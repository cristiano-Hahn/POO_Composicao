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
public class BemMovel {
    private String notaFiscal;
    private String fornecedor;
    private BemPatrimonial patrimonio;

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public BemPatrimonial getPatrimonio() {
        return patrimonio;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setPatrimonio(BemPatrimonial patrimonio) {
        this.patrimonio = patrimonio;
    }
    
    public BemMovel(String descricao, Date dataAquisitacao, Integer numeroIdentificacao, String notaFiscal, String fornecedor){
        patrimonio = new BemPatrimonial(descricao, dataAquisitacao, numeroIdentificacao);
        this.notaFiscal = notaFiscal;
        this.fornecedor = fornecedor;
    }
}
