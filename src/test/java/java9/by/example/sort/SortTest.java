package java9.by.example.sort;

import org.junit.Test;

import static java9.by.example.sort.Sort.sort;
import static org.junit.Assert.assertArrayEquals;

public class SortTest {

    @Test
    public void shouldSortStrings() {
        String[] someStrings = {"cc", "aa", "bb"};

        sort(someStrings);

        String[] expected = {"aa", "bb", "cc"};
        assertArrayEquals(expected, someStrings);
    }
}