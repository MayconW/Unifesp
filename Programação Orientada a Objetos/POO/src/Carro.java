
@SuppressWarnings("unused")

public class Carro {
	
	private String Marca, modelo, placa;
	private boolean ligado;
	private float bateria, combustivel, velocidade;
	private Contador VezesLigou =new Contador() , VezesAcelerou =new Contador() , VezesFreou =new Contador();
	
	/*Inclui algumas coisas como velocidade, bateria e combustivel, para colocar algumas condições e o programa ter uma base "mais realista"*/
	
	public Carro(String Mar, String Mod, String Pl, boolean lig, float bat, float comb) {
		
		this.Marca=Mar;
		this.modelo=Mod;
		this.placa=Pl;
		this.bateria=bat;
		this.combustivel=comb;
		this.velocidade=0;
		
	}
	
	public void ligar() {
		/*Considerei que se ele ja esta ligado nao preciso ligar novamente*/
		if(this.ligado!=true ) {
			/*Tambem considerei que pra ligar ele deve ter carga e combustivel*/
			if(bateria==0 || combustivel==0) {
				
				System.out.println("Impossivel ligar o " +this.modelo+ "! Bateria: "+this.bateria+ "% Combustivel: "+this.combustivel+ "%");
			}else {
			this.ligado=true;
			this.VezesLigou.incrementa1();
			System.out.println("Carro " +this.modelo + " Ligado");
			System.out.println("Quantidade de vezes que o "+this.modelo +" foi ligado:"+VezesLigou.Contador_Atual());
			}
			}else {
			
			System.out.println("Carro " + this.modelo + " já está ligado!");
			
			
		}
		
		
	}
	public void desligar() {
		
		if(this.ligado==true) {
			System.out.println("Carro " + this.modelo + " Foi Desligado!");
			this.ligado=false;
		}else {
			System.out.println("Carro " + this.modelo + " Já esta Desligado!");
		}
		
		
		
	}
	
	
	public void frear() {
		/*Considerei que a pessoa pode pisar no freio mesmo com o carro parado desligado*/
		
		this.VezesFreou.incrementa1();
		/*Caso o carro estiver ligado, sua velocidade vai diminuindo*/
		if(this.ligado==true) {
			
				this.velocidade--;
			
		}
	
		
		System.out.println("Freando o " +this.modelo + " Pela " +VezesFreou.Contador_Atual()+ " Vez");
		
		
		
	}
	
	public void acelerar() {
		/*Considerei que para a aceleração ser contabilizada, o carro deve estar ligado*/
		if(this.ligado==true) {	
			this.VezesAcelerou.incrementa1();
			this.velocidade++;
			System.out.println("Acelerando o " +this.modelo + " Pela " +VezesAcelerou.Contador_Atual()+ " Vez");
		}else {
			System.out.println("Carro " + this.modelo + " esta desligado, não foi possivel acelerar!");
		
		
		
		
	}}

	public void abastecer(int litros) {
		System.out.println("Abastecendo o "+ this.modelo + " Em "+litros +" Litros");
		this.combustivel+=litros;
		
	}
	
	
	
	
	
	}	
	
	

