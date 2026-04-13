# Gerenciador de Áudio com OOP 
Este projeto consiste em uma aplicação Java desenvolvida para o gerenciamento e classificação de mídias de áudio, como músicas e podcasts. O objetivo principal foi aplicar os pilares da Programação Orientada a Objetos (POO) para criar um sistema escalável e organizado.

## Modelagem de Dados
Desenvolvimento de uma estrutura de classes sólida utilizando Herança, onde a classe mãe Audio fornece a base para Musica e Podcast.

Encapsulamento: Todos os atributos (titulo, duracao, totalReproducoes, etc.) foram protegidos como privados, sendo acessados exclusivamente via métodos getters e setters.

Comportamentos Base: Implementação dos métodos curte() e reproduz() para manipulação direta de métricas de engajamento.

## Polimorfismo e Sobrescrita
O sistema de classificação foi personalizado para cada tipo de mídia através da Sobrescrita de Métodos (@Override):

Músicas: Avaliadas pelo volume de reproduções (mais de 2000 execuções garantem nota máxima).

Podcasts: Avaliados pelo engajamento orgânico (mais de 500 curtidas garantem nota máxima).

## Sistema de Preferências

Crieação de uma classe especializada chamada Preferencias que utiliza o Polimorfismo para processar qualquer objeto do tipo Audio. O método inclui() analisa a classificação dinâmica de cada mídia e exibe recomendações personalizadas no terminal.

## estrutura de Pacotes

O projeto foi organizado para seguir as boas práticas de desenvolvimento:

br.com.alura.audiomind.modelos: Contém as classes de dados e lógica de negócio.

br.com.alura.audiomind.principal: Contém a classe Principal para execução e testes do sistema.

## Como executar

Clone o repositório.

Certifique-se de ter o Java instalado.

Compile as classes e execute a Principal.java.

O sistema simulará um grande volume de reproduções e curtidas através de loops, exibindo os resultados da classificação polimórfica.

## Origem do projeto

Este desafio foi desenvolvido como parte prática da minha trilha de estudos na Alura, com foco em consolidar o domínio sobre fundamentos de Java e Orientação a Objetos.

link do curso da [ALURA](https://cursos.alura.com.br/course/java-aplicando-orientacao-objetos)


[![Alura](https://img.shields.io/badge/Alura-10%20%2F%2010-blueviolet?style=for-the-badge&logo=appveyor)](https://www.alura.com.br)
