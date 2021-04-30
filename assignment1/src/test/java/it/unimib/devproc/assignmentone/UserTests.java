package it.unimib.devproc.assignmentone;

import static org.junit.Assert.*;
import it.unimib.devproc.assignmentone.User;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(UnitTest.class)
public class UserTests {

	@Test
	public void test() {
		User user1 = new User();
		user1.setId(0);
		user1.setName("user1");
		user1.setEmail("user1@site.it");
		
		assertEquals(Integer.valueOf(0), user1.getId());
		assertEquals("user1", user1.getName());
		assertEquals("user1@site.it", user1.getEmail());
	}

}
