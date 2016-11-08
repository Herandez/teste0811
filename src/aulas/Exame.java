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
public class Exame extends MomentoAvaliacao{
    private String questões;

    public Exame(String questões, String aluno, int nota, int dificuldade, String data) {
        super(aluno, nota, dificuldade, data);
        this.questões = questões;
    }
    
  
}
