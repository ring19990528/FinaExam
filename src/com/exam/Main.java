package com.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	int number;
	String name;
	int price;
	int calorie;
	public Main(){
		
	}
	public Main(int number,String name,int price,int calorie){
		this.number = number;
		this.name = name;
		this.price = price;
		this.calorie = calorie;
	}
	

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	
}
