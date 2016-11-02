package br.com.fabricadeprogramador.teste;

import br.com.fabricadeprogramador.aula1.Cidade;

/**
 * Created by carolina on 29/10/16.
 */
public class CidadeTeste {


        public static void main(String[] args) {


            Cidade cidade = new Cidade();
            cidade.nome = "Valparaiso de Goias";
            cidade. uf = "GO";

            Cidade cidade1 = new Cidade();
            cidade1.nome = "Taguatinga";
            cidade1. uf = "DF";

            Cidade cidade2 = new Cidade();
            cidade2.nome = "Asa Norte";
            cidade2. uf = "DF";

            System.out.println("Nome:" + cidade.nome+ ", UF:" + cidade. uf );
            System.out.println("");
            System.out.println("Nome:" + cidade1.nome+ ", UF:" + cidade1. uf );
            System.out.println("");
            System.out.println("Nome:" + cidade2.nome+ ", UF:" + cidade2. uf );
        }
    }
