/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brokerclient;

import currency.Currency;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author samue
 */




public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI(String userName) {
        initComponents();
        populateCurrencies();
        userLabel.setText("" + userName);
        updateUserDetails();
        updateStockInformation();
        spinner.addChangeListener(listener);
       

        
    }
    
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        popupMenu1 = new java.awt.PopupMenu();
        jColorChooser1 = new javax.swing.JColorChooser();
        jDialog1 = new javax.swing.JDialog();
        jSpinner2 = new javax.swing.JSpinner();
        jMenuItem1 = new javax.swing.JMenuItem();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        filterBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        rangeField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        toCurrency = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spinner = new javax.swing.JSpinner();
        buyButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        OriginalCurrency = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        userLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        sellAmountObject = new javax.swing.JSpinner();
        userLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

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

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame2.setMinimumSize(new java.awt.Dimension(100, 100));
        jInternalFrame2.setPreferredSize(new java.awt.Dimension(875, 600));
        jInternalFrame2.setVisible(true);
        jInternalFrame2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Companies");
        jInternalFrame2.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Detail Box");
        jInternalFrame2.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        filterBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Show All", "Highest Price", "Lowest Price", "Less than", "Greater than", "Name" }));
        filterBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filterBoxItemStateChanged(evt);
            }
        });
        filterBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterBoxActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(filterBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Filter By");
        jInternalFrame2.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Purchase History");
        jInternalFrame2.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, -1, -1));

        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jList2);

        jInternalFrame2.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 137, 134));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rangeField.setEditable(false);
        rangeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rangeField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(rangeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 90, -1));

        jLabel9.setText("Range: ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jLabel11.setText("USD ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, -1));

        jInternalFrame2.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 250, 40));

        descriptionArea.setEditable(false);
        descriptionArea.setColumns(20);
        descriptionArea.setRows(5);
        jScrollPane2.setViewportView(descriptionArea);

        jInternalFrame2.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 304, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Currency");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        toCurrency.setToolTipText("");
        toCurrency.setMaximumSize(new java.awt.Dimension(100, 32767));
        toCurrency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toCurrencyActionPerformed(evt);
            }
        });
        jPanel1.add(toCurrency, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 180, -1));

        jLabel10.setText("To");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Quanitity");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        spinner.setEditor(new javax.swing.JSpinner.NumberEditor(spinner, ""));
        jPanel1.add(spinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 64, 30));

        buyButton.setText("Buy");
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });
        jPanel1.add(buyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jTextPane1.setEditable(false);
        jScrollPane3.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 140, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("PURCHASE STOCK            ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 230, -1));

        jButton4.setText("Sell");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        OriginalCurrency.setEditable(false);
        OriginalCurrency.setText("USD");
        jScrollPane5.setViewportView(OriginalCurrency);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 50, 40));

        jButton2.setText("refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 100, -1));

        jInternalFrame2.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 670, 250));

        userLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userLabel.setText("      ");
        jInternalFrame2.getContentPane().add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Import");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 41));

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 200));

        jInternalFrame2.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, 280));

        sellAmountObject.setEditor(new javax.swing.JSpinner.NumberEditor(sellAmountObject, ""));
        jInternalFrame2.getContentPane().add(sellAmountObject, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 64, 30));

        userLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userLabel1.setText("User :");
        jInternalFrame2.getContentPane().add(userLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel12.setText("Last update: ");
        jInternalFrame2.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));
        jInternalFrame2.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        status.setText("N/a");
        jInternalFrame2.getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        getContentPane().add(jInternalFrame2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void filterBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterBoxActionPerformed
        // TODO add your handling code here:
        DefaultListModel companyList = new DefaultListModel();
        String filter = filterBox.getSelectedItem().toString();
        switch (filter) {
            case "Show All":
                rangeField.setEditable(false);
                companyList = new DefaultListModel();
                for (int index = 0; index < repository.size(); index++) {
                    companyList.addElement(repository.get(index).getCompanyname());
                }
                jList1.setModel(companyList);
                break;
            case "Highest Price":
                rangeField.setEditable(false);
                double highestPrice = 0;
                int index = 0;
                for (int i = 0; i < repository.size(); i++) {
                    if (repository.get(i).getShares().getPrice() > highestPrice) {
                        highestPrice = repository.get(i).getShares().getPrice();
                        index = i;
                    }

                }
                companyList = new DefaultListModel();
                companyList.addElement(repository.get(index).getCompanyname());
                jList1.setModel(companyList);

                break;
            case "Lowest Price":
                double lowestPrice = 0;
                index = 0;
                for (int i = 0; i < repository.size(); i++) {
                    if (repository.get(i).getShares().getPrice() < lowestPrice) {
                        highestPrice = repository.get(i).getShares().getPrice();
                        index = i;
                    }
                }
                companyList = new DefaultListModel();
                companyList.addElement(repository.get(index).getCompanyname());
                jList1.setModel(companyList);
                break;
            case "Less than":
                rangeField.setEditable(true);
                break;
            case "Greater than":
                rangeField.setEditable(true);
                break;
            case "Name":
                rangeField.setEditable(true);
                break;
                
                
        }

    }//GEN-LAST:event_filterBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        updateStockInformation();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void updateUserDetails() {
        DefaultListModel userDetailModel = new DefaultListModel();
        String name = userLabel.getText();
        UserID myInfo = controller.getUserDetails(name);

        for (int index = 0; index < myInfo.getMyShare().getShareList().size(); index++) {
            if (myInfo.getMyShare().getShareList().get(index).getQuantity() > 0) {
                userDetailModel.addElement(myInfo.getMyShare().getShareList().get(index).getCompanyName());
            }
        }
        jList2.setModel(userDetailModel);

    }

    private void updateStockInformation() {
        DefaultListModel companyList = new DefaultListModel();

        repository = controller.getCompanienames();

        for (int index = 0; index < repository.size(); index++) {
            companyList.addElement(repository.get(index).getCompanyname());
        }
        jList1.setModel(companyList);
    }


    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
       // updateStockInformation();
        loadCompanyDetails();

    }//GEN-LAST:event_jList1MouseClicked

    private void loadCompanyDetails() {
        String company = jList1.getSelectedValue();

        jTextPane1.setText("");

        spinner.setValue(0);

        String stockAmount = "";
        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).getCompanyname() == company) {
                descriptionArea.setText("Company name: " + repository.get(i).getCompanyname() + "\nSymbol: "
                        + repository.get(i).getSymbol() + "\nAvailable Stocks: " + repository.get(i).getShareAmount() + "\nPrice: " + repository.get(i).shares.getPrice()
                        + "\nLast updated: " + repository.get(i).getShares().getLastUpdate());
                sharePrice = repository.get(i).shares.getPrice();
                OriginalCurrency.setText(repository.get(i).getShares().getCurrency());
                //Sets the companyStockLimit when the customer selects on a company
                companyStockLimit = repository.get(i).getShareAmount();

            }

        }

    }


    private void filterBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filterBoxItemStateChanged

    }//GEN-LAST:event_filterBoxItemStateChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        DefaultListModel companyList = new DefaultListModel();
        String filter = filterBox.getSelectedItem().toString();

        try {
            if (filter.equals("Less than")) {
                int range = Integer.parseInt(rangeField.getText());
                for (int i = 0; i < repository.size(); i++) {
                    if (range > repository.get(i).getShares().getPrice()) {
                        companyList.addElement(repository.get(i).getCompanyname());
                    }
                }
                jList1.setModel(companyList);
            } else if (filter.equals("Greater than")) {
                int range = Integer.parseInt(rangeField.getText());
                for (int i = 0; i < repository.size(); i++) {
                    if (range < repository.get(i).getShares().getPrice()) {
                        companyList.addElement(repository.get(i).getCompanyname());
                    }

                }
                jList1.setModel(companyList);
            } else {
                String name = rangeField.getText();
                for (int i = 0; i < repository.size(); i++) {
                    if (name.equals(repository.get(i).getCompanyname())) {
                        companyList.addElement(repository.get(i).getCompanyname());
                    }
                    jList1.setModel(companyList);
                }

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Numbers only");
        }

    }//GEN-LAST:event_jButton5ActionPerformed


    private void toCurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toCurrencyActionPerformed
        spinner.setValue(0);
    }//GEN-LAST:event_toCurrencyActionPerformed


    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        String company = jList1.getSelectedValue();
        String amount = spinner.getValue().toString();

        //JOptionPane.showMessageDialog(this, userLabel.getText());
        if (Integer.parseInt(amount) > companyStockLimit) {
            JOptionPane.showMessageDialog(this, "Exceeding the limi");
        } else {

            if (controller.buyShares(userLabel.getText(), company, amount)) {
                updateStockInformation();
                JOptionPane.showMessageDialog(this, "Transaction was successful");
                updateUserDetails();
                jList1.clearSelection();
                spinner.setValue(0);
                lastUpate = date.toString();
                status.setText(lastUpate);
            } else {
                JOptionPane.showMessageDialog(this, "Transaction was unsuccessful please\nCheck company details ");
                updateStockInformation();
            }
        }

    }//GEN-LAST:event_buyButtonActionPerformed

    ChangeListener listener = new ChangeListener() {

        public void stateChanged(ChangeEvent e) {

            DecimalFormat df = new DecimalFormat("#,##0.00");

            if (newRate == 0) {
                JOptionPane.showMessageDialog(rootPane, "load currency exchange rate");

            } else {
                double i = Integer.parseInt(spinner.getValue().toString());
                String newAmount = df.format((i * sharePrice) * newRate);
                jTextPane1.setText(newAmount);
            }
        }
    };


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String currencyOne = OriginalCurrency.getText().trim();
        String currencyTwo = toCurrency.getSelectedItem().toString().substring(0, 3);

        newRate = currencyClient.getConversionRate(currencyOne, currencyTwo);
        JOptionPane.showMessageDialog(this, newRate);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String myCompanyStock = jList2.getSelectedValue();
        String myUsername = userLabel.getText();
        int sellAmount = Integer.parseInt(sellAmountObject.getValue().toString());

        String information = myCompanyStock + " " + myUsername + " " + sellAmount;
        if (sellAmount > sellLimit) {
            JOptionPane.showMessageDialog(this, "You don't have " + sellAmount + " shares your limit is" + sellLimit);
        } else {
            JOptionPane.showMessageDialog(this, controller.sellStock(myUsername, myCompanyStock, sellAmount));
            updateUserDetails();
            updateStockInformation();
            sellAmountObject.setValue(0);
            lastUpate = date.toString();
            status.setText(lastUpate);
        }
        jList2.clearSelection();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
        // TODO add your handling code here:
        String stockName = jList2.getSelectedValue();

        String name = userLabel.getText();
        myInfo = controller.getUserDetails(name);
        descriptionArea.setText("");
        for (int i = 0; i < myInfo.getMyShare().getShareList().size(); i++) {
            //  JOptionPane.showMessageDialog(this, myInfo.getMyShare().shareList.get(i).getCompanyName());
            if (myInfo.getMyShare().shareList.get(i).getCompanyName().equals(stockName)) {
                descriptionArea.setText("Company name: " + myInfo.getMyShare().shareList.get(i).getCompanyName()
                        + "\nAmount owned "
                        + myInfo.getMyShare().shareList.get(i).getQuantity());

                //Sets the max sell limit
                sellLimit = myInfo.getMyShare().shareList.get(i).getQuantity();
                // JOptionPane.showMessageDialog(this, stockName);
            }
        }
    }//GEN-LAST:event_jList2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        boolean changeFormat = controller.logOut(userLabel.getText());

        if (changeFormat) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    dispose();
                    new LoginForm().setVisible(true);

                }
            });
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public void populateCurrencies() {
        toCurrency.removeAllItems();
        for (int i = 0; i < currencyClient.currencySymbols.size(); i++) {
            toCurrency.addItem(currencyClient.currencySymbols.get(i));
        }

    }
  public static void main(String args[]){

}

    
    

    static Date date = new Date();
    static String lastUpate = "";
    private int companyStockLimit;
    private int sellLimit;
    private UserID myInfo;
    private double sharePrice;
    private String stockAmount = "";
    BrokerClient client = new BrokerClient();
    List<Company> repository = new ArrayList<Company>();
    user_Interface controller = new user_Interface();
    double newRate = 0;
    Currency currencyClient = new Currency();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane OriginalCurrency;
    private javax.swing.JButton buyButton;
    private javax.swing.JTextArea descriptionArea;
    private javax.swing.JComboBox<String> filterBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextPane jTextPane1;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextField rangeField;
    private javax.swing.JSpinner sellAmountObject;
    private javax.swing.JSpinner spinner;
    private javax.swing.JLabel status;
    private javax.swing.JComboBox<String> toCurrency;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel1;
    // End of variables declaration//GEN-END:variables
}
