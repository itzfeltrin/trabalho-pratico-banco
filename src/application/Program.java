/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import screen.MainScreen;

/**
 *
 * @author itzfeltrin
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainScreen ms = new MainScreen();
        ms.setResizable(false);
        ms.setLocationRelativeTo(ms);
        ms.setVisible(true);
    }
    
}
