/**
 * licecse... etc
 */
package kr.co.kosta.contact.service;

import java.util.List;

import kr.co.kosta.contact.model.Contact;
/**
 * Ŭ���� ����
 * @author User
 * @version
 */
public interface ContactService {
	
	/**
	 * �޼ҵ� ����
	 * @param contact
	 */
	void registContact(Contact contact);
	
	 /**
	  * 
	  * @return
	  */
	List<Contact> listContact();
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	
	Contact detailContact(String name);
	
	/**
	 * 
	 * @param name
	 */
	void removeContact(String name);
	
	
}
