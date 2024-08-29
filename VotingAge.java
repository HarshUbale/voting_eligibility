package projects;

import java.util.Scanner;

public class VotingAge {
	public static void main(String[] args) {
		System.out.println("Enter your current age");
		Scanner sc = new Scanner(System.in);
		int MyAge = sc.nextInt();
		int votingAge = 18;
		if (MyAge>=votingAge) {
			System.out.println("You are eligible for voting");
		}else {
			System.out.println("You are not eligible for voting");
		}
	}
}
