package com.pw2.aula2.dao;

import java.sql.Connection;

public interface ConexaoJDBC {
    public Connection criarConexao();
}
