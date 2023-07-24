package DiskPizza;
@SuppressWarnings("unused")
public class Distribuidora {
	
	private String Nome, CGC, Telefone, Endereco;
	private int qtd_coca=1000, qtd_fanta=800, qtd_cerveja=1500, qtd_suco=300;
	
		public Distribuidora(String n, String C, String T, String End){
			Nome=n;
			CGC=C;
			Telefone=T;
			Endereco=End;
			
		}
		
		
		
		
	public int comprar(int op, int quantidade) {
		
		
		switch(op) {
		case 1:
			if(qtd_coca>0) {
				qtd_coca-=quantidade;
				return quantidade;
				}
			break;
			
			
		case 2:
			if(qtd_fanta>0) {
				qtd_fanta-=quantidade;
				return quantidade;
			}
			break;
		case 3:
			if(qtd_cerveja>0) {
				qtd_cerveja-=quantidade;
				return quantidade;
			}
			break;
		case 4:
			if(qtd_suco>0) {
				qtd_suco-=quantidade;
				return quantidade;
			}
			break;
		default:
			break;
			
}
		
		return 0;
		
		
		
	}
	
	
	
	
	

}
