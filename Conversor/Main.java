package Conversor;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Paciente> list = new ArrayList<>();
        List<RequisicaoObservacao> listPront = new ArrayList<>();
        File f = new File("");
        String locEnvio = "IBMEC";
        String recebedor = "CESAR";
        String locReceb = "CONCLINICA";
        Header h = new Header(locEnvio, recebedor, locReceb, "P");
        String path = f.getAbsolutePath() + "/conclinica/Paciente.csv";
        String pathPront = f.getAbsolutePath() + "/conclinica/ProntuarioEndoscopia.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.lines().forEach(linha -> {
                String[] info = linha.split(";");
                String[] novo = new String[52];
                Arrays.fill(novo, "NULL");
                if (info.length < 52) {
                    for (int i = 0; i < info.length; i++) {
                        if (info[i] == null) novo[i] = "NULL";
                        else novo[i] = info[i];
                    }
                    info = novo;
                }

                if (!info[0].equalsIgnoreCase("CODIGO")) {
                    list.add(new Paciente(
                            info[0],
                            info[1],
                            info[11],
                            info[12],
                            info[43],
                            info[45],
                            info[47],
                            info[48],
                            info[49],
                            info[24],
                            info[25],
                            info[26],
                            info[16],
                            info[17]));
                }
            });

        } catch (IOException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(pathPront))) {
            br.lines().forEach(linha -> {
                String[] info = linha.split(";");
                String[] novo = new String[41];
                Arrays.fill(novo, "NULL");
                if (info.length < 41) {
                    for (int i = 0; i < info.length; i++) {
                        if (info[i] == null) novo[i] = "NULL";
                        else novo[i] = info[i];
                    }
                    info = novo;
                }

                if (!info[0].equalsIgnoreCase("CODIGO_PACIENTE")) {
                    listPront.add(new RequisicaoObservacao(
                            locEnvio,
                            recebedor,
                            locReceb,
                            info[0],
                            info[1],
                            info[2],
                            info[3],
                            info[28]));
                }
            });

            try (PrintStream fileStream = new PrintStream(f.getAbsolutePath() + "/conclinica/mensagens_hl7.txt")
            ) {
                for (RequisicaoObservacao r : listPront) {
                    for (Paciente p : list) {
                        if (r.getCodigo().equals(p.getcodigo())) {
                            r.ajeitaData();
                            p.ajeitaNome();
                            p.ajeitaNasc();
                            System.out.println(h);
                            System.out.println(p);
                            System.out.println(r);
                            System.out.println(r.toStringObx());
                            System.out.println();
                            fileStream.println(h);
                            fileStream.println(p);
                            fileStream.println(r);
                            fileStream.println(r.toStringObx());
                            fileStream.println();
                        }
                    }
                }
            }
            System.out.println("Salvando mensagens em: " + f.getAbsolutePath() + "/conclinica/mensagens_hl7.txt");
        } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
    }
    }
