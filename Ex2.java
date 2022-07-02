import java.util.Scanner;
public class Ex2 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite um numero: ");
		int numero = leia.nextInt();
		System.out.println(fib(numero));
		
	}
	public static String fib(int numero){
		int anterior = 0;
		int atual = 1;
		int proximo = 0;
		for(int i = 0;i<=numero;i++){
			
			System.out.print("  "+ anterior);
			proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
			if(numero == proximo){
				
				System.out.print("  "+ anterior);
				System.out.print("  "+ proximo);
				return "\nO numero pertence a sequencia fibonacci!";
			}
		}	
		return "\nO numero nao pertence a sequencia fibonacci!";
	}
}

