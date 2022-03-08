package br.com.sharedbox.common.documents.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.sharedbox.common.documents.EMail;

/**
 * 
 * @author Rafael Costi - rafaelcosti@outlook.com
 * @version 1.0.0
 * @since 12/28/2021
 */
public class EMailTest {
	/**
	 * Test constructor class
	 */
	@Test
	void constructorTest() {
		assertNotNull(new EMail());
	}

	/**
	 * 
	 * @return
	 */
	@Test
	public void validateTest() {
		assertTrue(new EMail("rafaelcosti@outlook.com").validate());
		assertTrue(new EMail("rafaelcosti@outlook.com").validate(true));
		assertFalse(new EMail("rafaelcosti@not-exist.com").validate(true));
		assertFalse(new EMail(null).validate());
		assertFalse(new EMail("##$$@outlook.com.").validate(true));
		assertFalse(new EMail("rafaelcost#i@&outlook.com").validate(true));
		assertFalse(new EMail("rafaelcost#i@outlook").validate());
		assertFalse(new EMail("rafaelcost#i@com").validate());
		assertFalse(new EMail("rafaelcosti@outlook.com.").validate(true));
	}
}
