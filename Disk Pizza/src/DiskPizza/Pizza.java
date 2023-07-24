package DiskPizza;
import java.util.Scanner;
@SuppressWarnings("unused")

public class Pizza {
	
	private int tomate=1, ovo=1,batata_palha=2, milho=1, cebola=1;
	private float mussarela = 4.50f;
	private float requeijao = 4.50f;

	private float calabresa = 4.50f;
	private float bacon = 4.50f;
	private float cheedar = 3.50f;
	private float oregano= 0.50f;
	private float azeitona= 2.50f;
	private float Total=0;
	Cardapio C1= new Cardapio();
	int op=0;
	Scanner input = new Scanner(System.in);
	
	float comprar(int resp) {
		if(resp==1) {
			Total=mussarela+calabresa+cheedar+oregano+azeitona+tomate;
			
			return Total;
		}
		if(resp==2) {
			Total=3*calabresa + azeitona+cebola;
			
			return Total;
	
		}
		if(resp==3) {
			Total=3*mussarela +cheedar+ requeijao+oregano+azeitona;
		}
		if(resp==4) {
			Total=3*bacon + cheedar + azeitona + cebola + tomate;
			
			return Total;
		}
		if(resp==5) {
			C1.imprimeIngredientes();
			
			while(op!=-1) {
				System.out.print("Digite uma opcao: ");
				
				op=input.nextInt();
				switch(op) {
				case 1:
					Total+=1;
					break;
					
				case 2:
					Total+=1;
					break;
				case 3:
					Total+=2;
					break;
				case 4:
					Total+=1;
					break;
				case 5:
					Total+=1;
					break;
				
				case 6:
					Total+=4.50;
					break;
				
				case 7:
					Total+=4.50;
					break;
				
				case 8:
					Total+=4.50;
					break;
				
				case 9:
					Total+=4.50;
					break;
				
				case 10:
					Total+=3.50;
					break;
				
				case 11:
					Total+=0.50;
					break;
				case 12:
					Total+=2.50;
					break;
				default:
					break;
				
				
				}
				System.out.println("Valor atual: " +Total);
			}
			return Total;
			
			
		}
		
		
		return Total;
		
	}

	
}
