package pkgCurrencyExchange;

import java.util.Arrays;
import java.util.Scanner;

public class ExchangeRates {
	private String defaultCurrency = "GBP";

	private String currencyChoice; //Starting currency
	private String exchangeCurrency;

	public void setcurrencyChoice(String currency) {
		this.currencyChoice = currency;
	}

	public String getCurrency() {
		return this.currencyChoice;
	}

	public ExchangeRates() {
	}



	public void checkExchangeRates() {
		defaultCurrency = "GBP";
		GbpRates gbpRates = new GbpRates();
		UsdRates usdRates = new UsdRates();
		JpyRates jpyRates = new JpyRates();
		AudRates audRates = new AudRates();
		EurRates eurRates = new EurRates();
		ExchangeRates er = new ExchangeRates();

		System.out.println("\n---EXCHANGE RATES---\n");		
		System.out.println("Your default currency is set to " + defaultCurrency);

		gbpRates.GBPExchangeRates();

		while (true) {
			System.out.println(" ");
			System.out.println("Press 1 to change default currency");
			System.out.println("Press 2 to exchange currency");
			System.out.println("Press 3 to return to dashboard");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.next();

			if (input.equals("1")) {
				String input2;
				do {
					System.out.println("Set your default currency:");
					System.out.println("- USD" + "\n- EUR" + "\n- JPY" + "\n- AUD");
					input2 = scanner.next().toUpperCase();
				} while (!Arrays.asList("USD", "EUR", "JPY", "AUD").contains(input2));

				switch (input2) {
				case "USD":
					defaultCurrency = "USD";
					break;
				case "EUR":
					defaultCurrency = "EUR";
					break;
				case "JPY":
					defaultCurrency = "JPY";
					break;
				case "AUD":
					defaultCurrency = "AUD";
					break;
				default:
					System.out.println("Please pick a currency");
					break;
				}

				System.out.println("To check exchange rates press ENTER");
				scanner.nextLine(); // Consume the newline
				String enter = scanner.nextLine();

				// Call the appropriate method based on the selected currency
				switch (defaultCurrency) {
				case "USD":
					usdRates.USDExchangeRates();
					break;
				case "EUR":
					eurRates.EURExchangeRates();
					break;
				case "JPY":
					jpyRates.JPYExchangeRates();
					break;
				case "AUD":
					audRates.AUDExchangeRates();
					break;
				case "GBP":
					gbpRates.GBPExchangeRates();
					break;
				default:
					System.out.println("Invalid default currency");
				}
			} else if (input.equals("2")) {
				er.ExchangeCurrency();
			} else if (input.equals("3")) {
				break;
			} else {
				System.out.println("Please choose a valid option: ");
			}
		}
	}

