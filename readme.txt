Documentação do projeto:
	
	O projeto possui quatro pacotes descritos a seguir:
		conexao
			Contém a classe responsável pela conexão ao banco de dados.
		
		gui
			Contém as classes usadas para interação aplicação/usuário por meio da biblioteca Swing do Java
		
		model.bean
		
			Contém as classes bean com os atributos dos objetos que serão persistidos no banco de dados
		
		model.dao
		
			Contém as classes DAO(Data Acesss Object) que são responsavéis pelo envio dos dados para o banco.
			
			
			
Instruções para executar o projeto.

	Configuração do banco de dados:
			Banco de utilizado: MySql
				User = root
				password = ""
			
				Base de dados: db_desafio(arquivo de importação encontra-se no projeto).
			
	A aplicação tem uma tela inicial com todos os botões para cadastro e consulta conforme pede os requisitos do desafio.

	Na tela de cadastro de pessoas há campos de edição para o preenchimento do nome e sobrenome, as salas e espaços são exibidos por meio de um JComboBox com valores carregados previamente do banco de dados(necessário cadastrar as salas e espaços previamente).

	Na tela de cadastro de salas e espaços há campos de edição de texto para nome e  lotação.

	O botão da Iniciar treinamento verifica se há pessoas, salas e espaços cadastrados. Também verifica se a diferença de pessoas em cada sala é superior a um.

	Cadastre as pessoas, salas e espaços para então validar o treinamento usando o botão Iniciar treinamento.

	
