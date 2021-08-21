package in.swathi.service;

import java.util.List;

import in.swathi.entity.Contact;


public interface ContactService {
	
	public void saveContact(Contact contact);
	public List<Contact> getAllContacts();
	public Contact getContactById(Integer cid);
	public void deleteContactById(Integer cid);
	

}
