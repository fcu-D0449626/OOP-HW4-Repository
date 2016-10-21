package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {
      public void tiida(){
    	  	int i;
    	  	int x;
    	  	Scanner scanner = new Scanner(System.in);
    	  	System.out.println("Please enter a number:");
    	  	i=scanner.nextInt();
    	  	NissanTiida loop=new NissanTiida();
    	  	for(x=0;x<i;x++){
    	    loop.tiida();
    	    }
      }
	
}
