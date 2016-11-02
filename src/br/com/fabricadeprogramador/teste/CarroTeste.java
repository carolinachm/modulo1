package br.com.fabricadeprogramador.teste;

import br.com.fabricadeprogramador.aula1.Carro;

/**
 * Created by carolina on 29/10/16.
 */
public class CarroTeste {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.ano = 2016;
        carro.cor = "vermelho";
        carro.marca = "fiat";
        carro.modelo = "fusion";

        Carro  carro1 = new Carro();
        carro1.ano = 2017;
        carro1.cor = "branco";
        carro1.marca = "chevrolet";
        carro1.modelo = "captiva";

        Carro  carro2 = new Carro();
        carro2.ano = 2016;
        carro2.cor = "branco";
        carro2.marca = "hiuday";
        carro2.modelo = "elantra";

        System.out.println(" Ano:" + carro.ano + ", Cor:" + carro.cor + ", Marca:" + carro.marca + ", Modelo:" + carro.modelo);
        System.out.println("");
        System.out.println(" Ano:" + carro1.ano + ", Cor:" + carro1.cor + ", Marca:" + carro1.marca + ", Modelo:" + carro1.modelo);
        System.out.println("");
        System.out.println(" Ano:" + carro2.ano + ", Cor:" + carro2.cor + ", Marca:" + carro2.marca + ", Modelo:" + carro2.modelo);
    }
}
