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
public class Referee extends SensibleDummy{
   int stricness;

    public Referee(int stricness, String nome, String cor) {
        super(nome, cor);
        this.stricness = stricness;
    }

    
}
