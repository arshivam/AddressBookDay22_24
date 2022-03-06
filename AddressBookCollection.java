package com.bridgelabz.day22_24;

import java.util.Scanner;

public class AddressBookCollection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		int choice;
		AddressBookMethods detail = new AddressBookMethods();
		do {
			System.out.println("Enter the choice : ");
			System.out.println("1.Add contact ");
			System.out.println("2.Display contact");
			System.out.println("3.Edit contact");
			System.out.println("4.Delete contact");
			ch= sc.nextInt();
			switch(ch) {
			case 1: 
				detail.readData();
				break;
			case 2:
				detail.DisplayContacts();
				break;
			case 3:
				System.out.println("\nEnter First Name you want to edit:- ");
				String name = sc.next();
				detail.editData(name);;
				break;
			case 4:
				detail.deleteData();
				break;
			}System.out.println("Do you want to continue? if yes press 1");
			choice = sc.nextInt();
		}while(choice == 1);
		sc.close();
	}
}
