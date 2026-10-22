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
| ID | Identificador [único] |
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
| RF13 | Obter resultado | Exibir uma tela contendo o rsultado final e o ranking de produtos. | Normal |
| RF14 | Salvar resultados | Implementação da análise TOPSIS e ranking de produtos | Baixa |

### 2.1 Sub-requisitos funcionais

| ID | Nome | Descrição | Prioridade |
|---|---|---|---|
| RF01.1 | A definir | A definir | A definir |
| RF01.2 | A definir | A definir | A definir |

## 3. Requisitos não funcionais

| ID | Nome | Descrição | Categoria | Prioridade |
|---|---|---|---|---|
| RNF01 | A definir | A definir | A definir | A definir |
| RNF02 | A definir | A definir | A definir | A definir |

## 4. Regras de negócio

| ID | Nome | Descrição | Prioridade |
|---|---|---|---|
| RN01 | A definir | A definir | A definir |
| RN02 | A definir | A definir | A definir |
| RN03 | A definir | A definir | A definir |

## 5. Restrições técnicas

A definir.

## 6. Dependências e integrações externas

A definir.
