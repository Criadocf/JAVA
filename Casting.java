public class Casting {
    public static void main(String[] args){
        String idade = "25";
        double altura = 1.85;
        int id = 11;
        
        System.out.println(altura + System.lineSeparator() + idade + System.lineSeparator() + id);
        
        //DE DOUBLE PARA INT E VICE-VERSA (FORMA MAIS FACIL)
        int altura_int = (int) altura; //transformando  altura para int.
        
        System.out.println(altura_int);
        
        double id_decimal = id; //transformando id para decimal(double)
        
        System.out.println(id_decimal);
        
        
        //DE STRING PARA INT E VICE-VERSA
        int idade_int = Integer.parseInt(idade); //transformando de String para inteiro
        
        
        
        //VENDO O TIPO NO JAVA.
        Object tipo_idade_int = idade_int;
        
        //vendo o tipo da variavel idade_int pra saber se ela era mesmo um inteiro, e e dessa forma abaixo que vemos isso no Java. Eu converto minha variavel int para Object como fiz na linha acima, e uso esses metodos abaixo.
        System.out.println(tipo_idade_int.getClass().getSimpleName());
        
        //de INT para STRING
        String reconvertendo_p_String = String.valueOf(idade_int);
        
        //Convertendo para objeto para saber o tipo da variavel. se deu certo a conversao
        Object tipo_reconvertendo_p_String = reconvertendo_p_String;
        
        System.out.println(tipo_reconvertendo_p_String.getClass().getSimpleName());
        
        
    }
}
