/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


/**
 *
 * @author Dave
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        autor = new javax.swing.JLabel();
        nombreRep = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        StatusWorkspace = new javax.swing.JButton();
        StatusRemote = new javax.swing.JButton();
        StatusIndex = new javax.swing.JButton();
        StatusLocal = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BotonArchivo = new javax.swing.JButton();
        BotonAdd = new javax.swing.JButton();
        BotonStatus = new javax.swing.JButton();
        BotonCommit = new javax.swing.JButton();
        BotonPull = new javax.swing.JButton();
        BotonPush = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(200, 201, 230));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/vista/gato_Git250.png")).getImage());

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Autor:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre Repositorio:");

        autor.setForeground(new java.awt.Color(255, 255, 255));
        autor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        autor.setText("jLabel3");

        nombreRep.setForeground(new java.awt.Color(255, 255, 255));
        nombreRep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreRep.setText("jLabel4");

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/gato_GIT.png"))); // NOI18N
        jLabel4.setText("Git");

        StatusWorkspace.setForeground(new java.awt.Color(255, 255, 255));
        StatusWorkspace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Workspace.png"))); // NOI18N
        StatusWorkspace.setText("Workspace");
        StatusWorkspace.setContentAreaFilled(false);
        StatusWorkspace.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StatusWorkspace.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StatusWorkspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusWorkspaceActionPerformed(evt);
            }
        });

        StatusRemote.setForeground(new java.awt.Color(255, 255, 255));
        StatusRemote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/RemoteRep50x50.png"))); // NOI18N
        StatusRemote.setText("Remote Repository");
        StatusRemote.setContentAreaFilled(false);
        StatusRemote.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StatusRemote.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StatusRemote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusRemoteActionPerformed(evt);
            }
        });

        StatusIndex.setForeground(new java.awt.Color(255, 255, 255));
        StatusIndex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Index.png"))); // NOI18N
        StatusIndex.setText("Index");
        StatusIndex.setContentAreaFilled(false);
        StatusIndex.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StatusIndex.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StatusIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusIndexActionPerformed(evt);
            }
        });

        StatusLocal.setForeground(new java.awt.Color(255, 255, 255));
        StatusLocal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/LocalRep.png"))); // NOI18N
        StatusLocal.setText("Local Repository");
        StatusLocal.setContentAreaFilled(false);
        StatusLocal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StatusLocal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StatusLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusLocalActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Status:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(autor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nombreRep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StatusWorkspace, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(StatusRemote, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(StatusIndex, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(StatusLocal, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(autor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreRep)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StatusWorkspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StatusIndex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StatusLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StatusRemote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(">");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BotonArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/NuevoArchivo.png"))); // NOI18N
        BotonArchivo.setText("Crear Archivo");
        BotonArchivo.setContentAreaFilled(false);
        BotonArchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonArchivo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonArchivo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonArchivoActionPerformed(evt);
            }
        });

        BotonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Add.png"))); // NOI18N
        BotonAdd.setText("Git Add");
        BotonAdd.setContentAreaFilled(false);
        BotonAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAddActionPerformed(evt);
            }
        });

        BotonStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Status.png"))); // NOI18N
        BotonStatus.setText("Git Status");
        BotonStatus.setContentAreaFilled(false);
        BotonStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonStatus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonStatus.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonStatusActionPerformed(evt);
            }
        });

        BotonCommit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Commit.png"))); // NOI18N
        BotonCommit.setText("Git Commit");
        BotonCommit.setContentAreaFilled(false);
        BotonCommit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCommit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonCommit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        BotonPull.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Pull.png"))); // NOI18N
        BotonPull.setText("Git Pull");
        BotonPull.setContentAreaFilled(false);
        BotonPull.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonPull.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonPull.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        BotonPush.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Push.png"))); // NOI18N
        BotonPush.setText("Git Push");
        BotonPush.setContentAreaFilled(false);
        BotonPush.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonPush.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonPush.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPushActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonCommit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonPush, javax.swing.GroupLayout.PREFERRED_SIZE, 124, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonPull, javax.swing.GroupLayout.PREFERRED_SIZE, 124, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 124, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonCommit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonPush, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonPull, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
        
     
        
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        if (jPanel1.isVisible()){            
            jPanel1.setVisible(false);
            jLabel3.setText(">");
        }
        else {
            jPanel1.setVisible(true);
            jLabel3.setText("<");
        }
    }//GEN-LAST:event_jPanel2MouseClicked

    private void BotonArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonArchivoActionPerformed

    private void BotonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAddActionPerformed

    private void BotonPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPushActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonPushActionPerformed

    private void StatusWorkspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusWorkspaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusWorkspaceActionPerformed

    private void StatusRemoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusRemoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusRemoteActionPerformed

    private void StatusIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusIndexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusIndexActionPerformed

    private void StatusLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusLocalActionPerformed

    private void BotonStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonStatusActionPerformed
        // TODO add your handling code here:
        if (jPanel1.isVisible()){            
            jPanel1.setVisible(false);
            jLabel3.setText(">");
        }
        else {
            jPanel1.setVisible(true);
            jLabel3.setText("<");
        }
    }//GEN-LAST:event_BotonStatusActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BotonAdd;
    public javax.swing.JButton BotonArchivo;
    public javax.swing.JButton BotonCommit;
    public javax.swing.JButton BotonPull;
    public javax.swing.JButton BotonPush;
    public javax.swing.JButton BotonStatus;
    public javax.swing.JButton StatusIndex;
    public javax.swing.JButton StatusLocal;
    public javax.swing.JButton StatusRemote;
    public javax.swing.JButton StatusWorkspace;
    public javax.swing.JLabel autor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel nombreRep;
    // End of variables declaration//GEN-END:variables
}
