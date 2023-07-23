import java.util.Scanner;
import java.util.StringTokenizer;

/*Como nao foi mencionado se precisaria salvar as palavras que foram geradas, apenas imprimi elas em Piglatim*/

public class Main {
	
	static Scanner input=new Scanner(System.in);
	
	
	public static void PigLatin (String palavra) {
		String Aux, Aux2;
		Aux=palavra.substring(0,1).toLowerCase();
		Aux2=palavra.substring(1,palavra.length()).toLowerCase();;
	
	System.out.print(Aux2 + Aux + "ay" + " ");
	
	}

	
	
	public static void main(String[] args) {	
		String aux;
	
		
		System.out.print("Digite a frase:");
		
		aux=input.nextLine();
		
		System.out.println("Frase antes de ser traduzida: " +aux);
	
		
		StringTokenizer Tok = new StringTokenizer(aux, " ");
		
		System.out.print("Frase depois de ser traduzida: ");
		
			while(Tok.hasMoreTokens()){
				
				PigLatin(Tok.nextToken());
				
			
		}
	
		
		
	}
    
}