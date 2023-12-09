package GUI;

//import .*;
import gymClass.Training;
import gymClass.Instructor;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.util.Random;
import gymClass.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Adam R
 */
public class GUIInstructor extends javax.swing.JFrame {

    /**
     *
     */
    public Instructor[] allInstructors = new Instructor[5];
    private static List<Instructor> DataInstructor;
    private DefaultTableModel tableModel;

    /**
     * Creates new form Instructor
     */
    public GUIInstructor() {
        initComponents();
        displayDataFromDatabase();
//        Koneksi koneksi= new Koneksi();
//        Koneksi.displayDataInTable(tableModel, this);
      DataInstructor = new LinkedList<Instructor>();

        String[] kolom = {"Nama", "Experience"};  

  

        allInstructors[0] = new Instructor("Ali", 5);
        allInstructors[1] = new Instructor("Steven", 2);
        allInstructors[2] = new Instructor("Erick", 4);
        allInstructors[3] = new Instructor("King", 3);
        allInstructors[4] = new Instructor("John", 6);

 
        for (int i = 0; i < allInstructors.length; i++) {
           
                allInstructors[i].getName();
                allInstructors[i].getExperience();
            this.DataInstructor.add(allInstructors[i]);

        }
//
        inputData();
    }

    /**
     * Retrieves the list of instructors' data.
     *
     * @return A LinkedList containing Instructor objects.
     */
  
     
    public static LinkedList<Instructor> dataInstuctor() {
        return (LinkedList<Instructor>) DataInstructor;
    }

    /**
     * Initializes and adds training data to instructors.
     */
      public void displayDataFromDatabase() {
        try {
            // Mendapatkan koneksi ke database (gunakan koneksi yang telah Anda buat)
            Koneksi koneksi = new Koneksi();
            Connection conn = koneksi.getConnection();

            // Query SQL untuk mengambil data dari tabel instructors
            String query = "SELECT name, experience FROM instructors";

            // Membuat prepared statement untuk eksekusi query
            PreparedStatement pst = conn.prepareStatement(query);

            // Mengeksekusi query dan mendapatkan hasilnya
            ResultSet rs = pst.executeQuery();

            // Mengambil metadata dari hasil query (nama kolom)
            int columnCount = rs.getMetaData().getColumnCount();
            String[] columnNames = new String[columnCount];
            for (int i = 0; i < columnCount; i++) {
                columnNames[i] = rs.getMetaData().getColumnName(i + 1);
            }

            // Menggunakan DefaultTableModel untuk menyimpan data dan kolom
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);

            // Mengisi model dengan data dari hasil query
            while (rs.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    rowData[i] = rs.getObject(i + 1);
                }
                model.addRow(rowData);
            }

            // Menetapkan model pada JTable
            jTable1.setModel(model);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    
    
    public void inputData() {
        Training T1 = new Training("Arms and Abs", LocalDate.of(2022, 10, 15), LocalDate.of(2022, 11, 15));
        Training T2 = new Training("Lower Abs", LocalDate.of(2022, 11, 16), LocalDate.of(2022, 12, 16));
        Training T3 = new Training("Cardio Level 1", LocalDate.of(2022, 8, 12), LocalDate.of(2022, 9, 13));
        Training T4 = new Training("Easy Arms", LocalDate.of(2022, 7, 10), LocalDate.of(2022, 8, 11));

        DataInstructor.get(0).addTraining(T1);

        DataInstructor.get(1).addTraining(T2);

        DataInstructor.get(2).addTraining(T3);
        DataInstructor.get(2).addTraining(T4);

        DataInstructor.get(3).addTraining(T4);

        DataInstructor.get(4).addTraining(T3);
        System.out.println("Data Instructor  :" + DataInstructor);
          for( int i = 0 ; i < DataInstructor.size() ; i++ ){

          
                 DataInstructor.get(i).addTraining(T1);
                 
                 
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_submit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        FieldNama = new javax.swing.JTextField();
        FieldExperience = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(204, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tambah Instructor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 315, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 420, 170));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 30, 40));

        btn_submit.setText("Tambah");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, -1, -1));

        jLabel3.setText("Nama");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        FieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNamaActionPerformed(evt);
            }
        });
        getContentPane().add(FieldNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 220, -1));

        FieldExperience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldExperienceActionPerformed(evt);
            }
        });
        getContentPane().add(FieldExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 220, -1));

        jLabel4.setText("Experience");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("List Instructor");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 315, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        String name= FieldNama.getText().trim();
        String experience= FieldExperience.getText().trim();
        
        try {
            int experienceInt= Integer.parseInt(experience);
            
            Koneksi koneksi= new Koneksi();
            
            koneksi.insertInstructor(name, experienceInt);
//            // TODO add your handling code here:
//            Koneksi.DatabaseManager.tambahInstructor(0, DataInstructor);
//        } catch (SQLException ex) {
//            Logger.getLogger(GUIInstructor.class.getName()).log(Level.SEVERE, null, ex);
       }catch(NumberFormatException e){
           e.printStackTrace();
       }

    }//GEN-LAST:event_btn_submitActionPerformed

    private void FieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNamaActionPerformed

    private void FieldExperienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldExperienceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldExperienceActionPerformed

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
            java.util.logging.Logger.getLogger(gymClass.Instructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gymClass.Instructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gymClass.Instructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gymClass.Instructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIInstructor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FieldExperience;
    private javax.swing.JTextField FieldNama;
    private javax.swing.JButton btn_submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
