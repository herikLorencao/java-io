package br.com.alura.teste;

import java.io.*;
import java.net.Socket;

public class TesteLeituraEscrita {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();

        InputStream inputStream = socket.getInputStream(); // System.in; // new FileInputStream("arquivo.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        OutputStream outputStream = socket.getOutputStream(); // System.out; // new FileOutputStream("arquivo2.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        String texto = bufferedReader.readLine();

        while (texto != null && !texto.isEmpty()) {
            bufferedWriter.write(texto);
            bufferedWriter.newLine();
            // Já descarrega a linha (imprime)
            bufferedWriter.flush();
            texto = bufferedReader.readLine();
        }

        bufferedWriter.close();
        bufferedReader.close();
    }
}