	public void ExchangeCurrency() {
		//Chose your current Currency
		Scanner scanner = new Scanner(System.in);
		String currencyChoice;

		do {
			System.out.println("Select your current currency: \n1. USD ($) \n2. EUR (€) \n3. JPY (¥) \n4. AUD ($) \n5. GBP (£)");
			currencyChoice = scanner.next().toUpperCase();

			switch (currencyChoice) {
			case "1":
			case "USD":
				currencyChoice = "USD";
				break;
			case "2":
			case "EUR":
				currencyChoice = "EUR";
				break;
			case "3":
			case "JPY":
				currencyChoice = "JPY";
				break;
			case "4":
			case "AUD":
				currencyChoice = "AUD";
				break;
			case "5":
			case "GBP":
				currencyChoice = "GBP";
				break;
			default:
				System.out.println("Invalid input. Please pick a valid option.");
			}
		} while (!Arrays.asList("USD", "EUR", "JPY", "AUD", "GBP").contains(currencyChoice));

		System.out.println("You selected: " + currencyChoice);


		//Currency which you want
		System.out.println("Pick desired currency: ");
		if (currencyChoice == "GBP") {
			System.out.println("\n1. USD ($) \n2. EUR (€) \n3. JPY (¥) \n4. AUD ($)");	
			exchangeCurrency = scanner.next();
			switch(exchangeCurrency) {
			case "1":
			case "USD":
				exchangeCurrency = "USD";
				break;
			case "2":
			case "EUR":
				exchangeCurrency = "EUR";
				break;
			case "3":
			case "JPY":
				exchangeCurrency = "JPY";
				break;
			case "4":
			case "AUD":
				exchangeCurrency = "AUD";
				break;
			case "5":
			case "GBP":
				exchangeCurrency = "GBP";
				break;
			default:
				System.out.println("Please pick an option");
			} 

		} else if (currencyChoice == "USD") {
			System.out.println("\n1. EUR (€) \n2. JPY (¥) \n3. GBP (£) \n4. AUD ($)");	
			exchangeCurrency = scanner.next();
			switch(exchangeCurrency) {
			case "1":
			case "EUR":
				exchangeCurrency = "EUR";
				break;
			case "2":
			case "JPY":
				exchangeCurrency = "JPY";
				break;
			case "3":
			case "GBP":
				exchangeCurrency = "GBP";
				break;
			case "4":
			case "AUD":
				exchangeCurrency = "AUD";
				break;
			default:
				System.out.println("Please pick an option");
			} 

		} else if (currencyChoice == "EUR") {
			System.out.println("\n1. USD ($) \n2. GBP (£) \n3. JPY (¥) \n4. AUD ($)");	
			exchangeCurrency = scanner.next();
			switch(exchangeCurrency) {
			case "1":
			case "USD":
				exchangeCurrency = "USD";
				break;
			case "2":
			case "GBP":
				exchangeCurrency = "GBP";
				break;
			case "3":
			case "JPY":
				exchangeCurrency = "JPY";
				break;
			case "4":
			case "AUD":
				exchangeCurrency = "AUD";
				break;
			default:
				System.out.println("Please pick an option");
			} 

		} else if (currencyChoice == "JPY") {
			System.out.println("\n1. USD ($) \n2. EUR (€) \n3. GBP (£) \n4. AUD ($)");	
			exchangeCurrency = scanner.next();
			switch(exchangeCurrency) {
			case "1":
			case "USD":
				exchangeCurrency = "USD";
				break;
			case "2":
			case "EUR":
				exchangeCurrency = "EUR";
				break;
			case "3":
			case "GBP":
				exchangeCurrency = "GBP";
				break;
			case "4":
			case "AUD":
				exchangeCurrency = "AUD";
				break;
			default:
				System.out.println("Please pick an option");
			} 

		} else if (currencyChoice == "AUD") {
			System.out.println("\n1. USD ($) \n2. EUR (€) \n3. JPY (¥) \n4. GBP (£)");	
			exchangeCurrency = scanner.next();
			switch(exchangeCurrency) {
			case "1":
			case "USD":
				exchangeCurrency = "USD";
				break;
			case "2":
			case "EUR":
				exchangeCurrency = "EUR";
				break;
			case "3":
			case "JPY":
				exchangeCurrency = "JPY";
				break;
			case "4":
			case "GBP":
				exchangeCurrency = "GBP";
				break;
			default:
				System.out.println("Please pick an option");
			} 

		}

		ExchangeRates er = new ExchangeRates();
		GbpRates gbpRates = new GbpRates();
		UsdRates usdRates = new UsdRates();
		JpyRates jpyRates = new JpyRates();
		AudRates audRates = new AudRates();
		EurRates eurRates = new EurRates();
		//ExchangeCurrency could be a number so the following switch converts that into the Abbrevation currency

		//Doing the Maths
		System.out.println("\nEnter amount to exchange");
		if (currencyChoice == "USD" || currencyChoice == "AUD") {
			System.out.print("$");
		} else if (currencyChoice == "JPY") {
			System.out.print("¥");
		} else if (currencyChoice == "EUR") {
			System.out.print("€");
		} else if (currencyChoice == "GBP") {
			System.out.print("£");
		}
		String amount = scanner.next();
		double amount2 = Double.parseDouble(amount);

		//GBP maths
		if (currencyChoice == "GBP" && exchangeCurrency == "JPY") {
			double JPYresult = amount2 * gbpRates.getJPYrate();
			System.out.println("JPY = ¥" + JPYresult);
		} else if (currencyChoice == "GBP" && exchangeCurrency == "AUD") {
			double AUDresult = amount2 * gbpRates.getAUDrate();
			System.out.println("AUD = $" + AUDresult);
		} else if (currencyChoice == "GBP" && exchangeCurrency == "USD") {
			double USDresult = amount2 * gbpRates.getUSDrate();
			System.out.println("USD = $" + USDresult);
		} else if (currencyChoice == "GBP" && exchangeCurrency == "EUR") {
			double EURresult = amount2 * gbpRates.getEURrate();
			System.out.println("EUR = €" + EURresult);
		}

		//USDmaths
		if (currencyChoice == "USD" && exchangeCurrency == "JPY") {
			double JPYresult = amount2 * usdRates.getJPYrate();
			System.out.println("JPY = ¥" + JPYresult);
		} else if (currencyChoice == "USD" && exchangeCurrency == "AUD") {
			double AUDresult = amount2 * usdRates.getAUDrate();
			System.out.println("AUD = $" + AUDresult);
		} else if (currencyChoice == "USD" && exchangeCurrency == "GBP") {
			double GBPresult = amount2 * usdRates.getGBPrate();
			System.out.println("GBP = £" + GBPresult);
		} else if (currencyChoice == "USD" && exchangeCurrency == "EUR") {
			double EURresult = amount2 * usdRates.getEURrate();
			System.out.println("EUR = €" + EURresult);
		}		

		//AUDmaths
		if (currencyChoice == "AUD" && exchangeCurrency == "JPY") {
			double JPYresult = amount2 * audRates.getJPYrate();
			System.out.println("JPY = ¥" + JPYresult);
		} else if (currencyChoice == "AUD" && exchangeCurrency == "USD") {
			double USDresult = amount2 * audRates.getUSDrate();
			System.out.println("USD = $" + USDresult);
		} else if (currencyChoice == "AUD" && exchangeCurrency == "GBP") {
			double USDresult = amount2 * audRates.getGBPrate();
			System.out.println("GBP = £" + USDresult);
		} else if (currencyChoice == "AUD" && exchangeCurrency == "EUR") {
			double EURresult = amount2 * audRates.getEURrate();
			System.out.println("EUR = €" + EURresult);
		}

		//JPYmaths
		if (currencyChoice == "JPY" && exchangeCurrency == "AUD") {
			double AUDresult = amount2 * jpyRates.getAUDrate();
			System.out.println("JPY = ¥" + AUDresult);
		} else if (currencyChoice == "JPY" && exchangeCurrency == "USD") {
			double USDresult = amount2 * jpyRates.getUSDrate();
			System.out.println("USD = $" + USDresult);
		} else if (currencyChoice == "JPY" && exchangeCurrency == "GBP") {
			double USDresult = amount2 * jpyRates.getGBPrate();
			System.out.println("GBP = £" + USDresult);
		} else if (currencyChoice == "JPY" && exchangeCurrency == "EUR") {
			double EURresult = amount2 * jpyRates.getEURrate();
			System.out.println("EUR = €" + EURresult);
		}

		//EURmaths
		if (currencyChoice == "EUR" && exchangeCurrency == "AUD") {
			double AUDresult = amount2 * eurRates.getAUDrate();
			System.out.println("JPY = ¥" + AUDresult);
		} else if (currencyChoice == "EUR" && exchangeCurrency == "USD") {
			double USDresult = amount2 * eurRates.getUSDrate();
			System.out.println("USD = $" + USDresult);
		} else if (currencyChoice == "EUR" && exchangeCurrency == "GBP") {
			double USDresult = amount2 * eurRates.getGBPrate();
			System.out.println("GBP = £" + USDresult);
		} else if (currencyChoice == "EUR" && exchangeCurrency == "JPY") {
			double JPYresult = amount2 * eurRates.getJPYrate();
			System.out.println("JPY = €" + JPYresult);
		}

		System.out.println("Press any key to Continue");
		scanner.nextLine();
		String cont = scanner.nextLine();


		System.out.println("To exchange more money press 1");
		System.out.println("To go back press 2");
		String option = scanner.next();

		if (option.equals("2")) {

		} else if (option.equals("1")) {
			er.ExchangeCurrency();
		}
		else {
			System.out.println("Please enter a valid option");
		}
	}
}
