package com.tns.dao;

import javax.naming.spi.DirectoryManager;

import com.tns.entity.EntityManagerFactory;

public class Jpautil1 {

 private static EntityManagerFactory factory; // entitymanagerFactory is responsible for generating EntityManager
	
    private static DirectoryManager entityManager;
 
    static
{
	factory = Persistence.createEntityManagerFactory("JPA-PU");
	}

     public static DirectoryManager getEntityManager()
{

	{
		entityManager = factory.createEntityManager(); // create entity manager
		
	}	
	return entityManager;

}}

