package com.design.patterns.proxy;

public class ConcreteSubject extends Subject {

	@Override
	public void performSomeAction() {
		System.out.println("doSomeWork() inside ConcreteSubject is invoked.");
	}

}
