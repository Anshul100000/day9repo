package com.bridgelab;

import java.util.ArrayList;
import java.util.Map;

import java.util.Scanner;

public class adressbookmain {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String name = scanner.next();

	        String[] names = new String[3];
	        String[] numbers = new String[3];
	        names[0] = "Aaron";
	        numbers[0] = "0845 50 50 50";
	        names[1] = "Fred";
	        numbers[1] = "00 49 12345";
	        names[2] = "Jonas";
	        numbers[2] = "666";

	        for (int i = 0; i < names.length; i++) {
	            if (names[0].equalsIgnoreCase(name)) {
	               System.out.println("Number: " + numbers[i]);
	            }
	        }
	 }
}
