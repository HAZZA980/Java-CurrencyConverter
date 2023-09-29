package pkgCurrencyExchange;

import java.util.Scanner;

public class JpyRates {
	private double JPYtoEURExchangeRate = 0.0064;
	private double JPYtoGBPExchangeRate = 0.0055;
	private double JPYtoUSDExchangeRate = 0.0067;
	private double JPYtoAUDExchangeRate = 0.0011;

	public JpyRates() {
	}

	//Euro
	public void setEURrate(double EuroRate) {
		this.JPYtoEURExchangeRate = EuroRate;
	}
	
	public double getEURrate() {
		return this.JPYtoEURExchangeRate;
	}
	
	//GBP
	public void setGBPrate(double gbpRate) {
		this.JPYtoGBPExchangeRate = gbpRate;
	}
	
	public double getGBPrate() {
		return this.JPYtoGBPExchangeRate;
	}
	
	//US Dollar
	public void setUSDrate(double usdRate) {
		this.JPYtoUSDExchangeRate = usdRate;
	}
	
	public double getUSDrate() {
		return this.JPYtoUSDExchangeRate;
	}
	
	//Austrailian Dollar
	public void setAUDrate(double AudRate) {
		this.JPYtoAUDExchangeRate = AudRate;
	}
	
	public double getAUDrate() {
		return this.JPYtoAUDExchangeRate;
	}
	
	public void JPYExchangeRates() {
		JpyRates jpyRates = new JpyRates();
		System.out.println("United States Dollar (USD) --  $" + jpyRates.getEURrate());
		System.out.println("Euro (EUR) -- €" + jpyRates.getEURrate());
		System.out.println("Great British Pound (GBP) -- £" + jpyRates.getGBPrate());
		System.out.println("Austrailian Dollar (AUD) -- $" + jpyRates.getAUDrate());
	}

}
