package br.com.fabricadeprogramador.aula1;

/**
 * Created by carolina on 30/10/16.
 */
public class Calculadora {

    public double a;
    public double b;




    public Double somar(Double a, Double b){
        return a + b;
    }
    public Double subtrair(Double a, Double b){
        return a - b;
    }
    public Double multiplicar(Double a, Double b){
        return a * b;
    }
    public double dividir(double a, double b){
        Double divisao = null;

        if(a > 0 && b > 0 ) {
            divisao  = a/b;
        }
        return divisao;
    }
    public double mode(double a, double b){
        return a % b;
    }

    public boolean ePar(int a){
        if(a % 2 == 0){
            return true;
        }
        return false;
    }
    public double calcular(Double a, Double b, Integer operacao){
        Double calculo = null;

        if(operacao == 1){
            calculo = somar(a, b);
        }else {
            if (operacao == 2){
                calculo = subtrair(a,b);
            }else {
                if (operacao == 3){
                    calculo = multiplicar(a,b);
                }else{
                    if (operacao == 4){
                        calculo = dividir(a,b);
                    }
                }
            }
        }

            return  calculo;
    }

}
