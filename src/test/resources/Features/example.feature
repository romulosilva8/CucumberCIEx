#language: pt
Funcionalidade: Negativa de emissao

  @TestCaseKey=AQA-T4
  Cenario: CT03 - CLIENTE NAO POSSUI O CARTAO, HOUVE NEGATIVA PARA O AVISO DE EMISSAO
    Dado A comunicacao do aviso de emissao
    Quando Houver Recusa (avisoEmissaoApolice)
    Entao Proceder com recusa da oferta do Cartao Porto
