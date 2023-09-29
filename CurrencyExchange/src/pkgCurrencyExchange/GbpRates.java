package pkgCurrencyExchange;

import java.util.Scanner;

public class GbpRates {
	private double GBPtoEURExchangeRate = 1.18;
	private double GBPtoUSDExchangeRate = 1.21;
	private double GBPtoJPYExchangeRate = 181.59;
	private double GBPtoAUDExchangeRate = 1.91;
	public GbpRates() {
	}
	
	//Euro
	public void setEURrate(double EuroRate) {
		this.GBPtoEURExchangeRate = EuroRate;
	}

	public double getEURrate() {
		return this.GBPtoEURExchangeRate;
	}

	//USD
	public void setUSDrate(double usdRate) {
		this.GBPtoUSDExchangeRate = usdRate;
	}

	public double getUSDrate() {
		return this.GBPtoUSDExchangeRate;
	}

	//Japanese Yen
	public void setJPYrate(double yenRate) {
		this.GBPtoJPYExchangeRate = yenRate;
	}

	public double getJPYrate() {
		return this.GBPtoJPYExchangeRate;
	}

	//Austrailian Dollar
	public void setAUDrate(double AudRate) {
		this.GBPtoAUDExchangeRate = AudRate;
	}

	public double getAUDrate() {
		return this.GBPtoAUDExchangeRate;
	}


	public void GBPExchangeRates() {
		GbpRates gbpRates = new GbpRates();
		System.out.println("United States Dollar (USD) --  $" + gbpRates.getUSDrate());
		System.out.println("Euro (EUR) -- €" + gbpRates.getEURrate());
		System.out.println("Japanese Yen (JPY) -- ¥" + gbpRates.getJPYrate());
		System.out.println("Austrailian Dollar (AUD) -- $" + gbpRates.getAUDrate());
	}
}
