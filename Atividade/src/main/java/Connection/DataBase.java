package Connection;

import Dominio.Concerto;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public void save(Concerto concerto) {

        String sql = "INSERT INTO pessoa(codgio, descricao, pagamento,dateConcerto, id) VALUES (?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            // Criar uma conexão com o banco de dados
            conn = Connection.createConnectionToMySQL();

            // Criamos uma PreparedStatement, para executar uma query
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            // Adicionar os valores que são esperados pela query
            pstm.setString(1, concerto.getCodigo());
            pstm.setString(2, String.valueOf(concerto.getDescricao()));
            pstm.setLong(3, concerto.getPagamento());
            pstm.setDate(4, Date.valueOf(concerto.getDataConcerto()));
            pstm.setInt(5, Math.toIntExact(concerto.getId()));


            // Executar a query
            pstm.execute();

            System.out.println("salvo com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            // Fechar as conexões
            try {
                if (pstm != null) {
                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public List<Concerto> getContatos(){

        String sql = "SELECT * FROM concertos";

        List<Concerto> concertos = new ArrayList<Concerto>();

        Connection conn = null;
        PreparedStatement pstm = null;
        //Classe que vai recuperar os dados do banco. ***SELECT****
        ResultSet rset = null;

        try {
            conn = Connection.createConnectionToMySQL();

            pstm = (PreparedStatement) conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            while (rset.next()) {

                Concerto concerto = new Concerto();
               // concerto.setCodigo(rset.getString();

                concertos.add(concerto);

            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(rset!=null) {
                    rset.close();
                }

                if(pstm!=null) {
                    pstm.close();
                }

                if(conn!=null) {
                    conn.close();
                }
            }catch(Exception e) {
                e.printStackTrace();
            }
        }

        return concertos;
    }

}
