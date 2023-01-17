package codes;

import java.util.Scanner;

public class SwitchUsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day");
		String day = sc.next();

		String res = switch (day) {
		case "monday", "tuesday", "wednesday" -> "Work from Office";
		case "thusday", "friday", "saterday" -> "Work from home";

		default -> {
			if (day.isEmpty())
				yield "Please insert a valid day.";
			else
				yield "Looks like a Sunday.";
		}
		};
		System.out.println(res);
	}

}
