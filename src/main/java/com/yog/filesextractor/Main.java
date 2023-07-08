package com.yog.filesextractor;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author Yougeshwar
 */
@Slf4j
public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel("com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme");
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                log.error("Unable to load UI theme", ex);
            }
            JMainFrame jMainFrame = new JMainFrame();
            jMainFrame.initView();
            jMainFrame.setVisible(true);
        });
    }
}
