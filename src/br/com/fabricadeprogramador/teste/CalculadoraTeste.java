package br.com.fabricadeprogramador.teste;

import br.com.fabricadeprogramador.aula1.Calculadora;

import java.util.Scanner;

/**
 * Created by carolina on 30/10/16.
 */
public class CalculadoraTeste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Digite o primeiro numero:");
        calc.a = scanner.nextInt();
        System.out.println("Digie o segundo numero:");
        calc.b = scanner.nextInt();

        int soma = calc.somar(10,2);
        int subitracao = calc.subtrair(10,2);
        int multiplicacao = calc.multiplicar(10,2);
        double divisao = calc.dividir(10,2);
        double resto = calc.mode(10,2);


        System.out.println("O resultado da soma é: " + soma);
        System.out.println("O resultado da subltracao é: " + subitracao);
        System.out.println("O resultado da multiplicação é: " + multiplicacao);
        System.out.println("O resultado da divisao é: " + divisao);
        System.out.println("O resultado do resto é: " + resto);

        scanner.close();

    }
}
