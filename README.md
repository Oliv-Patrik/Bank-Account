_**Bank Account**_ Um projeto bancário em Java, criado para o BootCamp da Santander em parceria com a DIO. Este projeto apresenta um sistema bancário simples, com recursos para criar contas, depósitos, saques e transferências entre contas.

**Funcionalidades:**

•  Criar uma conta bancária<br/>
•  Fazer depósitos em uma conta<br/>
•  Fazer saques em uma conta<br/>
•  Transferir fundos entre contas<br/>
•  Exibir o saldo atual de uma conta<br/>
•  Listar todas as contas bancárias<br/>

**Como executar:**

Faça o clone do repositório para sua máquina local usando o comando: git clone https://github.com/Oliv-Patrik/Bank-Account.git
Navegue até a pasta do projeto: cd Bank-Account
Execute o arquivo Main.java usando a IDE ou a linha de comando do Java.
Exemplo de uso:

1 Crie duas contas bancárias:

``Account account1 = new Account("Oliv Patrik", 1000.0);``<br/>
``Account account2 = new Account("José Silva", 500.0);``

2 Exiba o saldo das contas:<br/>
``System.out.println("Saldo da conta de Oliv Patrik: " + account1.getBalance());``<br/>
``System.out.println("Saldo da conta de José Silva: " + account2.getBalance());``<br/>

3 Faça um depósito na conta de Oliv Patrik:<br/>
``account1.deposit(300.0);``<br/>

4 Faça um saque na conta de José Silva:<br/>
``account2.withdraw(200.0);``<br/>

5 Exiba o saldo atual das contas:<br/>
``System.out.println("Saldo atual da conta de Oliv Patrik: " + account1.getBalance());``<br/>
``System.out.println("Saldo atual da conta de José Silva: " + account2.getBalance());``<br/>

**Contribuições:** Este projeto é aberto a contribuições e melhorias. Para contribuir, siga os passos abaixo:

1 - Faça o fork do repositório.<br/>
2 - Crie uma branch para suas alterações.<br/>
3 - Faça o commit das alterações.<br/>
4 - Faça o push para a branch criada.<br/>
5 - Abra um pull request com suas alterações.<br/>