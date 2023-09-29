package pkgCurrencyExchange;

import java.util.Scanner;

public class AudRates {

	private double AUDtoEURExchangeRate = 0.60;
	private double AUDtoGBPExchangeRate = 0.52;
	private double AUDtoJPYExchangeRate = 95.00;
	private double AUDtoUSDExchangeRate = 0.64;

	public AudRates() {
	}

	//Euro
	public void setEURrate(double EuroRate) {
		this.AUDtoEURExchangeRate = EuroRate;
	}
	
	public double getEURrate() {
		return this.AUDtoEURExchangeRate;
	}
	
	//USD
	public void setGBPrate(double gbpRate) {
		this.AUDtoGBPExchangeRate = gbpRate;
	}
	
	public double getGBPrate() {
		return this.AUDtoGBPExchangeRate;
	}
	
	//Japanese Yen
	public void setJPYrate(double yenRate) {
		this.AUDtoJPYExchangeRate = yenRate;
	}
	
	public double getJPYrate() {
		return this.AUDtoJPYExchangeRate;
	}
	
	//United States Dollar
	public void setUSDrate(double usdRate) {
		this.AUDtoUSDExchangeRate = usdRate;
	}
	
	public double getUSDrate() {
		return this.AUDtoUSDExchangeRate;
	}

	public void AUDExchangeRates() {
		AudRates audRates = new AudRates();
		System.out.println("United States Dollar (USD) --  $" + audRates.getEURrate());
		System.out.println("Euro (EUR) -- €" + audRates.getEURrate());
		System.out.println("Japanese Yen (JPY) -- ¥" + audRates.getJPYrate());
		System.out.println("Great British Pound (GBP) -- $" + audRates.getGBPrate());
	}

}
