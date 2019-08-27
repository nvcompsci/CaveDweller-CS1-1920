/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jword
 */
public class Cave {
    private Caveman cman;
    private Bomb bomb;
    private Potion potion;
    
    public Cave() {
        cman = new Caveman();
        bomb = new Bomb();
        potion = new Potion();
    }
    
}
