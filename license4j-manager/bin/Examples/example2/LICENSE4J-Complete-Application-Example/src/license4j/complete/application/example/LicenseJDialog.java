/**
 * This is the main licensing dialog. Users will use this dialog to change,
 * activate deactivate and modify license.
 *
 * In a real application, usually a single type of license is used, but this is
 * a demonstration/example application, so it has support for all license types.
 */
package license4j.complete.application.example;

import com.license4j.ActivationStatus;
import com.license4j.License;
import com.license4j.ModificationStatus;
import com.license4j.ValidationStatus;
import static com.license4j.ValidationStatus.LICENSE_VALID;
import com.license4j.util.FileUtils;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class LicenseJDialog extends javax.swing.JDialog {

    // file chooser to install license text in a file
    private JFileChooser jFileChooser1;
    // ProductLicense class
    private ProductLicense productLicense;
    // License object
    private License license;
    // list of license types, to display in a combo.
    private String[] licenseTypes = {
        "Select License Type",
        "License Text",
        "Floating License Text",
        "Basic License Key",
        "Secure License Key",
        "Online License Key"
    };

    /**
     * Creates new form LicenseJDialog
     */
    public LicenseJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.setLocationRelativeTo(parent);

        // Initialize product license class.
        productLicense = new ProductLicense();

        // Initialize file chooser.
        jFileChooser1 = new JFileChooser();
    }

    /**
     * This method updates GUI elements when license changed, activated,
     * deactivated etc.
     */
    private void updateGUI() {
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

        if (license != null) {
            // Display license validation and activation status in a text field.
            licenseStatusTextField.setText(
                    "Validation: " + license.getValidationStatus()
                    + "\t"
                    + "Activation: " + license.getActivationStatus());

            // Only license text can store user information.
            if (license.getLicenseText() != null) {
                registrationNameTextField.setText(license.getLicenseText().getUserRegisteredTo());
                companyNameTextField.setText(license.getLicenseText().getUserCompany());
            } else {
                registrationNameTextField.setText("");
                companyNameTextField.setText("");
            }

            if (license.getActivationStatus() == ActivationStatus.ACTIVATION_REQUIRED) {
                // disable deactivate button
                deactivateLicenseButton.setEnabled(false);
                // enable activate button
                activateLicenseButton.setText("Activate License");
                activateLicenseButton.setEnabled(true);
            } else if (license.getActivationStatus() == ActivationStatus.ACTIVATION_COMPLETED) {
                // enable deactivate button
                deactivateLicenseButton.setEnabled(true);
                // change activate button and enable
                activateLicenseButton.setText("Re-Activate License");
                activateLicenseButton.setEnabled(true);


                // License can only be modified if activation
                // return type is a license text
                if (productLicense.getActivatedLicenseType() == 1) {
                    modifyLicenseButton.setEnabled(true);
                }
            } else {
                deactivateLicenseButton.setEnabled(false);
                modifyLicenseButton.setEnabled(false);
            }
        } else {
            // no license found
            licenseStatusTextField.setText("LICENSE NOT FOUND");
            registrationNameTextField.setText("");
            companyNameTextField.setText("");

            activateLicenseButton.setEnabled(false);
            modifyLicenseButton.setEnabled(false);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        licenseTypeTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        licenseStatusTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        registrationNameTextField = new javax.swing.JTextField();
        companyNameTextField = new javax.swing.JTextField();
        closejButton = new javax.swing.JButton();
        changeLicenseButton = new javax.swing.JButton();
        modifyLicenseButton = new javax.swing.JButton();
        activateLicenseButton = new javax.swing.JButton();
        deactivateLicenseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("License");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("License Information"));

        jLabel1.setText("License Type:");

        licenseTypeTextField.setEditable(false);

        jLabel2.setText("License Status:");

        licenseStatusTextField.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(licenseTypeTextField)
                    .addComponent(licenseStatusTextField))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(licenseStatusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("User Information"));

        jLabel3.setText("Registration Name:");

        jLabel4.setText("Company Name:");

        registrationNameTextField.setEditable(false);

        companyNameTextField.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registrationNameTextField)
                    .addComponent(companyNameTextField))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(registrationNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(companyNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        closejButton.setText("Close");
        closejButton.setPreferredSize(new java.awt.Dimension(75, 23));
        closejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closejButtonActionPerformed(evt);
            }
        });

        changeLicenseButton.setText("Change License");
        changeLicenseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeLicenseButtonActionPerformed(evt);
            }
        });

        modifyLicenseButton.setText("Modify License");
        modifyLicenseButton.setEnabled(false);
        modifyLicenseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyLicenseButtonActionPerformed(evt);
            }
        });

        activateLicenseButton.setText("Activate License");
        activateLicenseButton.setEnabled(false);
        activateLicenseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activateLicenseButtonActionPerformed(evt);
            }
        });

        deactivateLicenseButton.setText("Deactivate License");
        deactivateLicenseButton.setEnabled(false);
        deactivateLicenseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deactivateLicenseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 170, Short.MAX_VALUE)
                        .addComponent(modifyLicenseButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deactivateLicenseButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(activateLicenseButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeLicenseButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closejButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(closejButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changeLicenseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modifyLicenseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(activateLicenseButton)
                    .addComponent(deactivateLicenseButton))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeLicenseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeLicenseButtonActionPerformed
        // display a combo selection to user.
        String selection = (String) JOptionPane.showInputDialog(null, "Select a license type.", "License Type", JOptionPane.PLAIN_MESSAGE, null, licenseTypes, licenseTypes[0]);
        if (selection != null) {
            if (selection.toString().compareTo("Select License Type") == 0) {
                // No selection
            } else if (selection.compareToIgnoreCase("License Text") == 0) {
                // license text selected.
                jFileChooser1.setMultiSelectionEnabled(false);
                jFileChooser1.setFileSelectionMode(JFileChooser.FILES_ONLY);

                int r = jFileChooser1.showOpenDialog(this);
                if (r == JFileChooser.APPROVE_OPTION) {
                    String licenseTextInFile = null;
                    try {
                        // read selected file.
                        licenseTextInFile = FileUtils.readFile(jFileChooser1.getSelectedFile().getAbsolutePath());

                        // set file contents as license string
                        productLicense.setLicenseString(licenseTextInFile);
                        // set license type
                        productLicense.setLicenseType(1);

                        // validate license text
                        license = productLicense.validateLicense(false);

                        // save license info into config file
                        productLicense.saveLicense();

                        // update gui
                        updateGUI();
                    } catch (IOException ex) {
                        Logger.getLogger(LicenseJDialog.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else if (selection.compareToIgnoreCase("Floating License Text") == 0) {
                // floating license text selected
                // get floating license server information
                String host = new FloatingLicenseServerJDialog(null, true).showDialog();
                if (host != null) {
                    // set hostname and port number
                    productLicense.setHostname(host.substring(0, host.indexOf(":")));
                    productLicense.setPortnumber(Integer.parseInt(host.substring(host.indexOf(":") + 1, host.length())));

                    // validate license
                    license = productLicense.validateLicense(false);

                    // DO NOT SAVE obtained license text from server like here!!!
                    // It is saved to easily display license informatio in GUI.
                    // YOU WILL NEED TO JUST SAVE SERVER INFORMATION, AND LICENSE
                    // WILL BE OBTAINED FROM SERVER WHEN validate METHOD CALLED.
                    productLicense.setLicenseString(license.getLicenseString());
                    productLicense.setLicenseType(2);

                    // save server information to config file
                    productLicense.saveLicense();

                    // update GUI
                    updateGUI();
                }
            } else if (selection.compareToIgnoreCase("Basic License Key") == 0) {
                // basic license key selected
                // get the key
                String key = new ChangeBasicProductKeyJDialog(null, true).showDialog();
                if (key != null) {
                    // set license key and type
                    productLicense.setLicenseString(key);
                    productLicense.setLicenseType(3);

                    // validate license
                    license = productLicense.validateLicense(false);

                    // save
                    productLicense.saveLicense();

                    // udpate GUI
                    updateGUI();
                }
            } else if (selection.compareToIgnoreCase("Secure License Key") == 0) {
                // secure license key selected, 55 characters long
                String key = new ChangeCryptographicProductKeyJDialog(null, true).showDialog();
                if (key != null) {
                    // set license key and type
                    productLicense.setLicenseString(key);
                    productLicense.setLicenseType(3);

                    // validate license
                    license = productLicense.validateLicense(false);

                    // save 
                    productLicense.saveLicense();

                    // update GUI
                    updateGUI();
                }
            } else if (selection.compareToIgnoreCase("Online License Key") == 0) {
                // online license key selected
                String key = new ChangeBasicProductKeyJDialog(null, true).showDialog();
                if (key != null) {
                    // set license key and type
                    productLicense.setLicenseString(key);
                    productLicense.setLicenseType(4);

                    // validate
                    license = productLicense.validateLicense(false);

                    // save
                    productLicense.saveLicense();

                    // update GUI
                    updateGUI();
                }
            }

            /**
             * Get the validation status, and perform required actions.
             *
             * Here, If license is valid, it just continues to run. If
             * ValidationStatus is other than LICENSE_VALID, it just displays a
             * message dialog.
             */
            switch (license.getValidationStatus()) {
                case LICENSE_VALID:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "License error: " + license.getValidationStatus(), "License Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_changeLicenseButtonActionPerformed

    private void closejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closejButtonActionPerformed
        if (license != null && license.getValidationStatus() == ValidationStatus.LICENSE_VALID) {
            // Valid license installed close dialog
            dispose();
        } else {
            // A valid license is not installed, so exit JVM (or another way close application).
            System.exit(-1);
        }
    }//GEN-LAST:event_closejButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (productLicense.loadLicense()) {
            // When window is opened, load and validate license, then update gui.
            license = productLicense.validateLicense(false);

            updateGUI();
        }
    }//GEN-LAST:event_formWindowOpened

    private void activateLicenseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activateLicenseButtonActionPerformed
        // activate button clicked.
        License activatedLicense = productLicense.activateLicense();

        // Basically get the activation status and shows a message dialog
        // You can make anything according to obtained activation status.
        if (activatedLicense.getActivationStatus() == ActivationStatus.ACTIVATION_COMPLETED) {
            license = activatedLicense;

            JOptionPane.showMessageDialog(null, "License activated, see license details.", "License Activated", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Activation error: " + activatedLicense.getActivationStatus(), "Activation Error", JOptionPane.ERROR_MESSAGE);
        }

        updateGUI();
    }//GEN-LAST:event_activateLicenseButtonActionPerformed

    private void modifyLicenseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyLicenseButtonActionPerformed
        // Get the modification key from user.
        String r = JOptionPane.showInputDialog("Type Modification Key");
        if (!r.isEmpty()) {
            // modify license
            License modifiedLicense = productLicense.modifyLicense(r.trim());
            // If it is successfull modified, or alredy modified in case of a volume license, change the license
            // modifyActivation method modifies and returns the new modified license object.
            if (modifiedLicense.getModificationStatus() == ModificationStatus.MODIFICATION_COMPLETED
                    || modifiedLicense.getModificationStatus() == ModificationStatus.MODIFICATION_COMPLETED_PREVIOUSLY) {
                license = modifiedLicense;

                JOptionPane.showMessageDialog(null, "License Modified, see license details.", "License Modified", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Modification error: " + modifiedLicense.getModificationStatus(), "Modification Error", JOptionPane.ERROR_MESSAGE);
            }

            updateGUI();
        }
    }//GEN-LAST:event_modifyLicenseButtonActionPerformed

    private void deactivateLicenseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deactivateLicenseButtonActionPerformed
        // deactivate license, license must be activated before deactivation.
        License deactivatedLicense = productLicense.deactivateLicense();

        if (deactivatedLicense.getActivationStatus() == ActivationStatus.DEACTIVATION_COMPLETED) {
            license = deactivatedLicense;

            // JUST display a message dialog
            JOptionPane.showMessageDialog(null, "License deactivated, see license details.", "License Deactivated", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Deactivation error: " + deactivatedLicense.getActivationStatus(), "Deactivation Error", JOptionPane.ERROR_MESSAGE);
        }

        updateGUI();
    }//GEN-LAST:event_deactivateLicenseButtonActionPerformed
    /**
     *
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activateLicenseButton;
    private javax.swing.JButton changeLicenseButton;
    private javax.swing.JButton closejButton;
    private javax.swing.JTextField companyNameTextField;
    private javax.swing.JButton deactivateLicenseButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField licenseStatusTextField;
    private javax.swing.JTextField licenseTypeTextField;
    private javax.swing.JButton modifyLicenseButton;
    private javax.swing.JTextField registrationNameTextField;
    // End of variables declaration//GEN-END:variables
}