package com.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mcdonalds {
	public Mcdonalds() {

	}
	public void Mcdonalds() {
		FileReader fr;
		try {
			fr = new FileReader("menu.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String[] token1 = line.split(",");
			List<String> list1 = new ArrayList<>();
			for (int i = 0; i < token1.length; i++) {
				list1.add(token1[i]);
			}
			line = in.readLine();
			String[] token2 = line.split(",");
			List<String> list2 = new ArrayList<>();
			for (int i = 0; i < token2.length; i++) {
				list2.add(token2[i]);
			}
			line = in.readLine();
			String[] token3 = line.split(",");
			List<String> list3 = new ArrayList<>();
			for (int i = 0; i < token3.length; i++) {
				list3.add(token3[i]);
			}
			line = in.readLine();
			String[] token4 = line.split(",");
			List<String> list4 = new ArrayList<>();
			for (int i = 0; i < token4.length; i++) {
				list4.add(token4[i]);
			}
			line = in.readLine();
			String[] token5 = line.split(",");
			List<String> list5 = new ArrayList<>();
			for (int i = 0; i < token5.length; i++) {
				list5.add(token5[i]);
			}
			line = in.readLine();
			String[] token6 = line.split(",");
			List<String> list6 = new ArrayList<>();
			for (int i = 0; i < token6.length; i++) {
				list6.add(token6[i]);
			}
			line = in.readLine();
			String[] token7 = line.split(",");
			List<String> list7 = new ArrayList<>();
			for (int i = 0; i < token7.length; i++) {
				list7.add(token7[i]);
			}
			System.out.println("1)" + list1.get(1));
			System.out.println("2)" + list2.get(1));
			System.out.println("3)" + list3.get(1));
			System.out.println("4)" + list4.get(1));
			System.out.println("5)" + list5.get(1));
			System.out.println("6)" + list6.get(1));
			System.out.println("7)" + list7.get(1));
			Scanner scanner = new Scanner(System.in);
			System.out.println("請輸入餐點:");
			String number = scanner.nextLine();
			System.out.println("請輸入數量:");
			int a = scanner.nextInt();
			while (number != "q") {
				switch (number) {
				case "1":
					System.out.println(list1.get(1) + a + "份");
					break;
				case "2":
					System.out.println(list2.get(1) + a + "份");
					break;
				case "3":
					System.out.println(list3.get(1) + a + "份");
					break;
				case "4":
					System.out.println(list4.get(1) + a + "份");
					break;
				case "5":
					System.out.println(list5.get(1) + a + "份");
					break;
				case "6":
					System.out.println(list6.get(1) + a + "份");
					break;
				case "7":
					System.out.println(list7.get(1) + a + "份");
					break;
				case "0":
					break;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void function() {
		List<Main> men = new ArrayList<>();

	}

	public void question() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mcdonalds m = new Mcdonalds();
		m.Mcdonalds();

	}

}
