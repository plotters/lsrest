package com.legalsounds.social;

import org.apache.log4j.Logger;

public class FQLQueryBuilder {
	private static final Logger log = Logger.getLogger(FQLQueryBuilder.class);

	private String[] select;
	private String[] from;
	private String[] where;
	private String[] orderBy;
	private String[] limit;
	
	private String in;

	private String query;

	private String getSelect() {
		String result = " SELECT " + getStringFromStringArray(select);
		return result;
	}

	public FQLQueryBuilder setSelect(String[] select) {
		this.select = select;
		return this;
	}

	private String getFrom() {
		String result = " FROM " + getStringFromStringArray(from);
		return result;
	}

	public FQLQueryBuilder setFrom(String[] from) {
		this.from = from;
		return this;
	}

	private String getWhere() {
		String result = " WHERE " + getStringFromStringArray(where);
		return result;
	}

	public FQLQueryBuilder setWhere(String[] where) {
		this.where = where;
		return this;
	}

	private String getOrderBy() {
		String result = getStringFromStringArray(orderBy);
		if (!result.isEmpty())	{
			result = " ORDER BY " + result;
		} 
		return result;
	}

	public FQLQueryBuilder setOrderBy(String[] orderBy) {
		this.orderBy = orderBy;
		return this;
	}

	private String getLimit() {
		String result = getStringFromStringArray(limit);
		if (!result.isEmpty())	{
			result = " LIMIT " + result;
		} 
		return result;
	}

	public FQLQueryBuilder setLimit(String[] limit) {
		this.limit = limit;
		return this;
	}

	private String getIn()	{
		if (in == null) {
			return "";
		}
		return in;
	}
	
	public FQLQueryBuilder setIn(FQLQuery fqlQuery) {
		String queryString = fqlQuery.getQuery();
		in = " IN ( " + queryString + " ) ";
		return this;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public FQLQuery build() {
		if (query == null) {
			query = getSelect() + getFrom() + getWhere() + getIn() + getOrderBy()
					+ getLimit();
		}
		FQLQuery fqlQuery = new FQLQuery(this);
		
		log.info("Building FQL query: " + fqlQuery.getQuery());
		
		return fqlQuery;
	}

	// FIXME: bug with multicase where
	private String getStringFromStringArray(String[] stringArray) {
		if (stringArray == null) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for (String s : stringArray) {
			sb.append(s + " ");
		}
		sb.deleteCharAt(sb.length() - 1);
		String s = sb.toString().replaceAll("\\s", ", ");
		return s;
	}
}
