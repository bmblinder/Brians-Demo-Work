// --== CS400 File Header Information ==--
// Name: Brian Blinder
// Email: bblinder@wisc.edu
// Team: KC Red
// Role: Frontend
// TA: Keren Chen
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class FrontendTests {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private Frontend tester;// declares a new frontend object

	/**
	 * Instantiates a frontend object
	 */
	@BeforeEach
	public void preTest() {
	
		tester = new Frontend();// initializes frontend object		
		System.setOut(new PrintStream(outContent));
		System.out.println(outContent.toString());
	}
	
	@AfterEach
	public void postTest() {
		System.setOut(originalOut);
	}

	@Test
	public void testQuit(){
		
			
			//String input = "x";
			//InputStream inputStreamSimulator = new ByteArrayInputStream(input.getBytes());
            //System.setIn(inputStreamSimulator);
            System.setOut(originalOut);
            System.out.println(outContent.toString());
            if(!outContent.toString().contains("Exiting the Program... Good Bye!")) {
            	fail();
            }
 
	}
	
//	/**
//	 * Tests if the Initial Screen (home screen) will appear correctly
//	 * @throws IOException 
//	 */
//	@Test
//	public void testHomeScreen() throws IOException {
//		Scanner scanner = new Scanner(System.in);
//        String s = null;
//        if(scanner.hasNext()) {
//        	s+=scanner.next();
//        };
//        System.out.println(s);
//		assertTrue(scanner.equals(
//				"************************************************************************************************************************************************************\nHi, Welcome to the Wikipedia Seach Game!  |  To start enter 's'  |  Otherwise enter 'x' to exit the program!\n"));
//	}
//
//	/**
//	 * Tests if the start command from the home screen will print a correct
//	 * interface
//	 */
//	@Test
//	public void testHomeInput_s() {
//		// group of code responsible for clearing the console
//		System.out.flush();
//
//		// group of code responsible for manufacturing user input to be tested
//		String input = "s";
//		InputStream in = new ByteArrayInputStream(input.getBytes());
//		System.setIn(in);
//
//		if (!System.console().writer().equals(
//				"************************************************************************************************************************************************************\n************************************************************************************************************************************************************\nTo play the game: Enter the title of the Wikipedia article that you want to start at  |  Enter 'r' if you want a random starting article  |  Enter 'x' to exit.\n")) {
//			fail();
//		}
//
//	}
//
//	/**
//	 * Tests if the pregame screen (setting the start and end of the desired path),
//	 * is displayed correctly & functions properly
//	 */
//	@Test
//	public void testUserInputPreGame() {
//		// group of code responsible for clearing the console
//		String input = "s";
//		InputStream in = new ByteArrayInputStream(input.getBytes());
//		System.setIn(in);
//		System.out.flush();
//		// group of code responsible for manufacturing user input to be tested
//		input = "Russia";
//		in = new ByteArrayInputStream(input.getBytes());
//		System.setIn(in);
//
//		if (!System.console().writer().equals(
//				"Now enter the title of the Wikipedia article that you want to find  |  Enter 'r' if you want to find a random article  |  Enter 'x' to exit.")) {
//			fail();
//		}
//
//	}

	/**
	 * Tests if turns are properly incremented, at the start of the game, after a
	 * turn is made, and after 2 turns are made
	 */
	//@Test
//	public void testTurnIncrementation() {
//
//		if (tester.getTurn() != 0) {
//			fail();
//		}
//		
//		// A set of group of code responsible for manufacturing user input to test if the turn are incrementing properly
//		String input = "s";
//		InputStream in = new ByteArrayInputStream(input.getBytes());
//		System.setIn(in);
//		
//		input = "r";
//		in = new ByteArrayInputStream(input.getBytes());
//		System.setIn(in);
//		
//		input = "r";
//		 in = new ByteArrayInputStream(input.getBytes());
//		System.setIn(in);
//
//		input = "1";
//		in = new ByteArrayInputStream(input.getBytes());
//		System.setIn(in);
//		if (tester.getTurn() != 1) {
//			System.out.println(tester.getTurn());
//			fail();
//		}
//
//		input = "1";
//		in = new ByteArrayInputStream(input.getBytes());
//		System.setIn(in);
//		if (tester.getTurn() != 2) {
//			fail();
//		}

//	}

}
