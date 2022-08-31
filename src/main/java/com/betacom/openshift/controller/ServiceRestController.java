package com.betacom.openshift.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.betacom.openshift.model.Contatto;
import com.betacom.openshift.service.ContattoService;

@RestController
public class ServiceRestController {
	@Autowired
	private ContattoService cr;
	
	@RequestMapping("test")
	public List<Contatto> serviceTest() {
		return cr.getAll();
	}
}
