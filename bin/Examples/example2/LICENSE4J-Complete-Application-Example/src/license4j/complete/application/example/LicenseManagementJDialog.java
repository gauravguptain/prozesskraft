/**
 * This window is for developers; it displays some details about the license.
 */
package license4j.complete.application.example;

import com.license4j.ActivationStatus;
import com.license4j.License;

public class LicenseManagementJDialog extends javax.swing.JDialog {

    // ProductLicense class
    private ProductLicense productLicense;
    // License object
    private License license;

    /**
     * Creates new form LicenseManagementJDialog
     */
    public LicenseManagementJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.setSize(700, 625);
        this.setLocationRelativeTo(parent);

        // initialize productlicense class.
        productLicense = new ProductLicense();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        licenseTypeTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        validationStatusTextField = new javax.swing.JTextField();
        activationStatusTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        usageCountTextField = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        activatedLicenseStringEditorPane = new javax.swing.JEditorPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        licenseStringEditorPane = new javax.swing.JEditorPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        modificationStatusEditorPane = new javax.swing.JEditorPane();
        jLabel8 = new javax.swing.JLabel();
        usageTimejTextField = new javax.swing.JTextField();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("License Management");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("License Information"));

        jLabel1.setText("License Type:");

        licenseTypeTextField.setEditable(false);

        jLabel2.setText("License String:");

        jLabel3.setText("Validation Status:");

        jLabel4.setText("Activation Status:");

        validationStatusTextField.setEditable(false);

        activationStatusTextField.setEditable(false);

        jLabel5.setText("Modification Status:");

        jLabel6.setText("Activated License String:");

        jLabel7.setText("License Usage Count:");

        usageCountTextField.setEditable(false);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        activatedLicenseStringEditorPane.setEditable(false);
        activatedLicenseStringEditorPane.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jScrollPane4.setViewportView(activatedLicenseStringEditorPane);

        licenseStringEditorPane.setEditable(false);
        licenseStringEditorPane.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jScrollPane5.setViewportView(licenseStringEditorPane);

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        modificationStatusEditorPane.setEditable(false);
        modificationStatusEditorPane.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jScrollPane6.setViewportView(modificationStatusEditorPane);

        jLabel8.setText("License Use Time:");

        usageTimejTextField.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(licenseTypeTextField)
                    .addComponent(validationStatusTextField)
                    .addComponent(activationStatusTextField)
                    .addComponent(usageCountTextField)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(usageTimejTextField))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(licenseTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(validationStatusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(activationStatusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(usageCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(usageTimejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        closeButton.setText("Close");
        closeButton.setPreferredSize(new java.awt.Dimension(75, 23));
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // When window is opened, load license and set values in GUI elements.
        if (productLicense.loadLicense()) {
            license = productLicense.validateLicense(false);

            switch (productLicense.getLicenseType()) {
                case 1:
                    licenseTypeTextField.setText("License Text");
                    break;
                case 2:
                    licenseTypeTextField.setText("Floating License Text");
                    break;
                case 3:
                    licenseTypeTextField.setText("License Key");
                    break;
                case 4:
                    licenseTypeTextField.setText("Online License Key");
                    break;
            }

            licenseStringEditorPane.setText(productLicense.getLicenseString());
            licenseStringEditorPane.setCaretPosition(0);
            validationStatusTextField.setText(license.getValidationStatus().toString());

            activationStatusTextField.setText(license.getActivationStatus().toString());
            activatedLicenseStringEditorPane.setText(productLicense.getActivatedLicenseString());
            activatedLicenseStringEditorPane.setCaretPosition(0);

            if (license.getActivationStatus() == ActivationStatus.ACTIVATION_COMPLETED && license.getLicenseText() != null) {
                // Here check if license is modified
                if (license.getUsedModificationKeys() == null) {
                    modificationStatusEditorPane.setText("Not modified");
                } else {
                    // modification keys found, they are separated with spaces, 
                    // replace spaces with a new license and display in GUI.
                    modificationStatusEditorPane.setText("Modified by following keys:\n"
                            + license.getUsedModificationKeys().replace(" ", "\n"));
                }
            } else {
                // License with activation return type license text can only be modified. 
                modificationStatusEditorPane.setText("Not applicable");
            }
            modificationStatusEditorPane.setCaretPosition(0);

            if (productLicense.getLicenseType() == 4 && license.getUseCountAllowed() > 0) {
                // If license is an online license key and use limit is set, display it.
                // use count is increased on each run.
                usageCountTextField.setText(license.getUseCountCurrent()
                        + " / "
                        + license.getUseCountAllowed());
            } else {
                usageCountTextField.setText("Not applicable");
            }
            if (productLicense.getLicenseType() == 4 && license.getUseTimeLimitAllowed() > 0) {
                // If license is an online license key and use time limit is set, display it.
                usageTimejTextField.setText(splitToComponentTimes(license.getUseTimeCurrent())
                        + " / "
                        + splitToComponentTimes(license.getUseTimeLimitAllowed()));
            } else {
                usageTimejTextField.setText("Not applicable");
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private String splitToComponentTimes(long longVal) {
        int h = (int) longVal / 3600;
        int remainder = (int) longVal - h * 3600;
        int m = remainder / 60;
        remainder = remainder - m * 60;
        int s = remainder;

        String hours;
        String minutes;
        String seconds;
        if (h < 10) {
            hours = "0" + String.valueOf(h);
        } else {
            hours = String.valueOf(h);
        }
        if (m < 10) {
            minutes = "0" + String.valueOf(m);
        } else {
            minutes = String.valueOf(m);
        }
        if (s < 10) {
            seconds = "0" + String.valueOf(s);
        } else {
            seconds = String.valueOf(s);
        }

        return hours + ":" + minutes + ":" + seconds;
    }
    /**
     *
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane activatedLicenseStringEditorPane;
    private javax.swing.JTextField activationStatusTextField;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JEditorPane licenseStringEditorPane;
    private javax.swing.JTextField licenseTypeTextField;
    private javax.swing.JEditorPane modificationStatusEditorPane;
    private javax.swing.JTextField usageCountTextField;
    private javax.swing.JTextField usageTimejTextField;
    private javax.swing.JTextField validationStatusTextField;
    // End of variables declaration//GEN-END:variables
}
