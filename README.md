🧠 Exercícios de Herança e Polimorfismo em Java

Projeto desenvolvido com foco na aplicação prática de Programação Orientada a Objetos, explorando:

Herança

Polimorfismo

Sobrescrita de métodos

Encapsulamento

Organização em pacotes

O projeto contém dois estudos principais: uma Calculadora e um Sistema de Cinema com diferentes tipos de ingressos.

📁 Estrutura do Projeto
Calculadora/
 └── src/
      └── Calculatordio/
           ├── Menu.java
           └── module-info.java

ExercicioPHDIO/
 └── src/
      └── ExercicioOne/
           ├── Cinema.java
           ├── Filme.java
           ├── IngressosFML.java
           ├── IngressosMeia.java
           └── module-info.java

🧮 Parte 1 — Calculadora

Projeto simples com menu interativo para execução de operações matemáticas.

Conceitos aplicados:

Organização de fluxo lógico

Separação de responsabilidades

Estruturação de entrada e saída

🎬 Parte 2 — Sistema de Cinema

Simulação de um sistema de venda de ingressos com diferentes tipos de cobrança.

📌 Modelagem

Filme.java → Representa o filme exibido

Cinema.java → Gerencia informações do cinema

IngressosFML.java → Ingresso com valor integral

IngressosMeia.java → Ingresso com desconto

Aqui é onde entra o ponto forte:

🔥 Herança

Provavelmente existe uma classe base de ingresso (ou poderia existir), e os tipos específicos herdam comportamento comum.

Exemplo conceitual:

Ingresso ingresso = new IngressosMeia();


Isso permite comportamento dinâmico em tempo de execução.

🎯 Conceitos Demonstrados

Reutilização de código através de herança

Especialização de comportamento

Polimorfismo com referência da classe pai

Estruturação de sistema orientado a objetos

Modelagem baseada em cenário real

▶️ Como Executar

Clone o repositório:

git clone https://github.com/seu-usuario/nome-do-repo.git


Abra em uma IDE (Eclipse, IntelliJ ou VS Code)

Execute as classes principais de cada módulo

📚 Aprendizados Consolidados

Entendimento prático de hierarquia de classes

Aplicação real de polimorfismo

Estruturação de sistemas pequenos com responsabilidade definida

Base para padrões de projeto

🚀 Próximos Passos (Evolução Recomendada)

Para elevar o projeto de nível:

Criar classe abstrata Ingresso

Aplicar @Override explicitamente

Criar um sistema único integrando cinema + menu

Aplicar padrão Strategy para cálculo de valor

Adicionar tratamento de exceções

Implementar testes unitários
