package com.deloitte.lab3ex5;

import java.util.Scanner;

public class Lab3Ex5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text (type 'END' on a new line to finish):");
        
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        
        while (true) {
            String line = scanner.nextLine();
            
            if (line.equalsIgnoreCase("END")) {
                break;
            }
            
            lineCount++;
            charCount += line.length();
            wordCount += line.split("\\s+").length;
        }
        
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters: " + charCount);
        
        scanner.close();
    }
}
