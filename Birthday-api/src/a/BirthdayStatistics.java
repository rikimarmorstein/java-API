package a;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BirthdayStatistics {

	// List<Person> peoplexx = new ArrayList<>(BirthdayTask.getPeople());

	public static int countMemebers(List<Person> peoplexx) {

		return peoplexx.size();

	}

	public static int getHappyMonth(List<Person> people) {
		int max = 0;
		int month = 0;
		int l = 0;
		for (int i = 1; i <= 12; i++) {
			int sum = 0;
			for (Person person : people) {
				if (person.getBirthday().getMonthValue() == i) {
					sum++;
					month = i;
				}
			}
			if (sum > max) {
				max = sum;
				l = month;
			}
		}
		return l;
	}

	public static int getSadlyMonth(List<Person> people) {
		int min = 100;
		int month = 0;
		int l = 0;
		for (int i = 1; i <= 12; i++) {
			int sum = 0;
			for (Person person : people) {
				if (person.getBirthday().getMonthValue() == i) {
					sum++;
					month = i;

				}
			}
			if (sum > 0 && sum < min) {
				min = sum;
				l = month;
			}
		}
		return l;
	}

	public static Map<Integer, Integer> getEvents(List<Person> people) {
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for (int i = 1; i <= 12; i++) {
			int sum = 0;
			for (Person person : people) {
				if (person.getBirthday().getMonthValue() == i) {
					sum++;
				}
			}
			map.put(i, sum);
		}
		return map;
	}

}
