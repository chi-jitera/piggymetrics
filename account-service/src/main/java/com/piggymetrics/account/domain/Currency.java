package com.piggymetrics.account.domain;

public enum Currency {

	USD, EUR, RUB, VND;

	public static Currency getDefault() {
		return USD;
	}
}
