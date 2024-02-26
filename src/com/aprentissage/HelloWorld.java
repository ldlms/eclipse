package com.aprentissage;

public class HelloWorld {

	public static void main(String[] args) {
		int i;
		for (i = 0; i < 5; i++) {
			System.out.println("Bienvenue dans Eclipse !");
		}

		System.out.println("C'est la fin !");
		HelloWorld newHelloWorld = new HelloWorld();
		newHelloWorld.add(5, 4);

	}

	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}

}
