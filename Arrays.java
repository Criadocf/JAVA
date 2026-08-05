import java.util.ArrayList; //Tenho que importar pra usar o ArrayList ja q e uma classe.

public class Arrays {
    public static void main(String[] args) {
        //ARRAY
        int[] array = {1,3,5,7,9}; //array (ESTATICO, TAMANHO FIXO)
        
        int[] novo = new int[2]; //esse [2] signnifica que vai ser criado um array com 2 elementos.
        
        System.out.println(array[0]);
        
        novo[0] = 12;   //Forma de adicionar que serve apenas pro array, no caso do ArrayList usamos o metodo .add();
        novo[1] = 17;
        System.out.println(novo[0] + " " + novo[1]);
        
        System.out.println(novo.length); // me diz quantos elementos existem nesse array.
        
        
        //ARRAYLIST
        ArrayList<String> times = new ArrayList<>(); //O ArrayList e dinamico
        
        times.add("Vasco");
        
        System.out.println(times.get(0)); //No caso do ArrayList eu uso o get(indice) para acessar aos elementos.
        times.add("Flabosta");
        System.out.println(times.get(1));
        times.add("Sao Paulo");
        System.out.println(times.get(2));
        
        times.remove(2); //No caso do Array nao podemos remover, apenas substituir, no caso por 'null, 0 ou false'
        
        
        //podemos tambem remover pelo proprio valor do objeto.
        times.remove("Flabosta"); //Aspas simples apenas para caracteres do tipo char.
        
    }
}