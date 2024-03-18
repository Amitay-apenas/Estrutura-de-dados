import java.util.Scanner;
public class aula03 {
    public static void main (String args[]){
        String[] nomes = new String[10];/*Atribuindo o tamanho*/

        nomes[0] = "Amenaídes";
        nomes[1] = "Jonas";
        nomes[2] = "Amitay";
        nomes[3] = "Ginaldo";
        nomes[4] = "Homo Sapiens";
        nomes[5] = "Homo Habilis";
        nomes[6] = "Australopitecus";
        nomes[7] = "Everton";
        nomes[8] = "Mario";
        nomes[9] = "Luffy";

        Double[] notas = new Double[10];/*Atribuindo o tamanho*/

        notas[0] = 0.6;
        notas[1] = 0.6;
        notas[2] = 0.6;
        notas[3] = 10.0;
        notas[4] = 8.0;
        notas[5] = 2.0;
        notas[6] = 5.9;
        notas[7] = 8.9;
        notas[8] = 7.5;
        notas[9] = 6.6;

        for(int i = 0; i<=9; i ++){
            System.out.println("O aluno " + nomes[i] + " teve nota: " + notas[i]);
        }
    }
}
