
public class Contador {
	
	private int contador;
	
	/*Criando construtores com e sem parametro*/
	public Contador(int C) {
		this.contador=C;
		
	}
	
	public Contador() {
		this.contador=0;
	}
	
	public int Contador_Atual() {
		return this.contador;
		
	}
	
	public void incrementa1() {
		this.contador++;
	}
	public void incrementa_com_parametro(int valor) {
		System.out.println("Incrementando Contador em " +valor);
		this.contador+=valor;
	}
	
	public void decrementa1() {
		this.contador--;
	}
	public void decrementa_com_parametro(int valor) {
		System.out.println("Decrementando Contador em " +valor);
		this.contador-=valor;
	}
	
	public void visualiza_Contador() {
		
		System.out.println("Contador = " +this.contador);
		
	}

}
