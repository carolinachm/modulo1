package br.com.fabricadeprogramador.aula1;

/**
 * Created by carolina on 01/11/16.
 */
public class FiguraGeometrica {

    public int a;
    public int b;
    public int c;

    public String eEquilatero(int a, int b, int c){
        if (a == b && a ==c && b == c){
            return "equilatero";
        }
        return  "isoceles";
    }

    public String eEcaleno(int a, int b, int c){
        if(a != b && a !=c && b != c){
            return "Escaleno";
        }else{
            if (a == b && a ==c && b == c){
                return "Equilatero";
            }
        }
        return "Isoceles";
    }


   public String identificarTriangulo(int a, int b, int c){

       if(a != b && a !=c && b != c){
           return "Escaleno";
       }else{
           if (a == b && a ==c && b == c){
               return "Equilatero";
           }
       }
       return "Isoceles";
   }


}
