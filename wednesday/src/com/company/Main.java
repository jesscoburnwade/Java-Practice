package com.company;

public class Main {

    public static void main(String[] args) {

    //	for(int B = 2; B<=20; ++B) {
	//		System.out.println("Times table of: " + B);
	//		System.out.println("-----------------");

	//		for (int A = 1; A <= 10; ++A)
	//			System.out.println(B + " x " + A + " = " + (A * B));
	//		System.out.println("");

		int age = 12;

		switch(age) {
			case 1:
			case 2:
			case 3:
				System.out.println("You can crawl.");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("You can walk.");
				break;
			default:
				System.out.println("At " + age + " you should be able to walk...");
		}
    }
}