package Atividade1;

	
	import java.util.Scanner;
		
	public class Atividade1 {

	        public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a primeira nota: ");
	        double nota1 = scanner.nextDouble();

	        System.out.print("Digite a segunda nota: ");
	        double nota2 = scanner.nextDouble();

	        System.out.print("Digite a terceira nota: ");
	        double nota3 = scanner.nextDouble();

	        double peso1 = 2;
	        double peso2 = 3;
	        double peso3 = 5;

	        double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

	        System.out.println("A média final do aluno é: " + media);

	        scanner.close();
	    }

}
