package pkgCurrencyExchange;
import java.util.Scanner;

public class AppLoader {

	public static void main(String[] args) {		
		ExchangeRates er = new ExchangeRates();
		//Currency Converter - DASHBOARD
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("\n---DASHBOARD---\n");
			System.out.println("Please chose from the following options - Press 1, 2 or 3");
			System.out.println("1. Check exchange rate");
			System.out.println("2. Exchange Currency");
			System.out.println("3. Exit\n");

			String input = scanner.next();

			switch(input) {
			case ("1"):
				er.checkExchangeRates();
			break;
			case ("2"):
				er.ExchangeCurrency();
			break;
			case ("3"):
				System.out.println("Exiting program.");
				scanner.close();
				System.exit(0);	
			}
		}
	}
}
