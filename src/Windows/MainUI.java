
package Windows;

import Graph.Graph;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import proyectoeed1.FilesIO;
import proyectoeed1.Solution;

/**
 *
 * @author Santiago Aristimuño
 */
public class MainUI extends javax.swing.JFrame {
    Graph graph;
    File f;
    /**
     * Creates new form MainUI
     * @param graph
     */
    public MainUI(Graph graph) {
        this.graph = graph;
        FilesIO io = new FilesIO();
        f = io.file;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFileChooser1 = new javax.swing.JFileChooser();
        jFrame3 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        ChooseFile = new javax.swing.JButton();
        addUser = new javax.swing.JButton();
        removeUser = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        removeEdge = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Display = new javax.swing.JTextArea();
        Islands = new javax.swing.JLabel();
        Bridges = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        showUsers = new javax.swing.JButton();
        Save = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto 1");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ChooseFile.setText("Choose File");
        ChooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseFileActionPerformed(evt);
            }
        });

        addUser.setText("Add User");
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });

        removeUser.setText("Remove User");
        removeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserActionPerformed(evt);
            }
        });

        jButton1.setText("Add Edge");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        removeEdge.setText("Remove Edge");
        removeEdge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEdgeActionPerformed(evt);
            }
        });

        Display.setColumns(20);
        Display.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Display.setRows(5);
        jScrollPane1.setViewportView(Display);

        Islands.setText("Number of Islands: ");

        Bridges.setText("Number of Bridges: ");

        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        showUsers.setText("Show users Info");
        showUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showUsersActionPerformed(evt);
            }
        });

        Save.setText("Save to file");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removeEdge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChooseFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Islands)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                        .addComponent(Bridges))
                    .addComponent(jScrollPane1))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(start)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeEdge)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChooseFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(showUsers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Save))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Islands, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(Bridges, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseFileActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        try{
            this.f = fc.getSelectedFile();
            FilesIO io = new FilesIO();
            String users = io.getUsersString(f);
            String relations = io.getEdgesString(f);
            io.loadGraphData(users, relations, graph);
            this.UpdateScreen();
            io.saveChanges(this.f, this.graph);
            
            //this.graph = 
        }catch(Exception e){
            
        }
        
        
    }//GEN-LAST:event_ChooseFileActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        this.UpdateScreen();
    }//GEN-LAST:event_startActionPerformed

    private void showUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showUsersActionPerformed
        ShowUsers usersList = new ShowUsers(graph.GetUsers());
        usersList.setVisible(true);
    }//GEN-LAST:event_showUsersActionPerformed

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
       AddUser ad = new AddUser(this);
       ad.setVisible(true);
       
       
    }//GEN-LAST:event_addUserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AddEdge ae = new AddEdge(this);
        ae.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void removeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUserActionPerformed
        RemoveUser ru = new RemoveUser(this);
        ru.setVisible(true);
    }//GEN-LAST:event_removeUserActionPerformed

    private void removeEdgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEdgeActionPerformed
        RemoveEdge re = new RemoveEdge(this);
        re.setVisible(true);
    }//GEN-LAST:event_removeEdgeActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        try{
            FilesIO io = new FilesIO();
            io.saveChanges(this.f, graph);
            JOptionPane.showMessageDialog(null, "Succesfully Saves");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Could not save file");
        }
    }//GEN-LAST:event_SaveActionPerformed
    public void UpdateScreen(){
        Solution solution = new Solution();
        Display.setText(this.graph.toString());
        Islands.setText("Number of Islands: "+solution.numOfIslandsDFS(graph.matrix) );
        Bridges.setText("Number of Bridges: "+solution.numOfBridges(graph.matrix) );
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bridges;
    private javax.swing.JButton ChooseFile;
    private javax.swing.JTextArea Display;
    private javax.swing.JLabel Islands;
    private javax.swing.JButton Save;
    private javax.swing.JButton addUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeEdge;
    private javax.swing.JButton removeUser;
    private javax.swing.JButton showUsers;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
