package com.design.patterns.proxy;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		System.out.println("Proxy pattern demo");
		Proxy proxy1 = new Proxy();
		proxy1.performSomeAction();

		Proxy proxy2 = new Proxy();
		proxy2.performSomeAction();

		System.out.println("Proxy object count : " + Proxy.count);
	}

}
