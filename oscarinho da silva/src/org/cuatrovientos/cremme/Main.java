package org.cuatrovientos.cremme;


import java.util.Scanner;

/**
 * main program with user console interface to manage the village
 * @author OSKAR
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// variables for new inhabitants
		String Name = new String();
		
		String DNI = "";
		Inhabitant Inhabitant = null;
		// variable to use in remove and read cases
		int index = 0;
		Scanner reader = new Scanner(System.in);
		String option = "";
		
		Village Village = new Village();
		do {
		
				System.out.println("------------ MyDiary --------------");
				System.out.println("Select one option:\n");
				System.out.println("1. Add new Inhabitant");
				System.out.println("2. Remove Inhabitant");
				System.out.println("3. Search Inhabitant");
				System.out.println("4. Show all Inhabitants");
				System.out.println("5. Exit");
				option = reader.nextLine();
		switch (option) {
		case "1":
				System.out.println("Please, enter DNI.");
				DNI = reader.nextLine();
				DNI = new String();
				System.out.println("Please, enter NAME");
				Name = reader.nextLine();
				Name = new String();
				Inhabitant = new Inhabitant(Name,DNI);
				Village.addInhabitant(Inhabitant);
		break;
		
		case "2":
				System.out.println("Please, enter index number.");
				Name = reader.nextLine();
				index = Integer.parseInt(Name);
				Village.removeInhabitant(index);
		break;
		case "3":
				System.out.println("Please, enter index number.");
				Name = reader.nextLine();
				index = Integer.parseInt(Name);
				Inhabitant = Village.searchInhabitant(index);
				if (null != Inhabitant) {
					System.out.println("Inhabitant #" + index + "\n" + Inhabitant.show());
		}
		break;
		case "4":
			System.out.println(Village.showAll());
			break;
		case "5":
			System.out.println();
			System.out.println("Bye");
			break;
				default:
			System.out.println();
			System.out.println("TRY AGAIN");
			break;
			}
		} while (!option.equals("5"));
	}
	}


