package br.com.fabricadeprogramador.teste;

import br.com.fabricadeprogramador.aula1.FiguraGeometrica;

import java.util.Scanner;

/**
 * Created by carolina on 02/11/16.
 */
public class FiguraGeometricaTeste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        FiguraGeometrica figuraGeometrica = new FiguraGeometrica();

        System.out.println("Digite o primeiro lado:");
        double a = scanner.nextDouble();
        System.out.println("Digite o segundo lado:");
        double b = scanner.nextDouble();
        System.out.println("Digite o terceiro lado:");
        double c = scanner.nextDouble();

        String resultado = figuraGeometrica.identificarTriangulo(1,2,3);
        String resultado1 = figuraGeometrica.eEquilatero(1,2,3);
        String resultado2 = figuraGeometrica.eEcaleno(1,1,1);
        System.out.println("Qual o tipo de triangulo: " + figuraGeometrica.eEcaleno(1,1,1));
        System.out.println("Qual o tipo de triangulo: " + figuraGeometrica.eEquilatero(1,1,1));
        System.out.println("Qual o tipo de triangulo: " + figuraGeometrica.identificarTriangulo(1,1,1));
    }
}
