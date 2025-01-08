package tests;

import org.testng.annotations.Test;

import PageObjects.UsersPage;
import testSetup.Base;

public class TestA extends Base {
	@Test
	public void user() {

		UsersPage u = new UsersPage();
		u.NavigateToUsers();
		System.out.println("start");
	}

}
