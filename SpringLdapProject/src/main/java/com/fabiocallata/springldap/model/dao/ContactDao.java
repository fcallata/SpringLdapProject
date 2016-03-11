package com.fabiocallata.springldap.model.dao;

import java.util.List;

import com.fabiocallata.springldap.model.bo.Contact;
import com.fabiocallata.springldap.model.dto.ContactDto;

public interface ContactDao {
	public List getAllContactNames();

	public List<Contact> getContactDetails(String commonName, String lastName);

	public void insertContact(ContactDto contactDTO);

	public void updateContact(ContactDto contactDTO);

	public void deleteContact(ContactDto contactDTO);
}
