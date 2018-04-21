/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrimonio.composicao;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author Cristiano Hahn
 */
public class PatrimonioComposicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BemImovel casa = new BemImovel(200f,1500f,"Apartamento",Date.from(Instant.MIN), 788);
        BemSemovente touro = new BemSemovente("Mineiro",Date.from(Instant.MIN), 1,Date.from(Instant.MIN),TpAnimal.CAPRINO);
        BemMovel carro = new BemMovel("Carro", Date.from(Instant.MIN),123, "ModeloDeNota", "Fiat");
        
        casa.getPatrimonial().getDescricao();
        casa.getPatrimonial().setDescricao("Apartamento de luxo");
        casa.getPatrimonial().getDescricao();
        casa.getPatrimonial().getNumeroIdentificacao();
        casa.getArea();
        
        touro.setTipoAnimal(TpAnimal.BOVINO);
        touro.getDataNascimento();
        touro.getPatrimonio().getSituacao();
        touro.getPatrimonio().getSituacao();
        
        carro.getPatrimonio().setNumeroIdentificacao(500);
        carro.getPatrimonio().tombar();
        carro.getPatrimonio().getSituacao();
        carro.setFornecedor("Ford");
        carro.getFornecedor();
    }
    
}
