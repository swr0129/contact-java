package kr.co.kosta.contact;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import kr.co.kosta.contact.model.Contact;
import kr.co.kosta.contact.service.view.ContactView;

public class ContectManagerMain {

	public static void main(String[] args) throws Exception {
		
		//1. 사용자에게 화면을 보여준다. (View)
		/*
		 * ======================================
		 * 1. 연락처 등록
		 * 2. 연락처 전체보기
		 * Q. 종료
		 * ======================================
		 * 선택>
		 * 
		 * 1. 선택하면 --> 
		 * 
		 * 사용자이름과 이메일, 나이, 주소를 각각 입력해 주세요.(구분자는 스페이스 입니다.)
		 * 
		 */
		
		//콘솔(터미널)을 통해 사용자입력을 받을 수 있는 스트림 생성
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		//System.out.print("입력하시고 엔터를 쳐주세요 : ");
		
		//String typed = br.readLine();
		
		//System.out.println(typed);
		//Contact contact = new Contact("kim", "kim@naver.com", 40, "seoul");
		
		//System.out.println(contact);
		
		ContactView view= new ContactView();
		view.run();
		
		

	}

}
