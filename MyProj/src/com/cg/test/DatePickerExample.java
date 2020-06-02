package com.cg.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jdesktop.swingx.JXDatePicker;

public class DatePickerExample extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
        JFrame frame = new JFrame("JXPicker Example");
        JPanel panel = new JPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 400, 250, 100);

        JXDatePicker picker = new JXDatePicker();
        picker.setDate(Calendar.getInstance().getTime());
        picker.setFormats(new SimpleDateFormat("dd.MM.yyyy"));
        picker.getEditor().setEditable(false);
        panel.add(picker);
        
        JButton button = new JButton("OK");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	JOptionPane.showMessageDialog(frame,new SimpleDateFormat("dd.MMMM.yyyy").format(picker.getDate()));
            }
          });
        
        panel.add(button);
        
        frame.getContentPane().add(panel);
        
        

        frame.setVisible(true);
    }
}
