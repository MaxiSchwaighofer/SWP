package Packege;

import java.util.Scanner;

public class alterBerechnen {

	public static void main(String[] args) {
		int alter = 0;
		System.out.println("Geben Sie das Alter der Person in Jahren ein");
		Scanner s = new Scanner(System.in);
		alter = s.nextInt();
		Person p;
		p = Person.getInstance(alter);
		System.out.println(p.getAlterInSekunden());
	}

}
