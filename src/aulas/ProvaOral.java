/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas;

/**
 *
 * @author UserPL022Pc04
 */
public class ProvaOral extends MomentoAvaliacao {
   private int fluencia;
    int dominioMateria;

    public ProvaOral(int fluencia, int dominioMateria, String aluno, int nota, int dificuldade, String data) {
        super(aluno, nota, dificuldade, data);
        this.fluencia = fluencia;
        this.dominioMateria = dominioMateria;
    }

    public int getFluencia() {
        return fluencia;
    }

    public void setFluencia(int fluencia) {
        this.fluencia = fluencia;
    }
    
}

