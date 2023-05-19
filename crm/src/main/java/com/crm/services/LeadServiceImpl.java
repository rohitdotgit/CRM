package com.crm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.entities.Lead;
import com.crm.repositories.LeadRepository;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;
@Service
public class LeadServiceImpl implements LeadService {
@Autowired
private LeadRepository leadRepo;
	@Override
	public void saveOneLead(Lead lead) {
		leadRepo.save(lead);

	}
	@Override
	public Lead findLeadById(long id) {
		// TODO Auto-generated method stub
		 java.util.Optional<Lead> findById = leadRepo.findById(id);
		Lead lead= findById.get();
		return lead;
	}
	@Override
	public void deleteLeadById(long id) {
		// TODO Auto-generated method stub
		leadRepo.deleteById(id);
		
	}
	@Override
	public List<Lead> getAllLeads() {
		// TODO Auto-generated method stub
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

}
