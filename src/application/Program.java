package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Champion firstChampion, secondChampion;

		System.out.println("Enter the data of the first champion: ");
		System.out.print("Name: ");
		String nameOne = sc.nextLine();
		System.out.print("Starting life: ");
		int lifeOne = sc.nextInt();
		System.out.print("Attack: ");
		int attackOne = sc.nextInt();
		System.out.print("Armor: ");
		int armorOne = sc.nextInt();
		firstChampion = new Champion(nameOne, lifeOne, attackOne, armorOne);

		System.out.println();

		System.out.println("Enter the data of the second champion: ");
		System.out.print("Name: ");
		sc.nextLine();
		String nameSecond = sc.nextLine();
		System.out.print("Starting life: ");
		int lifeSecond = sc.nextInt();
		System.out.print("Attack: ");
		int attackSecond = sc.nextInt();
		System.out.print("Armor: ");
		int armorSecond = sc.nextInt();
		secondChampion = new Champion(nameSecond, lifeSecond, attackSecond, armorSecond);

		System.out.println();

		System.out.print("How many shift do you want to run? ");
		int N = sc.nextInt();
		System.out.println();

		for (int i = 1; i - 1 < N; i++) {

			if (firstChampion.getLife() != 0 && secondChampion.getLife() != 0) {
				firstChampion.takeDamage(secondChampion);
				secondChampion.takeDamage(firstChampion);

				System.out.println("Result od turn " + i + ":");
				System.out.println(firstChampion.status());
				System.out.println(secondChampion.status());
				System.out.println();

			} else if (firstChampion.getLife() == 0 || secondChampion.getLife() == 0) {
				i = N;
			}
		}
		System.out.println("END OF COMBAT");
		sc.close();

	}

}
