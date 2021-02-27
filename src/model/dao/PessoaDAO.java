package model.dao;

import model.bean.Pessoa;
import conexao.Conexao;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;


public class PessoaDAO {

    public Boolean inserir(Pessoa pessoa) {
        Connection connection = Conexao.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        int resultado = 0;
        try {
            preparedStatement = connection.prepareStatement("select ((select count(*) "
                    + "from pessoa where sala_etapa_um = ?) >= "
                    + "(select lotacao from sala where nome = ?)) "
                    + "resultado"
                    + " from dual");
            preparedStatement.setString(1, pessoa.getSalaEtapaUm());
            preparedStatement.setString(2, pessoa.getSalaEtapaUm());
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                resultado = resultSet.getInt("resultado");
            }
            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "A sala de nome " + pessoa.getSalaEtapaUm() + " encontra-se com a lotação máxima");
                return false;
            } else if (resultado == 0) {
                preparedStatement = null;
                preparedStatement = connection.prepareStatement("select ((select count(*) "
                        + "from pessoa where sala_etapa_um = ?) >= "
                        + "(select lotacao from sala where nome = ?)) "
                        + "resultado "
                        + "from dual");
                preparedStatement.setString(1, pessoa.getSalaEtapaDois());
                preparedStatement.setString(2, pessoa.getSalaEtapaDois());
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    resultado = resultSet.getInt("resultado");
                }
            }
            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "A sala de nome " + pessoa.getSalaEtapaDois() + " encontra-se com a lotação máxima");
                return false;
            } else {
                preparedStatement = null;
                preparedStatement = connection.prepareStatement("INSERT INTO pessoa (nome,"
                        + "sobrenome,"
                        + "sala_etapa_um,"
                        + "sala_etapa_dois,"
                        + "espaco_um,"
                        + "espaco_dois)"
                        + "VALUES (?,?,?,?,?,?)");
                preparedStatement.setString(1, pessoa.getNome());
                preparedStatement.setString(2, pessoa.getSobrenome());
                preparedStatement.setString(3, pessoa.getSalaEtapaUm());
                preparedStatement.setString(4, pessoa.getSalaEtapaDois());
                preparedStatement.setString(5, pessoa.getEspacoUm());
                preparedStatement.setString(6, pessoa.getEspacoDois());
                preparedStatement.executeUpdate();
            }
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
            return false;
        } finally {
            Conexao.closeConnection(connection, preparedStatement);
        }
    }

    public List<Pessoa> buscar(Pessoa p) {
        Connection connection = Conexao.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Pessoa> pessoas = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM pessoa where nome like ? or sobrenome like ?");
            preparedStatement.setString(1, "%" + p.getNome() + "%");
            preparedStatement.setString(2, "%" + p.getSobrenome() + "%");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Pessoa pessoaRs = new Pessoa();
                pessoaRs.setIdPessoa(resultSet.getInt("id_pessoa"));
                pessoaRs.setNome(resultSet.getString("nome"));
                pessoaRs.setSobrenome(resultSet.getString("sobrenome"));
                pessoaRs.setSalaEtapaUm(resultSet.getString("sala_etapa_um"));
                pessoaRs.setSalaEtapaDois(resultSet.getString("sala_etapa_dois"));
                pessoaRs.setEspacoUm(resultSet.getString("espaco_um"));
                pessoaRs.setEspacoDois(resultSet.getString("espaco_dois"));
                pessoas.add(pessoaRs);
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            Conexao.closeConnection(connection, preparedStatement);
        }
        return pessoas;
    }

    public int buscarNumeroPessoas() {
        Connection connection = Conexao.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        int numeroDePessoas = 0;
        try {
            preparedStatement = connection.prepareStatement("SELECT count(*) c FROM pessoa");

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                numeroDePessoas = resultSet.getInt("c");
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            Conexao.closeConnection(connection, preparedStatement);
        }
        return numeroDePessoas;
    }

    public HashMap<Integer, Integer> buscarSalasEtapasUm() {
        Connection connection = Conexao.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        int i = 0;
        HashMap<Integer, Integer> valores = new HashMap<>();
        try {
            preparedStatement = connection.prepareStatement("select count(nome) c from pessoa group by sala_etapa_um");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                valores.put(i, resultSet.getInt("c"));
                i++;
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            Conexao.closeConnection(connection, preparedStatement);
        }
        return valores;
    }
    
    public HashMap<Integer, Integer> buscarSalasEtapasDois() {
        Connection connection = Conexao.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        int i = 0;
        HashMap<Integer, Integer> valores = new HashMap<>();
        try {
            preparedStatement = connection.prepareStatement("select count(nome) c from pessoa group by sala_etapa_dois");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                valores.put(i, resultSet.getInt("c"));
                i++;
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            Conexao.closeConnection(connection, preparedStatement);
        }
        return valores;
    }
}
