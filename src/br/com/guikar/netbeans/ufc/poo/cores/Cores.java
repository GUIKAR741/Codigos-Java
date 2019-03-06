package br.com.guikar.netbeans.ufc.poo.cores;

public class Cores {
    public static void main(String[] args) {
        Cor[] Cores={new Cor("amarelo"),new Cor("verde"),new Cor("vermelho")};
        Garoto garoto=new Garoto(),garoto1=new Garoto(),garoto2=new Garoto();
        garoto.setCor(Cores);
        garoto1.setCor(Cores);
        garoto2.setCor(Cores);
        System.out.println(garoto.pegaCor());
        System.out.println(garoto1.pegaCor());
        garoto.devolveCor();
        garoto1.devolveCor();
        System.out.println(garoto2.pegaCor());

    }

}
