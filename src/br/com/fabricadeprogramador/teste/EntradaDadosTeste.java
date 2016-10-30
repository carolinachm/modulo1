package br.com.fabricadeprogramador.teste;

import br.com.fabricadeprogramador.aula1.Cliente;

import java.util.Scanner;

/**
 * Created by carolina on 30/10/16.
 */
public class EntradaDadosTeste {

    public static void main(String[] args) {
        //Entrada de dados pelo teclado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome:");

        Cliente cliente = new Cliente();
        cliente.nome = scanner.next();

        System.out.println(cliente.nome.toUpperCase());
    }
}
