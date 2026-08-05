public class Teste {
	public static void main (String[] args) {
		byte teste = 125; //8 bits (-128 a 127)
		short teste1 = 10000; //16 bits (-32.768 a 32.767)
		int teste2 = 1000000; //32 bits (-2.147.483.648 a 2.147.483.647)
		long teste3 = 10000000L; //64 bits (-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807)
		 float teste4 = 5.50f; //32 bits, precisao simples.
		 double teste5 = 32.455745645; //64 bits precisao dupla.
		String nome = "Kleber"; // Palavras e frases.
		char Myname = 'a'; //representa apenas um caractere.
		boolean escolha = true; //falso ou verdadeiro.
		var aleatorio = 30; //O proprio python consegue inferir qual tipo de variavel estamos usando.
		
		System.out.println(teste4 + aleatorio);
		
	}
}