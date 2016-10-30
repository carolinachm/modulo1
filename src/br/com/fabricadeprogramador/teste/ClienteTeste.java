package br.com.fabricadeprogramador.teste;

import br.com.fabricadeprogramador.aula1.Cliente;
import br.com.fabricadeprogramador.aula1.EstadoCivil;

/**
 * Created by carolina on 30/10/16.
 */
public class ClienteTeste {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.nome = "Carolina";
        cliente.cpf = "590.024.676-05";
        cliente.rg = "35.115.118-7";
        cliente.altura = 1.70;
        cliente.peso = 116.0;
        cliente.estadoCivil = EstadoCivil.CASADO;

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Carolina";
        cliente1.cpf = "590.024.676-05";
        cliente1.rg = "35.115.118-7";
        cliente1.altura = 1.70;
        cliente1.peso = 116.0;
        cliente.estadoCivil = EstadoCivil.SOLTEIRO;

        Cliente cliente2 = new Cliente();
        cliente2.nome = "Carolina";
        cliente2.cpf = "590.024.676-05";
        cliente2.rg = "35.115.118-7";
        cliente2.altura = 1.70;
        cliente2.peso = 116.0;
        cliente.estadoCivil = EstadoCivil.DIVORCIADO;

        System.out.println(" Nome:" + cliente.nome + ", CPF:" + cliente.cpf + ", RG:" + cliente.rg + ", Altura:" + cliente.altura + ",Peso:" + cliente.peso + ",Estado Civil: " + EstadoCivil.SOLTEIRO);
        System.out.println("");
        System.out.println(" Nome:" + cliente1.nome + ", CPF:" + cliente1.cpf + ", RG:" + cliente1.rg + ", Altura:" + cliente1.altura + ",Peso:" + cliente1.peso + ",Estado Civil: " + EstadoCivil.CASADO);
        System.out.println("");
        System.out.println(" Nome:" + cliente2.nome + ", CPF:" + cliente2.cpf + ", RG:" + cliente2.rg + ", Altura:" + cliente2.altura + ",Peso:" + cliente2.peso + ",Estado Civil: " + EstadoCivil.VIUVO);

        String nome = new String("Carolina");

        char letra = nome.charAt(0);
        boolean vazio = nome.isEmpty();
        int tamanho = nome.length();
        String maiuscula = nome.toUpperCase();

        System.out.println(letra);
        System.out.println(vazio);
        System.out.println(tamanho);
        System.out.println(maiuscula);
    }
}
