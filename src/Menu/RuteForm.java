package Menu;

import Back_End.Adj_Mat_Graph;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class RuteForm extends javax.swing.JInternalFrame {
    Adj_Mat_Graph theGraph = new Adj_Mat_Graph();
    
    public RuteForm() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        messageField.setEnabled(false);
        

        theGraph.addVertex("Jl. Semeru");//0
        theGraph.addVertex("Jl. Bromo");//1
        theGraph.addVertex("Jl. RS Riyadi");//2
        theGraph.addVertex("Jl. Jaksa A. Suprapto");//3
        theGraph.addVertex("Jl. Jend Basuki Rahmat");//4
        theGraph.addVertex("Jl. Buring");//5
        theGraph.addVertex("Jl. Welirang");//6
        theGraph.addVertex("Jl. Merapi");//7
        theGraph.addVertex("Jl. Kahuripan");//8
        theGraph.addVertex("Jl. Belakang RSU");//9
        theGraph.addVertex("Jl. Tugu");//10
        theGraph.addVertex("Jl. Tumapel");//11
        theGraph.addVertex("Jl. Mojopahit");//12
        theGraph.addVertex("Jl. M.G.R. Sugiyopranoto");//13
        theGraph.addVertex("Jl. Aries Munandar");//14
        theGraph.addVertex("Jl. Merdeka Timur");//15
        theGraph.addVertex("Jl. Merdeka Selatan");//16
        theGraph.addVertex("Jl. Arif Rahman Hakim");//17
        theGraph.addVertex("Jl. Agus Salim");//18
        theGraph.addVertex("Jl. Kauman");//19
        theGraph.addVertex("Jl. Hasyim Asyari");//20
        theGraph.addVertex("Jl. Kawi");//21
        theGraph.addVertex("Jl. Arjuno");//22
        theGraph.addVertex("Jl. Tangkuban Perahu");//23
        theGraph.addVertex("Jl. Kelud");//24
        theGraph.addVertex("Jl. Tenes");//25

        theGraph.addEdge(0, 1, 350);
        theGraph.addEdge(1, 2, 140);
        theGraph.addEdge(2, 3, 100);
        theGraph.addEdge(2, 4, 84);
        theGraph.addEdge(4, 0, 400);
        theGraph.addEdge(1, 5, 350);
        theGraph.addEdge(1, 6, 50);
        theGraph.addEdge(7, 0, 200);
        theGraph.addEdge(4, 8, 400);
        theGraph.addEdge(8, 9, 280);
        theGraph.addEdge(8, 10, 300);
        theGraph.addEdge(8, 11, 220);
        theGraph.addEdge(11, 12, 450);
        theGraph.addEdge(10, 11, 350);
        theGraph.addEdge(12, 13, 240);
        theGraph.addEdge(13, 15, 150);
        theGraph.addEdge(18, 16, 50);
        theGraph.addEdge(15, 16, 150);
        theGraph.addEdge(16, 19, 300);
        theGraph.addEdge(19, 20, 85);
        theGraph.addEdge(20, 17, 180);
        theGraph.addEdge(17, 4, 800);
        theGraph.addEdge(14, 15, 500);
        theGraph.addEdge(20, 21, 50);
        theGraph.addEdge(21, 24, 500);
        theGraph.addEdge(21, 22, 500);
        theGraph.addEdge(21, 23, 190);
        theGraph.addEdge(21, 1, 550);
        theGraph.addEdge(24, 21, 100);
        theGraph.addEdge(25, 21, 400);
        theGraph.addEdge(0, 25, 400);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        messagePanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        messageField1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        startField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        endField = new javax.swing.JTextField();
        messagePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageField = new javax.swing.JTextArea();
        mulaiButton = new javax.swing.JButton();

        messageField1.setColumns(20);
        messageField1.setRows(5);
        jScrollPane2.setViewportView(messageField1);

        javax.swing.GroupLayout messagePanel1Layout = new javax.swing.GroupLayout(messagePanel1);
        messagePanel1.setLayout(messagePanel1Layout);
        messagePanel1Layout.setHorizontalGroup(
            messagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(messagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, messagePanel1Layout.createSequentialGroup()
                    .addContainerGap(29, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(33, Short.MAX_VALUE)))
        );
        messagePanel1Layout.setVerticalGroup(
            messagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(messagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, messagePanel1Layout.createSequentialGroup()
                    .addContainerGap(31, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(33, Short.MAX_VALUE)))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Dashboard/map600px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Dari jalan apa rute anda dimulai?");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Anda ingin melakukan perjalanan ke mana?");

        messageField.setColumns(20);
        messageField.setRows(5);
        jScrollPane1.setViewportView(messageField);

        javax.swing.GroupLayout messagePanelLayout = new javax.swing.GroupLayout(messagePanel);
        messagePanel.setLayout(messagePanelLayout);
        messagePanelLayout.setHorizontalGroup(
            messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, messagePanelLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        messagePanelLayout.setVerticalGroup(
            messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, messagePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mulaiButton.setText("Mulai");
        mulaiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulaiButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(startField)
                            .addComponent(jLabel3)
                            .addComponent(endField, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                            .addComponent(mulaiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(messagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(startField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mulaiButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(messagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(38, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mulaiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulaiButtonActionPerformed
        messageField.setText("");
        String start1 = startField.getText();
        int startVertex = theGraph.getIndexByLabel(start1);
        String end1 = endField.getText();
        int endVertex = theGraph.getIndexByLabel(end1);
        
        String[] arrJalan = theGraph.detectRoadDirection(startVertex, endVertex);
        for(String i:arrJalan){
            messageField.append(i);
        }
        
    }//GEN-LAST:event_mulaiButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField endField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea messageField;
    private javax.swing.JTextArea messageField1;
    private javax.swing.JPanel messagePanel;
    private javax.swing.JPanel messagePanel1;
    private javax.swing.JButton mulaiButton;
    private javax.swing.JTextField startField;
    // End of variables declaration//GEN-END:variables
}
