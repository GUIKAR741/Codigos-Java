package br.com.guikar.ufc.ed;

import java.util.Random;

public class Hashing {
    private static int tamanho=127;
    private static int valor[]=new int[tamanho];
    public static int f(int v){
        return Integer.rotateLeft(v,10)*(tamanho/2)% tamanho;
    }
    public static void main(String[] args) {
        int cont=0;
        for (int i = 0; i < 50; i++) {
            int num=new Random().nextInt(1000);
            int pos=f(num);
            if(valor[pos]==0 || valor[pos]==num){
                valor[pos]=num;
            }else{
                cont++;
            }
        }
        System.out.println("Colisoes: "+cont);
    }
}
