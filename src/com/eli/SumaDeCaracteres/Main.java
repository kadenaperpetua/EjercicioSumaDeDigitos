package com.eli.SumaDeCaracteres;

public class Main {

    public static void main(String[] args) {
        char[] digitos ={'0','1','2','3','4','5','6','7','8','9'};

        //int num= decode('1');
        //System.out.println("num = " + num);

        long suma = sumarDigitos(digitos);
        System.out.println("suma = " + suma);


    }

    public static int decode(char digito){
        int num=digito-48;
        return num;
    }

    public static long sumarDigitos(char[] digitos){
        long suma =0;
        for( char digito : digitos){
            suma+= decode(digito);
        }
        return suma;
    }

}
