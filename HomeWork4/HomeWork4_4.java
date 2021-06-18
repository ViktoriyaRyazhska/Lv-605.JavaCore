package com.edu;

public class HomeWork4_4 {


	public static void main(String[] args) {
		
		Dog dog1 = new Dog ("Bobik", Breeds.BULDOGG, 5);
		Dog dog2 = new Dog ("Tuzik", Breeds.HOUND, 6);
		Dog dog3 = new Dog ("Zychka",Breeds.CHIHUAHUA,8);
		System.out.println(dog1 == dog2);
		System.out.println(dog2 == dog3);
		System.out.println(dog3 == dog2);
		System.out.println(dog3 == dog1);



	}
}