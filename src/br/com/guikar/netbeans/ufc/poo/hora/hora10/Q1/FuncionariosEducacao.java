
package br.com.guikar.netbeans.ufc.poo.hora.hora10.Q1;

public class FuncionariosEducacao {

    public static void main(String[] args) {
        Coordenador c = new Coordenador("Fulano","134679",1500.50);
        Secretario s = new Secretario("Ciclano","123456",1200.70);
        Professor p = new Professor("Beltrano","789456",5000.80,15);
        System.out.println(c.calculaSalario());
        System.out.println(s.calculaSalario());
        System.out.println(p.calculaSalario());
    }
    
}
