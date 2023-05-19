package com.crm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.entities.Contact;
import com.crm.repositories.ContactRepository;
@Service
public class ContactServiceImpl implements ContactService {
@Autowired
private ContactRepository contactRepo;
	@Override
	public void saveContact(Contact contact) {
		// TODO Auto-generated method stub
contactRepo.save(contact);
	}
	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}
	@Override
	public Contact getcontactById(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact=findById.get();
		return contact;
	}

}
