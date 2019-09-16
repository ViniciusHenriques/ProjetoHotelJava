/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Vinicius
 */
public class DAOFactory {
     private static final FuncionarioDAO WDAO = new FuncionarioDAO();
    
    public static final FuncionarioDAO getFuncionarioDAO(){
        return WDAO;
    }
    
    private static final QuartoDAO QDAO = new QuartoDAO();
    
    public static final QuartoDAO getQuartoDAO(){
        return QDAO;
    }
    
    private static final ReservaDAO RDAO = new ReservaDAO();
    
    public static final ReservaDAO getReservaDAO(){
        return RDAO;
    }
    private static final HospedeDAO HDAO = new HospedeDAO();
    public static final HospedeDAO getHospedeDAO(){
        return HDAO;
    }
    
}
