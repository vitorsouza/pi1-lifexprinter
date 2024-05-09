# LifeXPrinter

Resultado do roteiro de laboratório **Lab Maven 01 - Automação de Build** da disciplina de Projeto Integrado I do curso de [Ciência da Computação](https://informatica.ufes.br/pt-br/graduacao/ccomp/sobre-o-curso) do [Centro Tecnológico](https://ct.ufes.br/) da [Universidade Federal do Espírito Santo](https://www.ufes.br/).

Este projeto simples exercita o uso de [Maven](https://maven.apache.org/) para configuração de dependências, instalação do próprio projeto no repositório local e seu uso como dependência num segundo projeto Maven, para experimentar o uso de dependências transitivas.

O código em si utiliza a biblioteca [Commons CSV](https://commons.apache.org/proper/commons-csv/) para ler um arquivo em [formato CSV](https://pt.wikipedia.org/wiki/Comma-separated_values) e imprimir certos dados numa determinada ordem. O diretório `lifex` possui o projeto completo, enquanto `lifexprinter` possui apenas o cliente que usa `lifex` como dependência e chama sua API para recuperar os dados já processados.
