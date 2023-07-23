

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
					
	public static void main(String[] args) throws IOException {
		int aux1=0;
		try {
			Map<String,Integer>map=new HashMap<>();
			
			map.put("teste", 3);
			map.put("umaPalavra", 1);
			map.put("outraPalavra", 10);
		
			FileOutputStream out= new FileOutputStream("Destino.txt");
			PrintWriter aux= new PrintWriter(out);
			
			for(Map.Entry<String, Integer>entry : map.entrySet()) {
				aux.println(entry.getKey()+" "+entry.getValue());
			}
			
			aux.close();
			out.close();
			
			
		}
		catch(Exception e) {
			aux1=1;
			System.err.println("Erro!\n" + e.getMessage());
		}finally {
			if(aux1==0){
				System.out.println("Arquivo gerado com sucesso!");
			}
			
		}
		
		
	
		
	}
	
}