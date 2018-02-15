package org.mvpigs.wallet;

import java.security.PrivateKey;
import java.security.PublicKey;

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
	
	public void setSK(PrivateKey private1) {
		
		
	}
	//Getters y Setters 
	public PublicKey getAddress() {
		return Address;
	}

	public void setAddress(PublicKey address) {
		Address = address;
	}

	public PrivateKey getSKey() {
		return SKey;
	}

	public void setSKey(PrivateKey sKey) {
		SKey = sKey;
	}
	//Metodos
	/* genera el par clave privada - clave pública
	 *  para la wallet utilizando la clase GenSig 
	 */
	public void generateKeyPair() {
		genSig = new GenSig();
		GenSig.generateKeyPair();
	
	
		
	}

	

	
	

}
