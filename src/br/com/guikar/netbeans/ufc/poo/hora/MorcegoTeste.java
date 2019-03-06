package br.com.guikar.netbeans.ufc.poo.hora;

public class MorcegoTeste {

	public static void main(String[] args) {
		Morcego bruce; // Declarando uma variavel de referencia, chamado bruce
		bruce = new Morcego(); // instanciando um objeto
		
		// Declaracao das variaveis de instancia
		bruce.antebraco = 50.51; 
		bruce.especie = "Diaemus youngi";
		bruce.isSaudavel = true;
		bruce.faixaEtaria = 'A';
		bruce.sexo = 'M';
		bruce.peso = (float) 0.07; //casting
		
		System.out.println("- Ficha do morcego para pesquisa -");
		System.out.println("Especie: "+bruce.especie+"\nSaudavel: "+bruce.isSaudavel+"\nAntebraco(mm): "+bruce.antebraco+"\nSexo: "+bruce.sexo);

	}

}
