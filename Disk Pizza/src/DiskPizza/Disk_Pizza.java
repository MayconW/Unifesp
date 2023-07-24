package DiskPizza;
import java.util.Scanner;
public class Disk_Pizza {

	
	
	public static void main(String[] args) {
		boolean verifica_cadastro=true;
		Cardapio cardapio=new Cardapio();
		Bebidas bebida=new Bebidas();
		Cliente c1=new Cliente("Maycon", "Rua Turquia", "400800000-02", 25, 988259999);
		Scanner input = new Scanner(System.in);
		int resp;
		float valor=0;
		
		
		if(verifica_cadastro==false) {
			System.out.println("Iniciando o O cadastro do cliente!");
			
		
	}else {	
		Pizza P1= new Pizza();
		c1.dados();	
		cardapio.imprime();
		System.out.print("Digite a opcao desejada:");
		resp=input.nextInt();
		
		valor=P1.comprar(resp);
		
		System.out.println("Preco atual R$:"+ valor);
		System.out.print("Deseja Alguma bebida? Digite: 0 - Nao / 1 - Sim:");
		resp=input.nextInt();
		if(resp==1) {
			bebida.imprimeBebidas();
			valor+=bebida.comprar();
			
		}
			
	}
	
		System.out.println("Preco final da compra R$:"+ valor);
		
}
}