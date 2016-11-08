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
public class Teste extends MomentoAvaliacao{
    String local;

    public Teste(String local, String aluno, int nota, int dificuldade, String data) {
        super(aluno, nota, dificuldade, data);
        this.local = local;
    }

    
    
}
