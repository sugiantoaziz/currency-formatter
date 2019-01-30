package com.metrasys.db2.currency.formatter;

import java.math.BigDecimal;

import com.metrasys.db2.currency.formatter.constant.Constants;

public class AppMainTest {

	public static void main(String[] args) {
		String formattedCurrency = CurrencyFormatter.formatCurrency(Constants.RUPIAH_INDONESIA, new BigDecimal(100000),
				Constants.PEMISAH_DESIMAL, Constants.PEMISAH_GRUP);
		System.out.println(formattedCurrency);
	}

}
