package pkgCurrencyExchange;

import java.util.Scanner;

public class EurRates {
	private double EURtoUSDExchangeRate = 0.95;
	private double EURtoGBPExchangeRate = 0.82;
	private double EURtoJPYExchangeRate = 149.44;
	private double EURtoAUDExchangeRate = 1.57;

	public EurRates() {
	}

	//Euro
	public void setUSDrate(double EuroRate) {
		this.EURtoUSDExchangeRate = EuroRate;
	}
	
	public double getUSDrate() {
		return this.EURtoUSDExchangeRate;
	}
	
	//USD
	public void setGBPrate(double gbpRate) {
		this.EURtoGBPExchangeRate = gbpRate;
	}
	
	public double getGBPrate() {
		return this.EURtoGBPExchangeRate;
	}
	
	//Japanese Yen
	public void setJPYrate(double yenRate) {
		this.EURtoJPYExchangeRate = yenRate;
	}
	
	public double getJPYrate() {
		return this.EURtoJPYExchangeRate;
	}
	
	//Austrailian Dollar
	public void setAUDrate(double AudRate) {
		this.EURtoAUDExchangeRate = AudRate;
	}
	
	public double getAUDrate() {
		return this.EURtoAUDExchangeRate;
	}
	
	public void EURExchangeRates() {
		EurRates eurRates = new EurRates();
		System.out.println("United States Dollar (USD) --  $" + eurRates.getUSDrate());
		System.out.println("Great British Pound (GBP) -- £" + eurRates.getGBPrate());
		System.out.println("Japanese Yen (JPY) -- ¥" + eurRates.getJPYrate());
		System.out.println("Austrailian Dollar (AUD) -- $" + eurRates.getAUDrate());
	}
}
