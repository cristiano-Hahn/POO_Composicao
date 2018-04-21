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
public class BemSemovente {
    private BemPatrimonial patrimonio;
    private TpAnimal tipoAnimal;
    private Date dataNascimento;
    
    public BemSemovente(String descricao, Date dataAquisitacao, 
            Integer numeroIdentificacao, Date datanascto, TpAnimal animal){
      patrimonio = new    BemPatrimonial(descricao, dataAquisitacao, numeroIdentificacao);
      this.tipoAnimal = animal;
      this.dataNascimento = datanascto;
    }

    public BemPatrimonial getPatrimonio() {
        return patrimonio;
    }

    public TpAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setPatrimonio(BemPatrimonial patrimonio) {
        this.patrimonio = patrimonio;
    }

    public void setTipoAnimal(TpAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
