package org.mvpigs.transaction;

import java.security.PublicKey;

public class Transaction {

	//Propiedades
	private String hash = "";
	private double prev_hash = 0.0;
	private PublicKey pKey_sender = null;
	private PublicKey pKey_recipient = null;
	private double pigcoins = 0.0;
	private String message = "";
	byte[] signature;

	//Constructor
	public Transaction() {

	}

	public Transaction(String hash, double pigcoins, String message) {
		this.hash = hash;
		this.pigcoins = pigcoins;
		this.message = message;
	}
	//Getters y Setters

	public Transaction(String string, String string2, PublicKey address, PublicKey address2, int i, String string3) {

	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public double getPigcoins() {
		return pigcoins;
	}

	public void setPigcoins(double pigcoins) {
		this.pigcoins = pigcoins;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
