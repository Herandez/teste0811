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
public abstract class MomentoAvaliacao {
    protected String aluno;
    protected int nota;
    protected int dificuldade;
    protected String data;

    public MomentoAvaliacao(String aluno, int nota, int dificuldade, String data) {
        this.aluno = aluno;
        this.nota = nota;
        this.dificuldade = dificuldade;
        this.data = data;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
}
