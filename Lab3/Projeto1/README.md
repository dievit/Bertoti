# 📦 Busca CEP - Projeto Spring Boot

Este projeto foi desenvolvido como parte da disciplina de Banco de Dados (Lab III) do professor **Bertoti**.

Trata-se de uma aplicação **Fullstack** simples que consome a API pública do ViaCEP, armazena o histórico de pesquisas em um banco de dados em memória (H2) e permite a geração de relatórios em arquivo de texto.

## 🚀 Tecnologias Utilizadas

* **Java 21** (Backend)
* **Spring Boot 3** (Framework Principal)
* **Spring Data JPA** (Persistência de Dados)
* **H2 Database** (Banco de Dados em Memória)
* **HTML5, CSS3 e JavaScript** (Frontend)
* **Maven** (Gerenciador de Dependências)

## ⚙️ Funcionalidades

1.  **Busca de CEP:** Consome a API externa `viacep.com.br`.
2.  **Máscara de Input:** Formatação automática do CEP no frontend.
3.  **Persistência:** Salva automaticamente todos os CEPs válidos pesquisados no banco de dados.
4.  **Histórico:** Exibe na tela as últimas pesquisas realizadas.
5.  **Relatório em TXT:** Gera um arquivo `relatorio_ceps.txt` na pasta **Downloads** do usuário contendo todo o histórico do banco.

## 🛠️ Como Rodar o Projeto

### Pré-requisitos
* Java 17 ou superior instalado.
* Maven (o projeto já inclui o wrapper `mvnw`).

### Passo a Passo
1.  Clone este repositório:
    ```bash
    git clone [https://github.com/dievit/Bertoti.git](https://github.com/dievit/Bertoti.git)
    ```
2.  Acesse a pasta do projeto:
    ```bash
    cd Bertoti/Lab3/Projeto1
    ```
3.  Execute a aplicação via terminal:
    * **Windows:**
        ```powershell
        .\mvnw spring-boot:run
        ```
    * **Linux/Mac:**
        ```bash
        ./mvnw spring-boot:run
        ```
4.  Acesse no navegador: `http://localhost:8080`

## 📡 Documentação da API (Endpoints)

| Método | URL | Descrição |
| :--- | :--- | :--- |
| **POST** | `/api/consulta` | Recebe um CEP (String) no corpo, consulta o ViaCEP e salva no banco. |
| **GET** | `/api/historico` | Retorna uma lista JSON com todos os endereços pesquisados. |
| **GET** | `/api/relatorio` | Gera o arquivo `.txt` na máquina do usuário e retorna mensagem de sucesso. |

## 👨‍💻 Autor

Desenvolvido por **Diego Vitvicki** para a aula de Lab III.
