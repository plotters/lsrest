package com.legalsounds.test;

import org.junit.Ignore;
import org.junit.Test;

import com.legalsounds.social.FQLQuery;
import com.legalsounds.social.FQLQueryBuilder;

public class FQLQueryBuilderTest {

	@Test
	@Ignore
	public void subQueryTest() {

		FQLQuery query = new FQLQueryBuilder()
				.setSelect(new String[] { "uid1" })
				.setFrom(new String[] { "friend" })
				.setWhere(new String[] { "uid2=me()" }).build();

		System.out.println(query.getQuery());

		FQLQueryBuilder fqlQueryBuilder = new FQLQueryBuilder()
				.setSelect(
						new String[] { "uid", "first_name", "last_name",
								"pic_small" }).setFrom(new String[] { "user" })
				.setWhere(new String[] { "uid" }).setIn(query)
				.setOrderBy(new String[] { "name" });

		query = fqlQueryBuilder.build();

		System.out.println(query.getQuery());

	}

	@Test
	public void emailQueryTest() {
		FQLQuery query = new FQLQueryBuilder()
				.setSelect(new String[] { "email" })
				.setFrom(new String[] { "user" })
				.setWhere(new String[] { "uid=me()" }).build();

		System.out.println(query.getQuery());
	}
}
