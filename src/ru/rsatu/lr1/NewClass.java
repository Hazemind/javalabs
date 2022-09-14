package ru.rsatu.lr1;

import ru.rsatu.lr1.HelloWorld;

public class NewClass{
	public static void main(String[] args){
		System.out.println("I'm gonna say Hello");
		HelloWorld.Hello();
		HelloWorld dyn = new HelloWorld();
		dyn.Dynamic();
	}
}