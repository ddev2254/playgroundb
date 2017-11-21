package java9.by.example.sort;

public class Sort {

    public static void sort(String[] strings) {
        int n = strings.length;
        while (n > 1) {
            for (int i = 0; i < n - 1; i++) {
                if (strings[i].compareTo(strings[i + 1]) > 0) {
                    String temp = strings[i + 1];
                    strings[i + 1] = strings[i];
                    strings[i] = temp;
                }
            }
            n--;
        }
    }
}
