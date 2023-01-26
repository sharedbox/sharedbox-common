package com.sharedbox.common.security.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.security.Token;

/**
 * Call test of Token class
 * 
 * @author Rafael Costi [rafaelcosti@outlook.com]
 * @version 1.0.0
 * @since 07/23/2021
 */
public class TokenTest {
	private final String TOKEN_1 =  "JR58p9y2OqaL9uGfXMsrmcprQ9NgQQNS7-M4S16rdsm7X"
			+ "IQO22IoP4k+6aNIerUzXz2NfkLgOT2joZhxQ0xLnUdiCuJTQXPYGTjg0ii1mb5jjm2X"
			+ "VFYVSosOg0bfb0EvI47KGGSoq6mRxu4j5joLtkHOLoXK3PcKOzhcvLqxhnu9Bu-wUJs"
			+ "8rqdxXZmvuovDUdGxee0+UekNu6vtV6mfZcNnfc2AUWix67Zlshw-m6WAnkCiJNx61K"
			+ "-LMtNqE3YQ-9kpvjdEPimrppbbcNy1z7LwM7rRjihBMQTraZEYvJUntvPqk1JAuUgKP"
			+ "JITWpgC2BtQvOWxID7NnjQv3MpT1N8llm-vA1aBJgIUXXj6Bo5YAWvddstT5F579iz0"
			+ "JTb9Ijz90izjYHF1dR7z89ICUZOjxGKorruKcVpjPQAUR1ygAd+0q5pt0s7xZCorHZS"
			+ "BYkMEsYDPk434actbn062MOexx-be1akPXjL2UcPAWiMuaD2tuY5rScnis6eRKT+-ef"
			+ "p94tVt0hy4rXQpWeMAxBMCU3LfikUM6igJkCyk4rezCXHBbrdFg9L1aMBJQC5j-F6yr"
			+ "Py9DhgLUklIW9OhhG+BT9dXhYYe-Ho83zVa3wRR1UJGfy5Skfu8MNctWLL78L8Jlnrj"
			+ "sMxMGijOaEcYy-YmfaFr86VZG6LHgA705fA1WRlNgw3CdJxiSXvBeH2A5eKugmN5aQ6"
			+ "Ppp2JSAdhNYRSTUgTuPrv87dN4ZJ9zo6JXJ1PHG5mr6PSBcP7hnkqkNARSO1g3EzqY4"
			+ "oo4XBG4e6OfV6WvfHq2onGoBZoQR59M3WY5I4X+lhB4qnu-OJUZafygIuoSPDlIy7U4"
			+ "TPRYEI7zQiWiCbviuti0JRUrD+Mqj-NTK6Hzz0L6lX+eWiaQtN6jbfj9sxK9dVKrEB1"
			+ "PW-OXzHoLpd0c-YoCxQmGkQ=";
	
	/**
	 * Constructor test
	 */
	@Test
	public void construcotTest() {
		assertNotNull(new Token());
	}
	
	/**
	 * Generate test
	 * @throws Exception 
	 */
	@Test
	public void generateTest() throws Exception {
		assertNotNull(Token.generate());
		assertNotNull(Token.generate("TESTE"));
		assertNotNull(Token.generate(TOKEN_1.hashCode()));
	}
	
	/**
	 * Reader test
	 * @throws Exception 
	 */
	@Test
	public void readerTest() throws Exception {
		assertNotNull(Token.reader(null));
		assertNotNull(Token.reader(Token.generate()));
		assertNotNull(Token.reader(TOKEN_1));
		assertNotNull(Token.readerValues(Token.generate()));
	}
}
