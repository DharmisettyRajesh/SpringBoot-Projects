package demo;

import java.util.*;
public class Optionaldemo { 
	 public static void main(String[] args) {  
	        String[] str = new String[10];        
	        str[5]="hwehjhkhf dfhjfd";// Setting value for 5th index  
	        Optional<String> checkNull = Optional.ofNullable(str[5]);
	        System.out.println(checkNull);
	        if(!checkNull.isEmpty()){  // It Checks, value is present or not  
	            String lowercaseString = str[5].toLowerCase();  
	            System.out.print(lowercaseString);  
	        }else  
	            System.out.println("String value is not present");  
	    }
}
