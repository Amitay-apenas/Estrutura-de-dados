import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
        Queue<String> carros = new LinkedList<>();

        carros.add("Corvette c6");
        carros.add("Lotus Elise");
        carros.add("BMW M3 GTR");
        carros.add("Mercedes Amg SL 500");

        System.out.println(carros.poll());
        System.out.println(carros);
        System.out.println(carros.peek());
        System.out.println(carros.isEmpty()?"A fila está sem elementos":"A fila não está vazia");

        Stack<String> carros2 = new Stack<>();

        carros2.push("Ferrari 488 spider");
        carros2.push("Ferrari LaFerrari");
        carros2.push("Ferrari FXXK");
        carros2.push("Ferrari 296 GTB");

        System.out.println(carros2.pop());
        System.out.println(carros2);
        System.out.println(carros2.peek());
        System.out.println(carros2.empty()?"A pilha está vazia":"A pilha não está vazia");
    }
}