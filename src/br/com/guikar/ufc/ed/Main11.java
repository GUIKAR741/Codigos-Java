package br.com.guikar.ufc.ed;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int x[]=new int[n],y[]=new int[m];
        for (int i = 0; i < n; i++) {
            x[i]=sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            y[i]=sc.nextInt();
        }
        merge(x,0,x.length);
        for(int q:x){
            System.out.println(q);
        }

    }

    public static void merge(int vet[],int ini,int fim){
        if(ini<fim){
            int m=(ini+fim)/2;
            merge(vet,ini,m);
            merge(vet,m+1,fim);
            intercala(vet,ini,fim,m);
        }
    }
    public static void intercala(int vet[],int ini,int fim,int meio){
        int i=ini,j=meio+1,k=0,z=0;
        int inter[]=new int[fim-ini+1];
        while(i<=meio && j<=fim){
            if(vet[i]<vet[j]){
                inter[k]=vet[i];
                k++;
                i++;
            }else{
                inter[k]=vet[j];
                k++;
                j++;
            }
        }
        while(i<=meio){
            inter[k]=vet[i];
            k++;
            i++;
        }
        while(j<=fim){
            inter[k]=vet[j];
            k++;
            j++;
        }
        for (i = ini; i <= fim; i++) {
            vet[i]=inter[z];
            z++;
        }
    }
}
