package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i=0;
		String lyrics;
		Scanner scanner = new Scanner(System.in);
		while(i==0){			
		System.out.println("Please enter a password:");
		lyrics=scanner.nextLine();
		if(lyrics.equals("exit")){
			i=1;
			break;
		}
		else{
		PasswordEncorder re=new PasswordEncorder();
		lyrics=re.encode(lyrics);
		System.out.println(lyrics);
		}
		}
	}

}
