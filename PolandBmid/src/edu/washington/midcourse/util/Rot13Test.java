package edu.washington.midcourse.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.washington.midcourse.util.Rot13;

/**
 * 
 * @author bpoland
 * this is our basic junit, using an assertEquals to verify that the ascii characters in the charArray get rotated correctly.
 *
 */
public class Rot13Test {

	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testEncrypt() {
		assertEquals("Uryyb gurer. Grfgvat, grfgvat!", Rot13.encrypt("Hello there. Testing, testing!") );
	}
}
