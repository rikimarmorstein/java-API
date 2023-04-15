package a;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil {

	public static String BeautifyDate(LocalDate date) {

		return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
}
