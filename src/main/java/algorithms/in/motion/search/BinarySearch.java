package algorithms.in.motion.search;

public class BinarySearch {
	public static String search(String[] strings, String s) {
		int leftPosition = 0;
		int rightPosition = strings.length - 1;
		while (leftPosition <= rightPosition) {
			int newPosition = (leftPosition + rightPosition) / 2;
			if (strings[newPosition].equals(s)) {
				return Integer.toString(newPosition + 1);
			} else if (strings[newPosition].compareTo(s) < 0) {
				leftPosition = newPosition + 1;
			} else {
				rightPosition = newPosition - 1;
			}
		}
		return null;
	}
}
