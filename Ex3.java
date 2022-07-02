import java.util.Scanner;
public class Ex3{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantidade de dias no mes que houve faturamento: ");
		int quantidade = leia.nextInt();
		double maior = 0;
		double menor = 10238093387648.27;
		double[] faturamento_mensal = new double[quantidade];
		System.out.println("Digite a media mensal: ");
		double media_mensal = leia.nextDouble();
		double media_atual = 0;
		for(int i = 0;i<faturamento_mensal.length;i++){
			
			System.out.println("Digite o valor faturado no dia " + (i+1) +" do mes: ");
			faturamento_mensal[i] = leia.nextDouble();
			if(faturamento_mensal[i] > maior){
				
				maior = faturamento_mensal[i];
			}
			if(faturamento_mensal[i] < menor){
				
				menor = faturamento_mensal[i];
			}
			media_atual += faturamento_mensal[i];
		}
		
		System.out.println("Media atual: " + media_atual);
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println((media_atual > media_mensal ? "A media do mes atual e maior que a mensal!":"A media do mes atual e menor que a media mensal!"));
	}
}

