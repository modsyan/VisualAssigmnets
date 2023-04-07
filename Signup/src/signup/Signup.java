/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package signup;

/**
 *
 * @author modsyan
 */
import javax.swing.JOptionPane;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class Signup {
    public static void main(String[] args) {
        new MainFrame().addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
            int confirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit the program?", "Exit Program Message Box", JOptionPane.YES_NO_OPTION);
            if (confirmed == JOptionPane.YES_OPTION) {
//                dispose(); 
            }
           }
    }
}
