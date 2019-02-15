package tumusiime.iuea;

import java.util.ArrayList;
import java.util.Scanner;

public class OOPII {

	public static void main(String[] args) {
		ArrayList<String>names=new ArrayList<String> ();
	       int n =1;
	       while(true) {
	    	   System.out.print("Enter students "+n+"");
	    	   String name =new Scanner(System.in).nextLine();
	    	   if(name.toLowerCase().equals("exit"))
	    	      break;
	    	       
	    	      else
	    	    	  names.add(name);
	    	   Scanner scn =new Scanner(System.in);
	    	 ///  if(scn.nextInt()<100) {
	    	  for(int i=0;i<6;i++) {
	    		   
	    	    		  
	    		
                   System.out.print("OOP");
	    		  
	    		  int OOP =scn.nextInt();
                    System.out.print("Compute:");
	    		  
	    		  int Compute =scn.nextInt();
                      System.out.print("WebDesign:");
	    		  
	    		  int WebDesign =scn.nextInt();
                   System.out.print("Network:");
	    		  
	    		  int Network =scn.nextInt();
                   System.out.print("Research:");
	    		  
	    		  int Research =scn.nextInt();
	    		  
                     System.out.print("Communication:");
	    		  
	    		  int Communication =scn.nextInt();
	    		  
	    		  int sum = Communication + Research +  WebDesign +  Compute +  OOP +  Network;
	    		  int avg;
	    		  
	    		  avg = sum/6;
	    		  
	    		  System.out.print("Sum : "+sum+ "\n Avearge :"+avg+"\n");
	    		
	    		
	    			
	    		  
	    		  
	    		  
	    	  
	    	   
	    	   n++;
	    	   break;
	    	  }
	      // }
	       
	       
	       			}

	
	}}


