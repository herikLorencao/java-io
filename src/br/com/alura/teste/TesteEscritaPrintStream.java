package br.com.alura.teste;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class TesteEscritaPrintStream {
    public static void main(String[] args) throws IOException {
//        PrintStream p = new PrintStream("arquivo2.txt");
        PrintWriter p = new PrintWriter("arquivo2.txt", StandardCharsets.UTF_8);

        p.println("Teste");
        p.println("Novo texto");

        p.close();
    }
}
