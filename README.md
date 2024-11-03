# Sistema de Gerenciamento de Funcionários

## Visão Geral

O Sistema de Gerenciamento de Funcionários é uma aplicação Java que implementa um sistema completo para gerenciamento de recursos humanos. O sistema utiliza conceitos fundamentais de programação orientada a objetos como herança, polimorfismo, encapsulamento e abstração.

## Estrutura do Projeto

### Classes Principais

#### `Empresa`
A classe principal que gerencia toda a estrutura organizacional.

**Atributos:**
- `nome`: Nome da empresa (privado)
- `listaDepartamentos`: Lista de departamentos
- `listaDeFuncionarios`: Lista de funcionários

**Métodos principais:**
- `adicionarFuncionario()`: Cadastra novo funcionário
- `removerFuncionario()`: Remove funcionário da empresa
- `adicionarDepartamento()`: Cria novo departamento
- `removerDepartamento()`: Remove departamento existente
- `atualizarFuncionarios()`: Atualiza dados dos funcionários
- `atualizarDepartamento()`: Atualiza informações departamentais

#### `Funcionario`
Representa cada funcionário da empresa.

**Atributos:**
- `nomeFuncionario`: Nome completo
- `idFuncionario`: Identificador único
- `cargoFuncionario`: Cargo atual
- `salarioFuncionario`: Salário
- `cpfFuncionario`: CPF (privado)
- `estaEmDepartamento`: Status de alocação

**Métodos:**
- `getCPF()`: Retorna CPF
- `setCPF()`: Define CPF

#### `Departamento`
Gerencia as unidades organizacionais.

**Atributos:**
- `nomeDoDepartamento`: Nome do departamento
- `idDepartamento`: Identificador único
- `listaDeFuncionarios`: Funcionários alocados

**Métodos:**
- `adicionarFuncionarioAoDepartamento()`: Aloca funcionário
- `removerFuncionarioDoDepartamento()`: Remove funcionário

#### `Display`
Responsável pela interface com usuário.

**Métodos:**
- `printListaFuncionariosDepartamento()`: Exibe funcionários por departamento
- `printListaFuncionariosGeral()`: Lista todos os funcionários
- `printListaDepartamentosGeral()`: Mostra todos os departamentos

## Funcionalidades

### 1. Gestão de Funcionários

- Cadastro de novos funcionários
- Atualização de dados cadastrais
- Remoção de funcionários
- Consulta de informações
- Validação de dados únicos (ID, CPF)

### 2. Gestão de Departamentos

- Criação de departamentos
- Atualização de informações
- Remoção de departamentos
- Alocação de funcionários
- Desalocação de funcionários

### 3. Validações e Segurança

- Verificação de IDs únicos
- Proteção de dados sensíveis (CPF)
- Controle de alocação departamental
- Verificações de existência antes de operações

## Fluxo de Operação

1. **Inicialização**
   - Carregamento do sistema
   - Inicialização das estruturas de dados

2. **Menu Principal**
   - Adicionar funcionário
   - Gerenciar departamentos
   - Alocar funcionários
   - Atualizar cadastros
   - Consultar informações

3. **Operações**
   - Validação de dados
   - Execução da operação
   - Atualização do estado
   - Exibição de confirmação

## Boas Práticas Implementadas

- Encapsulamento de dados sensíveis
- Validação de dados de entrada
- Separação de responsabilidades
- Interface de usuário organizada
- Código comentado e documentado
- Estrutura hierárquica clara

## Possíveis Melhorias

1. **Persistência de Dados**
   - Implementação de banco de dados
   - Salvamento em arquivos

2. **Interface Gráfica**
   - Desenvolvimento de GUI
   - Melhor experiência de usuário

3. **Segurança**
   - Autenticação de usuários
   - Níveis de acesso
   - Criptografia de dados sensíveis

4. **Funcionalidades Adicionais**
   - Histórico de alterações
   - Relatórios gerenciais
   - Métricas de desempenho