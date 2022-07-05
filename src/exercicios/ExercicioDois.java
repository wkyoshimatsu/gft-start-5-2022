package exercicios;

import java.util.List;
import java.util.Scanner;

public class ExercicioDois {
    public static void aprovacao(){
        Scanner scanner = new Scanner(System.in);
        //List<String>  matriculas = new ArrayList<String>();
        //List<Float> notas = new ArrayList<Float>();
        //List<Float> medias = new ArrayList<Float>();
        //List<Integer> frequencias = new ArrayList<Integer>();
        String[] matriculas={};
        Float[] notas = {};
        Float[] medias={};
        Integer[] frequencias={};


        String temporario;
        for(int i = 0; i < 5; i++){
            System.out.println("Insira a matricula do aluno "+(i+1));
            matriculas[i] = scanner.next();
            for(int j = 0; j<3; j++){
                System.out.println("Insira a nota "+(j+1)+" do aluno "+(i+1));

                notas[i+j] = Float.parseFloat(scanner.next());

            }
            System.out.println("Insira a frequência do aluno "+(i+1));
            frequencias[i] = Integer.parseInt(scanner.next());

        }





    }
}
