/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graph;

/**
 *
 * @author Santiago Aristimuño
 */
public class Graph {
    public int[][] matrix;
    public User[] users;
    public int MAX_SIZE = 30; //check aproppiate size
    public Graph(){
        matrix = new int[MAX_SIZE][MAX_SIZE];
        users = new User[MAX_SIZE];
    }
    //!check cases
    //Vertex operations

    /**
     *
     * @param data
     */
    public void addUser(User data){
        for(int i=0;i<users.length;i++){
           if (users[i] == null){
               users[i] = data;
               break;
           } 
        }
    }    
    /**
     *
     * @param ID
     * @param name
     */
    public void addUser(int ID, String name){
        User data = new User(ID, name);
        for(int i=0;i<users.length;i++){
           if (users[i] == null){
               users[i] = data;
               this.matrix[i][i] = 1;
               break;
           } 
        }
    }
    public User getUser(int ID){
        for (User vert : users) {
            if (vert!=null){
                if (ID == vert.getID()){
                    return vert;
                }
            }  
        }
        return null;
    }
    public int getIndex(int ID){
        int index;
        for (int i=0;i<users.length;i++){
            if (users[i] != null){
                if (ID == users[i].getID()){
                    index = i;
                    return index;
                }
            }
            
        }
        return -1;
    }
    public void addEdge(int ID1, int ID2, int weight){
        int index1, index2;
        index1 = this.getIndex(ID1);
        index2 = this.getIndex(ID2);
        if (index1==-1 || index2==-1){
            System.out.println("Not found");
        }else{
            this.matrix[index1][index2] = weight;
            this.matrix[index2][index1] = weight; 
        }
    }
    public void removeEdge(int ID1, int ID2){
        int index1, index2;
        index1 = this.getIndex(ID1);
        index2 = this.getIndex(ID2);
        if (index1==-1 || index2==-1){
            System.out.println("Not found");
        }else{
            this.matrix[index1][index2] = 0;
            this.matrix[index2][index1] = 0; 
        }
        
    }
    public void removeUser(int ID){
        int index = this.getIndex(ID);
        if (index != -1){
            for (User user :users){
                if (user != null){
                    this.removeEdge(ID,user.getID());
                }
                
            }
            users[index] = null;
        }else{
            System.out.println("Not found");
        }
    }
    public int getUserGrade(int ID){
        
        int userIndex = this.getIndex(ID);
        int grade = 0;
        for (int i=0;i<users.length;i++){
            
            if (this.matrix[userIndex][i] != 0){
                grade++;
            }
        }
        return grade;
    }
    public int getIdByIndex(int index){
        if (index<0){
            return -1;
        }
        if (index >= MAX_SIZE){
            return -1;
        }else{
           if (this.users[index] == null){
               return -1;
           }else{
               return this.users[index].getID();
           }
        }
    }
    @Override
    public String toString(){
       StringBuilder s = new StringBuilder();
       s.append("ID  ");
       for (int i =0; i<this.MAX_SIZE;i++){
           if (this.users[i]!=null){
               s.append(users[i].getID()).append(" ");
           }
       }
       s.append("\n");     
       for (int i=0;i<this.MAX_SIZE;i++){
           if (this.users[i] != null){
               s.append(users[i].getID()).append(" ");
           }else{
               s.append("   ");
           }
           
           for (int j:this.matrix[i]){
               if (j == 0){
                   s.append("   ");
               }else{
                   if (j%10==0){
                       s.append(j).append(" ");
                   }else{
                      s.append(j).append("  "); 
                   }
                   
               }
               s.append(" ");
               
           }
           s.append("\n");
       }
       
       return s.toString();
    }
    public boolean ExistID(int ID){
        for(User user:this.users){
            if (user != null){
                if (user.getID() == ID){
                    return true;
                }
            }
        }
        return false;
    }
    public String GetUsers(){
        StringBuilder s = new StringBuilder();
        for (User user:this.users){
            if (user!=null){
                s.append(user.toString());
                s.append("\n");
            }
            
        }
        return s.toString();
    }
}


