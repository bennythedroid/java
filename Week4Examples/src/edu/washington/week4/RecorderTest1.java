package edu.washington.week4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RecorderTest1 {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRecorder() {
		Recorder rec = new Recorder("Test1", 10);
		assertEquals(10, rec.getTimeLength());
		assertEquals("Test1", rec.getName());
	}

	@Test
	public void testPlay() {
		fail("Not yet implemented");
	}

	@Test
	public void testRecordTheEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTimeLength() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTimeLength() {
		fail("Not yet implemented");
	}

}
