package tests;

import org.testng.annotations.Test;

import PageObjects.UsersPage;
import testSetup.Base;

public class TestB extends Base {

	@Test
	public void user() {

		UsersPage u = new UsersPage();
		u.NavigateToUsers();
		System.out.println("New phase");
	}

}
