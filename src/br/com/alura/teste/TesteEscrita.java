package br.com.alura.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        var fileOutputStream = new FileOutputStream("arquivo2.txt");
        var outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        var bufferedWriter = new BufferedWriter(outputStreamWriter);

        bufferedWriter.write("Teste");
        bufferedWriter.newLine();
        bufferedWriter.write("Novo texto");

        bufferedWriter.close();
    }
}
