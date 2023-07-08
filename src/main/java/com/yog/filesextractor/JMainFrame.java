package com.yog.filesextractor;

import com.yog.filesextractor.utils.AppConstants;
import com.yog.filesextractor.utils.AppProperties;
import com.yog.filesextractor.utils.UIMessage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author Yougeshwar
 */
@Slf4j
public class JMainFrame extends javax.swing.JFrame {
    private AppProperties appProperties;

    public JMainFrame() {
    }

    public void initView() {
        initComponents();

        appProperties = new AppProperties();
        try {
            appProperties.load();
        } catch (IOException ex) {
            log.error("Unable to load application properties.", ex);
            UIMessage.error(this, "Unable to load application properties.");
        }
        setTitle(String.format("%s V%s", AppConstants.APP_NAME, AppConstants.getAppVersion()));
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jDirTextField1 = new javax.swing.JTextField();
        jSelectButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jDirTextField2 = new javax.swing.JTextField();
        jSelectButton2 = new javax.swing.JButton();
        jProgressBar = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jOutputTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jOutputTextArea2 = new javax.swing.JTextArea();
        jStartButton = new javax.swing.JButton();

        jFileChooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Files Extractor");

        jLabel1.setText("Directory 1");

        jSelectButton1.setText("Select");
        jSelectButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelectButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Directory 2");

        jSelectButton2.setText("Select");
        jSelectButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelectButton2ActionPerformed(evt);
            }
        });

        jProgressBar.setStringPainted(true);

        jPanel1.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jOutputTextArea1.setEditable(false);
        jOutputTextArea1.setColumns(20);
        jOutputTextArea1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jOutputTextArea1.setRows(5);
        jScrollPane1.setViewportView(jOutputTextArea1);

        jPanel1.add(jScrollPane1);

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jOutputTextArea2.setEditable(false);
        jOutputTextArea2.setColumns(20);
        jOutputTextArea2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jOutputTextArea2.setRows(5);
        jScrollPane2.setViewportView(jOutputTextArea2);

        jPanel1.add(jScrollPane2);

        jStartButton.setText("Start");
        jStartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStartButtonActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDirTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSelectButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jProgressBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDirTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSelectButton2)
                            .addComponent(jStartButton))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jSelectButton2, jStartButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jDirTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSelectButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jDirTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSelectButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jStartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jDirTextField1, jDirTextField2, jLabel1, jLabel2, jSelectButton1, jSelectButton2, jStartButton});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSelectButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelectButton1ActionPerformed
        String current = jDirTextField1.getText();
        if (!current.isBlank()) {
            jFileChooser.setCurrentDirectory(new File(current));
        }
        if (jFileChooser.showOpenDialog(this) != JFileChooser.APPROVE_OPTION) {
            return;
        }
        jDirTextField1.setText(jFileChooser.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_jSelectButton1ActionPerformed

    private void jSelectButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelectButton2ActionPerformed
        String current = jDirTextField2.getText();
        if (!current.isBlank()) {
            jFileChooser.setCurrentDirectory(new File(current));
        }
        if (jFileChooser.showOpenDialog(this) != JFileChooser.APPROVE_OPTION) {
            return;
        }
        jDirTextField2.setText(jFileChooser.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_jSelectButton2ActionPerformed

    private void jStartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStartButtonActionPerformed
        new Thread(() -> startComparision()).start();
    }//GEN-LAST:event_jStartButtonActionPerformed

    private void setFieldsEnabled(boolean b) {
        jDirTextField1.setEnabled(b);
        jDirTextField2.setEnabled(b);
        jSelectButton1.setEnabled(b);
        jSelectButton2.setEnabled(b);
        jStartButton.setEnabled(b);
    }

    private void startComparision() {
        setFieldsEnabled(false);
        String dir1 = jDirTextField1.getText();
        String dir2 = jDirTextField2.getText();

        if (dir1.isBlank() || dir2.isBlank()) {
            UIMessage.error(this, "Input directory is empty");
            return;
        }

        File file1 = new File(dir1);
        File file2 = new File(dir2);

        if (!file1.exists() || !file2.exists()) {
            UIMessage.error(this, "Invalid input directory path");
            return;
        }

        try {
            List<String> dir1Files = Files.list(Paths.get(dir1))
                    .map(Path::toFile)
                    .filter(File::isFile)
                    .map(File::getName)
                    .collect(Collectors.toList());
            List<String> dir2Files = Files.list(Paths.get(dir2))
                    .map(Path::toFile)
                    .filter(File::isFile)
                    .map(File::getName)
                    .collect(Collectors.toList());

            int count = 0;
            jProgressBar.setMaximum(dir1Files.size() - 1);
            StringBuilder sb1 = new StringBuilder();
            for (int i = 0; i < dir1Files.size(); i++) {
                String fname = dir1Files.get(i);
                if (!dir2Files.contains(fname)) {
                    sb1.append("> ").append(fname).append("\n");
                    count++;
                }
                jProgressBar.setValue(i + 1);
            }
            sb1.insert(0, "-- Extra files in directory 1 --\nCount = " + count + "\n\n");
            jOutputTextArea1.setText(sb1.toString());

            count = 0;
            jProgressBar.setMaximum(dir2Files.size() - 1);
            StringBuilder sb2 = new StringBuilder();
            sb1.append("-- Directory 2 Output").append("\n");
            for (int i = 0; i < dir2Files.size(); i++) {
                String fname = dir2Files.get(i);
                if (!dir1Files.contains(fname)) {
                    sb2.append("> ").append(fname).append("\n");
                    count++;
                }
                jProgressBar.setValue(i + 1);
            }
            sb2.insert(0, "-- Extra files in directory 2 --\nCount = " + count + "\n\n");
            jOutputTextArea2.setText(sb2.toString());

            UIMessage.info(this, "Comparision complete.");
        } catch (IOException ex) {
            log.error("Error", ex);
        }

        setFieldsEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jDirTextField1;
    private javax.swing.JTextField jDirTextField2;
    private javax.swing.JFileChooser jFileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextArea jOutputTextArea1;
    private javax.swing.JTextArea jOutputTextArea2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jSelectButton1;
    private javax.swing.JButton jSelectButton2;
    private javax.swing.JButton jStartButton;
    // End of variables declaration//GEN-END:variables
}
