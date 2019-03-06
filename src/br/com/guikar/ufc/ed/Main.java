package br.com.guikar.ufc.ed;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int lista[]=new int[n];
        for (int i = 0; i < n; i++) {
            lista[i]=sc.nextInt();
        }
        System.out.println(lista[0]+lista[1]);
        for (int i = 1; i < n-1; i++) {
            System.out.println(lista[i+1]+lista[i-1]+lista[i]);
        }
        System.out.println(lista[n-2]+lista[n-1]);

    }
}
