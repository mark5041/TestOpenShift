package com.betacom.openshift.repository;

import com.betacom.openshift.model.Contatto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("contattiRepositoy")
public interface ContattoRepository extends JpaRepository<Contatto, Long> {
	
}
