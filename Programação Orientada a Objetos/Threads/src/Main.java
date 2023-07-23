import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     
        int numThreads = 1;

       
        int valorInicial;
        int valorFinal;
        int cont=0;
        int trabalho=0;
        int resp;

    	Scanner s = new Scanner(System.in);
    	
    	System.out.print("Digite o Valor Inicial:");
    	valorInicial=s.nextInt();
    	System.out.print("Digite o Valor Final:");
    	valorFinal=s.nextInt();
    	do {
    		System.out.print("Digite a Quantidade de Theads (Entre 1 - 5): ");
    		numThreads=s.nextInt();
    		
    	}while(numThreads>5||numThreads<1);
    	
    	
    	
    	System.out.println("Intervalo: [" +valorInicial +"] - [" +valorFinal +"], Utilizando: " +numThreads +" Threads");
    	
    	
        Collection<Long> primos = new ArrayList<>();

        //lista de threads
        Collection<CalculaPrimos> threads = new ArrayList<>();

        if(valorInicial==0) {
        	 trabalho = valorFinal / 1;
        }else {
         trabalho = valorFinal / valorInicial;
        }
        

        for (int i = 1; i <= numThreads; i++) {
            int trab = Math.round(trabalho / numThreads);
            int fim = trab * i;
            int ini = (fim - trab) + 1;
            CalculaPrimos thread = new CalculaPrimos(ini, fim, primos);
            thread.setName("Thread "+i);
            threads.add(thread);
        }

        for (CalculaPrimos cp : threads) {
            cp.start();
        }

        for (CalculaPrimos cp : threads) {
            try {
                cp.join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        
        System.out.println("\n" +"Existem: " +primos.size() +" numeros primos neste intervalo!");
        
        System.out.println("Deseja Visualiza-los?: 0-Nao / 1-Sim:");
     
        	resp=s.nextInt();
        
        	
      
        
 
        if(resp==1) {
        	
        	 for (Long primo : primos) {
        		 System.out.println(primo);
             }
        	 }
        System.out.println("Encerrando!");
    
    
}}