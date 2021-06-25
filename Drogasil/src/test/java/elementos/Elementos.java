package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
 private By cookies = By.cssSelector("#onetrust-close-btn-container > button");
 private By searchHeader = By.id("searchHeader");
 private By button = By.xpath("//*[@id=\"fixed-container-styles\"]/header/div/form/button[2]");

public By getSearchHeader() {
	return searchHeader;
}

public By getButton() {
	return button;
}

public By getCookies() {
	return cookies;
}



}
