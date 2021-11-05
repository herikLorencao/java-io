package br.com.alura.teste;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStream {
    public static void main(String[] args) throws FileNotFoundException {
//        PrintStream p = new PrintStream("arquivo2.txt");
        PrintWriter p = new PrintWriter("arquivo2.txt");

        p.println("Teste");
        p.println("Novo texto");

        p.close();
    }
}
