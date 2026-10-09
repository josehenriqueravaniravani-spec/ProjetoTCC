/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoagrohad.dao;

import br.com.projetoagrohad.model.Raca;
import br.com.projetoagrohad.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author JoseHenriqueRavani
 */
public class RacaDAO {
    
    //Criar uma variável para conexão com o banco
    private Connection conexao;
    
    //Método para abrir a conexão com o Banco de Dados
    public RacaDAO() throws ClassNotFoundException, SQLException {
        conexao = Conexao.abrirConexao();
    }
    
    /* Método criado para verificar se o usuário quer cadastrar
    um novo registro ou alterar algum já existente */
    public void gravar(Object objeto) throws SQLException {
        //Criando um novo objeto do tipo Profissão
        Raca raca = (Raca) objeto;
        /* Verifica se o valor do código é igual a zero, se for o
        sistema deve chamar o método inserir, caso não seja, 
        chama o método do alterar*/
        if(raca.getIdRaca() == 0) {
            this.inserir(raca);
        } else {
            this.alterar(raca);
        }
    }

    public void inserir(Object objeto) throws SQLException {
        String sql = "INSERT INTO raca VALUES (default, ?)";
        //Criando um novo objeto do tipo Profissao
        Raca raca = (Raca) objeto;
        /* O método prepareStatement - É usado para criar um objeto
        que representa a instrução SQL que será executada */
        PreparedStatement stmt = null;
        //TRATAMENTO DE EXCEÇÃO
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, raca.getNomeRaca());
            stmt.execute();
        } catch (SQLException ex) {
            //Mostrando uma pilha de erros dessa exceção
            ex.printStackTrace();
            System.out.println("Problemas na Controller ao Cadastrar Raça! ERRO: " + ex.getMessage());
            throw new SQLException("Erro ao inserir raça");
        } finally {
            Conexao.encerrarConexao(conexao, stmt);
        }
    }

    private void alterar(Raca raca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
