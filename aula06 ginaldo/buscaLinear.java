public class buscaLinear {
    public static int buscaLinear(int[] array, int valorProcurado){ /*Metodo de busca linear*/
        for(int i = 0; i < array.length; i ++){/*For para iterar cada valor do array*/
            if(array[i] == valorProcurado){/*If para procuar o valor desejado*/
                return i;
            }
        }
        return -1;/*Para caso não encontre o valor procurado, retorne -1*/
    }

    public static void main(String args[]){
        int[] numeros = {1, 2, 3, 4, 5};
        int valorProcurado = 3;
        int indice = buscaLinear(numeros, valorProcurado);

        if(indice != -1){
            System.out.println("O valor "+ valorProcurado+ "foi encontrado no índice "+indice);
        }
        else {
            System.out.println("O valor " + valorProcurado + " não foi encontrado no array");
        }
    }
}