package Demo;

import org.testng.annotations.Test;

public class DemoPractice3Test {
	@Test
	public void demo3()
	{
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
		String URL = System.getProperty("url");
		System.out.println(URL);
	}
}
