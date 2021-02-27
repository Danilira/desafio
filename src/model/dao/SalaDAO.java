package model.dao;

import model.bean.Sala;
import conexao.Conexao;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SalaDAO {
    public Boolean inserir(Sala sala) {
        Connection connection = Conexao.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO sala (nome, lotacao) VALUES (?,?)");
            preparedStatement.setString(1, sala.getNome());
            preparedStatement.setInt(2, sala.getLotacao());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
            return false;
        } finally {
            Conexao.closeConnection(connection, preparedStatement);
        }
    }
    
    public List<Sala> buscar(String nome) {
        Connection connection = Conexao.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Sala> salas = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement("SELECT nome, sobrenome, sala_etapa_um FROM pessoa WHERE sala_etapa_um = ? or sala_etapa_dois = ?");
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, nome);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Sala salaRs = new Sala();
                salaRs.setNome(resultSet.getString("nome") + " " + resultSet.getString("sobrenome"));
                if(resultSet.getString("sala_etapa_um").equals(nome)){
                    salaRs.setEtapa("1");
                } else{
                    salaRs.setEtapa("2");
                }
                salas.add(salaRs);
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            Conexao.closeConnection(connection, preparedStatement);
        }
        return salas;
    }
    
    public static List<String> buscarLista() {
        Connection connection = Conexao.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<String> salas = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM sala");
            
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                salas.add(resultSet.getString("nome"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            Conexao.closeConnection(connection, preparedStatement);
        }
        return salas;
    }
    
    public int buscarNumeroSala() {
        Connection connection = Conexao.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        int numeroDeSalas = 0;
        try {
            preparedStatement = connection.prepareStatement("SELECT count(*) c FROM sala");
            
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                numeroDeSalas = resultSet.getInt("c");
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            Conexao.closeConnection(connection, preparedStatement);
        }
        return numeroDeSalas;
    }
}

