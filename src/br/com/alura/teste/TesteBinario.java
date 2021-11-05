package br.com.alura.teste;

import java.io.*;

public class TesteBinario {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Escrita
        String nome = "Herik S. Lorenção";
        FileOutputStream fileOutputStream = new FileOutputStream("objeto.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(nome);
        objectOutputStream.close();

        // Leitura
        FileInputStream fileInputStream = new FileInputStream("objeto.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        var nomeLeitura = (String) objectInputStream.readObject();
        System.out.println(nomeLeitura);

        objectOutputStream.close();
    }
}
