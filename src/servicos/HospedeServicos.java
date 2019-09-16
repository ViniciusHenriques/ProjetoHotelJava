/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.HospedeDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Hospede;

/**
 *
 * @author Vinicius
 */
public class HospedeServicos {
    public void cadastrarHospede(Hospede f) throws SQLException{
        HospedeDAO fDAO = DAOFactory.getHospedeDAO();
        fDAO.cadastrarHospede(f);
    }
    
     public  ArrayList<Hospede> buscarHospede() throws SQLException{
        HospedeDAO fDAO = DAOFactory.getHospedeDAO();
        return fDAO.buscarHospede();
    }//fecha public 
    public void deletar(long id) throws SQLException{
        HospedeDAO fDAO = DAOFactory.getHospedeDAO();
        fDAO.deletar(id);
    }
    public ArrayList<Hospede> filtrar(String query) throws SQLException {
        HospedeDAO fDAO = DAOFactory.getHospedeDAO();
        return fDAO.filtrar(query);
    }//fecha método
    public void alterarHospede(Hospede f) throws SQLException {
        HospedeDAO fDAO = DAOFactory.getHospedeDAO();
        fDAO.alterar(f);
    }//fecha método
}
