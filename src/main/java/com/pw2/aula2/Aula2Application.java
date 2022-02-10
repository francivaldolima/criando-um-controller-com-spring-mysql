package com.pw2.aula2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aula2Application {
    /*
    * 1) Criar uma conexão JDBC conforme arquivos (classe de Conexão, e classe AlunoDAO) anexo a tarefa.

      2) Após confirmar que sua aplicação esteja conectando ao banco de dados, crie um Controller apenas para listar os
      *  dados de todos os alunos cadastrado no banco.

      NOTA 1: Na classe Conexão o banco será criado automaticamente na execução da classe.

      NOTA 2: Inserir registros no banco de dados manualmente, seu projeto deve apenas listar os dados do banco.
    * */
    public static void main(String[] args) {
        SpringApplication.run(Aula2Application.class, args);
    }

}
