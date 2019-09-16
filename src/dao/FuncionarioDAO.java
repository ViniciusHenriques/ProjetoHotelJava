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
import modelo.Funcionario;
import persistencia.ConexaoBanco;

/**
 *
 * @author Vinicius
 */
public class FuncionarioDAO {
    public void cadastrarFuncionario(Funcionario f) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
    
        try {
            String sql="";
            sql = "insert into funcionario(idfuncionario,nome,senha,telefone,cpf,cargo,sexo,salario)"
                    +"values(null,'"+f.getNome()+"','"+f.getSenha()+"','"+f.getTelefone()+"','"+f.getCpf()+"','"+f.getCargo()+"','"+f.getSexo()+"',"+f.getSalario()+")";
                 stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar Funcionario!"+e.getMessage());
        }finally{
            stat.close();
            con.close();
        }//fecha finally
    }//fecha método
    
    public  ArrayList<Funcionario> buscarFuncionario() throws SQLException{
         Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "select * from funcionario";
            ResultSet rs =  stat.executeQuery(sql);
            ArrayList<Funcionario> fun = new ArrayList<>();
            while(rs.next()){
                Funcionario f = new Funcionario();
                f.setIdFuncionario(rs.getLong("idfuncionario"));
                f.setNome(rs.getString("nome"));
                f.setSenha(rs.getString("senha"));
                f.setTelefone(rs.getString("telefone"));
                f.setCpf(rs.getString("cpf"));
                f.setCargo(rs.getString("cargo"));
                f.setSexo(rs.getString("sexo"));
                f.setSalario(rs.getDouble("salario"));
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
            String sql = "delete from funcionario where idfuncionario ="+id;
            stat.execute(sql);
            
        } catch (Exception e) {
            throw new SQLException("Erro ao deletar"+e.getMessage());
            
        }finally{
            stat.close();
            con.close();
        }
    }
    
    public  ArrayList<Funcionario> filtrar(String query) throws SQLException{
         Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "select * from funcionario "+query;
            ResultSet rs =  stat.executeQuery(sql);
            ArrayList<Funcionario> fun = new ArrayList<>();
            while(rs.next()){
                Funcionario f = new Funcionario();
                f.setIdFuncionario(rs.getLong("idfuncionario"));
                f.setNome(rs.getString("nome"));
                f.setSenha(rs.getString("senha"));
                f.setTelefone(rs.getString("telefone"));
                f.setCpf(rs.getString("cpf"));
                f.setCargo(rs.getString("cargo"));
                f.setSexo(rs.getString("sexo"));
                f.setSalario(rs.getDouble("salario"));
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
    
    public void alterarFuncionario(Funcionario p) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "update funcionario set nome = '"+p.getNome()+"' , senha = '"+p.getSenha()+"', telefone = '"+p.getTelefone()+"', cpf= '"+p.getCpf()+"', cargo= '"+p.getCargo()+"', sexo= '"+p.getSexo()+"', salario = "+p.getSalario()+"  where idfuncionario="+p.getIdFuncionario();
            stat.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro ao alterar !"+e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método 
    
    
    public boolean validarSenha(Funcionario u) throws SQLException {                  

        Connection conexao = ConexaoBanco.getConexao();
        Statement stat = conexao.createStatement();

        String sql;

        sql = "select count(*)"
                + " from funcionario"
                + " where nome ='" + u.getNome()+ "' and"
                + " senha = '" + u.getSenha() + "' ";

        ResultSet rs = stat.executeQuery(sql);
        int retorno = -2;

        while (rs.next()) {
            retorno = rs.getInt(1);
        }//fecha while

        if (retorno == 1) {
            stat.close();
            return true;
        } else {
            return false;
        }//fecha else
    }//fecha método  
}
