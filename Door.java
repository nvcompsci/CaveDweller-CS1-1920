/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jword
 */
public class Door {
    private int x, y;
    
    public Door(Cave cave) {
        double rand = Math.random(); // 0.0 - 0.9
        //rand = .20
        if (rand > 0.75) {
            x = 0;
            y = cave.getHeight() / 2;
        }
        else if (rand > 0.5) {
            x = cave.getWidth();
            y = cave.getHeight() / 2;
        }
        else if (rand > 0.25) {
            y = cave.getHeight();
            x = cave.getWidth() / 2;
        }
        else {
            y = 0;
            x = cave.getWidth() / 2;
        }
        
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
