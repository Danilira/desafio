package model.dao;

import model.bean.Espaco;
import conexao.Conexao;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class EspacoDAO {
    
    public Boolean inserir(Espaco espaco) {
        
        Connection connection = Conexao.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO espaco (nome, lotacao) VALUES (?,?)");
            preparedStatement.setString(1, espaco.getNome());
            preparedStatement.setInt(2, espaco.getLotacao());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
            return false;
        } finally {
            Conexao.closeConnection(connection, preparedStatement);
        }
    }
    
    public List<Espaco> buscar(String nome) {
        Connection connection = Conexao.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Espaco> espacos = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement("SELECT nome, sobrenome, espaco_um FROM pessoa WHERE espaco_um like ? or espaco_dois like ?");
            preparedStatement.setString(1, "%" + nome + "%");
            preparedStatement.setString(2, "%" + nome + "%");
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Espaco espacoRs = new Espaco();
                espacoRs.setNome(resultSet.getString("nome") + " " + resultSet.getString("sobrenome"));
                if(resultSet.getString("espaco_um").equals(nome)){
                    espacoRs.setEtapa("1");
                } else{
                    espacoRs.setEtapa("2");
                }
                espacos.add(espacoRs);
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            Conexao.closeConnection(connection, preparedStatement);
        }
        return espacos;
    }
    
    public static List<String> buscarLista() {
        Connection connection = Conexao.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<String> espaco = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM espaco");
            
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                espaco.add(resultSet.getString("nome"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            Conexao.closeConnection(connection, preparedStatement);
        }
        return espaco;
    }
    
    public int buscarNumeroEspacos() {
        Connection connection = Conexao.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        int numeroDeEspacos = 0;
        try {
            preparedStatement = connection.prepareStatement("SELECT count(*) c FROM espaco");
            
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                numeroDeEspacos = resultSet.getInt("c");
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            Conexao.closeConnection(connection, preparedStatement);
        }
        return numeroDeEspacos;
    }
}

