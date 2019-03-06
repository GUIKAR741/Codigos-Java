package br.com.guikar.ufc.poo.floricultura;

public class TesteFloricultura {
    public static void main(String[] args) {
        Floricultura floricultura=new Floricultura("flor");
        Planta planta=new Planta();
        planta.setNome("rosa");
        planta.setEstoqueIdeal(50);
        planta.setTotalEstoque(60);
        Planta planta1=new Planta();
        planta1.setNome("amarelo");
        planta1.setEstoqueIdeal(30);
        planta1.setTotalEstoque(60);
        floricultura.entradaNoEstoque(planta);
        floricultura.entradaNoEstoque(planta1);
        floricultura.saidaNoEstoque("rosa",40);
        floricultura.comprasDoDia();
        floricultura.saidaNoEstoque("amarelo",40);
        floricultura.comprasDoDia();
    }
}
