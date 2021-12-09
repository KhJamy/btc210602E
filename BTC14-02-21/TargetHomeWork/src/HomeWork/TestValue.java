
package HomeWork;


import org.openqa.selenium.By;

public class TestValue {
	
	Method m = new Method();
	
	void purchaseTargetProduct() throws InterruptedException {
		
		m.openBrowser();
		m.gotoSite("https://www.target.com/");
		//m.typeOnElement(By.id("#search"), "kids toys");
		m.typeOnElement(By.xpath("//input[@type='search']"), "kids toys");
		Thread.sleep(3000);
		m.findElementByxPath(("//a[@id='kids toys for girls']"));
		Thread.sleep(5000);
		m.reFresh();
		Thread.sleep(3000);
		m.findElementByxPath("//a[contains(text(),'Crayola 52pc Silly Scents Mini Art Case')]");
		//m.findElementByxPath("//a[@aria-label=\"Crayola 52pc Silly Scents Mini Art Case\"]");
		//m.findElementby(By.xpath("//a[@aria-label=\"Crayola 52pc Silly Scents Mini Art Case\"]"));
		m.findElementByxPath("//button[@data-test=\"custom-quantity-picker\"]");
		
	}

}
