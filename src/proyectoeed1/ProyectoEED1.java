/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoeed1;

import Graph.Graph;
import Windows.MainUI;


//import Graph.User;

/**
 *
 * @author Santiago Aristimuño
 */
public class ProyectoEED1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Graph graph = new Graph();
        
        
        FilesIO io = new FilesIO();
        String users = io.getUsersString(io.file);
        String relations = io.getEdgesString(io.file);
        
        
        io.loadGraphData(users, relations, graph);
        
        MainUI mainWindow = new MainUI(graph);
        mainWindow.setVisible(true);
        
        
    }
    
}
