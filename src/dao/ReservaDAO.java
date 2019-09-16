/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Funcionario;
import modelo.Hospede;
import modelo.Quarto;
import modelo.Reserva;
import persistencia.ConexaoBanco;

/**
 *
 * @author Vinicius
 */
public class ReservaDAO {
     public void cadastrarReserva(Reserva f) throws SQLException{
         Connection con = ConexaoBanco.getConexao();
         Statement stat = con.createStatement();
    
        try {
            String sql="";
            String sel="";
            
            HospedeDAO eDAO = new HospedeDAO();
            long chaveGerada = eDAO.cadastrarHospede(f.getHospede());
            
            
            sql = "update quarto set status ='Ocupado' where idquarto= "+f.getQuarto().getIdQuarto()+" ; ";
            
            sel = " insert into reserva(idreserva,dataentrada,datasaida,idquarto,idfuncionario,idhospede)"
                    +" values(null,'"+f.getDataEntrada()+"','"+f.getDataSaida()+"',"+f.getQuarto().getIdQuarto()+","+f.getFuncinario().getIdFuncionario()+","+chaveGerada+");";
            stat.executeUpdate(sql);
            stat.execute(sel);
        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar Reserva!"+e.getMessage());
        }finally{
            stat.close();
            con.close();
        }//fecha finally
    }//fecha método
     
     public  ArrayList<Reserva> buscarReserva() throws SQLException{
         Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "select * from reserva ";
            ResultSet rs =  stat.executeQuery(sql);
            ArrayList<Reserva> qua = new ArrayList<>();
            
            
            
           
            while(rs.next()){
                Reserva f = new Reserva();
                f.setIdReserva(rs.getLong("idreserva"));
                f.setDataEntrada(rs.getString("dataentrada"));
                f.setDataSaida(rs.getString("datasaida"));
                
                Quarto q = new Quarto();
                q.setIdQuarto(rs.getLong("idquarto"));
                
                Funcionario u =  new Funcionario();
                u.setIdFuncionario(rs.getLong("idfuncionario"));
                
                Hospede h =  new Hospede();               
                h.setIdHospede(rs.getLong("idhospede"));
                
                
                f.setQuarto(q);
                f.setFuncinario(u);
                f.setHospede(h);
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
    
    public void deletar(long id,long idQu,long idhos)throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            
            
            String up = "update quarto set status ='Vago' where idquarto= "+idQu+" ; ";
            stat.executeUpdate(up);
            
            String sql = "delete from reserva where idreserva="+id;
            
            stat.execute(sql);
            String hos = "delete from hospede where idhospede="+idhos;
            stat.execute(hos);
            
        } catch (Exception e) {
            throw new SQLException("Erro ao deletar"+e.getMessage());
            
        }finally{
            stat.close();
            con.close();
        }
    }
    
    public  ArrayList<Reserva> filtrar(String query) throws SQLException{
         Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "select *,valor set quarto.idquarto=reserva.idquarto from reserva,quarto "+query;
            ResultSet rs =  stat.executeQuery(sql);
            ArrayList<Reserva> qua = new ArrayList<>();
            while(rs.next()){
                Reserva f = new Reserva();
                
                f.setIdReserva(rs.getLong("idreserva"));
                f.setDataEntrada(rs.getString("dataentrada"));
                f.setDataSaida(rs.getString("datasaida"));
                f.getQuarto().setIdQuarto(rs.getLong("idquarto"));
                f.getFuncinario().setIdFuncionario(rs.getLong("idfuncionario"));
                f.getHospede().setIdHospede(rs.getLong("idhospede"));
                f.getQuarto().setValor(rs.getDouble("valor"));
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
    
    public void alterarReserva(Reserva p) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "update reserva set dataentrada ='"+p.getDataEntrada()+"' , datasaida='"+p.getDataSaida()+"', idquarto = "+p.getQuarto().getIdQuarto()+", idFuncionario = "+p.getFuncinario().getIdFuncionario()+", idhospede= '"+p.getHospede().getIdHospede()+"' where idreserva="+p.getIdReserva();
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
