import java.util.Scanner;
public class Ex5{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite uma palavra/frase: ");
		String frase = leia.nextLine();
		String frase_invertida = "";
		
		for(int i = frase.length()-1; i>=0;i--){
			
			frase_invertida+= frase.charAt(i);
			
		}
		System.out.println("Frase invertida: " + frase_invertida);
	}
}

