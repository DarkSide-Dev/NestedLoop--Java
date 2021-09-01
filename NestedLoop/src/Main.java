import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		System.out.print("Enter the number of rows: ");
		rows = scanner.nextInt();
		
		System.out.print("Enter the number of columns: ");
		columns = scanner.nextInt();
		
		System.out.print("Enter the symbol you want to use: ");
		symbol = scanner.next();

		System.out.println();
		
		for(int j = 0; j < columns; j++) {
			
			for(int i = 0; i < rows; i++) {
				
				System.out.print(symbol);
				
			}
			
			System.out.println("");
			
		}

	}

}
