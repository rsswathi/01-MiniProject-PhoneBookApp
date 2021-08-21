package in.swathi.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.swathi.entity.Contact;
import in.swathi.repository.ContactRepository;
import in.swathi.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contacts = new ArrayList<Contact>();
		contactRepository.findAll().forEach(contacts1 -> contacts.add(contacts1));
		return contacts;
	}

	@Override
	public Contact getContactById(Integer cid) {
		return contactRepository.findById(cid).get();
	}

	@Override
	public void saveContact(Contact contacts) {
		contactRepository.save(contacts);

	}

	@Override
	public void deleteContactById(Integer cid) {
		contactRepository.deleteById(cid);
		

	}

}
