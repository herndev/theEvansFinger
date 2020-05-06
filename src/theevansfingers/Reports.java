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
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import logic.Courses;
import logic.Students;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Paulous
 */
public class Reports extends javax.swing.JFrame {
    //Get the database result
    private Database db = new Database();
    private String courseCodeArray[] = null;
    /**
     * Creates new form Reports
     */
    public Reports() {
        initComponents();
        setSize(900,500);
    setLocation(250,150);
    setResizable(false);
    loadCombo();
    }
    
    /**
     * Method that loads all students from
     */
    
    private void loadStudents(){
        
    }
    
      private void loadCombo(){
        List<Courses> courses = db.getAllCourses();
            courseCodeArray = new String[courses.size()];
        for(int i=0; i<courses.size();i++){
            String courseName = courses.get(i).getCourseName();
            String courseCodes = courses.get(i).getCourseCode();
            courseCodeArray[i] = courseCodes;
             
            System.out.print(courseName + " Nothing");
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

        typeOfReport = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        studentNumber = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 500));
        setMinimumSize(new java.awt.Dimension(900, 500));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        typeOfReport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        typeOfReport.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All Students", "All courses", "Courses against Student" }));
        typeOfReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeOfReportActionPerformed(evt);
            }
        });
        getContentPane().add(typeOfReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 119, 220, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("GENERATE REPORTS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        studentNumber.setText("Student Number");
        studentNumber.setToolTipText("Student Number");
        studentNumber.setMaximumSize(new java.awt.Dimension(160, 70));
        studentNumber.setMinimumSize(new java.awt.Dimension(160, 70));
        studentNumber.setPreferredSize(new java.awt.Dimension(160, 70));
        studentNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNumberActionPerformed(evt);
            }
        });
        getContentPane().add(studentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, 30));

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BIOMETRIC CLASS ATTENDANCE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/close.jpg"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(852, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 0, 910, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Generate");
        jButton1.setPreferredSize(new java.awt.Dimension(160, 70));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Close");
        jButton2.setPreferredSize(new java.awt.Dimension(160, 70));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton3.setText("STUDENTS ABOVE 85%");
        jButton3.setPreferredSize(new java.awt.Dimension(160, 70));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/1A.jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(900, 500));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typeOfReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeOfReportActionPerformed
        // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_typeOfReportActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String student = studentNumber.getText();
        
        Database db = new Database();
        
        if(db.searchStudent(student)){
            printIndividualReport(student);
        }else {
            System.out.println("Nigga");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //Hard coded values
       int get = JOptionPane.showOptionDialog(rootPane, "Pick A Courses", null, WIDTH, WIDTH, null, courseCodeArray, rootPane);
       String itemPicked = courseCodeArray[get];
       System.out.println("\n"+itemPicked);
       above85Percent(itemPicked);
       
    }//GEN-LAST:event_jButton3ActionPerformed
    /**
     * Print the report students above 85%
     * @param courseCode 
     */
    private void above85Percent(String courseCode){
        List<Students> students = db.getAllCourseAttendance(courseCode);
        List<Courses> courses = db.getAllCourseCount();
        HashMap<String, Integer> studentHash = new HashMap();
        HashMap<String, Integer> courseHash = new HashMap();
       
        
        //for loop to itterate through the list
        for(int i =0; i<students.size(); i++){
            
            String courseName = students.get(i).getCourseName();
            int totalCount = students.get(i).getTotalClassAttended();
            studentHash.put(courseName, totalCount);
        }
        
          //for loop to itterate through the list
        for(int i =0; i<courses.size(); i++){
            
            String courseName = courses.get(i).getCourseName();
            int totalCount = courses.get(i).getTotalCourse();
            courseHash.put(courseName, totalCount);
        }
        
        
        JFileChooser dialog = new JFileChooser();
            //Rename the pdf at print stage
            dialog.setSelectedFile(new File(courseCode+"Attendance85andMore.pdf"));
            int dialogResult = dialog.showSaveDialog(null);
            if (dialogResult==JFileChooser.APPROVE_OPTION){
            try {
                String filePath = dialog.getSelectedFile().getPath();
                
                
                //Create the document
                
                Document document = new Document();
                PdfWriter myWritter = PdfWriter.getInstance(document, new FileOutputStream(filePath));
                PdfPTable table = new PdfPTable(5);
                document.open();
                
                float[] columnWidths =new float[] {2,2,2,2,2};
                table.setWidths(columnWidths);
                table.setWidthPercentage(100);
                
                document.add(new Paragraph("=============ALL STUDENTS 85% ATTENDANCE "+courseCode+" ============ "));
                
                
                document.add(new Paragraph("\n"));
                table.addCell(new PdfPCell(new Paragraph("STUDENT NAME",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("STUDENT ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Total Attended Classes",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Total Classes",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Percentage of Atttendance",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                
 
                /**
                 * Loop through the list and print the value at each stage
                 */
                for(int i =0; i<students.size();i++){
                    String courseName = students.get(i).getCourseName();
                   
                    //Get the count of the current course under view
                    float courseCount = courseHash.get(courseName);
                    
                    float percent = (students.get(i).getTotalClassAttended()/courseCount) * 100;
                    
                    //check for the percentage
                    if(percent > 84){
                        table.addCell(new PdfPCell(new Paragraph( ""+students.get(i).getStudentName() ,FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph( ""+students.get(i).getStudentNumber() ,FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph( ""+students.get(i).getTotalClassAttended() ,FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph( ""+ courseCount,FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph( ""+percent ,FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));

                    }
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
    }
    
    /**
     * Print A report for below 85
     * @param courseCode 
     */
    private void below85Percent(String courseCode){
        List<Students> students = db.getAllCourseAttendance(courseCode);
        List<Courses> courses = db.getAllCourseCount();
        HashMap<String, Integer> studentHash = new HashMap();
        HashMap<String, Integer> courseHash = new HashMap();
       
        
        //for loop to itterate through the list
        for(int i =0; i<students.size(); i++){
            
            String courseName = students.get(i).getCourseName();
            int totalCount = students.get(i).getTotalClassAttended();
            studentHash.put(courseName, totalCount);
        }
        
          //for loop to itterate through the list
        for(int i =0; i<courses.size(); i++){
            
            String courseName = courses.get(i).getCourseName();
            int totalCount = courses.get(i).getTotalCourse();
            courseHash.put(courseName, totalCount);
        }
        
        
        JFileChooser dialog = new JFileChooser();
            //Rename the pdf at print stage
            dialog.setSelectedFile(new File(courseCode+"Attendance85andBelow.pdf"));
            int dialogResult = dialog.showSaveDialog(null);
            if (dialogResult==JFileChooser.APPROVE_OPTION){
            try {
                String filePath = dialog.getSelectedFile().getPath();
                
                
                //Create the document
                
                Document document = new Document();
                PdfWriter myWritter = PdfWriter.getInstance(document, new FileOutputStream(filePath));
                PdfPTable table = new PdfPTable(5);
                document.open();
                
                float[] columnWidths =new float[] {2,2,2,2,2};
                table.setWidths(columnWidths);
                table.setWidthPercentage(100);
                
                document.add(new Paragraph("=============ALL STUDENTS 85% ATTENDANCE "+courseCode+" ============ "));
                
                
                document.add(new Paragraph("\n"));
                table.addCell(new PdfPCell(new Paragraph("STUDENT NAME",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("STUDENT ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Total Attended Classes",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Total Classes",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Percentage of Atttendance",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                
 
                /**
                 * Loop through the list and print the value at each stage
                 */
                for(int i =0; i<students.size();i++){
                    String courseName = students.get(i).getCourseName();
                   
                    //Get the count of the current course under view
                    float courseCount = courseHash.get(courseName);
                    
                    float percent = (students.get(i).getTotalClassAttended()/courseCount) * 100;
                    
                    //check for the percentage
                    if(percent < 85){
                        table.addCell(new PdfPCell(new Paragraph( ""+students.get(i).getStudentName() ,FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph( ""+students.get(i).getStudentNumber() ,FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph( ""+students.get(i).getTotalClassAttended() ,FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph( ""+ courseCount,FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph( ""+percent ,FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));

                    }
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
    }
    private void studentNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNumberActionPerformed
        // TODO add your handling code here:
    
        
    }//GEN-LAST:event_studentNumberActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Home home = new Home();
        home.show();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked
    
    private void printIndividualReport(String studentNumber) {
        
    
        
        List<Students> students = db.getAllStudentAttendance(studentNumber);
        List<Courses> courses = db.getAllCourseCount();
        HashMap<String, Integer> studentHash = new HashMap();
        HashMap<String, Integer> courseHash = new HashMap();
       
        
        //for loop to itterate through the list
        for(int i =0; i<students.size(); i++){
            
            String courseName = students.get(i).getCourseName();
            int totalCount = students.get(i).getTotalClassAttended();
            studentHash.put(courseName, totalCount);
        }
        
        //hash map for  course
          //for loop to itterate through the list
        for(int i =0; i<courses.size(); i++){
            
            String courseName = courses.get(i).getCourseName();
            int totalCount = courses.get(i).getTotalCourse();
            courseHash.put(courseName, totalCount);
        }
        
        
        //Start the pdf
       //Create the database object
         JFileChooser dialog = new JFileChooser();
            dialog.setSelectedFile(new File("StudentIform.pdf"));
            int dialogResult = dialog.showSaveDialog(null);
            if (dialogResult==JFileChooser.APPROVE_OPTION){
            try {
                String filePath = dialog.getSelectedFile().getPath();
                
                
                //Create the document
                
                Document document = new Document();
                PdfWriter myWritter = PdfWriter.getInstance(document, new FileOutputStream(filePath));
                PdfPTable table = new PdfPTable(5);
                document.open();
                
                float[] columnWidths =new float[] {2,2,2,2,2};
                table.setWidths(columnWidths);
                table.setWidthPercentage(100);
                
                document.add(new Paragraph("=========================ALL STUDENTS INFORMATION======================= "));
                document.add(new Paragraph("\n"));
                table.addCell(new PdfPCell(new Paragraph("STUDENT ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Course Code",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Total",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Total Classes",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Percentage of Atttendance",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));

                //Get the iterator
                
                Iterator passThroughMe = studentHash.entrySet().iterator();
                
                while(passThroughMe.hasNext()){
                    int i = 0;
                    Map.Entry mapElement = (Map.Entry)passThroughMe.next();
                   System.out.println(courseHash.get(mapElement.getKey()));
                   
                    
                    float counts = (int)mapElement.getValue();
                    float countCourses = courseHash.get(mapElement.getKey());
                    table.addCell(new PdfPCell(new Paragraph( studentNumber ,FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(String.valueOf(mapElement.getKey()) ,FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(String.valueOf(counts),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(String.valueOf(countCourses),
                            FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                   
                   // the percentage of attendance 
                   float percent = (counts/countCourses) * 100;
                   System.out.println(percent);
                    table.addCell(new PdfPCell(new Paragraph(String.valueOf(percent + "%"),
                            FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    i++;
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
    }
    
    private void printAllStudents() throws Exception{
           //Create the database object
         JFileChooser dialog = new JFileChooser();
            dialog.setSelectedFile(new File("StudentIform.pdf"));
            int dialogResult = dialog.showSaveDialog(null);
            if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();
            
            Database db = new Database();
            List<Students> student = db.studentInfo();

            //Create the document 

            Document document = new Document();
            PdfWriter myWritter = PdfWriter.getInstance(document, new FileOutputStream(filePath));
            PdfPTable table = new PdfPTable(6);
            document.open();
            
            float[] columnWidths =new float[] {2,2,2,2,2,2};
            table.setWidths(columnWidths);
            table.setWidthPercentage(100);
            
            document.add(new Paragraph("=========================ALL STUDENTS INFORMATION======================= "));
            document.add(new Paragraph("\n"));
            table.addCell(new PdfPCell(new Paragraph("STUDENT ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("STUDENT NAME",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("PROGRAM",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("YEAR OF STUDY", FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("GENDER", FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("DATE OF BIRTH", FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
            
            for(int i =0; i< student.size(); i++){
             table.addCell(new PdfPCell(new Paragraph( student.get(i).getStudentName() ,FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
             table.addCell(new PdfPCell(new Paragraph(student.get(i).getStudentNumber(),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
             table.addCell(new PdfPCell(new Paragraph(student.get(i).getProgram(),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
             table.addCell(new PdfPCell(new Paragraph(student.get(i).getYearOfStudy(),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
             table.addCell(new PdfPCell(new Paragraph(student.get(i).getGender(),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
             table.addCell(new PdfPCell(new Paragraph(student.get(i).getDob(),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
             
            }
          document.add(table);
          
          //Create a pie chart for the gender 
         
          document.close();
            
        }
    }
    
    private JFreeChart generatePieChart(){
        DefaultPieDataset dataSet = new DefaultPieDataset();
		dataSet.setValue("China", 19.64);
		dataSet.setValue("India", 17.3);
		dataSet.setValue("United States", 4.54);
		dataSet.setValue("Indonesia", 3.4);
		dataSet.setValue("Brazil", 2.83);
		dataSet.setValue("Pakistan", 2.48);
		dataSet.setValue("Bangladesh", 2.38);

		JFreeChart chart = ChartFactory.createPieChart(
				"World Population by countries", dataSet, true, true, false);

		return chart;
    }
    
    
    private void getAllCourses() throws Exception {
            JFileChooser dialog = new JFileChooser();
            dialog.setSelectedFile(new File("AllCourses.pdf"));
            int dialogResult = dialog.showSaveDialog(null);
            if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();
            
            
              Database db = new Database();
            
             List<Courses> courses = db.getAllCourses();

            //Create the document 

            Document document = new Document();
            PdfWriter myWritter = PdfWriter.getInstance(document, new FileOutputStream(filePath));
            PdfPTable table = new PdfPTable(2);
            document.open();
            
            float[] columnWidths =new float[] {2,2};
            table.setWidths(columnWidths);
            table.setWidthPercentage(100);
            
            document.add(new Paragraph("=========================ALL COURSES======================= "));
            table.addCell(new PdfPCell(new Paragraph("COURSE NAME",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("COURSE CODE",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
            
            
            for(int i =0; i< courses.size(); i++){
             table.addCell(new PdfPCell(new Paragraph( courses.get(i).getCourseName() ,FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
             table.addCell(new PdfPCell(new Paragraph(courses.get(i).getCourseCode(),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
             
            }
            document.add(table);
            document.close();
            
            
            }
      
    }
    
    
    private void attendance(){
        
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField studentNumber;
    private javax.swing.JComboBox typeOfReport;
    // End of variables declaration//GEN-END:variables
}
