package com.person.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.person.model.JsonResponseResult;
import com.person.service.base.JsonResponseService;
import com.person.service.impl.JsonResponseServiceImpl;

public class RestServiceImpl implements RestService {

	private static Logger logger = LoggerFactory
			.getLogger(JsonResponseServiceImpl.class);

	private JsonResponseService jsonResponseService;

	public RestServiceImpl() {
	}

	public String mesageResult(String message) {
		return null;
	}


	public JsonResponseResult getJsonResponseResult(String message) {
		logger.info("Invoking getJsonResponseResult from RestServiceImpl");
		return jsonResponseService.getJsonResponse(message);
	}

	public JsonResponseService getJsonResponseService() {
		return jsonResponseService;
	}

	public void setJsonResponseService(JsonResponseService jsonResponseService) {
		this.jsonResponseService = jsonResponseService;
	}


}
