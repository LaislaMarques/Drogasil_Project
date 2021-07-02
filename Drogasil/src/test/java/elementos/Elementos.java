package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
 private By cookies = By.id("onetrust-accept-btn-handler");
 private By onsite = By.xpath("//*[@id=\"sm__onsite\"]/div[3]/a");
 private By searchHeader = By.id("searchHeader");
 private By button = By.xpath("//*[@id=\"fixed-container-styles\"]/header/div/form/button[2]");
private By dorflex = By.cssSelector("#__next > main > div > div:nth-child(2) > div > div > h1");
private By feijoada = By.cssSelector("#__next > main > div > div.sc-kNzBZN.DmTPj > h1");


		public By getfeijoada() {
	return  feijoada;
}
public By getdorflex() {
	return dorflex;
}
public By getSearchHeader() {
	return searchHeader;
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
