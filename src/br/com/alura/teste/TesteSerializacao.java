package br.com.alura.teste;

import java.io.*;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Escrita
        Cliente cliente = new Cliente("Herik", "Dev", "123545835");
        FileOutputStream fileOutputStream = new FileOutputStream("cliente.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(cliente);

        // Leitura (serialVersionUID serve para identificar se houve mudanças na classe)
        // se o valor do serialUID muda não pode ser feita a leitura (se ele não for colocado o java injeta)
        FileInputStream fileInputStream = new FileInputStream("cliente.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Cliente clienteLeitura = (Cliente) objectInputStream.readObject();
        System.out.println(clienteLeitura.toString());

        // OBS: Se uma classe tem herança a classe pai também tem que ser Serializable
        // Se quiser ignorar algum atributo da classe é só adicionar o modificador transient
    }
}
