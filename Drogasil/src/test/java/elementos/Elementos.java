package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
 private By cookies = By.id("onetrust-accept-btn-handler");
 private By onsite = By.xpath("//*[@id=\"sm__onsite\"]/div[3]/a");
 private By login = By.xpath("//*[@id=\"fixed-container-styles\"]/header/div/div[1]/div[1]/div/p");
 private By button = By.xpath("//*[@id=\"fixed-container-styles\"]/header/div/div[1]/div[2]/button");
 private By username = By.xpath("//*[@id=\'emailCpf\']");
 private By password = By.xpath("//*[@id=\'password\']");
 private By forgetpassword = By.xpath("//*[@id=\"__next\"]/main/div/div/div[2]/div[1]/div[1]/form/a");
 private By textoEsp = By.linkText("Esqueceu sua senha?");
 private By fazercdastro = By.xpath("//*[@id=\"__next\"]/main/div/div/div[2]/div[1]/div[1]/form/button");


 
 
 
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

public By getUsername() {
	return username;
}

public By getForgetpassword() {
	return forgetpassword;
}

public By getPassword() {
	return password;
}

public By getTextoEsp() {
	return textoEsp;
}

public By getFazercdastro() {
	return fazercdastro;
}



}
