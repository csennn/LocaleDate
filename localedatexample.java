import java.time.LocalDate;

public class LocalDateExample {

	public static void main(String[] args) {

		// to print the current date
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

		// to print the 256th day of 2023
		localDate = LocalDate.ofYearDay(2023, 256);
		System.out.println(localDate); // 2023-09-13

	}

}
