# Requirements — Sistema de Avaliação Comparativa Multicritério de Produtos (AHP-TOPSIS)

> Documento utilizado para estabelecer e avaliar requisitos do sistema e suas regras de negócio.

## 1. Introdução

### 1.1 Objetivo

Listar as requisições que o sistema deve cumprir por funcionalidades ou características, as regras de negócio que o compões, bem como descrevê-las e indicar sua prioridade no processo de desenvolvimento.

### 1.2 Escopo

O sistema tem como finalidade permitir a avaliação e comparação de produtos por meio de métodos de análise multicritério, utilizando o AHP (Analytic Hierarchy Process) para definir a importância relativa dos critérios e o TOPSIS (Technique for Order Preference by Similarity to Ideal Solution) para calcular a classificação das alternativas.

O escopo contempla a visualização de categorias e produtos, a definição e validação dos pesos dos critérios, a avaliação dos produtos, o cálculo do ranking e a apresentação dos resultados comparativos. O sistema também deverá contemplar o carregamento dos dados necessários à avaliação, conforme as fontes de dados definidas para o projeto.

A aplicação será desenvolvida para a plataforma Android, utilizando Kotlin e Jetpack Compose.

### 1.3 Definições e siglas

| Sigla | Significado |
|---|---|
| IC | Índice de Consistência |
| ID | Identificador [único] |
| IDE | Ambiente de Desenvolvimento Integrado [em inglês] |
| RC | Razão de Consistência |
| RF | Requisito Funcional |
| RNF | Rquisito Não Funcional |
| RN | Regra de Negócio |

## 2. Requisitos funcionais

| ID | Nome | Descrição | Prioridade |
|---|---|---|---|
| RF01 | Exibir tela iniciall | Implementação de inteterface gráfica da tela inicial que conterá as opções "Entrar com login" ou "Entrar como visitante". | Muito Alta |
| RF02 | Exibir tela com lista de categorias de produtos | Implementação de inteterface gráfica do menu principal. | Muito Alta |
| RF03 | Exibir tela com lista de produtos | Implementação de interface gráfica para as listas de cada categoria. | Muito Alta |
| RF04 | Permitir navegação entre telas | Implementação de uma pilha de navegação entre telas e exibição gráfica de atalhos. | Alta |
| RF05 | Mostrar detalhes dos produtos | Opção para visualização doas informações dos produtos, tais como foto, nome, modelo e fabricante. | Alta |
| RF06 | Exibir tela de autenticação de usuário | Mostrar formulários para login ou cadastro. | Normal |
| RF07 | Exibir tela de carregamento | Uma tela de espera entre o início da atividade e o carregamento da tela inicial. | Normal |
| RF08 | Permitir escolha dos pesos dos critérios | Permite ao usuário controlar os pesos dos pares de critérios usando o método AHP com escala de Saaty de 1 a 9. | Normal |
| RF09 | Validar consistência do cálculo AHP | Monitora os resultados de cálculo de pesos utilizando Razão de Consistência (RC ≤ 0,10). | Normal |
| RF10 | Permitir informar os valores dos critérios de cada produto. | Permite ao usuário controlar o valor de cada um dos 5 critérios por produtos. | Normal |
| RF11 | Revisar as configurações. | Exibe as escolhas feitas e permite voltar atrás. | Normal |
| RF12 | Processar dados. | Implementação do algoritmo TOPSIS. | Normal |
| RF13 | Obter resultado | Exibir uma tela contendo o resultado final e o ranking de produtos. | Normal |
| RF14 | Salvar resultados | Exportar o resultado final para o seu dispositivo | Baixa |
| RF15 | Iniciar nova avaliação | O usuário pode realizar uma nova avaliação após os resultados da anterior | Normal |

### 2.1 Sub-requisitos funcionais

