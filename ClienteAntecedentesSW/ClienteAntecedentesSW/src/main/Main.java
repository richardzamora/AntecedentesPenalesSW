/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import gui.GUIMenu;
import java.rmi.Naming;
import controller.ControllerAntecedentesPenales;

/**
 *
 * @author Estudiantes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            GUIMenu gui = new GUIMenu();
            gui.setVisible(true);
    }
}
