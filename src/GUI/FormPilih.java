package GUI;

//import .*;

import javax.swing.ComboBoxModel;
import GUI.GUIInstructor;
import gymClass.Instructor;
import gymClass.LatihanMember;
import gymClass.Member;
import gymClass.Training;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Adam R
 */
public class FormPilih extends javax.swing.JFrame {
    List<LatihanMember> dataLatihanMember;
    /**
     * Creates new form Instructor
     */
    public FormPilih() {
        initComponents();
        dataLatihanMember = new ArrayList<LatihanMember>();
        setselectMember();
        setselectTrainer();
    }
    
    private void setselectMember(){
        for(int i=0;i<new FormMember().dataMember.size();i++) {
            selectMember.addItem(new FormMember().dataMember.get(i).getNama());
        }
          
   }
    /**
    * Populates the 'selectTrainer' combo box with instructor names.
    */
   private void setselectTrainer(){
        for(int i=0;i<GUIInstructor.dataInstuctor().size();i++) {
            selectTrainer.addItem(GUIInstructor.dataInstuctor().get(i).getName());
        }
          
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        selectTrainer = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTraining = new javax.swing.JTable();
        selectMember = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablesimpan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TAMBAH LATIHAN");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("*pilih Latihan sesuai dengan Trainer");

        jLabel3.setText("Nama Trainer :");

        selectTrainer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTrainerActionPerformed(evt);
            }
        });

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tableTraining.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Latihan", "Tanggal Mulai", "Tanggal Selesai"
            }
        ));
        jScrollPane1.setViewportView(tableTraining);

        selectMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectMemberActionPerformed(evt);
            }
        });

        jLabel4.setText("Nama Member");

        tablesimpan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablesimpan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(228, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(180, 180, 180)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(selectMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(selectTrainer, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectTrainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(7, 7, 7)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jButton1)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Handles the 'Tambah' button click event.
     * It sets userTrainer and namaTrainer variables and makes the 'todolist' frame visible.
     * @param evt The action event.
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         // TODO add your handling code here:
         int index = selectMember.getSelectedIndex();
         Member m = new FormMember().dataMember.get(index);
         int index2 = selectTrainer.getSelectedIndex();
         Instructor ins = GUIInstructor.dataInstuctor().get(index2);
         int row = tableTraining.getSelectedRow();
         Training training = GUIInstructor.dataInstuctor().get(index2).getDataTrainer().get(row);
         
         LatihanMember latihan = new LatihanMember(m, ins, training);
         dataLatihanMember.add(latihan);
         System.out.println(dataLatihanMember);
//         tampilLatihanMember();
        System.out.println();
                  
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void tampilLatihanMember(){
        String[] kolom = {"Nama Member","Nama Instruktur","Nama Pelatihan"};
        
        DefaultTableModel model = new DefaultTableModel(kolom, 0);
        
        tablesimpan.setModel(model);
        for (int i=0;i<dataLatihanMember.size();i++){
            model.addRow(new Object[]{
                dataLatihanMember.get(i).getMember().getNama(),
                dataLatihanMember.get(i).getInstructor().getName(),
                dataLatihanMember.get(i).getTraining().getNameTrain(),

            });
//            this.dataMember.add(dataMember[i]);

        }
    }
    /**
    * Handles the selection of a trainer from the 'selectTrainer' combo box.
    * It updates the table with training details based on the selected trainer.
    * @param evt The action event.
    */
    private void selectTrainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTrainerActionPerformed
        // TODO add your handling code here:
        String selectedName = (String) selectTrainer.getSelectedItem(); // Dapatkan nama yang dipilih dari ComboBox
        int index = selectTrainer.getSelectedIndex();
        System.out.println(index);
        DefaultTableModel tableTrain = (DefaultTableModel) tableTraining.getModel();
        
        int rows = tableTraining.getRowCount();
        for(int i=0;i<rows;i++)
        ((DefaultTableModel)tableTraining.getModel()).removeRow(i);
        
        for(int i = 0 ; i < GUIInstructor.dataInstuctor().get(index).getDataTrainer().size(); i++ ){
            Object[] data = {GUIInstructor.dataInstuctor().get(index).getDataTrainer().get(i).getNameTrain(),
            GUIInstructor.dataInstuctor().get(index).getDataTrainer().get(i).getDateStart(),
            GUIInstructor.dataInstuctor().get(index).getDataTrainer().get(i).getDateEnd()
            };
            tableTrain.addRow(data);
        }
    
    }//GEN-LAST:event_selectTrainerActionPerformed

    private void selectMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectMemberActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_selectMemberActionPerformed

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
            java.util.logging.Logger.getLogger(FormPilih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPilih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPilih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPilih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPilih().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> selectMember;
    private javax.swing.JComboBox<String> selectTrainer;
    private javax.swing.JTable tableTraining;
    private javax.swing.JTable tablesimpan;
    // End of variables declaration//GEN-END:variables
}