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

    @Test
    public void shouldSortStringsWhenSomeOfThemAreTheSame() {
        String[] someStrings = {"ff", "ff", "ee"};

        sort(someStrings);

        String[] expected = {"ee", "ff", "ff"};
        assertThat(someStrings).isEqualTo(expected);
    }

    @Test
    public void shouldSortEmptyList() {
        String[] someStrings = {};

        sort(someStrings);

        String[] expected = {};
        assertThat(someStrings).isEqualTo(expected);
    }

    @Test
    public void shouldSortAlreadySortedList() {
        String[] someStrings = {"gg", "hh", "ii"};

        sort(someStrings);

        String[] expected = {"gg", "hh", "ii"};
        assertThat(someStrings).isEqualTo(expected);
    }
}