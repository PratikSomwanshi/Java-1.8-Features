package notes.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class DatesImpl {
	public static void main(String[] args) throws ParseException {
//		Date to string
		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat dd = new SimpleDateFormat("MM/dd/yy :: HH-mm-ss");
		String format = dd.format(d);
		System.out.println(format);

		// String to date
		SimpleDateFormat ff = new SimpleDateFormat("MM/dd/yy");

		Date date = ff.parse(format);
		System.out.println(date);

		// java.sql.date

		java.sql.Date dm = new java.sql.Date(20240825);
		System.out.println(dm);

		// Java 1.8 Date API changes

		LocalDate ld = LocalDate.now();

		System.out.println(ld);

		ld = ld.plusDays(2);

		System.out.println(ld);
		ld = ld.plusYears(2);

		System.out.println(ld);

		boolean leapYear = LocalDate.parse("2024-08-25").isLeapYear();
		System.out.println(leapYear);

		boolean before = LocalDate.parse("2024-08-10").isBefore(LocalDate.parse("2024-10-02"));
//		boolean before = LocalDate.parse("2024-08-10").isAfter(LocalDate.parse("2024-10-02"));
		System.out.println(before);

//		LocalTime

		LocalTime time = LocalTime.now();
		LocalTime plusHours = time.plusHours(2);
		System.out.println(time);
		System.out.println(plusHours);

	}
}
