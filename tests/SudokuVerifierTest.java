import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891
	
	@Test
	public void testVerifierCorrect() {
		//Arrange
		SudokuVerifier verifier = new SudokuVerifier();
		String candidateSolution = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		//Act
		int result = verifier.verify(candidateSolution);
		//Assertion
		assertEquals(0, result);
		System.out.println(result);
	}
	@Test
	public void testVerifierIncorrect() {
		//Arrange
		SudokuVerifier verifier = new SudokuVerifier();
		String candidateSolution = "123456789912345678891234567789123456678912345567891234456789123345678912234567891"; 	
		//Act
		int result = verifier.verify(candidateSolution);
		//Assertion
		assertEquals(-2, result);
	}
	
	@Test
	public void testVerifierNumberIncorrect() {
		//Arrange
		SudokuVerifier verifier = new SudokuVerifier();
		String candidateSolution = "123456789912345678891234567789123456678912345567891234456789123345678912234567890"; 	
		//Act
		int result = verifier.verify(candidateSolution);
		//Assertion
		assertEquals(-1, result);
	}

}
