package br.com.alura.teste;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
        // le os bytes
        var fileInputStream = new FileInputStream("arquivo.txt");
        // le os caracteres
        var inputStreamReader = new InputStreamReader(fileInputStream);
        // le um conjunto de caracteres (buffer)
        var bufferedReader = new BufferedReader(inputStreamReader);
        var texto = bufferedReader.readLine();

        while (texto != null) {
            System.out.println(texto);
            texto = bufferedReader.readLine();
        }


        bufferedReader.close();
    }
}
