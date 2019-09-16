/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Vinicius e Felipe
 * @since 06/06
 * @version 1.0
 */
public class Funcionario {
    private long idFuncionario;
    private String nome;
    private String senha;
    private String telefone;
    private String cpf;
    private String cargo;
    private String sexo;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(long idFuncionario, String nome, String senha, String telefone, String cpf, String cargo, String sexo, double salario) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.senha = senha;
        this.telefone = telefone;
        this.cpf = cpf;
        this.cargo = cargo;
        this.sexo = sexo;
        this.salario = salario;
    }

    

    public long getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return  idFuncionario + " - " + nome + " - " + cargo ;
    }
    
    

    
    
    
    
}//fecha classe

    
