package com.piggymetrics.account.chi1;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Savings settings/details for an account.
 * <p>
 * Includes current amount, currency, interest rate, and flags describing whether it is a deposit
 * and whether interest is capitalized.
 */
public class Saving {

	@NotNull
	private BigDecimal amount;

	@NotNull
	private Currency currency;

	@NotNull
	private BigDecimal interest;

	@NotNull
	private Boolean deposit;

	@NotNull
	private Boolean capitalization;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public BigDecimal getInterest() {
		return interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	public Boolean getDeposit() {
		return deposit;
	}

	public void setDeposit(Boolean deposit) {
		this.deposit = deposit;
	}

	public Boolean getCapitalization() {
		return capitalization;
	}

	public void setCapitalization(Boolean capitalization) {
		this.capitalization = capitalization;
	}
}