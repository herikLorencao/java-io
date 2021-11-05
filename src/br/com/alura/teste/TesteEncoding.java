package br.com.alura.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String caracter = "ç";
        System.out.println(caracter.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = caracter.getBytes();
        System.out.print(bytes.length + ", " + charset.displayName() + ", ");
        caracter = new String(bytes, charset.displayName());
        System.out.println(caracter);

        bytes = caracter.getBytes(StandardCharsets.UTF_16);
        System.out.print(bytes.length + ", UTF_16, ");
        caracter = new String(bytes, StandardCharsets.UTF_16);
        System.out.println(caracter);

        bytes = caracter.getBytes(StandardCharsets.US_ASCII);
        System.out.print(bytes.length + ", US_ASCII, ");
        caracter = new String(bytes, StandardCharsets.US_ASCII);
        System.out.println(caracter);
    }
}
