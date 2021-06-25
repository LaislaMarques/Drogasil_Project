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

	@Then("o sistema deve exibir a mensagem de Resumo de conta")
	public void o_sistema_deve_exibir_a_mensagem_de_resumo_de_conta() {
		mtdo.clicar(ele.getCookies());

	}

	@When("Informar usuario cadastrado")
	public void informar_usuario_cadastrado() {

	}

	@When("Clicar em esqueci minha senha")
	public void clicar_em_esqueci_minha_senha() {

	}

	@Then("o sistema deve exibir a campo com a informacao de Digite seu email ou cpf")
	public void o_sistema_deve_exibir_a_campo_com_a_informacao_de_digite_seu_email_ou_cpf() {

	}

}
