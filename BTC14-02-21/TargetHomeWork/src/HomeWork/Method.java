
package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method {
	
	ChromeDriver dr;
	
	//open browser
	void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\13476\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
	}
	
	//go to any web site.
	void gotoSite(String url) {
		dr.get(url);
	}
	
	// get any title.
	
	void getAnyTitle() {
		
		System.out.println(dr.getTitle());
	}
	
	// verify any element.
	
	void getTextByboolean(By by) {
		
		boolean b = dr.findElement(by).isDisplayed();
		System.out.println(b);
		}
	
	// refresh a page
	void reFresh() {
		
		dr.navigate().refresh();
	}
	
	// find any element by any locator.
	void typeOnElement(By typeBy, String writeString) {
		
		dr.findElement(typeBy).sendKeys(writeString);
	}
	
	// find any element by x path.
	void findElementByxPath(String xpathstring) {
		
		dr.findElement(By.xpath(xpathstring)).click();
	}
	
	// find element by css select.
	void findElementbycss(String cssSelector) {
		
		dr.findElement(By.cssSelector(cssSelector)).click();
	}
	
	//find any element By by.
	void findElementby(By by) {
		
		dr.findElement(by).click();
		
		}
	
	// find element by attribute.
	void getAnyAtribute(By by, String atributeName) {
		String text = dr.findElement(by).getAttribute(atributeName);
		System.out.println(text);
	}
	
	
	
	// close browser
		void closeBrowser() throws InterruptedException {
			Thread.sleep(5000);
			dr.quit();
		}
	
	}