| ID | Nome | Descrição | Prioridade |
|---|---|---|---|
| RF01.1 | Opção de cadastro | Cria um novo usuário na base de dados remota. | Muito Alta |
| RF01.2 | Opção de login | Permite o usuário retornar sempre com seu perfiu previamente cadastrado. | Muito Alta |
| RF01.3 | Opção de entrar como visitante | Permite o usuário utilizar o serviço sem necessariamente estar logado. | Muito Alta |
| RF02.1 | Carregar cards de categorias | Listar todas as categorias disponíveis em formado de cartões de acesso. | Muito Alta |
| RF03.1 | Carregar lista de produtos | Puxa da base de dados todas os produtos disponíveis em determinada categoria. | Muito Alta |
| RF04.1 | Navegar para configurações do aplicativo | Possibilidade de acessar informaçẽos de usuário e alterar padrões visuais. | Normal |
| RF04.2 | Voltar para a tela anterior | Possibilidade de retroceder pelo caminho de telas acessada. | Alta |
| RF04.2 | Voltar para a tela anterior | Possibilidade de retroceder pelo caminho de telas acessada. | Alta |
| RF08.1 | Exibir barras de pesos em pares dinamicamente | Cada vez que o usuário alterar um peso de critério, o cálculo das pabrras em será feito. | Normal |
| RF09.1 | Calcular o Índice de Consistência | Cálculo do IC a partir do autovalor máximo e da quantidade de critérios. | Alta |
| RF09.2 | Cálculo da Razão de Consistência | Cálculo da RC utilizando o IC e o Índice Aleatório (IR). | Alta |
| RF09.3 | Identificação de inconsistência | Verificar se a RC ultrapassa o limite de 0,10 (RC > 0,10). | Alta |
| RF09.4 | Emitir alerta de incosistência | Lança na tela um balão informando que há inconsistência na RC e que os pesos devem ser redefinidos | Alta |
| RF09.4.1 | Bloquear avanço de processamento de dados | Serve para barrar qualquer tentativa de prosseguir sem uma RC válida. | Alta |
| RF10.1 | Listar todos os produtos da categoria selecionada para avaliação | Para cada produto da lista, um cartão de informações sucintas será exibido. | Normal |
| RF11.1 | Exibir Matriz de Decisão | Mostra na tela a matriz montada pelo cálculo AHP | Normal |
| RF12.1 | Iniciar processamento TOPSIS | O usuário deverá clicar em um botão para confirmar | Normal |
| RF13.1 | Mostrar cartões dos produtos listados no resultado final | A exibição não passará de uma lista vertical de cartões dos produtos já ordenados pelo algoritmo TOPSIS | Alta |
| RF13.2 | Exibir o coeficiente de proximidade de cada alternativa | Mostrar ao usuário os números utilizados no cálculo TOPSIS | Baixa |
| RF13.3 | Exibir as distâncias euclidianas D+ e D− de cada alternativa | Mostrar ao usuário barras de comprimento proporcionais às distâncias euclidianas dadas pelo TOPSIS | Baixa |
| RF14.1 | Salvar o resultado de forma local | Utilizar Room ou DataStore fornecidos pela linguagem Kotlin | Levíssima |

## 3. Requisitos não funcionais

| ID | Nome | Descrição | Categoria(s) | Prioridade |
|---|---|---|---|---|
| RNF01 | Interface intuitiva. | A forma como devem ser exibidos os elementos gráficos deve ser de fácil compreensão | Usabilidade | Muito ALta |
| RNF02 | Interface responsiva. | Os elementos gráficos devem se ajuster a diferentes tamanhos de tela | Portabilidade | Muito ALta |
| RNF03 | Código modular e bem documentado. | Dividir o código do sistema em módulos bem definidos e documentados corretamente | Manutenabilidade | Muito Alta |
| RNF04 | Execução computacional instantânea dos cálculos matriciais. | O sistema deve possuir um mecanismo de cálculo otimizado e que atenda com rapidez as solicitações do usuário | Desempenho | Alta |
| RNF05 | Proteção à autenticação do usuário | Medidas de segurança devem fortalecer o sigilo das informações pessoais e acessos dos usuários | Desempenho | Alta |
| RNF05 | Persistência local ou remota de dados | O sistema vai salvar os resultados finais de cada avaliação | Levíssima |

# 4. Restrições técnicas

O desenvolvimento do sistema deverá respeitar as seguintes restrições técnicas e ferramentas previamente definidas pela equipe:

## 4.1. Tecnologias de desenvolvimento

- **Linguagem de programação:** Kotlin, utilizada na implementação da aplicação Android.
- **IDE**: Android Studio, para facilitar a integração do código com os testes em emuladores ou no próprio dispositivo móvel do desenvolvedor.
- **Construção da interface:** Jetpack Compose, utilizado para desenvolver as interfaces gráficas do aplicativo.
- **Arquitetura:** MVVM (Model-View-ViewModel), visando à separação de responsabilidades entre a interface, o gerenciamento de estado e a lógica de negócio.

## 4.2. Controle de versão

O código-fonte e os documentos do projeto deverão ser mantidos em um repositório compartilhado no GitHub, utilizando Git para o controle de versão. O desenvolvimento deverá seguir o fluxo de trabalho definido pela equipe, incluindo o uso de branches e pull requests, conforme as regras estabelecidas no repositório.

## 4.3. Gerenciamento de tarefas

A equipe deverá utilizar o GitHub Projects para registrar, organizar e acompanhar as tarefas relacionadas ao desenvolvimento do sistema. Essa ferramenta deverá auxiliar no acompanhamento do planejamento, na distribuição das atividades e no monitoramento do progresso ao longo do projeto.

## 4.4. Integração com serviços externos

O acesso a dados remotos deverá utilizar a API ou o serviço Firebase definido pela equipe, conforme a solução adotada para a obtenção e disponibilização dos dados necessários ao funcionamento do aplicativo.

## 6. Dependências e integrações externas

A definir.
