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
import modelo.Quarto;
import persistencia.ConexaoBanco;

/**
 *
 * @author Vinicius
 */
public class QuartoDAO {
     public void cadastrarQuarto(Quarto f) throws SQLException{
         Connection con = ConexaoBanco.getConexao();
         Statement stat = con.createStatement();
    
        try {
            String sql="";
            sql = "insert into quarto(idquarto,num,valor,tipo,andar,status,numcomodo)"
                    +"values(null,"+f.getNum()+","+f.getValor()+",'"+f.getTipo()+"','"+f.getAndar()+"','"+f.getStatus()+"',"+f.getNumComodos()+")";
                 stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar Quarto!"+e.getMessage());
        }finally{
            stat.close();
            con.close();
        }//fecha finally
    }//fecha método
    
    public  ArrayList<Quarto> buscarQuarto() throws SQLException{
         Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "select * from quarto";
            ResultSet rs =  stat.executeQuery(sql);
            ArrayList<Quarto> qua = new ArrayList<>();
            while(rs.next()){
                Quarto f = new Quarto();
                f.setIdQuarto(rs.getLong("idquarto"));
                f.setNum(rs.getInt("num"));
                f.setValor(rs.getDouble("valor"));
                f.setTipo(rs.getString("tipo"));
                f.setAndar(rs.getString("andar"));
                f.setStatus(rs.getString("status"));
                f.setNumComodos(rs.getInt("numcomodo"));
                
                qua.add(f);
            }//fecha while
            return qua;
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
            String sql = "delete from quarto where idquarto="+id;
            stat.execute(sql);
            
        } catch (Exception e) {
            throw new SQLException("Erro ao deletar"+e.getMessage());
            
        }finally{
            stat.close();
            con.close();
        }
    }
    
    public  ArrayList<Quarto> filtrar(String query) throws SQLException{
         Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "select * from quarto "+query;
            ResultSet rs =  stat.executeQuery(sql);
            ArrayList<Quarto> qua = new ArrayList<>();
            while(rs.next()){
                Quarto f = new Quarto();
                f.setIdQuarto(rs.getLong("idQuarto"));
                f.setNum(rs.getInt("Num"));
                f.setValor(rs.getDouble("valor"));
                f.setTipo(rs.getString("tipo"));
                f.setAndar(rs.getString("andar"));
                f.setStatus(rs.getString("status"));
                f.setNumComodos(rs.getInt("numcomodo"));
                
                qua.add(f);
            }//fecha while
            return qua;
        }catch (SQLException e) {
            throw  new SQLException("Erro ao buscar!"+e.getMessage());
        }finally{
            stat.close();
            con.close();
        }//fecha finally
    }//fecha public 
    
    public void alterarQuarto(Quarto p) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "update quarto set num ="+p.getNum()+" , valor = "+p.getValor()+", tipo = '"+p.getTipo()+"', andar = '"+p.getAndar()+"', status= '"+p.getStatus()+"', numcomodo= "+p.getNumComodos()+" where idquarto="+p.getIdQuarto();
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
