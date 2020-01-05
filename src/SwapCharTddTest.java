import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwapCharTddTest {

	@Test
	void swapLast2() {
		assertEquals("AB", SwapCharTdd.last2char("BA"));
	}
	
	@Test
	void swapLast4() {
		assertEquals("DC", SwapCharTdd.last2char("ABCD"));
	}
	
}
