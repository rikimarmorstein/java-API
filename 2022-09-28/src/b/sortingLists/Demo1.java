package b.sortingLists;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		{
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(6);
		list.add(5);
		list.add(2);
		list.add(3);

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		}
		System.out.println("======");
		{
			
			List<String> list = new ArrayList<>();
			list.add("bbb");
			list.add("kkk");
			list.add("ddd");
			list.add("aaa");
			list.add("mmm");
			list.add("mmm");


			System.out.println(list);
			Collections.sort(list);
			System.out.println(list);
			
		}
		System.out.println("======");
{
			
			List<LocalDate> list = new ArrayList<>();
			list.add(LocalDate.of(2022, 9, 28));
			list.add(LocalDate.of(2023, 9, 28));
			list.add(LocalDate.of(2021, 9, 28));



			System.out.println(list);
			Collections.sort(list);
			System.out.println(list);
			
		}System.out.println("======");
{
	
	List<Person> list = new ArrayList<>();
	list.add(new Person(106, "bbb", 25));
	list.add(new Person(105, "ddd", 20));
	list.add(new Person(107, "aaa", 30));
System.out.println("insert order");
	System.out.println(list);

System.out.println("natural order (id)");
Collections.sort(list);
	System.out.println(list);
	
	System.out.println("other order (name)");
	Collections.sort(list, new PersonNameComperator());
	System.out.println(list);
}System.out.println("======");
	}

}
