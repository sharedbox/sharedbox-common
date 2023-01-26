package com.sharedbox.common.documents.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.sharedbox.common.documents.EMail;
import com.sharedbox.common.network.TLDDomain;

/**
 * 
 * @author Rafael Costi - rafaelcosti@outlook.com
 * @version 1.0.0
 * @since 12/28/2021
 */
public class EMailTest {
	/**
	 * 
	 * @return
	 */
	@Test
	public void validateTest() {
		assertTrue(EMail.create("rafaelcosti@outlook.com").validate());
		assertTrue(EMail.create("rafaelcosti@outlook.com").validate(true));
		assertFalse(EMail.create("rafaelcosti@not-exist.com").validate(true));
		assertFalse(EMail.create(null).validate());
		assertFalse(EMail.create("##$$@outlook.com.").validate(true));
		assertFalse(EMail.create("rafaelcost#i@&outlook.com").validate(true));
		assertFalse(EMail.create("rafaelcost#i@outlook").validate());
		assertFalse(EMail.create("rafaelcost#i@com").validate());
		assertFalse(EMail.create("rafaelcosti@outlook.com.").validate(true));
	}

	/**
	 * 
	 * @return
	 * @throws Exception 
	 */
	@Test
	public void generateTest() throws Exception {
		assertNotNull(EMail.create().generate());
		assertNotNull(EMail.create().generate("test", TLDDomain.Com.getTld()));
		assertNotNull(EMail.create().generate("test", "test", null));
		assertNull(EMail.create().format());
	}
}
