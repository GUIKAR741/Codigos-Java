
package br.com.guikar.netbeans.ufc.poo.hora.horaq2;

public class Exercicio27 {

    public static void main(String[] args) {
        Peixe p1 = new Peixe("Bacalhau",15f);
        Peixe p2 = new Peixe("Bagre",10f);
        Peixe p3 = new Peixe("Bagre",14f);

        InscricaoAssociacao inscricao = new InscricaoAssociacao("01/06/1990",false);

        Pescador pescador = new Pescador("Aroldo","123456789",inscricao);
        Estado estado = new Estado("Ceará",20f,2);

        pescador.colocarNaSacola(p1);
        pescador.colocarNaSacola(p2);
        pescador.colocarNaSacola(p3);
        pescador.retiraPeixeMaisPesado();
        for(Peixe x : pescador.getSacola()) {
            if(x!=null)
                System.out.println(x.getPeso());
        }
//        System.out.println(estado.verificaPescador(pescador));
    }

}
