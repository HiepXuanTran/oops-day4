package DTO;

import java.util.Scanner;

public class Worker extends Person {
	private String position;
	private int NumberProduct;

	public Worker(String iD, String name, int age, String address, String position, int numberProduct) {
		super(iD, name, age, address);
		this.position = position;
		NumberProduct = numberProduct;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getNumberProduct() {
		return NumberProduct;
	}

	public void setNumberProduct(int numberProduct) {
		NumberProduct = numberProduct;
	}

	public Worker(String position, int numberProduct) {
		super();
		this.position = position;
		NumberProduct = numberProduct;
	}

	public Worker() {
		super();
	}

	public int Money() {
		return NumberProduct * 120;
	}

	public void nhap(Scanner scanner) {
		scanner.nextLine();
		System.out.println("Nhap Id : ");
		this.setID(scanner.nextLine());
		System.out.println("Nhap name: ");
		this.setName(scanner.nextLine());
		System.out.println("Nhap Age: ");
		this.setAge(scanner.nextInt());
		System.out.println("Nhap Address: ");
		this.setAddress(scanner.nextLine());
		scanner.nextLine();
		System.out.println("Nhap Position: ");
		this.setPosition(scanner.nextLine());
		System.out.println("Nhap NumberProduct: ");
		this.setNumberProduct(scanner.nextInt());
	}

	public void xuat() {
		System.out.println("ID : " + this.getID());
		System.out.println("Name : " + this.getName());
		System.out.println("Age : " + this.getAge());
		System.out.println("Address : " + this.getAddress());
		System.out.println("Position : " + this.getPosition());
		System.out.println("NumberProduct : " + this.getNumberProduct());
	}
}
