package com.design.patterns.proxy;

public class Proxy extends Subject {

	static Subject subject;
	static int count = 0;
	
	public Proxy() {
		subject = new ConcreteSubject();
		count++;
	}

	@Override
	public void performSomeAction() {
		System.out.println("proxy call is happening now !");
		if (subject == null) {
			subject = new ConcreteSubject();
			count++;
		}
		subject.performSomeAction();
	}

}
