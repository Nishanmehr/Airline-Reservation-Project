/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.airline_project;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author nisha
 */
public class GetTicket extends javax.swing.JInternalFrame {

    /**
     * Creates new form GetTicket
     */
    public GetTicket() {
        initComponents();
        this.getContentPane().setBackground(Color.blue);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ticketid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton(); // ✅ Download PDF button
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        firstName = new javax.swing.JLabel();
        flightName = new javax.swing.JLabel();
        departure = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        arrival = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ticket ID");

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Get Ticket");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        // ✅ Download PDF Button
        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setText("Download PDF");
        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setEnabled(false); // Pehle disable, ticket load hone ke baad enable hoga
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jPanel1.setBackground(new java.awt.Color(102, 255, 0));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Thanks For Choosing Nishant Airline");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gender");

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Arrival");

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("First Name");

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Departure");

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contact No.");

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Flight Name");

        lastName.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lastName.setForeground(new java.awt.Color(255, 255, 255));
        lastName.setText("jLabel10");

        gender.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        gender.setForeground(new java.awt.Color(255, 255, 255));
        gender.setText("jLabel10");

        firstName.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        firstName.setForeground(new java.awt.Color(255, 255, 255));
        firstName.setText("jLabel10");

        flightName.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        flightName.setForeground(new java.awt.Color(255, 255, 255));
        flightName.setText("jLabel10");

        departure.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        departure.setForeground(new java.awt.Color(255, 255, 255));
        departure.setText("jLabel10");

        contact.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        contact.setForeground(new java.awt.Color(255, 255, 255));
        contact.setText("jLabel10");

