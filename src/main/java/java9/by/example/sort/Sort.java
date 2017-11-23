package java9.by.example.sort;

public class Sort {

    public static void sort(String[] strings) {
        int numberOfStringsToSort = strings.length;
        while (numberOfStringsToSort > 1) {
            for (int i = 0; i < numberOfStringsToSort - 1; i++) {
                if (shouldChangeOrder(strings, i)) {
                    switchElements(strings, i);
                }
            }
            numberOfStringsToSort--;
        }
    }

    private static boolean shouldChangeOrder(String[] strings, int i) {
        return strings[i].compareTo(strings[i + 1]) > 0;
    }

    private static void switchElements(String[] strings, int i) {
        String temp = strings[i + 1];
        strings[i + 1] = strings[i];
        strings[i] = temp;
    }
}
