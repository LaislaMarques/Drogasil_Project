package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
 private By cookies = By.id("onetrust-accept-btn-handler");
 private By onsite = By.xpath("//*[@id=\"sm__onsite\"]/div[3]/a");
 private By login = By.xpath("//*[@id=\"fixed-container-styles\"]/header/div/div[1]/div[1]/div/p");
 private By button = By.xpath("//*[@id=\"fixed-container-styles\"]/header/div/div[1]/div[2]/button");

public By getlogin() {
	return login;
}

public By getButton() {
	return button;
}

public By getCookies() {
	return cookies;
}

public By getOnsite() {
	return onsite;
}



}
