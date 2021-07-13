#Author: laisla_marques@outlook.com

Feature: Login de Usuario Cadastrado
 Eu como usuario quero acessar o site e realizar login
 
 Background: Acessar tela de login
 Given que esteja no site "https://m2-stage.drogasil.com.br/"

  @CT01
  Scenario: Efetuar login com dados invalidos
    When Informar usuario e senha invalidos
    Then o sistema deve exibir a mensagem de Resumo de conta
    
  
  @CT02
   Scenario: Recuperar Senha 
   When Informar usuario cadastrado
   And Clicar em esqueci minha senha 
  Then o sistema deve exibir a campo com a informacao de Digite seu email ou cpf
    

