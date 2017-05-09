package pers.cheer2017.fand0509;

abstract class Animal {
	abstract void eat();
}

class Dog extends Animal {
	void eat() {
		System.out.println("啃骨头");
	}

	void lookHome() {
		System.out.println("看家");
	}
}

class Cat extends Animal {
	void eat() {
		System.out.println("吃鱼");
	}

	void catchFish() {
		System.out.println("抓老鼠");
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
