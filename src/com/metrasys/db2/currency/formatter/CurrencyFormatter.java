package com.metrasys.db2.currency.formatter;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import COM.ibm.db2.app.UDF;

public class CurrencyFormatter extends UDF {

	public static String formatCurrency(String currency, BigDecimal nominal, char decimalSeparator,
			char groupingSeparator) {
		DecimalFormat currencyFormat = (DecimalFormat) DecimalFormat.getCurrencyInstance();
		DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();

		decimalFormatSymbols.setCurrencySymbol(currency);
		decimalFormatSymbols.setMonetaryDecimalSeparator(decimalSeparator);
		decimalFormatSymbols.setGroupingSeparator(groupingSeparator);
		
		currencyFormat.setDecimalFormatSymbols(decimalFormatSymbols);
		try {
			return currencyFormat.format(nominal.doubleValue());
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
