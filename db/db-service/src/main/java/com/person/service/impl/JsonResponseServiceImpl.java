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

	 private PersonService personService;

	public JsonResponseServiceImpl() {
	}

	 public void setPersonService(PersonService personService) {
	 this.personService = personService;
	 }
	
	
	public JsonResponseResult getJsonResponse(String name) {

		//add person to database
		 logger.info("create new object person");
		 Person person = new Person(name, "@x"+name);
		 logger.info("try to add new person to database");
		 personService.add(person);

		 //retreive json response message saying hello x
		JsonResponseResult jsonResponseResult = new JsonResponseResult();
		jsonResponseResult.setMessage("Hello " + name);

		return jsonResponseResult;
	}

}
