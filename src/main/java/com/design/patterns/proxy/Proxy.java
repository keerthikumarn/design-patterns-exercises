package com.design.patterns.proxy;

public class Proxy extends Subject {

	static Subject subject;

	@Override
	public void performSomeAction() {
		System.out.println("proxy call is happening now !");
		if (subject == null) {
			subject = new ConcreteSubject();
		}
		subject.performSomeAction();
	}

}
