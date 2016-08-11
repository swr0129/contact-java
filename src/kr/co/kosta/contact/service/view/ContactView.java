package kr.co.kosta.contact.service.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContactView {

	public void run() throws IOException {
		
		String choice = "";
		do {
		printMainMenu();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		choice = br.readLine();
		
		if (choice.startsWith("1")) {
			System.out.println("1�� �����̽��ϴ�.");
		}else if (choice.startsWith("2")) {
			System.out.println("2�� �����̽��ϴ�.");
		}
		else
		{
		}
		
		}while (!choice.trim().toUpperCase().startsWith("Q"));

	}

	private void printMainMenu() {
		System.out.println("=================================");
		System.out.println("1. register contact");
		System.out.println("2. view all contacts");
		System.out.println("Q. quit app");
		System.out.println("=================================");
		
	}
}
