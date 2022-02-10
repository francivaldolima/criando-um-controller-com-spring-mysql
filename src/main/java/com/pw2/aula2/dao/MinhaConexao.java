package com.pw2.aula2.dao;

import java.sql.Connection;

public class MinhaConexao {
    public static Connection conexao(){
        ConexaoJDBC conexao = new ConexaoMysql();
        return conexao.criarConexao();
    }
}
