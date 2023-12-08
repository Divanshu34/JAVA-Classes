package com.sunbeam.b_classes;

import java.util.Scanner;

public class BComputer {
	private int cpu;
	private int ioDevices;
	private int primaryMemory;
	private int secondaryMemory;
	private String typeOfSecMem;

	public void setPrimaryMemory(int primaryMemory) {
		this.primaryMemory = primaryMemory;
	}
	
	public int getPrimaryMemory() {
		return this.primaryMemory;
	}
	
	public void setIoDevices(int ioD) {
		ioDevices = ioD;
	}
	
	public int getIoDevices() {
		return ioDevices;
	}
	
	//getter of cpu
	public int getCpu() {
		return cpu;
	}
	
	//setter of cpu
	public void setCpu(int c) {
		cpu = c;
	}
}

class Tester{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		BComputer computer1 = new BComputer();
		computer1.setCpu(4);
		System.out.println(computer1.getCpu());
		
		computer1.setIoDevices(2);
		System.out.println(computer1.getIoDevices());
		
		computer1.setPrimaryMemory(16);
		System.out.println(computer1.getPrimaryMemory());
		
		
		BComputer computer2 = new BComputer();
	}
}

//class SuperComputer extends BComputer{
//	void method1(int x) {
//		System.out.println(cpu);
//		System.out.println(ioDevices);
//	}
//}