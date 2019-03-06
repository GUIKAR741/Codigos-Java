package br.com.guikar.netbeans.ufc.poo.hora.horadocodigo01;

public class TestaCalculadora {
    static int total;
    public void viajar(){
        total++;
    }
    public static void main(String[] args) {
        Pessoa p1=new Pessoa("gui",1.70f,70f);
        Pessoa p2=new Pessoa("gu",1.80f,80f);
        Calculadora calc=new Calculadora();
//        System.out.println("p1:"+calc.calculaIMC(p1));
//        System.out.println("p2:"+calc.calculaIMC(p2));
//        calc.pi=11;
//        System.out.println("class p1:"+calc.classificaIMC(p1));
//        System.out.println("maior:"+calc.maiorMassa(p1,p2).getNome());
//        System.out.println("media:"+calc.mediaIMC(p1,p2));

        TestaCalculadora a=new TestaCalculadora();
        TestaCalculadora b=new TestaCalculadora();
        int i=0;
        while(i<10){
            a.viajar();
            b.viajar();
            b.viajar();
            i++;
        }
//        a.v2=0;
        System.out.println(a.total);
//        a.troca();
        System.out.println(b.total);
//        System.out.print(b.v2);
    }
}
