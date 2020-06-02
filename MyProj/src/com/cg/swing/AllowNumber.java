
package com.cg.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AllowNumber {
	public static void main(String[] args) {
		new AllowNumber();
	}
	JTextField txtNumber = new JTextField(12);
		int cnt=0;
	public AllowNumber() {
		JFrame frame = new JFrame("Allow Number only");
		JPanel panel = new JPanel();

		

		KeyListener keyListener = new KeyListener() {
			public void keyPressed(KeyEvent ke) {
				
				//printIt("Pressed", ke);
				
				System.out.println("Count::" + " : " + txtNumber.getText().split(".").length);

				if (ke.getKeyChar() == '.' && countOccurrences(txtNumber.getText(),'.')==0)
				{
					txtNumber.setEditable(true);
					
				}
				else if ((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9')|| ke.getKeyCode()==KeyEvent.VK_BACK_SPACE || ke.getKeyCode()==KeyEvent.VK_DELETE ) {
					
					txtNumber.setEditable(true);
				} else {
					txtNumber.setEditable(false);
				}
			}

			public void keyReleased(KeyEvent keyEvent) {
				// printIt("Released", keyEvent);
			}

			public void keyTyped(KeyEvent keyEvent) {
				// printIt("Typed", keyEvent);
			}

			private void printIt(String title, KeyEvent keyEvent) {
				int keyCode = keyEvent.getKeyCode();
				String keyText = KeyEvent.getKeyText(keyCode);
				System.out.println(title + " : " + keyText);
			}
		};
		txtNumber.addKeyListener(keyListener);

		panel.add(txtNumber);
		frame.add(panel);
		frame.setSize(500, 150);
		frame.setUndecorated(true);
		frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
	public static int countOccurrences(String haystack, char needle)
	{
    int count = 0;
    for (int i=0; i < haystack.length(); i++)
    {
        if (haystack.charAt(i) == needle)
        {
             count++;
        }
    }
    System.out.println("In function :"+count);
    return count;
   }
	
}