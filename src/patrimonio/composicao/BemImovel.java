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
public class BemImovel {
    private BemPatrimonial patrimonial;
    private float area;
    private float ultimoIPTU;

    public BemImovel(float area, float ultimoIPTU, String descricao, Date dataAquisicao, int numero) {
        this.area = area;
        this.ultimoIPTU = ultimoIPTU;
        patrimonial = new BemPatrimonial(descricao, dataAquisicao, numero);
    }

    public BemPatrimonial getPatrimonial() {
        return patrimonial;
    }

    public float getArea() {
        return area;
    }

    public float getUltimoIPTU() {
        return ultimoIPTU;
    }

    public void setPatrimonial(BemPatrimonial patrimonial) {
        this.patrimonial = patrimonial;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setUltimoIPTU(float ultimoIPTU) {
        this.ultimoIPTU = ultimoIPTU;
    }
   
    
    
    
}
