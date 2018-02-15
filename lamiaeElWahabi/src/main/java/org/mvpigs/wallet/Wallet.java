package org.mvpigs.wallet;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.Map;

import org.mvpigs.blockChain.BlockChain;
import org.mvpigs.pigcoin.GenSig;

public class Wallet {
	//Propiedades
	private PublicKey Address = null ;  //clave pública de la wallet
	private PrivateKey SKey = null;  //clave privada de la wallet
	private double total_input = 0.0;
	private double total_output = 0.0;
	private double balance = 0.0;
	private String inputTransactions = "";
	private String outputTransactions = "";
	private GenSig genSig;
	
	public void setSK(PrivateKey sKey) {
			}
	//Getters y Setters 
	public PublicKey getAddress() {
		return Address;
	}

	public void setAddress(PublicKey pKey) {
		Address = pKey;
	}

	public PrivateKey getSKey() {
		return SKey;
	}

	public void setSKey(PrivateKey sKey) {
		SKey = sKey;
	}
	
	public void setInputTransactions(String inputTransactions) {
		this.inputTransactions = inputTransactions;
	}
	public void setOutputTransactions(String outputTransactions) {
		this.outputTransactions = outputTransactions;
	}
	public double getTotal_input() {
		return total_input;
	}
	public void setTotal_input(double total_input) {
		this.total_input = total_input;
	}
	public double getTotal_output() {
		return total_output;
	}
	public void setTotal_output(double total_output) {
		this.total_output = total_output;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//Metodos
	/* genera el par clave privada - clave pública
	 *  para la wallet utilizando la clase GenSig 
	 */
	public void generateKeyPair() {
		KeyPair pares = GenSig.generateKeyPair();
		this.setSK(pares.getPrivate());
		this.setAddress(pares.getPublic());
		
	}
	public String toString(){
		System.out.println( getTotal_input() + "\n" + getTotal_output() + "\n" + getBalance());
		return inputTransactions;
	}
	public void loadCoins(BlockChain bChain) {
		
		
	}
	public void loadInputTransactions(BlockChain bChain) {
		
		
	}
	public void loadOutputTransactions(BlockChain bChain) {
		
		
	}
	public Object getOutputTransactions() {
		
		return null;
	}
	public Object getInputTransactions() {
		
		
		return null;
	}
	public byte[] signTransaction(String message) {
		
		return null;
	}
	public void sendCoins(PublicKey address2, Double pigcoins, String message, BlockChain bChain) {
		
		
	}
	public Map<String, Double> collectCoins(Double pigcoins) {
		
		return null;
	}

	
}
