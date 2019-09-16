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
public class Hospede {
    private long idHospede;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private long rg;
    private String cidade;
    private String sexo;

    public Hospede() {
    }

    public Hospede(long idHospede, String nome, String cpf, String endereco, String telefone, long rg, String cidade, String sexo) {
        this.idHospede = idHospede;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.rg = rg;
        this.cidade = cidade;
        this.sexo = sexo;
    }

    

    public long getIdHospede() {
        return idHospede;
    }

    public void setIdHospede(long idHospede) {
        this.idHospede = idHospede;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Hospede{" + "idHospede=" + idHospede + ", nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", telefone=" + telefone + ", rg=" + rg + ", cidade=" + cidade + ", sexo=" + sexo + '}';
    }
    
    
    
    
}
