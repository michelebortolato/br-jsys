package brjsys.GUI2;

/*
 * GUI.java
 *
 * Created on 22 febbraio 2008, 16.20
 */

/**
 *
 * @author  main
 */
import java.util.Arrays;
import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {
    
    /** Creates new form GUI */
    public GUI() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainGui = new javax.swing.JFrame();
        jButton_Inserisci = new javax.swing.JButton();
        jButton_Rimuovi = new javax.swing.JButton();
        jButton_Sandbox = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_File = new javax.swing.JMenu();
        jMenuItem_Exit = new javax.swing.JMenuItem();
        jMenu_Help = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        Sandbox = new javax.swing.JFrame();
        PannelloQuery = new javax.swing.JTabbedPane();
        jScrollPane_Query = new javax.swing.JScrollPane();
        TextAreaQuery = new javax.swing.JTextArea();
        PannelloRisultati = new javax.swing.JTabbedPane();
        jScrollPane_Ris = new javax.swing.JScrollPane();
        TextAreaRisultati = new javax.swing.JTextArea();
        jButton_Esegui = new javax.swing.JButton();
        InsertGui = new javax.swing.JFrame();
        jLabel_Nome = new javax.swing.JLabel();
        jTextField_Nome = new javax.swing.JTextField();
        jLabel_BOAss = new javax.swing.JLabel();
        jTextField_BOAss = new javax.swing.JTextField();
        jLabel_Reg = new javax.swing.JLabel();
        jLabel_Comm = new javax.swing.JLabel();
        jButton_Val = new javax.swing.JButton();
        jScrollPane_Reg = new javax.swing.JScrollPane();
        jTextArea_Reg = new javax.swing.JTextArea();
        jScrollPane_Comm = new javax.swing.JScrollPane();
        jTextArea_Comm = new javax.swing.JTextArea();
        RemGui = new javax.swing.JFrame();
        jTextField_Cerca = new javax.swing.JTextField();
        jButton_RimBR = new javax.swing.JButton();
        jButton_Cerca = new javax.swing.JButton();
        jScrollPane_BR = new javax.swing.JScrollPane();
        jList_BR = new javax.swing.JList();
        jTabbedPane_Dettagli = new javax.swing.JTabbedPane();
        jPanel_DettInt = new javax.swing.JPanel();
        jLabel_DNome = new javax.swing.JLabel();
        jLabel_DBOAss = new javax.swing.JLabel();
        jLabel_DReg = new javax.swing.JLabel();
        jLabel_DComm = new javax.swing.JLabel();
        jScrollPane_DReg = new javax.swing.JScrollPane();
        jTextArea_DReg = new javax.swing.JTextArea();
        jTextField_DBOAss = new javax.swing.JTextField();
        jTextField_DNome = new javax.swing.JTextField();
        jScrollPane_DComm = new javax.swing.JScrollPane();
        jTextArea_DComm = new javax.swing.JTextArea();
        jPassword_Password = new javax.swing.JPasswordField();
        JText_Username = new javax.swing.JTextField();
        jLabel_Username = new javax.swing.JLabel();
        jLabel_Password = new javax.swing.JLabel();
        jButton_Entra = new javax.swing.JButton();

        MainGui.setTitle("Brjsys");

        jButton_Inserisci.setText("Inserisci Business Rule");
        jButton_Inserisci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InserisciActionPerformed(evt);
            }
        });

        jButton_Rimuovi.setText("Rimuovi Business Rule");
        jButton_Rimuovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RimuoviActionPerformed(evt);
            }
        });

        jButton_Sandbox.setText("Sandbox");
        jButton_Sandbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SandboxActionPerformed(evt);
            }
        });

        jMenu_File.setText("File");

        jMenuItem_Exit.setText("Exit");
        jMenu_File.add(jMenuItem_Exit);

        jMenuBar1.add(jMenu_File);

        jMenu_Help.setText("Help");

        jMenuItem1.setText("About");
        jMenu_Help.add(jMenuItem1);

        jMenuBar1.add(jMenu_Help);

        javax.swing.GroupLayout MainGuiLayout = new javax.swing.GroupLayout(MainGui.getContentPane());
        MainGui.getContentPane().setLayout(MainGuiLayout);
        MainGuiLayout.setHorizontalGroup(
            MainGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainGuiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_Sandbox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MainGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton_Inserisci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Rimuovi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainGuiLayout.setVerticalGroup(
            MainGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainGuiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Inserisci)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Rimuovi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Sandbox, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        Sandbox.setBackground(new java.awt.Color(184, 207, 215));

        PannelloQuery.setBackground(new java.awt.Color(184, 207, 215));

        TextAreaQuery.setBackground(new java.awt.Color(255, 255, 204));
        TextAreaQuery.setColumns(20);
        TextAreaQuery.setRows(5);
        jScrollPane_Query.setViewportView(TextAreaQuery);

        PannelloQuery.addTab("Query", jScrollPane_Query);

        PannelloRisultati.setBackground(new java.awt.Color(184, 207, 215));

        TextAreaRisultati.setBackground(new java.awt.Color(255, 255, 204));
        TextAreaRisultati.setColumns(20);
        TextAreaRisultati.setRows(5);
        jScrollPane_Ris.setViewportView(TextAreaRisultati);

        PannelloRisultati.addTab("Risultati", jScrollPane_Ris);

        jButton_Esegui.setText("Esegui");

        javax.swing.GroupLayout SandboxLayout = new javax.swing.GroupLayout(Sandbox.getContentPane());
        Sandbox.getContentPane().setLayout(SandboxLayout);
        SandboxLayout.setHorizontalGroup(
            SandboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PannelloRisultati, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
            .addComponent(jButton_Esegui, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
            .addComponent(PannelloQuery, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );
        SandboxLayout.setVerticalGroup(
            SandboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SandboxLayout.createSequentialGroup()
                .addComponent(PannelloQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Esegui, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PannelloRisultati, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        InsertGui.setBackground(new java.awt.Color(255, 255, 204));

        jLabel_Nome.setText("Nome");

        jTextField_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NomeActionPerformed(evt);
            }
        });

        jLabel_BOAss.setText("BO Associato");

        jLabel_Reg.setText("Regola");

        jLabel_Comm.setText("Commento");

        jButton_Val.setText("VALIDA");
        jButton_Val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ValActionPerformed(evt);
            }
        });

        jTextArea_Reg.setColumns(20);
        jTextArea_Reg.setRows(5);
        jScrollPane_Reg.setViewportView(jTextArea_Reg);

        jTextArea_Comm.setColumns(20);
        jTextArea_Comm.setRows(5);
        jScrollPane_Comm.setViewportView(jTextArea_Comm);

        javax.swing.GroupLayout InsertGuiLayout = new javax.swing.GroupLayout(InsertGui.getContentPane());
        InsertGui.getContentPane().setLayout(InsertGuiLayout);
        InsertGuiLayout.setHorizontalGroup(
            InsertGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InsertGuiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InsertGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_Val, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .addGroup(InsertGuiLayout.createSequentialGroup()
                        .addGroup(InsertGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Nome)
                            .addComponent(jLabel_BOAss)
                            .addComponent(jLabel_Reg)
                            .addComponent(jLabel_Comm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InsertGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane_Reg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(jTextField_BOAss, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(jTextField_Nome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(jScrollPane_Comm, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))))
                .addContainerGap())
        );
        InsertGuiLayout.setVerticalGroup(
            InsertGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InsertGuiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InsertGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Nome)
                    .addComponent(jTextField_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InsertGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_BOAss)
                    .addComponent(jTextField_BOAss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InsertGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Reg)
                    .addComponent(jScrollPane_Reg, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InsertGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Comm)
                    .addComponent(jScrollPane_Comm, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField_Cerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CercaActionPerformed(evt);
            }
        });

        jButton_RimBR.setText("RIMUOVI SELEZIONATE");
        jButton_RimBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RimBRActionPerformed(evt);
            }
        });

        jButton_Cerca.setText("CERCA BUSINESS RULE");
        jButton_Cerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CercaActionPerformed(evt);
            }
        });

        jList_BR.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane_BR.setViewportView(jList_BR);

        jLabel_DNome.setText("Nome");

        jLabel_DBOAss.setText("BO Associato");

        jLabel_DReg.setText("Regola");

        jLabel_DComm.setText("Commento");

        jTextArea_DReg.setColumns(20);
        jTextArea_DReg.setRows(5);
        jScrollPane_DReg.setViewportView(jTextArea_DReg);

        jTextField_DNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_DNomeActionPerformed(evt);
            }
        });

        jTextArea_DComm.setColumns(20);
        jTextArea_DComm.setRows(5);
        jScrollPane_DComm.setViewportView(jTextArea_DComm);

        javax.swing.GroupLayout jPanel_DettIntLayout = new javax.swing.GroupLayout(jPanel_DettInt);
        jPanel_DettInt.setLayout(jPanel_DettIntLayout);
        jPanel_DettIntLayout.setHorizontalGroup(
            jPanel_DettIntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DettIntLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_DettIntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_DReg)
                    .addComponent(jLabel_DBOAss)
                    .addComponent(jLabel_DNome)
                    .addComponent(jLabel_DComm))
                .addGap(10, 10, 10)
                .addGroup(jPanel_DettIntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane_DComm, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                    .addComponent(jScrollPane_DReg, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                    .addComponent(jTextField_DBOAss, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                    .addComponent(jTextField_DNome, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_DettIntLayout.setVerticalGroup(
            jPanel_DettIntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DettIntLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_DettIntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_DNome)
                    .addComponent(jTextField_DNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_DettIntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_DBOAss)
                    .addComponent(jTextField_DBOAss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_DettIntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_DReg)
                    .addComponent(jScrollPane_DReg, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_DettIntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_DComm)
                    .addComponent(jScrollPane_DComm, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane_Dettagli.addTab("Details", jPanel_DettInt);

        javax.swing.GroupLayout RemGuiLayout = new javax.swing.GroupLayout(RemGui.getContentPane());
        RemGui.getContentPane().setLayout(RemGuiLayout);
        RemGuiLayout.setHorizontalGroup(
            RemGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RemGuiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RemGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane_Dettagli, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addGroup(RemGuiLayout.createSequentialGroup()
                        .addComponent(jTextField_Cerca, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Cerca, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane_BR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addComponent(jButton_RimBR, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE))
                .addContainerGap())
        );
        RemGuiLayout.setVerticalGroup(
            RemGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RemGuiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RemGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Cerca, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Cerca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane_BR, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane_Dettagli, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_RimBR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LoginGUI");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("LoginGUI"); // NOI18N

        jPassword_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassword_PasswordActionPerformed(evt);
            }
        });

        JText_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JText_UsernameActionPerformed(evt);
            }
        });

        jLabel_Username.setText("Username");

        jLabel_Password.setText("Password");

        jButton_Entra.setText("Entra");
        jButton_Entra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EntraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton_Entra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Username)
                            .addComponent(jLabel_Password))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JText_Username)
                            .addComponent(jPassword_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Username)
                    .addComponent(JText_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Password)
                    .addComponent(jPassword_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Entra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPassword_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassword_PasswordActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jPassword_PasswordActionPerformed

    private void jButton_EntraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EntraActionPerformed
        // TODO add your handling code here:
        
        String cmd = evt.getActionCommand();
        
        char[] inputP = jPassword_Password.getPassword();
        String inputU = JText_Username.getText();
        
        if (isUsernameCorrect(inputU) && isPasswordCorrect(inputP)) {
            System.out.println("PASSWORD OK");
            MainGui.pack();
            MainGui.setVisible(true);            
        } else {
            System.out.println("PASSWORD ERRATA");
            //custom title, error icon
            JOptionPane.showMessageDialog(this,"Username o Password errati.","Login error",JOptionPane.ERROR_MESSAGE);
        }

        //Zero out the possible password, for security.
        Arrays.fill(inputP, '0');

        jPassword_Password.selectAll();
        //resetFocus();
}//GEN-LAST:event_jButton_EntraActionPerformed

    //METODI AGGIUNTI
    
   private static boolean isUsernameCorrect(String input) {
        boolean isCorrect = true;

        if (input.equals("admin")) {
        isCorrect = true;
        } else {
        isCorrect = false;
        }
        return isCorrect;
    }
    
    private static boolean isPasswordCorrect(char[] input) {
        boolean isCorrect = true;
        char[] correctPassword = { 'p', 'a', 's', 's', 'w', 'o', 'r', 'd' };

        if (input.length != correctPassword.length) {
        isCorrect = false;
        } else {
        isCorrect = Arrays.equals (input, correctPassword);
        }
        //Zero out the password.
        Arrays.fill(correctPassword,'0');
        return isCorrect;
    }
    
    private void jButton_RimuoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RimuoviActionPerformed
        // TODO add your handling code here:
        RemGui.pack();
        RemGui.setVisible(true); 
}//GEN-LAST:event_jButton_RimuoviActionPerformed

    private void JText_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JText_UsernameActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_JText_UsernameActionPerformed

    private void jButton_InserisciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InserisciActionPerformed
        // TODO add your handling code here:
        InsertGui.pack();
        InsertGui.setVisible(true); 
}//GEN-LAST:event_jButton_InserisciActionPerformed

    private void jButton_SandboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SandboxActionPerformed
        // TODO add your handling code here:
        Sandbox.pack();
        Sandbox.setVisible(true); 
    }//GEN-LAST:event_jButton_SandboxActionPerformed

    private void jButton_ValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ValActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton_ValActionPerformed

    private void jButton_CercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CercaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton_CercaActionPerformed

    private void jTextField_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NomeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField_NomeActionPerformed

    private void jButton_RimBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RimBRActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton_RimBRActionPerformed

    private void jTextField_CercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CercaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField_CercaActionPerformed

    private void jTextField_DNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_DNomeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField_DNomeActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame InsertGui;
    private javax.swing.JTextField JText_Username;
    private javax.swing.JFrame MainGui;
    private javax.swing.JTabbedPane PannelloQuery;
    private javax.swing.JTabbedPane PannelloRisultati;
    private javax.swing.JFrame RemGui;
    private javax.swing.JFrame Sandbox;
    private javax.swing.JTextArea TextAreaQuery;
    private javax.swing.JTextArea TextAreaRisultati;
    private javax.swing.JButton jButton_Cerca;
    private javax.swing.JButton jButton_Entra;
    private javax.swing.JButton jButton_Esegui;
    private javax.swing.JButton jButton_Inserisci;
    private javax.swing.JButton jButton_RimBR;
    private javax.swing.JButton jButton_Rimuovi;
    private javax.swing.JButton jButton_Sandbox;
    private javax.swing.JButton jButton_Val;
    private javax.swing.JLabel jLabel_BOAss;
    private javax.swing.JLabel jLabel_Comm;
    private javax.swing.JLabel jLabel_DBOAss;
    private javax.swing.JLabel jLabel_DComm;
    private javax.swing.JLabel jLabel_DNome;
    private javax.swing.JLabel jLabel_DReg;
    private javax.swing.JLabel jLabel_Nome;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_Reg;
    private javax.swing.JLabel jLabel_Username;
    private javax.swing.JList jList_BR;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem_Exit;
    private javax.swing.JMenu jMenu_File;
    private javax.swing.JMenu jMenu_Help;
    private javax.swing.JPanel jPanel_DettInt;
    private javax.swing.JPasswordField jPassword_Password;
    private javax.swing.JScrollPane jScrollPane_BR;
    private javax.swing.JScrollPane jScrollPane_Comm;
    private javax.swing.JScrollPane jScrollPane_DComm;
    private javax.swing.JScrollPane jScrollPane_DReg;
    private javax.swing.JScrollPane jScrollPane_Query;
    private javax.swing.JScrollPane jScrollPane_Reg;
    private javax.swing.JScrollPane jScrollPane_Ris;
    private javax.swing.JTabbedPane jTabbedPane_Dettagli;
    private javax.swing.JTextArea jTextArea_Comm;
    private javax.swing.JTextArea jTextArea_DComm;
    private javax.swing.JTextArea jTextArea_DReg;
    private javax.swing.JTextArea jTextArea_Reg;
    private javax.swing.JTextField jTextField_BOAss;
    private javax.swing.JTextField jTextField_Cerca;
    private javax.swing.JTextField jTextField_DBOAss;
    private javax.swing.JTextField jTextField_DNome;
    private javax.swing.JTextField jTextField_Nome;
    // End of variables declaration//GEN-END:variables
    
}