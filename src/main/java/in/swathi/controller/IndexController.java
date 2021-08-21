package in.swathi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import in.swathi.entity.Contact;
import in.swathi.service.impl.ContactServiceImpl;

@Controller
public class IndexController {

	@Autowired
	ContactServiceImpl contactserviceimpl;

	@GetMapping("/")
	public String index() {

		return "index";
	}

	@GetMapping("/contact")
	private List<Contact> getContacts() {
		return contactserviceimpl.getAllContacts();

	}
	
	@GetMapping("/contact/{cid}")
	private Contact getContact(@PathVariable("contactId") int cid) {

		return contactserviceimpl.getContactById(cid);

	}
	
	@PostMapping("/contact")
	private int saveContact(@RequestBody Contact contact) {
		contactserviceimpl.saveContact(contact);
		return contact.getContactId();
	}
	
	@DeleteMapping("/contact/{cid}")
	private void deleteContact(@PathVariable("contactId") int cid) {
		contactserviceimpl.deleteContactById(cid);
	}

}
