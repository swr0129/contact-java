package kr.co.kosta.contact;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import kr.co.kosta.contact.model.Contact;
import kr.co.kosta.contact.service.view.ContactView;

public class ContectManagerMain {

	public static void main(String[] args) throws Exception {
		
		//1. ����ڿ��� ȭ���� �����ش�. (View)
		/*
		 * ======================================
		 * 1. ����ó ���
		 * 2. ����ó ��ü����
		 * Q. ����
		 * ======================================
		 * ����>
		 * 
		 * 1. �����ϸ� --> 
		 * 
		 * ������̸��� �̸���, ����, �ּҸ� ���� �Է��� �ּ���.(�����ڴ� �����̽� �Դϴ�.)
		 * 
		 */
		
		//�ܼ�(�͹̳�)�� ���� ������Է��� ���� �� �ִ� ��Ʈ�� ����
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		//System.out.print("�Է��Ͻð� ���͸� ���ּ��� : ");
		
		//String typed = br.readLine();
		
		//System.out.println(typed);
		//Contact contact = new Contact("kim", "kim@naver.com", 40, "seoul");
		
		//System.out.println(contact);
		
		ContactView view= new ContactView();
		view.run();
		
		

	}

}
