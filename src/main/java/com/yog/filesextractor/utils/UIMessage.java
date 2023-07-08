package com.yog.filesextractor.utils;

import java.awt.Component;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author Yougeshwar
 */
@Slf4j
public class UIMessage {

    public static void info(Component parent, String msg) {
        JOptionPane.showMessageDialog(parent, msg, "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void error(Component parent, String msg) {
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(parent, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void warn(Component parent, String msg) {
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(parent, msg, "Warning", JOptionPane.WARNING_MESSAGE);
    }

    public static void plain(Component parent, String title, String msg) {
        JOptionPane.showMessageDialog(parent, msg, title, JOptionPane.PLAIN_MESSAGE);
    }

    public static boolean confirmYN(Component parent, String msg) {
        return JOptionPane.showConfirmDialog(
                parent,
                msg,
                "Confirmation",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        ) == JOptionPane.YES_OPTION;
    }

    public static int confirmYNC(Component parent, String msg) {
        return JOptionPane.showConfirmDialog(parent,
                msg,
                "Confirmation",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
    }
}

