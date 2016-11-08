/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author UserPL022Pc04
 */
public abstract class SensibleDummy {
   protected String nome;
   protected String cor;

    public SensibleDummy(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }
   
    public void Move(int x, int y){
        
    }
}
