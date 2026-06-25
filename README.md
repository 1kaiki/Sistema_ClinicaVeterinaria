============ Sistema de Gerenciamento para Clínica Veterinária ================

DESCRIÇÃO : 

Este projeto foi desenvolvido em Java com o objetivo de simular um sistema simples de gerenciamento para uma clínica veterinária. O sistema permite o cadastro, consulta, alteração e exclusão de animais, produtos e vendas, auxiliando no controle básico das informações da clínica.

O projeto foi desenvolvido utilizando os principais conceitos da Programação Orientada a Objetos (POO), como:

Classes e Objetos
Encapsulamento
Herança
Polimorfismo
Classes Abstratas
Associação entre classes

Toda a interação é realizada por meio do terminal , utilizando menus para navegação.

Funcionalidades
Cadastro de Animais

Permite cadastrar animais atendidos pela clínica, como:

Cães
Gatos

Cada animal possui informações como:

Código
Nome
Idade
Raça

Além das características específicas de cada espécie.

Cadastro de Produtos

Permite cadastrar produtos comercializados pela clínica, como:

Ração
Brinquedo
Medicamento

Cada produto possui:

Código
Nome
Preço

Além das informações específicas de cada categoria.

Cadastro de Vendas

Permite registrar uma venda associando um produto.

Cada venda recebe um código único para identificação.

Pesquisa

Permite pesquisar:

Animais
Produtos
Vendas

A pesquisa é realizada por meio do código de identificação.

Alteração

Permite alterar os dados de:

Animais
Produtos

Para as vendas, a alteração não foi implementada, sendo necessário excluir e cadastrar novamente.

Exclusão

Permite excluir:

Animais
Produtos
Vendas
Estrutura do Projeto
ProjetoClinicaVeterinaria
│
├── Main.java
├── Menu.java
│
├── Animal.java
├── Cao.java
├── Gato.java
│
├── Produto.java
├── Racao.java
├── Brinquedo.java
├── Medicamento.java
│
└── Venda.java
Hierarquia das Classes
Animal
├── Cao
└── Gato

Produto
├── Racao
├── Brinquedo
└── Medicamento

Venda
(associa Animal e Produto)

Menu
(controla o sistema)

Main
(inicia o programa)
Tecnologias Utilizadas
Java
Programação Orientada a Objetos (POO)
Scanner
Arrays
Estruturas condicionais
Estruturas de repetição
Como Executar
Abra o projeto em uma IDE Java, como Eclipse, IntelliJ IDEA ou NetBeans.
Certifique-se de que todos os arquivos estejam no mesmo pacote.
Compile o projeto.
Execute o arquivo Main.java.
Utilize os menus exibidos no console para acessar as funcionalidades do sistema.
Organização das Classes
Animal.java

Classe base responsável pelas informações comuns dos animais.

Cao.java

Classe derivada de Animal, responsável pelas informações específicas dos cães.

Gato.java

Classe derivada de Animal, responsável pelas informações específicas dos gatos.

Produto.java

Classe base responsável pelas informações comuns dos produtos.

Racao.java

Classe derivada de Produto, representa produtos do tipo ração.

Brinquedo.java

Classe derivada de Produto, representa produtos do tipo brinquedo.

Medicamento.java

Classe derivada de Produto, representa produtos do tipo medicamento.

Venda.java

Classe responsável por representar uma venda, associando um animal a um produto.

Menu.java

Classe responsável por controlar toda a navegação do sistema, exibindo os menus e executando as operações de cadastro, pesquisa, alteração e exclusão.

Main.java

Classe responsável por iniciar a execução do sistema.

Conceitos de Programação Orientada a Objetos Aplicados
Encapsulamento por meio de atributos privados e métodos getters e setters.
Herança para especialização das classes Animal e Produto.
Polimorfismo utilizando referências das classes pai para manipular objetos das classes filhas.
Associação entre as classes Venda, Animal e Produto.
Organização modular do sistema utilizando múltiplas classes.
