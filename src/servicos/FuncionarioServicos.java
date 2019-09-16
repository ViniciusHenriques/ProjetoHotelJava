/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;
import modelo.Funcionario;
import dao.FuncionarioDAO;
import java.sql.SQLException;
import dao.DAOFactory;
import java.util.ArrayList;

/**
 *
 * @author Vinicius
 */
public class FuncionarioServicos {
    public void cadastrarFuncinario(Funcionario f) throws SQLException{
        FuncionarioDAO fDAO = DAOFactory.getFuncionarioDAO();
        fDAO.cadastrarFuncionario(f);
    }
    
     public  ArrayList<Funcionario> buscarFuncionario() throws SQLException{
        FuncionarioDAO fDAO = DAOFactory.getFuncionarioDAO();
        return fDAO.buscarFuncionario();
    }//fecha public 
    public void deletar(long id) throws SQLException{
        FuncionarioDAO fDAO = DAOFactory.getFuncionarioDAO();
        fDAO.deletar(id);
    }
    public ArrayList<Funcionario> filtrar(String query) throws SQLException {
        FuncionarioDAO fDAO = DAOFactory.getFuncionarioDAO();
        return fDAO.filtrar(query);
    }//fecha método
    public void alterarFuncionario(Funcionario f) throws SQLException {
        FuncionarioDAO fDAO = DAOFactory.getFuncionarioDAO();
        fDAO.alterarFuncionario(f);
    }//fecha método
    public boolean validarSenha(Funcionario u) throws SQLException {
        FuncionarioDAO uDAO = DAOFactory.getFuncionarioDAO();
        return uDAO.validarSenha(u);
    }//fecha método
}
