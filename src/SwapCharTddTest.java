import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwapCharTddTest {

	@Test
	void swapLast2() {
		assertEquals("AB", SwapCharTdd.last2char("BA"));
	}
	
	@Test
	void swapLast2With4Char() {
		assertEquals("DC", SwapCharTdd.last2char("ABCD"));
	}
	
	@Test
	void swapLast2With1Char() {
		assertEquals("DC", SwapCharTdd.last2char("ABCD"));
	}
	
	@Test
	void swapLast2WithAndReturnWholeString() {
		assertEquals("ABDC", SwapCharTdd.last2char("ABCD"));
	}
	
}
