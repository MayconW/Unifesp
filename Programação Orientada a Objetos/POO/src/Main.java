import java.util.Random;




public class Main {
	
	

public static void main(String[] args) {

	Triangulo T1=new Triangulo(4,5,6, "T1"); /* Triangulo que passei os parametros */
	Triangulo T2=new Triangulo(); /*Triangulo que nao passei os parametros */
	double valor_aleatorio, area_total=0;
	int aux, i;
	/*Utilzando os metodos para mostrar o Triangulo T1*/
	
	T1.mostra();
	T1.area();
	
	/*Utilzando os metodos para mostrar o Triangulo T2 Antes de alterar seus atributos por meio do set*/
	
	T2.mostra();
	T2.area();
	
	/*Alterando seus atributos*/
	T2.setAltura(10);
	T2.setBase(20);
	
	/* Chamando os metodos mostra e area para demonstrar que realmente os atributos foram alterados*/
	
	T2.mostra();
	T2.area();

	/*Recebendo os valores através do metodo get*/
	
	aux=T1.getArea();
	System.out.println("Variavel que recebeu a area de T1: " +aux);
	
	System.out.print("\n");
	
	/*Criando uma nova instancia de retangulo, neste caso, não quadrado*/
	System.out.println("------------------");
	System.out.print("\n");
	System.out.println("Classe Retangulo!");
	
	Retangulo R1= new Retangulo(5,4);
	
	R1.Dimensoes();
	R1.Verifica_R();
	
	/*Alterando os atributos para ele ser um quadrado*/
	
	R1.setAltura(4);
	R1.setBase(4);
	
	/*Printando a verificação*/
	System.out.println("Depois de alterar os atributos");
	R1.Dimensoes();
	R1.Verifica_R();
	
	System.out.println("------------------");
	System.out.print("\n");
	System.out.println("Classe Quadrado!");
	
	Quadrado Q1= new Quadrado(4);
	Q1.dimensoes_quadrado();
	Q1.area_quadrado();
	/*Aumentando meu quadrado em 2x*/
	
	Q1.Aumentar_Quadrado(2);
	Q1.dimensoes_quadrado();
	Q1.area_quadrado();
	
	
	
	
	/*Professor, vou criar apenas uma instancia e ir randomizando o valor dos seus lados atraves do random e setando atraves do metodo get*/
	Quadrado Q2=new Quadrado();
	System.out.print("\n");
	System.out.println("10 Quadrados  com lados aleatorios");
	System.out.println("------------------");
	System.out.print("\n");
	for(i=0; i<10; i++) {
		valor_aleatorio= new Random().nextDouble();
		System.out.println("Valor de random: "+valor_aleatorio);
		Q2.setLado(valor_aleatorio);
		System.out.print( "Quadrado "+(i+1));
		Q2.area_quadrado();
		area_total+=Q2.get_area_quadrado();
		
	}
	System.out.println("------------------");
	System.out.print("\n");
	
	System.out.println("Soma das areas: "+area_total);
	
	System.out.println("------------------");
	System.out.print("\n");
	System.out.println("Classe Contador!");
	System.out.print("\n");
	
	Contador C1 = new Contador(); /*Esse vai iniciar com 0 */
	/*Fazendo algumas manipulações para demonstrar a funcionalidade dos metodos implantados*/
	C1.visualiza_Contador();
	C1.incrementa1();
	C1.visualiza_Contador();
	C1.incrementa_com_parametro(10);
	C1.visualiza_Contador();
	C1.decrementa1();
	C1.visualiza_Contador();
	C1.decrementa_com_parametro(5);
	C1.visualiza_Contador();
	
	System.out.print("\n");
	System.out.println("------------------");
	System.out.print("\n");
	System.out.println("Classe Carro!");
	
	Carro Carro1= new Carro("Fiat", "Uno", "ABC-1234", false, 50, 100);
	
	Carro1.ligar();
	Carro1.ligar(); /*Só pra demonstrar que o metodo nao ira fazer nenhuma mudança pois o carro ja esta ligado*/
	Carro1.desligar();
	Carro1.desligar(); /*Mesma ideia*/
	Carro1.acelerar();
	Carro1.ligar();
	Carro1.acelerar();
	Carro1.acelerar();
	Carro1.acelerar();
	Carro1.frear();
	Carro1.desligar();
	
	System.out.print("\n");
	System.out.println("Carro 2!");
	Carro Carro2= new Carro("Ford", "Escort", "ABC-1111", false, 50, 0);
	Carro2.ligar();
	Carro2.abastecer(10);
	Carro2.ligar();
	Carro2.acelerar();
	Carro2.acelerar();
	Carro2.frear();
	Carro2.desligar();
	
	
}



}
