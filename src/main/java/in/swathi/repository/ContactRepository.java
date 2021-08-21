package in.swathi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.swathi.entity.Contact;


@Repository
public interface ContactRepository extends JpaRepository<Contact,Serializable>

{
	
	
	
}
