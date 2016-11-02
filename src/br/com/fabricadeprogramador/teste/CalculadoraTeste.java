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
        double a = scanner.nextDouble();
        System.out.println("Digie o segundo numero:");
        double b = scanner.nextDouble();
        System.out.println("Digie ooperacao: (1-soma, 2-subtracao, 3- multiplicacao,4-divisao)");
        Integer op = scanner.nextInt();



        boolean par = calc.ePar(100);
        double resultado = calc.calcular(a, b,op);


        System.out.println("O resultado da soma é: " + resultado);

        System.out.println("O resultado do e par: " + par);

        scanner.close();

    }
}
