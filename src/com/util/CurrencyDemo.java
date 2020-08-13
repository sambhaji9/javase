package com.util;

import java.util.Currency;
import java.util.Locale;

public class CurrencyDemo {
    public static void main(String[] args) {
        Currency currency;

        currency = Currency.getInstance(Locale.US);
        System.out.println("Symbol: " + currency.getSymbol());
        System.out.println("Default fractional digits: " + currency.getDefaultFractionDigits());
    }
}
