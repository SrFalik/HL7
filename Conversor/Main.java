package Conversor;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Paciente> list = new ArrayList<>();
        String path = "C:\\Users\\Falik\\Documents\\connazinica\\Paciente.csv";
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                br.lines().forEach(linha -> {
                    String[] info = linha.split(";");
                    String[] novo = new String[52];
                    int count = 0;
                    for (String s : novo) {
                        novo[count] = "NULL";
                        count++;
                    }
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
                    System.out.println(p);
                }

            } catch (IOException | ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }

        String pathOut = "C:\\Users\\Falik\\Documents\\connazinica\\PacienteCebola.txt";
        try (BufferedWriter bw = new
                BufferedWriter(new FileWriter(pathOut))) {
            for (Paciente p : list) {
                bw.write(p.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
