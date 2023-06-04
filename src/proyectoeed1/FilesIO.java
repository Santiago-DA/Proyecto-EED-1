/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoeed1;

import Graph.Graph;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 *
 * @author Santiago Aristimuño
 */
public class FilesIO {
        private String path = System.getProperty("user.dir")+ "\\src\\proyectoeed1\\Data.txt";
        public File file = new File(path);
        
    public String getUsersString(File file){
        String line;
        boolean isUser = false;
        StringBuilder s = new StringBuilder();
        
        try{
            FileReader fr;
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while((line = br.readLine())!=null){
                if(!line.isEmpty()){
                    if ("Usuarios".equals(line)){
                        isUser = true;
                        line = br.readLine();
                    }
                    if ("Relaciones".equals(line)){
                        isUser = false;
                    }
                    if (isUser == true){
                        s.append(line);
                    }
                    s.append("\n");
                }
                
            }
            return s.toString();
        }catch(IOException err){
            System.out.println("Something happend");
            return "";
        }
    }
    public String getUsersString(){
        String line;
        StringBuilder s = new StringBuilder();
        boolean isUser = false;
        try{
            FileReader fr;
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while((line = br.readLine())!=null){
                if(!line.isEmpty()){
                    if ("Usuarios".equals(line)){
                        isUser = true;
                        line = br.readLine();
                    }
                    if ("Relaciones".equals(line)){
                        isUser = false;
                    }
                    if (isUser == true){
                        s.append(line);
                    }
                    
                    s.append("\n");
                }
            }
            return s.toString();
        }catch(IOException err){
            System.out.println("Something happend");
            return "";
        }
    }
    
    public String getEdgesString(File file){
        String line;
        boolean isEdges = false;
        StringBuilder s = new StringBuilder();
        
        try{
            FileReader fr;
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while((line = br.readLine())!=null){
                if(!line.isEmpty()){
                    if ("Relaciones".equals(line)){
                        isEdges = true;
                        line = br.readLine();
                    }
                    if ("Usuarios".equals(line)){
                        isEdges = false;
                    }
                    if (isEdges == true){
                        s.append(line);
                    }
                    s.append("\n");
                }
            }
            return s.toString();
        }catch(IOException err){
            System.out.println("Something happend");
            return "";
        }
    }
    public String getEdgesString(){
        String line;
        boolean isEdges = false;
        StringBuilder s = new StringBuilder();
        
        try{
            FileReader fr;
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while((line = br.readLine())!=null){
                if(!line.isEmpty()){
                    if ("Relaciones".equals(line)){
                        isEdges = true;
                        line = br.readLine();
                    }
                    if ("Usuarios".equals(line)){
                        isEdges = false;
                    }
                    if (isEdges == true){
                        s.append(line);
                    }
                    s.append("\n");
                }
            }
            return s.toString();
        }catch(IOException err){
            System.out.println("Something happend");
            return "";
        }
    }
    
    public void loadGraphData(String users, String relations, Graph graph){
        int ID;
        String name;
        
        int ID1;
        int ID2;
        int weight;
        
        //adding Users
        String[] userData = users.split("\n");
        for (String s:userData){
            ID = Integer.parseInt(s.substring(0,s.indexOf(",")));
            name = s.substring(s.indexOf(",")+1).strip();
            graph.addUser(ID, name);
        }
        //adding edges
        String[] edgesData = relations.split("\n");
        for (String s:edgesData){
            if (!s.isEmpty()){
                ID1 = Integer.parseInt(s.substring(0, 3).strip());
                ID2 = Integer.parseInt(s.substring(s.indexOf(",")+1, s.indexOf(",")+5).strip());
                weight = Integer.parseInt(s.substring(10));
                graph.addEdge(ID1, ID2, weight);
                
                
            }
        }
    }
    
    //Redo into SaveChanges
    
    public void saveChanges(File file, Graph graph){
        StringBuilder s = new StringBuilder();
        s.append("Usuarios\n");
        s.append(graph.GetUsers());
        s.append("Relaciones\n");
        for (int i=0;i<graph.MAX_SIZE;i++) {
            for(int j=0;j<graph.MAX_SIZE;j++){
                if (graph.users[i]!=null || graph.users[j] != null){
                    if (graph.matrix[i][j] != 0){
                        s.append(graph.users[i].getID()+", "+graph.users[j].getID()+", "+graph.matrix[i][j]+"\n");
                    }
                }
            }
        } 
        try{
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.write(s.toString());
        pw.close();
        }catch(Exception e){
            
        }
        
    }
    
}
