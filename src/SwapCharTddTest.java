import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwapCharTddTest {

	@Test
	void swapLast2() {
		assertEquals("AB", SwapCharTdd.last2char("BA"));
	}
}
