package com.crm.services;

import java.util.List;

import com.crm.entities.Contact;

public interface ContactService {
	public void saveContact(Contact contact);

	public List<Contact> getAllContacts();

	public Contact getcontactById(long id);

}
