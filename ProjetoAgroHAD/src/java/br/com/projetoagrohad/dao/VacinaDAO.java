/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoagrohad.dao;

import br.com.projetoagrohad.model.Vacina;
import br.com.projetoagrohad.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author JoseHenriqueRavani
 */
public class VacinaDAO {
    
    //Criar uma variável para conexão com o banco
    private Connection conexao;
    
    //Método para abrir a conexão com o Banco de Dados
    public VacinaDAO() throws ClassNotFoundException, SQLException {
        conexao = Conexao.abrirConexao();
    }
    
    /* Método criado para verificar se o usuário quer cadastrar
    um novo registro ou alterar algum já existente */
    public void gravar(Object objeto) throws SQLException {
        //Criando um novo objeto do tipo Profissão
        Vacina vacina = (Vacina) objeto;
        /* Verifica se o valor do código é igual a zero, se for o
        sistema deve chamar o método inserir, caso não seja, 
        chama o método do alterar*/
        if(vacina.getIdVacina() == 0) {
            this.inserir(vacina);
        } else {
            this.alterar(vacina);
        }
    }

    public void inserir(Object objeto) throws SQLException {
        String sql = "INSERT INTO vacina VALUES (default, ?, ?)";
        //Criando um novo objeto do tipo Profissao
        Vacina vacina = (Vacina) objeto;
        /* O método prepareStatement - É usado para criar um objeto
        que representa a instrução SQL que será executada */
        PreparedStatement stmt = null;
        //TRATAMENTO DE EXCEÇÃO
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, vacina.getNomeVacina());
            stmt.setString(2, vacina.getDoseRecomendada());
            stmt.execute();
        } catch (SQLException ex) {
            //Mostrando uma pilha de erros dessa exceção
            ex.printStackTrace();
            System.out.println("Problemas na Controller ao Cadastrar Vacina! ERRO: " + ex.getMessage());
            throw new SQLException("Erro ao inserir vacina");
        } finally {
            Conexao.encerrarConexao(conexao, stmt);
        }
    }

    private void alterar(Vacina vacina) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
