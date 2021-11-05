package br.com.alura.teste;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TesteLeituraEscritaProperties {
    public static void main(String[] args) throws IOException {
        // LEITURA
        Properties props = new Properties();

        File arquivoLeitura = new File("config.properties");
        File arquivoEscrita = new File("config2.properties");

        FileReader fileReader = new FileReader(arquivoLeitura);
        props.load(fileReader);

        System.out.println(props.values());

        // ESCRITA
        FileWriter fileWriter = new FileWriter(arquivoEscrita);
        props.store(fileWriter, "#comentario");
    }
}
