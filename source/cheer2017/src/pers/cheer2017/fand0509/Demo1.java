package pers.cheer2017.fand0509;

abstract class Animal {
	abstract void eat();
}

class Dog extends Animal {
	void eat() {
		System.out.println("�й�ͷ");
	}

	void lookHome() {
		System.out.println("����");
	}
}

class Cat extends Animal {
	void eat() {
		System.out.println("����");
	}

	void catchFish() {
		System.out.println("ץ����");
	}
}

public class Demo1 {
	public static void main(String[] args) {
		method(new Cat());
	}

	public static void method(Animal a) {
		a.eat();
	}
}