        arrival.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        arrival.setForeground(new java.awt.Color(255, 255, 255));
        arrival.setText("jLabel10");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastName)
                            .addComponent(firstName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 327, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(gender)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(flightName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(29, 29, 29)
                        .addComponent(contact))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(departure)
                            .addComponent(arrival))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(firstName)
                    .addComponent(arrival))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(lastName)
                    .addComponent(departure))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(gender)
                    .addComponent(flightName)
                    .addComponent(contact))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(325, 325, 325)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(ticketid, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(320, 320, 320)
                                .addComponent(jButton1)
                                .addGap(30, 30, 30)
                                .addComponent(jButton2))) // ✅ Download button added next to Get Ticket
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ticketid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)) // ✅ Same row as Get Ticket
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String TicketID = ticketid.getText();

            Connection con;
            PreparedStatement pre;
            ResultSet rs;

            Class.forName("com.mysql.cj.jdbc.Driver");

                String dbPassword = System.getenv("DB_PASSWORD");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/Airline_Project",
                    "root",
                    dbPassword
            );
            pre = con.prepareStatement("SELECT * FROM ticket WHERE TicketID=?");
            pre.setString(1, TicketID);

            rs = pre.executeQuery();
            if (rs.next() != false) {
                firstName.setText(rs.getString("FirstName"));
                lastName.setText(rs.getString("LastName"));
                contact.setText(rs.getString("Contact"));
                gender.setText(rs.getString("Gender"));
                arrival.setText(rs.getString("Arrival"));
                departure.setText(rs.getString("Departure"));

                String s = rs.getString("FlightID");
                PreparedStatement vc = con.prepareStatement("SELECT FlightName FROM Flight WHERE FlightID=?");
                vc.setString(1, s);
                ResultSet vs = vc.executeQuery();
                vs.next();
                flightName.setText(vs.getString("FlightName"));

                // ✅ Ticket load hone ke baad PDF button enable karo
                jButton2.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(null, "Your Ticket ID is Invalid");
                jButton2.setEnabled(false);
            }

        } catch (ClassNotFoundException ex) {
            System.getLogger(GetTicket.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (SQLException ex) {
            System.getLogger(GetTicket.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // ✅ PDF Download Button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            // User se poochho kahan save karna hai
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save Ticket PDF");
            fileChooser.setSelectedFile(new java.io.File("Ticket_" + ticketid.getText() + ".pdf"));

            int userSelection = fileChooser.showSaveDialog(this);
            if (userSelection != JFileChooser.APPROVE_OPTION) return;

            String filePath = fileChooser.getSelectedFile().getAbsolutePath();
            if (!filePath.endsWith(".pdf")) filePath += ".pdf";

            // PDF create karo
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();

            // ── Header ──────────────────────────────────────────
            Font headerFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 22, BaseColor.WHITE);
            Font titleFont  = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16, BaseColor.WHITE);
            Font labelFont  = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, new BaseColor(0, 51, 255));
            Font valueFont  = FontFactory.getFont(FontFactory.HELVETICA, 12, BaseColor.BLACK);

            // Airline name header
            PdfPTable headerTable = new PdfPTable(1);
            headerTable.setWidthPercentage(100);
            PdfPCell headerCell = new PdfPCell(new Phrase("✈  NISHANT AIRLINES", headerFont));
            headerCell.setBackgroundColor(new BaseColor(0, 51, 255));
            headerCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerCell.setPadding(15);
            headerCell.setBorder(Rectangle.NO_BORDER);
            headerTable.addCell(headerCell);
            document.add(headerTable);

            // Subtitle
            PdfPTable subTable = new PdfPTable(1);
            subTable.setWidthPercentage(100);
            PdfPCell subCell = new PdfPCell(new Phrase("BOARDING PASS", titleFont));
            subCell.setBackgroundColor(new BaseColor(0, 102, 204));
            subCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            subCell.setPadding(8);
            subCell.setBorder(Rectangle.NO_BORDER);
            subTable.addCell(subCell);
            document.add(subTable);

            // Space
            document.add(new Paragraph("\n"));

            // ── Ticket ID ────────────────────────────────────────
            Font ticketIdFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14, new BaseColor(0, 51, 255));
            Paragraph ticketPara = new Paragraph("Ticket ID:  " + ticketid.getText(), ticketIdFont);
            ticketPara.setAlignment(Element.ALIGN_CENTER);
            document.add(ticketPara);
            document.add(new Paragraph("\n"));

            // ── Details Table ────────────────────────────────────
            PdfPTable detailsTable = new PdfPTable(2);
            detailsTable.setWidthPercentage(90);
            detailsTable.setSpacingBefore(10f);
            detailsTable.setWidths(new float[]{40f, 60f});

            addTableRow(detailsTable, "First Name",   firstName.getText(),   labelFont, valueFont);
            addTableRow(detailsTable, "Last Name",    lastName.getText(),    labelFont, valueFont);
            addTableRow(detailsTable, "Gender",       gender.getText(),      labelFont, valueFont);
            addTableRow(detailsTable, "Contact No.",  contact.getText(),     labelFont, valueFont);
            addTableRow(detailsTable, "Flight Name",  flightName.getText(),  labelFont, valueFont);
            addTableRow(detailsTable, "Arrival",      arrival.getText(),     labelFont, valueFont);
            addTableRow(detailsTable, "Departure",    departure.getText(),   labelFont, valueFont);

            document.add(detailsTable);
            document.add(new Paragraph("\n\n"));

            // ── Footer ───────────────────────────────────────────
            PdfPTable footerTable = new PdfPTable(1);
            footerTable.setWidthPercentage(100);
            Font footerFont = FontFactory.getFont(FontFactory.HELVETICA_OBLIQUE, 10, BaseColor.WHITE);
            PdfPCell footerCell = new PdfPCell(new Phrase("Thank you for choosing Nishant Airlines! Have a safe flight. ✈", footerFont));
            footerCell.setBackgroundColor(new BaseColor(0, 51, 255));
            footerCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            footerCell.setPadding(10);
            footerCell.setBorder(Rectangle.NO_BORDER);
            footerTable.addCell(footerCell);
            document.add(footerTable);

            document.close();

            JOptionPane.showMessageDialog(null, "✅ Ticket PDF saved successfully!\n" + filePath);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "PDF Error: " + e.getMessage());
        }
    }

    // ── Helper: Table row add karna ──────────────────────────────
    private void addTableRow(PdfPTable table, String label, String value, Font labelFont, Font valueFont) {
        PdfPCell labelCell = new PdfPCell(new Phrase(label, labelFont));
        labelCell.setBackgroundColor(new BaseColor(230, 240, 255));
        labelCell.setPadding(8);
        labelCell.setBorderColor(new BaseColor(200, 200, 200));
        table.addCell(labelCell);

        PdfPCell valueCell = new PdfPCell(new Phrase(value, valueFont));
        valueCell.setPadding(8);
        valueCell.setBorderColor(new BaseColor(200, 200, 200));
        table.addCell(valueCell);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrival;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel departure;
    private javax.swing.JLabel firstName;
    private javax.swing.JLabel flightName;
    private javax.swing.JLabel gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2; // ✅ Download PDF button
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastName;
    private javax.swing.JTextField ticketid;
    // End of variables declaration//GEN-END:variables
}