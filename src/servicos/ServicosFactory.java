/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 *
 * @author frant
 */
public class ServicosFactory {
    private static final FuncionarioServicos WS =  new FuncionarioServicos();
    
    public static FuncionarioServicos getFuncionarioServicos(){
        return WS;
    }
    
    
    private static final QuartoServicos QS =  new QuartoServicos();
    
    public static QuartoServicos getQuartoServicos(){
        return QS;
    }
    private static final ReservaServicos RS =  new ReservaServicos();
    
    public static ReservaServicos getReservaServicos(){
        return RS;
    }
    private static final HospedeServicos HS =  new HospedeServicos();
    
    public static HospedeServicos getHospedeServicos(){
        return HS;
    }
}//fecha classe
