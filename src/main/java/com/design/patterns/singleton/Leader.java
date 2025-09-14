package com.design.patterns.singleton;

public class Leader {

	private static Leader leader = null;

	private Leader() {

	}

	public static Leader getLeader() {
		if (leader == null) {
			synchronized (Leader.class) {
				if (leader == null) {
					leader = new Leader();
					System.out.println("New leader is elected for your group !!.");
				} else {
					System.out.print("You already have a leader for your group.");
					System.out.println("Send him for the ceremony.");
				}
			}
		}
		return leader;
	}

	public static void main(String[] args) {
		Leader firstCall = Leader.getLeader();
		Leader secondCall = Leader.getLeader();
	}

}
