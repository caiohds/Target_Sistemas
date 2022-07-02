import java.util.Scanner;
public class Ex4{
	
	public static void main (String[] args){
		Faturamentos faturamentos[] = new Faturamentos[5];
		
		faturamentos[0] = new Faturamentos("SP",67836.43);
		faturamentos[1] = new Faturamentos("RJ",36678.66);
		faturamentos[2] = new Faturamentos("MG",29229.88);
		faturamentos[3] = new Faturamentos("ES",27165.48);
		faturamentos[4] = new Faturamentos("Outros",19849.53);
		double faturamento_total = 0;
		for(int i = 0;i<faturamentos.length;i++){
			
			faturamento_total+=faturamentos[i].getFaturamento();
		}
		for(int i = 0;i<faturamentos.length;i++){
			
			System.out.printf(faturamentos[i].getNome() +": %.2f%% %n",(faturamentos[i].getFaturamento()/faturamento_total)*100 );
			
		}
		
	}
}

