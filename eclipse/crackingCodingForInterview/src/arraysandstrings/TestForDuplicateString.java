package arraysandstrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForDuplicateString {

	@Test
	public void testNull() {
		removeDuplicateCharacters input = new removeDuplicateCharacters();
		assertNull(input.removeDuplicates(null));
	}
	@Test
	public void testDublicate() {
		removeDuplicateCharacters input = new removeDuplicateCharacters();
		assertEquals("nitpa", input.removeDuplicates("anitapa"));
	}
	@Test
	public void testContinuousDuplicate() {
		removeDuplicateCharacters input = new removeDuplicateCharacters();
		assertEquals("nitpa", input.removeDuplicates("aaanittapaaa"));
	}

}
