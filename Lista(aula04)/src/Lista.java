import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args){

        System.out.println("////////////////////Menu////////////////////");
        System.out.println("Digite 1 para cadastrar \nDigite 2 para Procurar \nDigite 3 para Remover");

        List<String> nome = new ArrayList<>();
        List<Integer> matricula = new ArrayList<>();
        List<Integer> dataDeNascimento = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i ++){
            System.out.println("Digite o nome");
            nome.add(sc.nextLine());
        }
        for(int j = 0; j < 3; j ++){
            matricula.add(j);
        }
        for(int k = 0; k < 3; k++) {
            System.out.println("Digite a data de nascimento");
            dataDeNascimento.add(sc.nextInt());
        }


//        List<String> jogosFavoritos = new ArrayList<>()
//        {{
//            add("Zelda majora's mask");
//            add("Monster Hunter World");
//            add("Dark Souls remastered");
//            add("Call of Duty Warzone");
//        }};
//        System.out.print(jogosFavoritos);
    }
}
