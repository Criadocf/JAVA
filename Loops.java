import java.util.ArrayList;

public class Loops {
    public static void main(String[] args) {
        int[] sortes = {11, 7, 44}; //Array(vetor)
        
        ArrayList<Object> tudo = new ArrayList<>(); //ArrayList; tenho que fazer o import.
        
        tudo.add("kajota");
        
        sortes[0] = 111; //nao posso apagar ou adicionar um elemento em um array, mas posso substituir, fazendo dessa forma ai.
        
        
            //variavel          //
        for (int iterador = 0; iterador < sortes.length; iterador++){
            System.out.println(sortes[iterador]);
        }
        
        for (int tudao : sortes) { //Outra forma de iterar sobre uma estrutura de dados.
            tudo.add(tudao); //Nesse caso, iterei sobre os elementos do Array de inteiros de nome 'sortes' e em cada laço de repetiçao adicionei o elemento ao ArrayList de nome 'tudo'.
        }
        
        System.out.println(tudo);
        
        int count = 0;
        while (count < 10) {
            count++;
            System.out.println("JESUS TE AMA");
        }
        
    }
}