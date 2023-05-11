package com.crm.services;

import java.util.List;

import com.crm.entities.Lead;

public interface LeadService {
public void saveOneLead(Lead lead);

public Lead findLeadById(long id);

public void deleteLeadById(long id);

public List<Lead> getAllLeads();
}
