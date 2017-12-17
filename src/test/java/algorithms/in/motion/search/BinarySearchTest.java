package algorithms.in.motion.search;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static algorithms.in.motion.search.BinarySearch.search;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class BinarySearchTest {

	private Object[] stringTablesAndResults() {
		return new Object[] {
				new Object[]{new String[]{}, "s", null},
				new Object[]{new String[]{"a"}, "a", "1"},
				new Object[]{new String[]{"a", "b"}, "a", "1"},
				new Object[]{new String[]{"a", "b"}, "b", "2"},
				new Object[]{new String[]{"a", "b", "c"}, "c", "3"},
				new Object[]{new String[]{"a", "b", "c", "d", "e"}, "d", "4"},
		};
	}

	@Test
	@Parameters(method = "stringTablesAndResults")
	public void shouldFindGivenElementInTableAtExpectedPosition(String[] strings, String s, String expectedResult) {

		String result = search(strings, s);

		assertThat(result).isEqualTo(expectedResult);
	}
}