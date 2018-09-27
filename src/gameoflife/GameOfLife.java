/*
 * Ferris D.
 * 27/09/2018
 *
 */

package gameoflife;

import javax.swing.JOptionPane;

/**
 * @author fedie2562
 */
public class GameOfLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        String area[][] = new String[20][20];
        String input;
        int gen = 0;
        
        // Make the area empty
        for(int i = 0;i<20;i++){
            for(int p=0;p<20;p++){
                area[i][p] = " ";
            }
        }
        int cells = 0;
        input = JOptionPane.showInputDialog("This is the game of Life. \n "
                + "Please enter the amount of cells you want to start with.");
        cells = Integer.parseInt(input);
    }
    
}
