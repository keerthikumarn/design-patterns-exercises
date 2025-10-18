package com.design.patterns.state;

public class VendingMachineDemo {

	public static void main(String[] args) {
		System.out.println("\n--- First Transaction ---");
		VendingMachine vm = new VendingMachine();
		vm.insertCoin(1.0); // Invalid in IdleState
		vm.selectItem("A1");
		vm.insertCoin(1.5);
		vm.dispenseItem();
		System.out.println("\n--- Second Transaction ---");
		vm.selectItem("B2");
		vm.insertCoin(2.0);
		vm.dispenseItem();
	}

}
