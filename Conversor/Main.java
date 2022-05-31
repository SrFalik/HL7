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
        File f = new File("");
        Header h = new Header("CEBOLA", "PICLES", "GERGELIM", "CNTRL-3456", "P");
        String path = f.getAbsolutePath() + "/conclinica/Paciente.csv";
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

                    if(!info[0].equalsIgnoreCase("CODIGO")) {
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

                for (Paciente p : list) {
                    p.ajeitaNome();
                    p.ajeitaNasc();
                    System.out.println(h);
                    System.out.println(p);
                    System.out.println();
                }

            } catch (IOException | ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }

        String pathOut = f.getAbsolutePath() + "/conclinica/PacienteTeste.txt";
        try (BufferedWriter bw = new
                BufferedWriter(new FileWriter(pathOut))) {
            for (Paciente p : list) {
                bw.write(h.toString());
                bw.write(p.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
