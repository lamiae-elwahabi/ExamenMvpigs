package org.mvpigs.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mvpigs.blockChain.BlockChain;
import org.mvpigs.transaction.Transaction;
import org.junit.Before;


public class BlockChainTest {
	BlockChain blockChain = new BlockChain();

	@Before
	public  void setup() {
		blockChain = new BlockChain();
	}
	@Test
	public void testAssertTrue() {
		assertTrue(blockChain == blockChain);
	}
}
