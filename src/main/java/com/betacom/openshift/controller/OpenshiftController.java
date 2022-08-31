package com.betacom.openshift.controller;

import java.util.List;

import com.betacom.openshift.model.Contatto;
import com.betacom.openshift.service.ContattoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OpenshiftController {
	@Autowired
	private ContattoService cr;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView homnePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		List<Contatto> listacontatto = cr.getAll();
		mv.addObject("listacontatti", listacontatto);
		return mv;
	}
}
