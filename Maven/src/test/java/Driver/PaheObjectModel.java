package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaheObjectModel {
@FindBy(xpath="//input[@id='UserName']")
private WebElement username;
@FindBy(xpath="//input[@id='Password']")
private WebElement password;
@FindBy(xpath="//input[@id='btnLogIn']")
private WebElement login;

public PaheObjectModel(WebDriver d) {
    PageFactory.initElements(d,this);;
}

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}
public void login(String userName,String password) {
	getUsername().sendKeys(userName);
	getPassword().sendKeys(password);
	getLogin().click();  
}
	
}
