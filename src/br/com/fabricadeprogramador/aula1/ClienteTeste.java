package br.com.fabricadeprogramador.aula1;

/**
 * Created by carolina on 29/10/16.
 */
public class ClienteTeste {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.nome="Jão";
        cliente.cpf="795.862.523-53";
        cliente.rg = "13.624.272-8";

        Cliente cliente1 = new Cliente();
        cliente1.nome="Jão";
        cliente1.cpf="176.957.370-46";
        cliente1.rg = "37.417.084-8";

        Cliente cliente2 = new Cliente();
        cliente2.nome="Jão";
        cliente2.cpf="590.024.676-05";
        cliente2.rg = "30.619.230-5";

        System.out.println(" Nome:" + cliente.nome + ", CPF:" + cliente.cpf + ", RG:" + cliente.rg );
        System.out.println("");
        System.out.println(" Nome:" + cliente1.nome + ", CPF:" + cliente1.cpf + ", RG:" + cliente1.rg );
        System.out.println("");
        System.out.println(" Nome:" + cliente2.nome + ", CPF:" + cliente2.cpf + ", RG:" + cliente2.rg);
    }

}
