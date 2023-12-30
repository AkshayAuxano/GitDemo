package Test_Methods;

import org.testng.annotations.Test;

import ParallelBase.BaseTest22;

public class RunFirstPlayer extends BaseTest22{
	
	@Test
	public void firstExecutionMethod() throws Exception 
	{
		FirstPlayerPage signIn = new FirstPlayerPage(getDriver());
		signIn.firstPlayer();
	}
	
	

}
