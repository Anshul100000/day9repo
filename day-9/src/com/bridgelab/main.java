package com.bridgelab;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        ArrayList<telephoneentry> phonebook = new ArrayList<>();

        phonebook.add(new telephoneentry("Aaron", "111"));
        phonebook.add(new telephoneentry("Fred", "222"));
        phonebook.add(new telephoneentry("Jonas", "666"));

        for (int i = 0; i < phonebook.size(); i++) {
            if (phonebook.get(i).getName().equals(name)) {
                System.out.println("Number: " + phonebook.get(i).getNumber());
            }
        }
    }

}
