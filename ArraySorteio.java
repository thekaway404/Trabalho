package sorteio;

import java.util.Random;
import java.util.Scanner;

public class Sorteio {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Quantos participantes terão?");
        int totalParticipantes = leia.nextInt(); //Variavel total participante
        int participante = 0; //Participante
        String[] nomes = new String[totalParticipantes]; // Cria array nomes
        for(int i = 0; i < totalParticipantes; i++){
            participante = i + 1;
            System.out.println("Qual o nome do " + participante + "º participante");
            nomes[i] = leia.next(); //Pegar nome indice
            for(int b = 0; b < totalParticipantes; b++){
                /* Verifica se é o indice menor que i */
                if(b < i){
                while(nomes[i].equals(nomes[b])){
                    System.out.println("Esse nome já existe tente novamente :) ");
                    System.out.println("Qual o nome do " + participante + "º participante");
                    nomes[i] = leia.next();
                    break;
                }
                }
            }
        }
        /* Sorteia um número */
        Random r = new Random();
        int ganhador = r.nextInt(nomes.length);
        System.out.println("O ganhador é " + nomes[ganhador]);
    }
    
}
