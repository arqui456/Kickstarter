# Kickstarter
Kickstarter é o maior site de financiamento coletivo do mundo e que busca apoiar projetos inovadores. O site foi fundado em 2008 por Perry Chen, Yancey Strickler, e Charles Adler. Em geral, o domínio mantém uma comissão de 5% sobre os valores arrecadados; Amazon também faz uma sobretaxa de 3% a 5% em doações feitas por intermédio da tal. 

## Requisitos
+ Adicionar usuário com email, senha e nome;
+ Editar o perfil do usuário, como mudar o nome, senha etc;
+ Remover usuário
+ Usuário pode iniciar um KickStart, informando categoria, descrição, sendo que o usuário precisa possuir no mínimo 18 anos, ter conta bancária no país de origem e um cartao de crédito.
+ Usuário pode editar seu KickStart
+ Usuário pode deletar seu KickStart
+ Usuário pode ajudar um KickStart fazendo doação
+ Usuário deve poder conseguir ver os projetos listados na plataforma.

## Descrição de entidades 
### User
+ nome: String
+ email: String
+ password: String
+ bankAccount: BankAccount
+ biography: String
+ country: String

### Reward
+ value: Double
+ description: String

### Project
+ projectOwner: User
+ title: String
+ category: Category
+ description: String
+ duration: Long
+ desiredMoney: Double
+ currentMoney: Double
+ commnets: List<Comment>
+ constribuitors: List<User>
+ rewards: List<Reward>

### Comment
+ text: String
+ user: User

### BankAccount
+ bankName: String
+ userName: String
+ totalQuantity: Double
+ id: Long
+ localization: String

### KickStarter
+ users: Map<String, User>
+ projects: Map<String, Project>

