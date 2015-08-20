package com.person.camel.beans;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.person.model.ConsolidatedSearchResult;
import com.person.model.JsonResponseResult;

public class ResultAggregator implements AggregationStrategy {

	private static Logger logger = LoggerFactory
			.getLogger(ResultAggregator.class);

	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {

		ConsolidatedSearchResult consolidatedSearchResult = null;
		if (oldExchange == null) {
			consolidatedSearchResult = new ConsolidatedSearchResult();
		} else {
			consolidatedSearchResult = oldExchange.getIn().getBody(
					ConsolidatedSearchResult.class);
		}

		JsonResponseResult jsonResponseResult = newExchange.getIn().getBody(
				JsonResponseResult.class);

		if (jsonResponseResult != null) {
			consolidatedSearchResult.setJsonResponseResult(jsonResponseResult);
		}

		newExchange.getIn().setBody(consolidatedSearchResult);

		return newExchange;
	}
}
