package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {

		List list = new ArrayList() ;
		list.add("aaa");
		System.out.println(list.size());
		list.add("ccc");
		System.out.println(list.size());
		list.add("aaa");
		list.add("aaa");
		list.add(null);
		list.add(null);
		list.add(null);

System.out.println(list);
	
Set set=new HashSet();
set.add("aaa");
set.add("ccc");
set.add("bbb");
set.add("aaa");
list.add(null);
list.add(null);
list.add(null);
System.out.println(set);


	}

}
