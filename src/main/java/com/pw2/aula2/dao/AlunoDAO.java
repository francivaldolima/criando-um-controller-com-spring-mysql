package com.pw2.aula2.dao;

import com.pw2.aula2.entidade.Aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlunoDAO {

    //criar um objeto Connection para receber a conexão

    Connection con;

    public AlunoDAO() {
        con = MinhaConexao.conexao();
    }

    public List<Aluno> buscarAlunos() {
        try {
            String sql = "select * from aluno";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Aluno> alunos = new ArrayList();
            while (rs.next()) {
                Aluno a = new Aluno();
                a.setId(rs.getInt("id"));
                a.setNome(rs.getString("nome"));
                //add pessoa na lista
                alunos.add(a);
            }
            return alunos;
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
