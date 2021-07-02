package tests;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	Metodos mtdo = new Metodos();
	Elementos ele = new Elementos();

	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String site) {
		mtdo.abrirNavegador(site, "Acessando site");

	}

	@When("buscar por medicamento {string}")
	public void buscar_por_medicamento(String texto) {
		mtdo.pausa(2000);
		mtdo.tempToClick(ele.getCookies(), "fechar cookie");
		mtdo.clicar(ele.getCookies());
		mtdo.preencher(ele.getSearchHeader(), texto);
		mtdo.clicar(ele.getButton());
		mtdo.pausa(2000);
	}

	@Then("valido a busca {string}")
	public void valido_a_busca(String texto) {
		mtdo.tempToClick(ele.getdorflex(), null);
		mtdo.validartexto(ele.getdorflex(), texto);
		mtdo.pausa(1000);
		mtdo.fecharNavegador();

	}

	@When("buscar por alimento {string}")
	public void buscar_por_alimento(String alimento) {
		mtdo.pausa(2000);
		mtdo.tempToClick(ele.getCookies(), "fechar cookie");
		mtdo.clicar(ele.getCookies());
		mtdo.pausa(5000);
		mtdo.preencher(ele.getSearchHeader(), alimento);
		mtdo.clicar(ele.getButton());
		
	}
	@Then("valido a mensagem de {string}")
	public void valido_a_mensagem_de(String texto) {
	   mtdo.tempToClick(ele.getfeijoada(), texto);
		mtdo.fecharNavegador();
}
}
