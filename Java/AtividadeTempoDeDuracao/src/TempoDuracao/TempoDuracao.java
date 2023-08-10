package TempoDuracao;
	
	import java.util.Scanner;
	
	public class TempoDuracao {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o tempo de duração em segundos: ");
	        int tempoSegundos = scanner.nextInt();

	        int horas = tempoSegundos / 3600;
	        int minutos = (tempoSegundos % 3600) / 60;
	        int segundos = tempoSegundos % 60;

	        System.out.println("O evento durou: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");

	        scanner.close();
	    }
}
