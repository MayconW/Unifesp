@SuppressWarnings("unused")

public class Retangulo {
	
	private int base, altura, area, perimetro;
	private boolean Is_Quadrado;
	
	
	
	/*Construtor com atributos*/
	
	public Retangulo(int B, int H) {
		
		this.base=B;
		this.altura=H;
		
	}
	
	
	/*Métodos Get*/
	
	public int getBase() {
		return this.base;
		
	}
	public int getAltura() {
		
		return this.altura;
		
	}
	public int getArea() {
		
		return (base*altura);
	}
	
	public int getPerimetro() {
		perimetro=2*(base+altura);
		return perimetro;}
	
	
	public boolean Is_Quad() {
		if(base==altura) {
			return true;
		}else {
			return false;
		}
		
		
	}
		
		
	
	
	/*Métodos Set */
	
	public void setBase(int B) {
		this.base=B;
		
	}
	public void setAltura(int A) {
		this.altura=A;
	}
	
	
	/* Metodos que imprimem as caracteristicas*/

	public void Verifica_R() {
		
		if(base==altura) {
		System.out.println("É um Quadrado!");
		}else {
		System.out.println("Não é um Quadrado!");
		}
		
	}
	
	
	public void Dimensoes() {
		area=this.base*this.altura;

		System.out.println("Base: "+this.base);
		System.out.println("Altura: "+this.altura);
		System.out.println("Area: "+this.area);
	
	}
	
	

}
