/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theevansfingers;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import database.Database;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import logic.Attendance;
import logic.Courses;
import logic.HoldVariables;

/**
 *
 * @author Paulous
 */
public class Lecturer extends javax.swing.JFrame {
    String manNumber;
    String lecturerName;
    List<Courses> courses;
    /**
     * Creates new form Lecturer
     */
    public Lecturer() {
        initComponents();
//        Toolkit toolkit = getToolkit();
//        Dimension size = toolkit.getScreenSize();
//        setLocation(size.width/2 - getWidth()/2, 
//        size.height/2 - getHeight()/2);
        getLecturer();
        loadCombo();
        setSize(900,500);
    setLocation(250,150);
    setResizable(false);
    }
    
    private void getLecturer(){
        Database db = new Database();
        
        List<logic.Lecturer> lecturer = db.getAllLecturer(HoldVariables.lecturerName);
           HashMap<String, String> hashLecturer = new HashMap<>();
        
        for(int i=0; i<lecturer.size();i++){
            lecturerName = lecturer.get(i).getLecturerName();
            manNumber = lecturer.get(i).getManNumber();

            hashLecturer.put(lecturerName, manNumber);
            System.out.print(lecturerName + " ");
        }
        
        welcome.setText("Welcome "+lecturerName);
    }
    
    private void loadCombo(){
        Database db = new Database();
        
         courses = db.getManNumber(manNumber);
        
        if(courses.size() > 0){
            for(int i=0; i<courses.size(); i++){
                String courseName = courses.get(i).getCourseName();
                courseCombo.addItem(courseName);
            }
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

        jButton1 = new javax.swing.JButton();
        welcome = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        courseCombo = new javax.swing.JComboBox();
        studentNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 500));
        setMinimumSize(new java.awt.Dimension(900, 500));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Generate Register");
        jButton1.setPreferredSize(new java.awt.Dimension(160, 70));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        welcome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        welcome.setText("WELCOME: ");
        getContentPane().add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 184, 41));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("LOGOUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, -1, -1));

        getContentPane().add(courseCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 163, -1));

        studentNumber.setMinimumSize(new java.awt.Dimension(70, 30));
        studentNumber.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(studentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 150, 250, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Student Number");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, -1, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setMinimumSize(new java.awt.Dimension(70, 30));
        jTextArea1.setPreferredSize(new java.awt.Dimension(70, 30));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 210, 250, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Reason For Being Late");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Update Record");
        jButton3.setPreferredSize(new java.awt.Dimension(160, 70));
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Today's Register");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BIOMETRIC CLASS ATTENDANCE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 39));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/close.jpg"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(842, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(137, 137, 137)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/1A.jpg"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(900, 500));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Login log = new Login();
        log.show();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String courseCode = courseCombo.getSelectedItem().toString();
        if(courseCode.isEmpty()){
            JOptionPane.showMessageDialog(null, "No course selected");
        }else {
            
        }
        
        
         JFileChooser dialog = new JFileChooser();
            dialog.setSelectedFile(new File("attendance"+courseCode+".pdf"));
            int dialogResult = dialog.showSaveDialog(null);
            if (dialogResult==JFileChooser.APPROVE_OPTION){
                try {
                String filePath = dialog.getSelectedFile().getPath();
                
                Database db = new Database();
                LocalDate today = LocalDate.now();
                List<Attendance> attend = 
                        db.getAllAttendance(manNumber, courseCode, String.valueOf(today));
                //Create the document
                
                Document document = new Document();
                PdfWriter myWritter = PdfWriter.getInstance(document, new FileOutputStream(filePath));
                PdfPTable table = new PdfPTable(3);
                document.open();
                
                float[] columnWidths =new float[] {2,2,2};
                table.setWidths(columnWidths);
                table.setWidthPercentage(100);
                
                document.add(new Paragraph("=========================ATTENDANCE SESSION======================= "));
                document.add(new Paragraph("\n"));
                table.addCell(new PdfPCell(new Paragraph("STUDENT ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("STUDENT NAME",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("STATUS",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
           
                //Get the iterator
                
                
                for(int i =0; i< attend.size(); i++){
                    table.addCell(new PdfPCell(new Paragraph( attend.get(i).getStudentNumber(),
                            FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph( attend.get(i).getStudentName(),
                            FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(attend.get(i).getLateComingStatus(),
                            FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    
                }
                
              

                document.add(table);
                
                //Create a pie chart for the gender
                
                document.close();
                
                System.out.println("Nice");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DocumentException ex) {
                Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(Lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lecturer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox courseCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField studentNumber;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
