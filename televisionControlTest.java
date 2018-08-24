package com.capgemini.day3.javaTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day3.java.Television;

class televisionControlTest {
Television televisionControl;
@BeforeEach

	void test() {
		televisionControl = new Television();
		televisionControl.setPower(true);
		televisionControl.setChannel(234);
		televisionControl.setVolume(4);
		
	}
@Test

	void testTelevisionStatus() {

	
		assertEquals(11,televisionControl.changeVolume(11));
		assertEquals(15,televisionControl.changeChannel(15));
		assertEquals("Power: true Channel: 15 Volume: 11",televisionControl.powerStatus());
		assertEquals(false,televisionControl.powerStatus1());
	}


}
