package com.betacom.openshift.service.impl;

import java.util.List;

import com.betacom.openshift.model.Contatto;
import com.betacom.openshift.repository.ContattoRepository;
import com.betacom.openshift.service.ContattoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContattoServiceImpl implements ContattoService {
	
	@Autowired
	private ContattoRepository cr;

	@Override
	public List<Contatto> getAll() {
		return cr.findAll();
	}
	
}
