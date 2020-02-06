package unit.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tokenizer test")
class TokenizerTest {

	@DisplayName("tokenize test")
	@Test
	void testTokenize() {
		final String inputLine = "1 + 2";
		final List<Token> actual = Tokenizer.tokenize(inputLine);
		final List<Token> expected = new ArrayList<>();
		expected.add(new Token("1"));
		expected.add(new Token("+"));
		expected.add(new Token("2"));

		assertThat(actual).isEqualTo(expected);
	}
}