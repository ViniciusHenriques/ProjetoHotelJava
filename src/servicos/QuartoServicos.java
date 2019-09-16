/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.QuartoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Quarto;

/**
 *
 * @author Vinicius
 */
public class QuartoServicos {
    public void cadastrarQuarto(Quarto f) throws SQLException{
        QuartoDAO fDAO = DAOFactory.getQuartoDAO();
        fDAO.cadastrarQuarto(f);
    }
    
     public  ArrayList<Quarto> buscarQuarto() throws SQLException{
        QuartoDAO fDAO = DAOFactory.getQuartoDAO();
        return fDAO.buscarQuarto();
    }//fecha public 
    public void deletar(long id) throws SQLException{
        QuartoDAO fDAO = DAOFactory.getQuartoDAO();
        fDAO.deletar(id);
    }
    public ArrayList<Quarto> filtrar(String query) throws SQLException {
        QuartoDAO fDAO = DAOFactory.getQuartoDAO();
        return fDAO.filtrar(query);
        
        
    }//fecha método
    public void alterarQuarto(Quarto f) throws SQLException {
        QuartoDAO fDAO = DAOFactory.getQuartoDAO();
        fDAO.alterarQuarto(f);
    }//fecha método
}
