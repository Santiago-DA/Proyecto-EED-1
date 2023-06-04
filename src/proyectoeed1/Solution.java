/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoeed1;

/**
 *
 * @author Santiago Aristimuño
 */
public class Solution {
    private void dfs(int[][] matrix, int row, int col){  
        int H = matrix.length;  
        int L = matrix[0].length;  
        //returns true if any of the condition returns true  
        if (row < 0 || col < 0 || row >= H || col >= L || matrix[row][col] == 0){
            return;
        }
    //marking element as visited  
    matrix[row][col] = 0;   
    dfs(matrix, row+ 1, col);   
    dfs(matrix, row- 1, col);    
    dfs(matrix, row, col + 1);   
    dfs(matrix, row, col - 1);  
    }  
    
    public int numOfIslandsDFS(int[][] graph){
        int count = 0;
        int SIZE = graph.length;
        int[][] matrix = new int[SIZE][SIZE];
        //array copy
        for (int i =0;i<SIZE;i++){
            System.arraycopy(graph[i], 0, matrix[i], 0, SIZE);
        }
        
        //counting islands
        for (int r=0;r<SIZE;r++){
            for (int c=0;c<SIZE; c++){
                if (matrix[r][c] != 0){
                    dfs(matrix, r, c);
                    count++;
                }
            }
        }
        return count;
    }
    
    public int numOfBridges(int[][] graph){
        int numBridges = 0;
        int numIslands = this.numOfIslandsDFS(graph);
        int compare;
        int info;
        for (int[] graph1 : graph) {
            for (int j = 0; j<graph.length; j++) {
                if (graph1[j] != 0) {
                    info = graph1[j];
                    graph1[j] = 0;
                    compare = this.numOfIslandsDFS(graph);
                    graph1[j] = info;
                    if (numIslands != compare){
                        numBridges++;
                    }
                }
            }
        }
        
        return numBridges;
    }
}
