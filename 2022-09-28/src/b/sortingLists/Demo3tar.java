package b.sortingLists;

import java.util.ArrayList;
import java.util.List;

public class Demo3tar {

	public static void main(String[] args) {


		List<String> list = new ArrayList<>();
		list.add("ssssss");
		list.add("dsg");
		list.add("rgthh");
		list.add("sd");
		list.add("asdf");
		list.add("vvvvv");

		System.out.println(list);
		
		list.sort(null);
		System.out.println(list);
		
		list.sort(new StringLengthComparator());
		System.out.println(list);
		
	}

}
