package com.scripts.Actitime;

import java.io.IOException;

import org.testng.annotations.Test;
import com.generics.Actitime.BaseTest;
import com.pages.Actitime.POMActitimeLoginPage;

public class TESTActitimeLogin extends BaseTest
{
	@Test
	public void Login() throws IOException
	{
		POMActitimeLoginPage login=new POMActitimeLoginPage(driver);
		login.loginMethod();
	}
}
