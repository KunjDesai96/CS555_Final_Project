package edu.stevens.cs555;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class GenerateOutputTest {


	@BeforeAll
	static void setUpBeforeClass() throws Exception { 
		String []args = null;
		GenerateOutput.main(args);
	}
	
	@Test
	void test_us02_birth_b4_marriage() {
		try {
			assertEquals(true, GenerateOutput.us02_birth_b4_marriage(), "User story 02 failed!");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	@Test 
	void test_us04_marriage_b4_divorce() {
		try {
			assertEquals(true, GenerateOutput.us04_marriage_b4_divorce(), "User story 04 failed!");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	@Test
	void test_us22_unique_id() {
		try {
			assertEquals(true,GenerateOutput.us22_unique_ids(),"User story 22 failed!");
		}
		catch( ParseException e) {
			e.printStackTrace();
		}
	}
}
