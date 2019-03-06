package br.com.guikar.ufc.poo;

import java.util.Random;
import java.util.Scanner;

class runE extends RuntimeException{
    public runE(String res){
        super(res);
    }
}
class t {
    double saldo=10;

    public void setSaldo(double saldo){
        if(saldo>this.saldo)throw new runE("insu");
        else this.saldo-=saldo;
    }

    public static void main(String[] args){
//        t tt=new t();
//        tt.setSaldo(11);
        Object o[]={new Object(),null,new Scanner(System.in),new Random(),null};
        for (int i = 0; i <=o.length ; i++) {
            System.out.println(o[i]);
        }
//        int v=calc(new int[]{6,8,9,2},new int[]{6,2,4});
//        System.out.println(v);
    }
    public static int calc(int[] v1, int[] v2){
        int t,r=0;
        if(v1.length>v2.length)
            t=v1.length;
        else
            t=v2.length;
        for (int i = 0; i < t; i++)
            r+=v1[i]*v2[i];
        return r;
    }
}
