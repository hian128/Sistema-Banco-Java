🏦 Sistema Banco Java
Este é um projeto em Java que simula um sistema bancário funcional, desenvolvido para aplicar e consolidar conceitos fundamentais de Programação Orientada a Objetos (POO).

O foco principal foi a prática de encapsulamento, herança, polimorfismo e abstração, além da organização de pacotes e modelagem UML.

🚀 Funcionalidades
Gestão de Contas: Criação de contas vinculadas a clientes.

Conta Corrente: Inclui taxa de operação por transação.

Conta Poupança: Inclui mecanismo de rendimento de saldo.

Operações Financeiras:

Depósitos e saques com validação.

Transferências entre diferentes tipos de contas.

Listagem: Visualização detalhada de todas as contas registradas no sistema.

🏗️ Estrutura do Projeto
A arquitetura foi dividida em pacotes para garantir a separação de responsabilidades:

Sistema-Banco-Java/
├─ UML/           # Diagrama de classes do sistema
├─ src/
│  ├─ model/      # Classes de domínio (Cliente, Conta, ContaCorrente, ContaPoupanca)
│  ├─ service/    # Lógica de negócio e gerenciamento (BancoService.java)
│  └─ app/        # Ponto de entrada da aplicação (Main.java)

💻 Como Executar
Pré-requisitos
Java JDK 17 ou superior instalado.
Git instalado.

Passo a Passo
Clone o repositório:
git clone https://github.com/hian128/Sistema-Banco-Java.git

Entre na pasta do projeto:
cd Sistema-Banco-Java

Compile o projeto:
javac src/model/*.java src/service/*.java src/app/*.java -d bin

Execute o programa:
java -cp bin app.Main

📊 Modelagem UML
O sistema foi planejado utilizando diagramas de classe para definir os relacionamentos:

Herança: ContaCorrente e ContaPoupanca estendem a classe base Conta.

Composição: A classe Conta possui um objeto do tipo Cliente.

Polimorfismo: Métodos de saque e atualização de saldo comportam-se de forma distinta dependendo do tipo da conta.

Você pode visualizar o diagrama completo na pasta /UML deste repositório.

🛠️ Tecnologias Utilizadas
Linguagem: Java 17

Paradigma: Orientação a Objetos

Versionamento: Git & GitHub

👤 Autor
Desenvolvido por Hian. Confira mais projetos no meu perfil: hian128
