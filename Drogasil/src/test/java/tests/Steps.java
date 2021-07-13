package tests;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	Metodos metodo = new Metodos();
	Elementos ele = new Elementos();

	@Given("que esteja no site {string}")
	public void que_esteja_no_site(String site) {
		metodo.abrirNavegador(site, "Acessando site");
		metodo.pausa(1000);
		metodo.tempToClick(ele.getCookies(), null);
		metodo.clicar(ele.getCookies());
	}

	@When("Informar usuario e senha invalidos")
	public void informar_usuario_e_senha_invalidos() {
	
		metodo.clicar(ele.getlogin());
		metodo.clicar(ele.getButton());
		metodo.pausa(2000);
		metodo.preencher(ele.getUsername(), "rsppnet");
		metodo.preencher(ele.getPassword(), "123@321");
		metodo.clicar(ele.getFazercdastro());
	
		
	  
	}
	@Then("o sistema deve exibir a mensagem de Resumo de conta")
	public void o_sistema_deve_exibir_a_mensagem_de_resumo_de_conta() {
		
metodo.fecharNavegador();
	}



	@When("Informar usuario cadastrado")
	public void informar_usuario_cadastrado() {
		metodo.clicar(ele.getlogin());
		metodo.clicar(ele.getButton());
		metodo.pausa(1000);
		metodo.preencher(ele.getUsername(), "rsppnet");
		metodo.preencher(ele.getPassword(), "123@321");
	}

	@When("Clicar em esqueci minha senha")
	public void clicar_em_esqueci_minha_senha() {
		metodo.pausa(2000);
		metodo.clicar(ele.getForgetpassword());
	}

	@Then("o sistema deve exibir a campo com a informacao de Digite seu email ou cpf")
	public void o_sistema_deve_exibir_a_campo_com_a_informacao_de_digite_seu_email_ou_cpf() {
		metodo.validarTexto(ele.getTextoEsp(), "Esqueceu sua senha!");
	}

}
