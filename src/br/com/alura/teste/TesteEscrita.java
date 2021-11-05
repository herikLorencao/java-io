package br.com.alura.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        var fileOutputStream = new FileOutputStream("arquivo2.txt");
        var outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
        var bufferedWriter = new BufferedWriter(outputStreamWriter);

        bufferedWriter.write("Teste");
        bufferedWriter.newLine();
        bufferedWriter.write("Novo texto");

        bufferedWriter.close();
    }
}
