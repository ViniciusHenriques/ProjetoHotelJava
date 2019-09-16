/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
* @author Vinicius e Felipe
 * @since 06/06
 * @version 1.0
 */
public class Reserva {
    private long idReserva;
    private String dataEntrada;
    private String dataSaida;
    private Quarto quarto;
    private Funcionario funcinario;
    private Hospede hospede;
    
    //nome hospede
    //id fun

    public Reserva() {
    }

    public Reserva(long idReserva, String dataEntrada, String dataSaida, Quarto quarto, Funcionario funcinario, Hospede hospede) {
        this.idReserva = idReserva;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.quarto = quarto;
        this.funcinario = funcinario;
        this.hospede = hospede;
    }

    

    
    public long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(long idReserva) {
        this.idReserva = idReserva;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Funcionario getFuncinario() {
        return funcinario;
    }

    public void setFuncinario(Funcionario funcinario) {
        this.funcinario = funcinario;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }
    public double calcularTotal(){
        
        double valor = getQuarto().getValor();
        return valor*2;
    }
    

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida + ", quarto=" + quarto + ", funcinario=" + funcinario + ", hospede=" + hospede + '}';
    }

    
    
    
    
    
    
    
            
}//fecha classe
