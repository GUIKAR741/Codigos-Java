package br.com.guikar.netbeans.ufc.poo.robo;

import java.util.Scanner;

public class Jogar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nomeMundo,nomeRobo;
        int dificuldade,x,y;
        System.out.print("Digite o nome do mundo:");
        nomeMundo=sc.nextLine();
        do {
            System.out.print("Digite a dificuldade do mundo:(Entre 1 e 10)");
            dificuldade = sc.nextInt();
            sc.nextLine();
        }while (dificuldade<1 || dificuldade>10);
        do {
            System.out.print("Digite a largura do mundo:");
            x = sc.nextInt();
            sc.nextLine();
        }while (x<0);
        do {
            System.out.print("Digite a altura do mundo:");
            y = sc.nextInt();
            sc.nextLine();
        }while (y<0);
        System.out.print("Digite o nome do Robo:");
        nomeRobo=sc.nextLine();
        Mundo mundo=new Mundo(nomeMundo,x,y,dificuldade);
        Robo robo=new Robo(nomeRobo,mundo);
        boolean jogar=true;
        int opcao;
        String direcao = "";
        while (jogar){
            switch (robo.getDirecao()){
                case 'n':
                    direcao="Norte";
                    break;
                case 's':
                    direcao="Sul";
                    break;
                case 'o':
                    direcao="Oeste";
                    break;
                case 'l':
                    direcao="Leste";
                    break;
            }
            System.out.print("Olá "+robo.getNome()+"!\n"+
                    "Você tem "+robo.getNivelBateria()+" de Bateria!\n" +
                    "Ainda restam "+robo.getMundo().getComidaNoMapa()+" comidas no mapa!\n" +
                    "Você está andando para o " +direcao+"!\n"+
                    "Coma tudo para terminar o jogo!\n" +
                    "O que deseja fazer?\n"+
                    "1-Andar para Frente\n" +
                    "2-Virar para Esquerda\n"+
                    "3-Virar para Direita\n" +
                    "4-Dormir (Ainda pode dormir "+robo.getDorme()+" vezes, dormir recupera 20 de bateria)\n" +
                    "5-Sair do jogo\n" +
                    "Opção selecionada:");
            opcao=sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    robo.andaFrente();
                    break;
                case 2:
                    robo.dobraEsquerda();
                    break;
                case 3:
                    robo.dobraDireita();
                    break;
                case 4:
                    robo.dormir();
                    break;
                case 5:
                    jogar=false;
                    break;
            }
            if(robo.getNivelBateria()<=0)
                jogar=false;
            if(!jogar)
                System.out.println("Obrigado por Jogar!");
        }
    }
}
