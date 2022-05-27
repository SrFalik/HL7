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
                    list.add(new Paciente(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8], info[9],info[10], info[11], info[12], info[13], info[14], info[15], info[16], info[17], info[18], info[19],
                            info[20], info[21], info[22], info[23], info[24], info[25], info[26], info[27], info[28], info[29], info[30], info[31], info[32], info[33], info[34], info[35], info[36], info[37], info[38], info[39],
                            info[40], info[41], info[42], info[43], info[44], info[45], info[46], info[47], info[48], info[49], info[50], info[51]));
                });

                for (Paciente p : list) {
                    p.ajeitaNome();
                    p.ajeitaNasc();
                    System.out.println(p);
                }

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            String pathOut = "C:\\Users\\Falik\\Documents\\connazinica\\PacienteCebola.txt";
        try (BufferedWriter bw = new
                BufferedWriter(new FileWriter(pathOut))) {
            for (Paciente p : list) {
                bw.write(p.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
