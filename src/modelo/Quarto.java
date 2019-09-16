/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author QI
 */
public class Quarto {
    private long idQuarto;
    private int num;
    private double valor;
    private String tipo;
    private String andar;
    private String status;
    private int numComodos;

    public Quarto() {
    }

    public Quarto(long idQuarto, int num, double valor, String tipo, String andar, String status, int numComodos) {
        this.idQuarto = idQuarto;
        this.num = num;
        this.valor = valor;
        this.tipo = tipo;
        this.andar = andar;
        this.status = status;
        this.numComodos = numComodos;
    }

    public long getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(long idQuarto) {
        this.idQuarto = idQuarto;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumComodos() {
        return numComodos;
    }

    public void setNumComodos(int numComodos) {
        this.numComodos = numComodos;
    }

    @Override
    public String toString() {
        return idQuarto + " - N° " + num + " - "+andar+"° Andar" ;
    }
    
    
    

    
    
     
}
