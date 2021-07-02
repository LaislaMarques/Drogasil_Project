#Author: laisla_marques@outlook.com
@drogasil
Feature: Pesquisar produto no site drogasil
 Eu como usuario quero acessar o site e realizar a busca de um produto
 
 Background: Acessar tela de login
 Given que eu esteja no site "https://m2-stage.drogasil.com.br/"

  @CT01
  Scenario: buscar produto valido
    When buscar por medicamento "dorflex"
    Then valido a busca 'Resultado para "dorflex"'
    
  
  @CT02
   Scenario: busca por produto inxistente
   When buscar por alimento "feijoada"
  Then valido a mensagem de 'Nenhum resultado encontrado para "feijoada"'
  
    

