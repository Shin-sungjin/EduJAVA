package basic;

import java.util.Scanner;


public class Solution {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String arr = " ";
        
        
        for( int i=0; i < a.length(); i++) {
        	char b = a.charAt(i);
        	if(b >= 'a' && b <= 'z') {
        		int c = b - 32;
        		arr += (char)c;
        		
        	}
        	else {
        		int d = b + 32;
        		arr += (char)d;
        		 
        	}
        	
        
            	
        	}
        
        System.out.println(arr);
        }

}
