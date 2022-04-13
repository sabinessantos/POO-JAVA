package avaliacao.unidade20221.faculdade.tui;
import java.util.Scanner;

public class TuiUtil {
 		private static Scanner scanner = new Scanner(System.in);
 

		public static Integer obterInteger(String texto) {
			System.out.println(texto);
			int valor = scanner.nextInt();
			scanner.nextLine();
			return valor;
		}
 
		public static String obterString(String texto) {
			System.out.println(texto);
			return scanner.nextLine();
		}
	 
}