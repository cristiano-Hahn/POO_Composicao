/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrimonio.composicao;

import java.util.Date;

/**
 *
 * @author Cristiano Hahn
 */
public class BemPatrimonial {
    private String descricao;
    private Date dataAquisicao;
    private Integer numeroIdentificacao;
    private TpSituacao situacao;

    public BemPatrimonial(String descricao, Date dataAquisicao, Integer numeroIdentificacao) {
        this.descricao = descricao;
        this.dataAquisicao = dataAquisicao;
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public void setNumeroIdentificacao(Integer numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public void setSituacao(TpSituacao situacao) {
        this.situacao = situacao;
    }

    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    public Integer getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public TpSituacao getSituacao() {
        return situacao;
    }
    
     public void colocarEmInventario(){
        if (situacao == TpSituacao.TOMBADO){
            situacao = TpSituacao.INVENTARIO;
        }
    }
    
    public void tombar(){
        situacao = TpSituacao.TOMBADO;        
    }
    
    public void baixar(){
        if (situacao == TpSituacao.TOMBADO){
            situacao = TpSituacao.BAIXADO;        
        }
    }  
    
}
