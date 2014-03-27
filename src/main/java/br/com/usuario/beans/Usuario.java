/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.usuario.beans;

/**
 *
 * @author karol
 */
public class Usuario {
    private String nome, cpf, email, tif;
    
    private byte[] imagem01;
    private byte[] imagem02;
    private byte[] imagem03;
    private byte[] imagem04;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTif() {
        return tif;
    }

    public void setTif(String tif) {
        this.tif = tif;
    }

    public byte[] getImagem01() {
        return imagem01;
    }

    public void setImagem01(byte[] imagem01) {
        this.imagem01 = imagem01;
    }

    public byte[] getImagem02() {
        return imagem02;
    }

    public void setImagem02(byte[] imagem02) {
        this.imagem02 = imagem02;
    }

    public byte[] getImagem03() {
        return imagem03;
    }

    public void setImagem03(byte[] imagem03) {
        this.imagem03 = imagem03;
    }

    public byte[] getImagem04() {
        return imagem04;
    }

    public void setImagem04(byte[] imagem04) {
        this.imagem04 = imagem04;
    }
    
    
}
