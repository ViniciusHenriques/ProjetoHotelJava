/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Hospede;
import persistencia.ConexaoBanco;

/**
 *
 * @author Vinicius
 */
public class HospedeDAO {
    public long cadastrarHospede(Hospede f) throws SQLException{
         Connection con = ConexaoBanco.getConexao();
         Statement stat = con.createStatement();
    
        
        try {
          String sql;
            sql = "insert into hospede(idhospede,nome,cpf,endereco,telefone,rg,cidade,sexo)"
                    +"values(null,'"+f.getNome()+"','"+f.getCpf()+"','"+f.getEndereco()+"','"+f.getTelefone()+"',"+f.getRg()+",'"+f.getCidade()+"','"+f.getSexo()+"')";

            /* Devemos informar na hora da execução do código
               SQL que queremos resgatar as chaves geradas */
            stat.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            
            //Buscando a chave gerada no auto_increment
            ResultSet rs = stat.getGeneratedKeys();
            long chaveGerada=0;
            
            /* Testando se o resultSet é diferente de null
               e se ele tem um próximo. Se tiver, buscamos 
               a chaveGerada com o método getLong(1) */
            if (rs != null && rs.next()) {
                chaveGerada = rs.getLong(1);
            }
            
            //Retornando a chave que foi gerada no cadastro de Endereço
            return chaveGerada;
            
            
        } catch (SQLException se) {
            throw new SQLException("Erro ao cadastrar Endereco no Banco de dados! "+se.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha public 
    
    public  ArrayList<Hospede> buscarHospede() throws SQLException{
         Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "select * from hospede";
            ResultSet rs =  stat.executeQuery(sql);
            ArrayList<Hospede> fun = new ArrayList<>();
            while(rs.next()){
                Hospede f = new Hospede();
                f.setIdHospede(rs.getLong("idhospede"));
                f.setNome(rs.getString("nome"));
                f.setCpf(rs.getString("cpf"));
                f.setEndereco(rs.getString("endereco"));
                f.setTelefone(rs.getString("telefone"));
                
                f.setRg(rs.getLong("rg"));
                f.setSexo(rs.getString("sexo"));
                f.setCidade(rs.getString("cidade"));
                fun.add(f);
            }//fecha while
            return fun;
        }catch (SQLException e) {
            throw  new SQLException("Erro ao buscar!"+e.getMessage());
        }finally{
            stat.close();
            con.close();
        }//fecha finally
    }//fecha public 
    
    public void deletar(long id)throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "delete from hospede where idhospede="+id;
            stat.execute(sql);
            
        } catch (Exception e) {
            throw new SQLException("Erro ao deletar"+e.getMessage());
            
        }finally{
            stat.close();
            con.close();
        }
    }
    
    public  ArrayList<Hospede> filtrar(String query) throws SQLException{
         Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "select * from hospede "+query;
            ResultSet rs =  stat.executeQuery(sql);
            ArrayList<Hospede> hos = new ArrayList<>();
            while(rs.next()){
                Hospede f = new Hospede();
                f.setIdHospede(rs.getLong("idhospede"));
                f.setNome(rs.getString("nome"));
                f.setCpf(rs.getString("cpf"));
                f.setEndereco(rs.getString("endereco"));
                f.setTelefone(rs.getString("telefone"));
                f.setRg(rs.getLong("rg"));
                f.setCidade(rs.getString("cidade"));
                f.setSexo(rs.getString("sexo"));
                
                hos.add(f);
            }//fecha while
            return hos;
        }catch (SQLException e) {
            throw  new SQLException("Erro ao buscar!"+e.getMessage());
        }finally{
            stat.close();
            con.close();
        }//fecha finally
    }//fecha public 
    
    public void alterar(Hospede p) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "update hospede set nome ='"+p.getNome()+"' , cpf='"+p.getCpf()+"', endereco= '"+p.getEndereco()+"', telefone= '"+p.getTelefone()+"', rg= "+p.getRg()+", cidade= '"+p.getCidade()+"', sexo = '"+p.getSexo()+"'  where idhospede="+p.getIdHospede();
            stat.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro ao alterar !"+e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método 
}
