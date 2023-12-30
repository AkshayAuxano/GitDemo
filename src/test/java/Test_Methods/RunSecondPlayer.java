package Test_Methods;

import org.testng.annotations.Test;

import ParallelBase.BaseTest22;

public class RunSecondPlayer extends BaseTest22 {
	
	@Test
	public void secondExecutionMethod() throws Exception 
	{
		SecondPlayerPage signIn = new SecondPlayerPage(getDriver());
		signIn.secondPlayer();
	}

}
