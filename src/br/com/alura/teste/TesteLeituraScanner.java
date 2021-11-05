package br.com.alura.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {
    public static void main(String[] args) throws Exception {
        File file = new File("contas.csv");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            Scanner linhaScanner = new Scanner(scanner.nextLine());

            // Para definir a separação de decimal como .
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String tipoConta = linhaScanner.next();
            Integer conta = linhaScanner.nextInt();
            Integer agencia = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            Double saldo = linhaScanner.nextDouble();

            System.out.format(new Locale("pt", "BR"),  "%s | %05d-%04d | %s | R$ %.2f %n", tipoConta, conta, agencia, titular, saldo);
            linhaScanner.close();
        }

        scanner.close();
    }
}
