package b.sortingLists;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		if (Integer.compare(str1.length(), str2.length()) != 0) {
			return Integer.compare(str1.length(), str2.length());
		} else {
			return str1.compareTo(str2);
		}
	}

}
