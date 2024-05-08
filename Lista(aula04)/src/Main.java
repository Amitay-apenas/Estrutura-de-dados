import java.util.ArrayList;
import java.util.List;
//Tutora: Amenáides Perfeita Rodrigues Cardoso S2
public class Main {
    public static void main(String[] args) {
        List <String> familia = new ArrayList<>()
        {{

            add("Amenaides Rodrigues Cardoso");
            add("Aminadab Rodrigues Cardoso");
            add("Yasmin Rodrigues Cardoso");
            add("Levi Rodrigues Cardoso");
            add("Amitay Rodrigues Cardoso");
            add("Nino");
            add("Kombi");

        }};
        System.out.println("Essa é a minha família:" + familia);

        System.out.println("Essa é a minha esposa:" + familia.get(0));
        System.out.println("Essa é meu primogênito:" + familia.get(3));
        System.out.println("Essa é minha primeiro filha:" + familia.get(1));
        System.out.println("Essa é a minha filha mais nova:" + familia.get(2));

        familia.remove(4);
        System.out.println(("O pai morreu protegendo a família:" + familia));

        familia.set(4, "Ninho");
        System.out.println(familia);
    }
}