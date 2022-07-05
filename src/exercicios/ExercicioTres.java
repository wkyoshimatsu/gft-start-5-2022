package exercicios;

import java.util.Scanner;

public class ExercicioTres {
    public static void votacao(){
        int votosCandidatoUm = 0;
        int votosCandidatoDois = 0;
        int votosCandidatoTres = 0;
        int votosCandidatoQuatro = 0;
        int votosNulo = 0;
        int votosBranco = 0;
        int totalVotos;
        int voto;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira seu voto:\n1 para candidato 1\n2 para candidato 2\n3 para candidato 3\n4 para candidato 4\n5 para voto nulo\n6 para voto em branco\n0 para finalizar");
        while(true){
            voto = Integer.parseInt(scanner.next());
            switch(voto){
                case 1:
                    votosCandidatoUm++;
                    break;
                case 2:
                    votosCandidatoDois++;
                    break;
                case 3:
                    votosCandidatoTres++;
                    break;
                case 4:
                    votosCandidatoQuatro++;
                    break;
                case 5:
                    votosNulo++;
                    break;
                case 6:
                    votosBranco++;
                    break;
                case 0:
                    System.out.println("Candidato 1 teve: "+votosCandidatoUm+" votos.");
                    System.out.println("Candidato 2 teve: "+votosCandidatoDois+" votos.");
                    System.out.println("Candidato 3 teve: "+votosCandidatoTres+" votos.");
                    System.out.println("Candidato 4 teve: "+votosCandidatoQuatro+" votos.");
                    System.out.println("Total de votos nulos: "+votosNulo+" votos.");
                    System.out.println("Total de votos brancos: "+votosBranco+" votos.");
                    totalVotos = votosCandidatoUm + votosCandidatoDois + votosCandidatoTres + votosCandidatoQuatro + votosNulo + votosBranco;
                    System.out.println("A percentagem de votos nulos sobre o total de votos: "+((votosNulo*100)/totalVotos)+"%");
                    System.out.println("A percentagem de votos em branco sobre o total de votos: "+((votosBranco*100)/totalVotos)+"%");
                    votosCandidatoUm = 0;
                    votosCandidatoDois = 0;
                    votosCandidatoTres = 0;
                    votosCandidatoQuatro = 0;
                    votosNulo = 0;
                    votosBranco = 0;
                    break;
                default:
                    System.out.println("Insira seu voto:\n1 para candidato 1\n2 para candidato 2\n3 para candidato 3\n4 para candidato 4\n5 para voto nulo\n6 para voto em branco\n0 para finalizar");
            }
        }
    }
}
