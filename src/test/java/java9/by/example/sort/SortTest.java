package java9.by.example.sort;

import org.junit.Test;

import static java9.by.example.sort.Sort.sort;
import static org.assertj.core.api.Assertions.assertThat;

public class SortTest {

    @Test
    public void shouldSortStrings() {
        String[] someStrings = {"cc", "aa", "bb"};

        sort(someStrings);

        String[] expected = {"aa", "bb", "cc"};
        assertThat(someStrings).isEqualTo(expected);
    }
}