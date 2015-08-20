package com.person.service.impl;

import net.lr.tutorial.karaf.db.examplejpa.Person;
import net.lr.tutorial.karaf.db.examplejpa.PersonService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.person.model.JsonResponseResult;
import com.person.service.base.JsonResponseService;

public class JsonResponseServiceImpl implements JsonResponseService {

	private static Logger logger = LoggerFactory
			.getLogger(JsonResponseServiceImpl.class);

//	 private PersonService personService;

	public JsonResponseServiceImpl() {
	}

//	 public void setPersonService(PersonService personService) {
//	 this.personService = personService;
//	 }
	
	
	public JsonResponseResult getJsonResponse(String message) {

//		//add person to database
//		 Person person = new Person("x", "@x");
//		 personService.add(person);

		 //retreive json response message saying hello x
		JsonResponseResult jsonResponseResult = new JsonResponseResult();
		jsonResponseResult.setMessage("Hello " + message);

		return jsonResponseResult;
	}

}
