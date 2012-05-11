package com.wrml

import grails.test.mixin.*
import org.junit.*
import static org.junit.Assert.*

@TestFor(User)
class UserIntegrationTests{

	@Before
	void setUp() {
		// Setup logic here
	}

	@After
	void tearDown() {
		// Tear down logic here
	}

 @Test
	void testFirstSaveEver() {
		def user = new User(userId: 'mark', password: 'markmasse',email: 'vinod@wrml.com')
		assertNotNull user.save()
		assertNotNull user.id
		def foundUser = User.get(user.id)
		assertEquals 'mark', foundUser.userId
	}
}
