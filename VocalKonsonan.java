package com.tugas;

import java.util.Scanner;

public class VocalKonsonan {
	public static void main(String[] args) {
		int vwlCount = 0, conCount = 0;
		
		String kalimat = "Belajar Java itu menyenangkan!!";
		
	    for(int i = 0; i < kalimat.length(); i++) {    
            if(kalimat.charAt(i) == 'a' || kalimat.charAt(i) == 'e' || kalimat.charAt(i) == 'i' || kalimat.charAt(i) == 'o' || kalimat.charAt(i) == 'u') {
                vwlCount++;    
            } else if(kalimat.charAt(i) >= 'a' && kalimat.charAt(i)<='z') {        
                conCount++;    
            }    
        }    
	    
        System.out.println("Jumlah huruf vocal: " + vwlCount);    
        System.out.println("Jumlah huruf konsonan: " + conCount);
        System.out.println("Total jumlah character: " + kalimat.length());
    }
}
