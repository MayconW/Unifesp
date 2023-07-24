package DiskPizza;

import java.util.Scanner;


@SuppressWarnings("unused")

public class Bebidas {

	Scanner input = new Scanner(System.in);
	private int Coca=10, Fanta=3, Cerveja=10, Suco_Natural=3, op=0;
	private float Coca_p=7.5f, Fanta_p=7.50f, Cerveja_p=5.5f, Suco_p=4.5f;
	public float Total=0, qtd=0;
	
	Distribuidora D1=new Distribuidora("Bebidas E Cia", "495495495", "19988000000", "Rua Colinas-SP");
	
	public void imprimeBebidas() {
		System.out.println("Digite o ingrediente que quer adicionar!");
		System.out.println("Se desejar parar, digite -1. ");
		System.out.println("1 - Coca 2l: R$: 7,50");
		System.out.println("2 - Fanta 2l: R$: 7,50");
		System.out.println("3 - Cerveja 1l: R$: 5,50");
		System.out.println("4 - Suco Natural 1l: R$: 4,50");
	}
	
	public float comprar() {
		
		while(op!=-1) {
			System.out.print("Digite uma opcao: ");
			
			op=input.nextInt();
			
			if(op!=-1) {
				System.out.print("Digite a quantidade: ");
				qtd=input.nextInt();
			
			
			switch(op) {
			
			case 1:
				if(Coca>0 && Coca>qtd) {
					Total+=7.50*qtd;
					Coca-=1*qtd;
					break;
				}else {
					System.out.println("Comprando mais Coca!\n");
					Coca+=D1.comprar(1, 100);
					Total+=7.50*qtd;
					Coca-=1*qtd;
					break;
					}
	
				
			case 2:
				if(Fanta>0 && Fanta>qtd) {
					Total+=7.50*qtd;
					Fanta-=1*qtd;
					break;
				}else {
					System.out.println("Comprando mais Fanta!\n");
					Fanta+=D1.comprar(2, 100);
					Total+=7.50*qtd;
					Fanta-=1*qtd;
					break;
				}
				
			case 3:
				if(Cerveja>0 && Cerveja>qtd ) {
					Total+=5.50*qtd;
					Cerveja-=1*qtd;
					break;
				}else {
					System.out.println("Comprando mais Cerveja!\n");
					Cerveja+=D1.comprar(3, 100);
					Total+=5.50*qtd;
					Cerveja-=1*qtd;
					break;
					
				}
				
			case 4:
				if(Suco_Natural>0 && Suco_Natural>qtd) {
					Total+=4.50*qtd;
					Suco_Natural-=1*qtd;
					break;
			}else {
			System.out.println("Comprando mais Suco!\n");
			Suco_Natural+=D1.comprar(4,100);
			Total+=4.50*qtd;
			Suco_Natural-=1*qtd;
			}
				
			default:
				break;
	}}
			System.out.println("Valor atual das bebidas: " +Total);
}
		return Total;
		} }
