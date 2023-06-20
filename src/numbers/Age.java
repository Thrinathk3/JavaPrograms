package numbers;

import java.time.*;
import java.util.*;

public class Age {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);


		System.out.println("Enter your DOB in YYYY-MM-DD");
		String input=scn.nextLine();
		scn.close();

		LocalDate dob = LocalDate.parse(input);
		LocalDate currentDate=LocalDate.now();//today date

		Period agePeriod=Period.between(dob, currentDate);

		//int ageYears=agePeriod.getYears();
		//int ageMonths=agePeriod.getMonths();
		//int ageDays=agePeriod.getDays();

		System.out.println("Your age is "+agePeriod.getYears()+"years"+agePeriod.getMonths()+"months and"+agePeriod.getDays()+"days");
	}

}
