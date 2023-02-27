package com.tugas;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		// palindrome string
		Scanner inputStr= new Scanner(System.in);
		String a, b = "";
		
        System.out.print("Masukan sebuah string: ");
        a=inputStr.nextLine();
  
        int n=a.length();
        
        for(int i=n-1; i>=0; i--){
            b+=a.charAt(i);
        }
        
        if(a.equalsIgnoreCase(b)) {
            System.out.println(a + " adalah palindrome");
        } else {
            System.out.println(a + " bukan palindrome");
        }
		
		// palindrome angka
        int rem, rev=0, temp;
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Masukan angka: ");
        n = userInput.nextInt(); 
        
        temp = n;
  
        while( n != 0 ) {
            rem= n % 10;
            rev= rev * 10 + rem;
            n=n/10;
        }
 
        if (temp == rev) {
        	System.out.println(temp + " adalah palindrome");
        } else {
        	System.out.println(temp + " bukan palindrome");
        }
	}
}
