/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.ReservaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Reserva;

/**
 *
 * @author Vinicius
 */
public class ReservaServicos {
    public void cadastrarReserva(Reserva f) throws SQLException{
        ReservaDAO fDAO = DAOFactory.getReservaDAO();
        fDAO.cadastrarReserva(f);
    }
    
     public  ArrayList<Reserva> buscarReserva() throws SQLException{
        ReservaDAO fDAO = DAOFactory.getReservaDAO();
        return fDAO.buscarReserva();
    }//fecha public 
    public void deletar(long id, long idQu, long idhos) throws SQLException{
        ReservaDAO fDAO = DAOFactory.getReservaDAO();
        fDAO.deletar(id,idQu,idhos);
    }
    public ArrayList<Reserva> filtrar(String query) throws SQLException {
        ReservaDAO fDAO = DAOFactory.getReservaDAO();
        return fDAO.filtrar(query);
        
        
    }//fecha método
    public void alterarQuarto(Reserva f) throws SQLException {
        ReservaDAO fDAO = DAOFactory.getReservaDAO();
        fDAO.alterarReserva(f);
    }//fecha método
}
