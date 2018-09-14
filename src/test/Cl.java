package test;

import java.util.Scanner;

public class Cl {

	int a, b;
	String c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int a = sc.nextInt();
		System.out.println("请输入一个运算符：");
		String c = sc.next();
		System.out.println("请输入第二个整数：");
		int b = sc.nextInt();
		switch (c) {
		case "+": {
			add(a, b);
			break;
		}
		case "-": {
			reduce(a, b);
			break;
		}
		case "*": {
			ride(a, b);
			break;
		}
		case "/": {
			except(a, b);
			break;
		}
		}
		sc.close();
	}

	private static void except(int a2, int b2) {
		// TODO Auto-generated method stub
		System.out.println(a2 + "/" + b2 + "=" + (a2 / b2));
	}

	private static void ride(int a2, int b2) {
		// TODO Auto-generated method stub
		System.out.println(a2 + "*" + b2 + "=" + (a2 * b2));
	}

	private static void reduce(int a2, int b2) {
		// TODO Auto-generated method stub
		System.out.println(a2 + "-" + b2 + "=" + (a2 - b2));
	}

	private static void add(int a2, int b2) {
		// TODO Auto-generated method stub
		System.out.println(a2 + "+" + b2 + "=" + (a2 + b2));
	}

}
