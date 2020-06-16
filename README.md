# Refatorações

- Retirada das funções de dentro das classes **"CadastroLivroController"**, **"ExibirController"** e **"InitController"**
e colocadas em uma nova pasta **FUNCTIONS** onde foram criadas
as classes **"FunctionCadastroLivro"**, **"FunctionExibirController"** e **"FunctionsInitController"**.
- Dentro dos controles, foram feitas as chamadas das functions deixando mais limpo o entendimento do código.
- Dentro de **"initView"** foi feita uma alteração nos objetos para chamar as funções de FunctionInitController.
