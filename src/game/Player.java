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
public class Player extends SensibleDummy{
    int fatigue;
    int atack;
    int defense;
    char faceTo;

    public Player(int fatigue, int atack, int defense, char faceTo, String nome, String cor) {
        super(nome, cor);
        this.fatigue = fatigue;
        this.atack = atack;
        this.defense = defense;
        this.faceTo = faceTo;
    }
   
    public void Pass(){
        
    }
    
    public void Shoot(){
        
    }
}
