//*****************************************************************************************************
//
//      File:               ComputerPurchase.java
//
//      Student:            Leon Krugliakov
//
//      Assignment:         Assignment #12
//
//      Course Name:        Java I
//
//      Course Number:      COSC 2050 - 01
//
//      Due:                April 29th, 2020
//
//
//      This is a program that allows the user to make a selection from a 
//      variety of computer components and the program then computes the total
//      cost of the computer. The application is built using Java Swing for the
//      GUI implementation.
//
//      Other files required:
//
//*****************************************************************************************************

//package computer;

//*****************************************************************************************************

import java.text.NumberFormat;

//*****************************************************************************************************

public class ComputerPurchase extends javax.swing.JFrame
{

    public ComputerPurchase() 
    {
        initComponents();
    }

    //*****************************************************************************************************
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        windowsVersion = new javax.swing.ButtonGroup();
        JOptionPane = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        processorType = new javax.swing.JComboBox<>();
        memorySize = new javax.swing.JComboBox<>();
        storageSize = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        windows7Pro = new javax.swing.JRadioButton();
        windows7Ultimate = new javax.swing.JRadioButton();
        officePackageOption = new javax.swing.JCheckBox();
        accountingPackageOption = new javax.swing.JCheckBox();
        graphicsPackageOption = new javax.swing.JCheckBox();
        priceLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        calculateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Computer");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Hardware");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Processor:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Memory:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Disk:");

        processorType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quad Core 3.40GHz", "Quad Core 3.50GHz", "Quad Core 3.60GHz" }));

        memorySize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4GB", "8GB", "16GB", "32GB" }));

        storageSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "500GB", "1TB", "2TB" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Software");

        windowsVersion.add(windows7Pro);
        windows7Pro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        windows7Pro.setSelected(true);
        windows7Pro.setText("Windows 7 Professional");
        windows7Pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                windows7ProActionPerformed(evt);
            }
        });

        windowsVersion.add(windows7Ultimate);
        windows7Ultimate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        windows7Ultimate.setText("Windows 7 Ultimate");

        officePackageOption.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        officePackageOption.setText("Office Package");
        officePackageOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                officePackageOptionActionPerformed(evt);
            }
        });

        accountingPackageOption.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        accountingPackageOption.setText("Accounting Package");

        graphicsPackageOption.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        graphicsPackageOption.setText("Graphics Package");

        priceLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceLabel.setText("Price: ");

        exitButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        calculateButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 29, Short.MAX_VALUE))
                            .addComponent(processorType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(memorySize, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(storageSize, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calculateButton)
                        .addGap(34, 34, 34)
                        .addComponent(exitButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(windows7Pro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(accountingPackageOption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(graphicsPackageOption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(officePackageOption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(windows7Ultimate, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(windows7Pro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(windows7Ultimate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(officePackageOption)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(accountingPackageOption)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(graphicsPackageOption)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exitButton)
                            .addComponent(calculateButton))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(processorType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(memorySize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(storageSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addComponent(priceLabel)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //*****************************************************************************************************
    
    private void windows7ProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_windows7ProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_windows7ProActionPerformed

    //*****************************************************************************************************
    
    private void officePackageOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_officePackageOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_officePackageOptionActionPerformed

    //*****************************************************************************************************
    
    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        double total = COMPUTER_BASE_PRICE;
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        processorTypeValue = (String) processorType.getSelectedItem();
        memorySizeValue = (String) memorySize.getSelectedItem();
        storageSizeValue = (String) storageSize.getSelectedItem();
        operatingSystem = "Windows 7 Professional";
        software = "";
        
        if(windows7Ultimate.isSelected())
        {
            total += 100;
            operatingSystem = "Windows 7 Ultimate";
        }
        
        if(officePackageOption.isSelected())
        {
            total += 400;
            software += "Office Package ";
        }
        
        if(accountingPackageOption.isSelected())
        {
            total += 200;
            software += "Accounting Package ";
        }
        
        if(graphicsPackageOption.isSelected())
        {
            total += 600;
            software += "Graphics Package ";
        }
        
        total += getCostOfItem(processorTypeValue);
        total += getCostOfItem(memorySizeValue);
        total += getCostOfItem(storageSizeValue);
        
        priceLabel.setText("Price: " + nf.format(total));
        
        String message = "You Have Selected:\n" + "Processor: " + 
                processorTypeValue + "\nMemory: " + memorySizeValue 
                + "\nDisk: " + storageSizeValue + "\nOperating System: " + 
                operatingSystem + "\nSoftware: " + software;
        
        String title = "Lineup";
        
        JOptionPane.showMessageDialog(this, message, title, 
                JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_calculateButtonActionPerformed

    //*****************************************************************************************************
    
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    //*****************************************************************************************************
    
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(ComputerPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComputerPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComputerPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComputerPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComputerPurchase().setVisible(true);
            }
        });
        
    }
    
    //*****************************************************************************************************
    
    public double getCostOfItem(String item)
    {
        double costOfItem = 0.0;
        
        switch(item)
        {
            case "Quad Core 3.50GHz":
                costOfItem = 50;
                break;
            case "Quad Core 3.60GHz":
                costOfItem = 150;
                break;
            case "8GB":
                costOfItem = 50;
                break;
            case "16GB":
                costOfItem = 100;
                break;
            case "32GB":
                costOfItem = 150;
                break;
            case "1TB":
                costOfItem = 50;
                break;
            case "2TB":
                costOfItem = 150;
            default:
                costOfItem = 0;
                break;
        }
        
        
        return costOfItem;
    }

    //*****************************************************************************************************
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JOptionPane JOptionPane;
    private javax.swing.JCheckBox accountingPackageOption;
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JCheckBox graphicsPackageOption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> memorySize;
    private javax.swing.JCheckBox officePackageOption;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JComboBox<String> processorType;
    private javax.swing.JComboBox<String> storageSize;
    private javax.swing.JRadioButton windows7Pro;
    private javax.swing.JRadioButton windows7Ultimate;
    private javax.swing.ButtonGroup windowsVersion;
    // End of variables declaration//GEN-END:variables
    private double COMPUTER_BASE_PRICE = 500.00;
    private String memorySizeValue,
            processorTypeValue,
            storageSizeValue,
            windowsVersionValue,
            operatingSystem,
            software;

}
