
package br.com.guikar.ufc.poo.hora.hora09.Q1;

public class Cinema {

    public static void main(String[] args) {
        
        Caixa caixa = new Caixa();
        Ingresso ingressos[]=new Ingresso[6];
        ingressos[0] = new IngressoNormal(15.50f,"Os incríveis","1",10);
        ingressos[1] = new IngressoNormal(20f,"Ana e Vitória o filme","1",10);
        ingressos[2] = new IngressoNormal(10.20f,"Vingadore: Guerra Infinita","1",10);
        ingressos[3] = new IngressoVip(16.80f,"Venon","1",10);
        ingressos[4] = new IngressoVip(9.25f,"A Freira","1",10);
        ingressos[5] = new IngressoVip(35f,"O Predador","1",10);

        Funcionario funcionario = new Funcionario("420800",ingressos,caixa,"Luiz","m");
        Cliente cliente1 = new Cliente("Lia","f",100.50f,"os incríveis");
        Cliente cliente2 = new Cliente("Sofia","f",20f,"Venon");
        
        funcionario.acao(cliente1);
        funcionario.getCaixa().exibeLucro();
        cliente1.pegarInfoIngresso();
        System.out.println(cliente1.getDinheiro());
        funcionario.acao(cliente2);
        funcionario.getCaixa().exibeLucro();
        cliente2.pegarInfoIngresso();
        System.out.println(cliente2.getDinheiro());
    }
    
}
