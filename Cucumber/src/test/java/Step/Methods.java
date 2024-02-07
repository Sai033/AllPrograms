package Step;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {
	  private static WebDriver d;

	    private Methods() {
	        // Private constructor to prevent direct instantiation
	    }

	    public static WebDriver getDriver() {
	        if (d == null) {
	            // Initialize the WebDriver (in this case, ChromeDriver)
	            d = new FirefoxDriver();
	        }
	        return d;
	    }

	    public static void quitDriver() {
	        if (d != null) {
	            d.quit();
	            d = null; // Set it to null to indicate that the driver has been closed
	        }
	    }
	
	
WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(10));
public boolean CheckElementDisplayedbyXpath(String xpath, String elementName) {
	try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		boolean element = d.findElement(By.xpath(xpath)).isDisplayed();
		if (element) {
			System.out.println(elementName + " is Displaying");
		} else {
			System.out.println(elementName + "  -----------is Not Displaying");
		}
		return true;
	} catch (Exception e) {
		System.out.println("not able  to validate Display element");
		System.out.println("Exception : " + e);
		return false;
	}

}

public boolean CheckElementDisplayedbyID(String id, String elementName) {
	try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
		boolean element = d.findElement(By.id(id)).isDisplayed();
		System.out.println(elementName + " is Displaying");
		return true;
	} catch (Exception e) {
		System.out.println("not able validate Display element");
		System.out.println("Exception : " + e);
		return false;
	}

}

public boolean CheckElementDisplayedbyName(String name, String elementName) {
	try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name)));
		boolean element = d.findElement(By.name(name)).isDisplayed();
		if (element) {
			System.out.println(elementName + " is Displaying");
		} else {
			System.out.println(elementName + " is Not Displaying");
		}
		return true;
	} catch (Exception e) {
		System.out.println("not able validate Display element");
		System.out.println("Exception : " + e);
		return false;
	}

}

public boolean CheckElementDisplayedbyClassName(String className, String elementName) {
	try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(className)));
		boolean element = d.findElement(By.className(className)).isDisplayed();
		if (element) {
			System.out.println(elementName + " is Displaying");
		} else {
			System.out.println(elementName + " is Not Displaying");
		}
		return true;
	} catch (Exception e) {
		System.out.println("not able validate Display element");
		System.out.println("Exception : " + e);
		return false;
	}

}

public boolean enteringDataintoTextfiledByID(String ID, String DataneedtoEnter, String elementName) {
	try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(ID)));
		d.findElement(By.id(ID)).sendKeys(DataneedtoEnter);
		System.out.println("entered data into " + elementName + " : " + DataneedtoEnter);
		return true;
	} catch (Exception e) {
		System.out.println("not able to enter the data into " + elementName);
		System.out.println("Exception : " + e);
		return false;

	}
}

public boolean enteringDataintoTextfiledByName(String name, String DataneedtoEnter, String elementName) {
	try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name)));
		d.findElement(By.name(name)).sendKeys(DataneedtoEnter);
		System.out.println("entered data into " + elementName + " : " + DataneedtoEnter);
		return true;
	} catch (Exception e) {
		System.out.println("not able to enter the data into " + elementName);
		System.out.println("Exception : " + e);
		return false;

	}
}

public boolean enteringDataintoTextfiledByClassName(String className, String DataneedtoEnter,
		String elementName) {
	try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(className)));
		d.findElement(By.className(className)).sendKeys(DataneedtoEnter);
		System.out.println("entered data into " + elementName + " : " + DataneedtoEnter);
		return true;
	} catch (Exception e) {
		System.out.println("not able to enter the data into " + elementName);
		System.out.println("Exception : " + e);
		return false;

	}
}

public boolean enteringDataintoTextfiledByXpath(String xpath, String DataneedtoEnter, String elementName) {
	try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		d.findElement(By.xpath(xpath)).sendKeys(DataneedtoEnter);
		System.out.println("entered data into " + elementName + " : " + DataneedtoEnter);
		return true;
	} catch (Exception e) {
		System.out.println(" ------------------------not able to enter the data into " + elementName);
		System.out.println("Exception : " + e);
		return false;

	}
}

public boolean clickonElementbyID(String ID, String elementName) {
	try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(ID)));
		d.findElement(By.id(ID)).click();
		System.out.println("clicked on " + elementName + " element");
		return true;
	} catch (Exception e) {
		System.out.println("not able click on " + elementName + " element");
		System.out.println("Exception : " + e);
		return false;

	}
}

public boolean clickonElementbyXpath(String xpath, String elementName) {
	try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		d.findElement(By.xpath(xpath)).click();
		System.out.println("clicked on " + elementName + " element");
		return true;
	} catch (Exception e) {
		System.out.println("--------------------not able click on " + elementName + " element");
		System.out.println("Exception : " + e);
		return false;

	}
}

public boolean CheckEnteredDataisDisplaying(String xpath, String DataneedtoValidate) {
	try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		String element = d.findElement(By.xpath(xpath)).getText();
		if (element.contains(DataneedtoValidate)) {
			System.out.println("the " + DataneedtoValidate + " data is Displaying");
		} else {
			System.out.println("The " + DataneedtoValidate + " data is not Displaying");
		}
		return true;
	} catch (Exception e) {
		System.out.println("not able validate " + DataneedtoValidate);
		System.out.println("Exception : " + e);
		return false;
	}
}

public boolean selectValueinDropdownByVisualtextbyID(String ID, String valuetoSelect, String fieldName) {
	try {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(ID)));
		Select select = new Select(d.findElement(By.id(ID)));
		select.selectByVisibleText(valuetoSelect);
		System.out.println("Selected " + valuetoSelect + " from " + fieldName + " Menu");
		return true;
	} catch (Exception e) {
		System.out.println("not able select " + valuetoSelect + " from " + fieldName + " Menu");
		System.out.println("Exception : " + e);
		return false;
	}

}
public boolean selectValueinDropdownByVisualtextbyXpath(String xpath, String valuetoSelect, String fieldName) {
	try {
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
		Select select = new Select(d.findElement(By.xpath(xpath)));
		select.selectByVisibleText(valuetoSelect);
		System.out.println("Selected " + valuetoSelect + " from " + fieldName + " Menu");
		return true;
	} catch (Exception e) {
		System.out.println("not able select " + valuetoSelect + " from " + fieldName + " Menu");
		System.out.println("Exception : " + e);
		return false;
	}

}

public boolean scrolltoElementByXpath(String xpath) {
	try {
		WebElement element = d.findElement(By.xpath(xpath));
		((JavascriptExecutor) d).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);
		return true;
	} catch (Exception e) {
		System.out.println("FAIL:: not able to scroll to element");	
	     return false;
}}
}
