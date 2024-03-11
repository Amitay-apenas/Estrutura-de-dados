import java.util.Scanner;
public class main{
    public static void main(String[] args){
        String[] nomes;/* Cria um vetor que recebe o nome de nomes*/
        nomes = new String[5]; /* Atribui o tamanho do vetor*/
        double[] notas = new double[5];/* Declaração combinada um vetor usando double que tem a vantagem de receber números decimais e inteiros */
        double soma = 0, media;/* Nova variável que recebe o ponto de partida de um vetor e recebe a media para cáclulo*/
        for (int i = 0; i <= 4; i++){
            System.out.println("Entre com o nome do aluno n° "+(i+1));/* o (i+1) faz com que a posição mude após receber o valor*/
            nomes[i] = new Scanner(System.in).nextLine();
            System.out.println("Entre com o nome do aluno n° "+(i+1));/* o (i+1) faz com que a posição mude após receber o valor*/
            nomes[i] = new Scanner(System.in).nextLine();
            soma = soma + notas[i];
        }
        media = soma /5;
        System.out.println("A média dos alunos é: "+ media);
        System.out.println();
        System.out.println("Lista dos alunos cuja nota é superior a média da turma");
        for(int i = 0; i <= 4; i++) {
            if(notas[i] > media)
                System.out.println(nomes[i]);
        }
    }
}