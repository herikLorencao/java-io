package br.com.alura.teste;

import java.io.*;

public class TesteEscritaFileWritter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("arquivo2.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

//        fileWriter.write("teste");
//        fileWriter.write(System.lineSeparator());
//        fileWriter.write("Novo texto");

        bufferedWriter.write("Teste");
        bufferedWriter.newLine();
        bufferedWriter.write("Novo texto");

        bufferedWriter.close();
//        fileWriter.close();
    }
}
