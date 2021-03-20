package junitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class JunitTest1 {
	
	
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Initialize connection to database");
	}
	
	@AfterAll
	static void AfterAll() {
		System.out.println("Close database connection");
	}
	
	@BeforeEach
	void beforeEachtest(TestInfo info) {
		System.out.println("Initialize data for " + " "+ info.getDisplayName());
	}
	
	@AfterEach
	void afterEachtest(TestInfo info ) {
		System.out.println("Clean up Test Data for " + " " +  info.getDisplayName());
	}
	
	@Test
	void lengthTest() {
		String str = null;
		assertEquals(4, str.length());
	}
	
	
	@Test
	
	void toUppercase() {
		assertEquals("ABCD", "abcd".toUpperCase());
		
	}

	@Test
	void splitStringToArray(){
		assertArrayEquals(new String[] {"Hello", "David"}, "Hello-David".split("-"));
		
	}
}
