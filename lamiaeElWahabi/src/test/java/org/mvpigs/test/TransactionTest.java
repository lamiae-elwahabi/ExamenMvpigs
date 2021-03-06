package org.mvpigs.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mvpigs.transaction.Transaction;


public class TransactionTest {
	//Inicializamos los parametros a utilizar en los casos test

	Transaction transaction = new Transaction();
	byte[] signaturee = {1, 5, 6};

	@Before
	public  void setup() {
		transaction= new Transaction();
	}
	@Test
	public void testAssertArrayEqual() {
		byte[] signature = {1, 5, 6};
		assertArrayEquals(signaturee, signature);

	}
	@Test 
	public void testAssertEqual() {
		assertEquals((transaction.getHash()), ""); 
	}
}