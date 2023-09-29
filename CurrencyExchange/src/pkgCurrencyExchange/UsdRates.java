package pkgCurrencyExchange;

import java.util.Scanner;

public class UsdRates {
		private double USDtoEURExchangeRate = 0.95;
		private double USDtoGBPExchangeRate = 0.82;
		private double USDtoJPYExchangeRate = 149.44;
		private double USDtoAUDExchangeRate = 1.57;

		public UsdRates() {
		}

		//Euro
		public void setEURrate(double EuroRate) {
			this.USDtoEURExchangeRate = EuroRate;
		}
		
		public double getEURrate() {
			return this.USDtoEURExchangeRate;
		}
		
		//USD
		public void setGBPrate(double gbpRate) {
			this.USDtoGBPExchangeRate = gbpRate;
		}
		
		public double getGBPrate() {
			return this.USDtoGBPExchangeRate;
		}
		
		//Japanese Yen
		public void setJPYrate(double yenRate) {
			this.USDtoJPYExchangeRate = yenRate;
		}
		
		public double getJPYrate() {
			return this.USDtoJPYExchangeRate;
		}
		
		//Austrailian Dollar
		public void setAUDrate(double AudRate) {
			this.USDtoAUDExchangeRate = AudRate;
		}
		
		public double getAUDrate() {
			return this.USDtoAUDExchangeRate;
		}

		public void USDExchangeRates() {
			UsdRates usdRates = new UsdRates();
			System.out.println("Great British Pound (GBP) --  £" + usdRates.getGBPrate());
			System.out.println("Euro (EUR) -- €" + usdRates.getEURrate());
			System.out.println("Japanese Yen (JPY) -- ¥" + usdRates.getJPYrate());
			System.out.println("Austrailian Dollar (AUD) -- $" + usdRates.getAUDrate());
		}
	
}
