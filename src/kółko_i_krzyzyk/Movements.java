package kó³ko_i_krzyzyk;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Movements extends Board{
	int movement = 0;
	public Movements() {
		ActionListener al= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == button1) {
					movement ++;
					if(movement % 2 == 0)
						button1.setText("O");
					else
						button1.setText("X");
					button1.setEnabled(false);
					move();
				}
				if(e.getSource() == button2) {
					movement ++;
					if(movement % 2 == 0)
						button2.setText("O");
					else
						button2.setText("X");
					button2.setEnabled(false);
					move();
				}
				if(e.getSource() == button3) {
					movement ++;
					if(movement % 2 == 0)
						button3.setText("O");
					else
						button3.setText("X");
					button3.setEnabled(false);
					move();
				}
				if(e.getSource() == button4) {
					movement ++;
					if(movement % 2 == 0)
						button4.setText("O");
					else
						button4.setText("X");
					button4.setEnabled(false);
					move();
				}
				if(e.getSource() == button5) {
					movement ++;
					if(movement % 2 == 0)
						button5.setText("O");
					else
						button5.setText("X");
					button5.setEnabled(false);
					move();
				}
				if(e.getSource() == button6) {
					movement ++;
					if(movement % 2 == 0)
						button6.setText("O");
					else
						button6.setText("X");
					button6.setEnabled(false);
					move();
				}
				if(e.getSource() == button7) {
					movement ++;
					if(movement % 2 == 0)
						button7.setText("O");
					else
						button7.setText("X");
					button7.setEnabled(false);
					move();
				}
				if(e.getSource() == button8) {
					movement ++;
					if(movement % 2 == 0)
						button8.setText("O");
					else
						button8.setText("X");
					button8.setEnabled(false);
					move();
				}
				if(e.getSource() == button9) {
					movement ++;
					if(movement % 2 == 0)
						button9.setText("O");
					else
						button9.setText("X");
					button9.setEnabled(false);
					move();
				}
				if(e.getSource() == button10) {
					restart();
				}
			}
			
		};
		button1.addActionListener(al);
		button2.addActionListener(al);
		button3.addActionListener(al);
		button4.addActionListener(al);
		button5.addActionListener(al);
		button6.addActionListener(al);
		button7.addActionListener(al);
		button8.addActionListener(al);
		button9.addActionListener(al);
		button10.addActionListener(al);
	}
	public void move() {
		String x;
        if (movement % 2 == 0)
            x = "X";
        else
            x = "O";
        movement++;
       if (button1.isEnabled() && button2.getText() == button3.getText() && !button2.isEnabled() && !button3.isEnabled())
        {
            button1.setText(x);
            button1.setEnabled(false);
        }
        else if (button1.isEnabled() && button4.getText() == button7.getText() && !button4.isEnabled() && !button7.isEnabled())
        {
            button1.setText(x);
            button1.setEnabled(false);
        }
        else if (button1.isEnabled() && button5.getText() == button9.getText() && !button5.isEnabled() && !button9.isEnabled())
        {
            button1.setText(x);
            button1.setEnabled(false);
        }
        else if (button2.isEnabled() && button1.getText() == button3.getText() && !button1.isEnabled() && !button3.isEnabled())
        {
            button2.setText(x);
            button2.setEnabled(false);
        }
        else if (button2.isEnabled() && button5.getText()== button8.getText()&& !button5.isEnabled() && !button8.isEnabled())
        {
            button2.setText(x);
            button2.setEnabled(false);
            checkWhoWins();
        }
        else if (button3.isEnabled() && button1.getText()== button2.getText()&& !button1.isEnabled() && !button2.isEnabled())
        {
            button3.setText(x);
            button3.setEnabled(false);
            checkWhoWins();
        }
        else if (button3.isEnabled() && button6.getText()== button9.getText()&& !button6.isEnabled() && !button9.isEnabled())
        {
            button3.setText(x);
            button3.setEnabled(false);
            checkWhoWins();
        }
        else if (button3.isEnabled() && button5.getText()== button7.getText()&& !button5.isEnabled() && !button7.isEnabled())
        {
            button3.setText(x);
            button3.setEnabled(false);
            checkWhoWins();
        }
        else if (button4.isEnabled() && button5.getText()== button6.getText()&& !button5.isEnabled() && !button6.isEnabled())
        {
            button4.setText(x);
            button4.setEnabled(false);
            checkWhoWins();
        }
        else if (button4.isEnabled() && button1.getText()== button7.getText()&& !button1.isEnabled() && !button7.isEnabled())
        {
            button4.setText(x);
            button4.setEnabled(false);
            checkWhoWins();
        }
        else if (button5.isEnabled() && button4.getText()== button6.getText()&& !button4.isEnabled() && !button6.isEnabled())
        {
            button5.setText(x);
            button5.setEnabled(false);
            checkWhoWins();
        }
        else if (button5.isEnabled() && button2.getText()== button8.getText()&& !button2.isEnabled() && !button8.isEnabled())
        {
            button5.setText(x);
            button5.setEnabled(false);
            checkWhoWins();
        }
        else if (button6.isEnabled() && button5.getText()== button4.getText()&& !button4.isEnabled() && !button5.isEnabled())
        {
            button6.setText(x);
            button6.setEnabled(false);
            checkWhoWins();
        }
        else if (button6.isEnabled() && button3.getText()== button9.getText()&& !button3.isEnabled() && !button9.isEnabled())
        {
            button6.setText(x);
            button6.setEnabled(false);
            checkWhoWins();
        }
        else if (button7.isEnabled() && button8.getText()== button9.getText()&& !button8.isEnabled() && !button9.isEnabled())
        {
            button7.setText(x);
            button7.setEnabled(false);
            checkWhoWins();
        }
        else if (button7.isEnabled() && button1.getText()== button4.getText()&& !button4.isEnabled() && !button1.isEnabled())
        {
            button7.setText(x);
            button7.setEnabled(false);
            checkWhoWins();
        }
        else if (button7.isEnabled() && button5.getText()== button3.getText()&& !button5.isEnabled() && !button3.isEnabled())
        {
            button7.setText(x);
            button7.setEnabled(false);
            checkWhoWins();
        }
        else if (button8.isEnabled() && button7.getText()== button9.getText()&& !button9.isEnabled() && !button7.isEnabled())
        {
            button8.setText(x);
            button8.setEnabled(false);
            checkWhoWins();
        }
        else if (button8.isEnabled() && button2.getText()== button5.getText()&& !button2.isEnabled() && !button5.isEnabled())
        {
            button8.setText(x);
            button8.setEnabled(false);
            checkWhoWins();
        }
        else if (button9.isEnabled() && button7.getText()== button8.getText()&& !button8.isEnabled() && !button7.isEnabled())
        {
            button9.setText(x);
            button9.setEnabled(false);
            checkWhoWins();
        }
        else if (button9.isEnabled() && button3.getText()== button6.getText()&& !button3.isEnabled() && !button6.isEnabled())
        {
            button9.setText(x);
            button9.setEnabled(false);
            checkWhoWins();
        }
        else if (button9.isEnabled() && button5.getText()== button1.getText()&& !button5.isEnabled() && !button1.isEnabled())
        {
            button9.setText(x);
            button9.setEnabled(false);
            checkWhoWins();
        }
        else if (button5.isEnabled())
        {
            button5.setText(x);
            button5.setEnabled(false);
            checkWhoWins();
        }
        else if (button1.isEnabled())
        {
            button1.setText(x);
            button1.setEnabled(false);
            checkWhoWins();
        }
        else if (button2.isEnabled())
        {
            button2.setText(x);
            button2.setEnabled(false);
            checkWhoWins();
        }
        else if (button3.isEnabled())
        {
            button3.setText(x);
            button3.setEnabled(false);
            checkWhoWins();
        }
        else if (button4.isEnabled())
        {
            button4.setText(x);
            button4.setEnabled(false);
            checkWhoWins();
        }
        else if (button6.isEnabled())
        {
            button6.setText(x);
            button6.setEnabled(false);
            checkWhoWins();
        }
        else if (button7.isEnabled())
        {
            button7.setText(x);
            button7.setEnabled(false);
            checkWhoWins();
        }
        else if (button8.isEnabled())
        {
            button8.setText(x);
            button8.setEnabled(false);
            checkWhoWins();
        }
        else if (button9.isEnabled())
        {
            button9.setText(x);
            button9.setEnabled(false);
            checkWhoWins();
        }
	}
	public void restart() {
		button1.setEnabled(true);
        button1.setText(null);
        button2.setEnabled(true);
        button2.setText(null);
        button3.setEnabled(true);
        button3.setText(null);
        button4.setEnabled(true);
        button4.setText(null);
        button5.setEnabled(true);
        button5.setText(null);
        button6.setEnabled(true);
        button6.setText(null);
        button7.setEnabled(true);
        button7.setText(null);
        button8.setEnabled(true);
        button8.setText(null);
        button9.setEnabled(true);
        button9.setText(null);
	}
	public void checkWhoWins() {
        if (button1.isEnabled() == false && button1.getText() == button2.getText() && button2.getText() == button3.getText())
        {
            JOptionPane.showMessageDialog(null, "game over");
            restart();
        } 
        else if (button1.isEnabled() == false && button1.getText() == button4.getText() && button1.getText() == button7.getText())
        {
            JOptionPane.showMessageDialog(null, "game over");
            restart();
        }
        else if (button4.isEnabled() == false && button4.getText() == button5.getText() && button4.getText() == button6.getText())
        {
            JOptionPane.showMessageDialog(null, "game over");
            restart();
        }
        else if (button7.isEnabled() == false && button7.getText() == button8.getText() && button7.getText() == button9.getText())
        {
            JOptionPane.showMessageDialog(null, "game over");
            restart();
        }
        else if (button2.isEnabled() == false && button2.getText() == button5.getText() && button2.getText() == button8.getText())
        {
            JOptionPane.showMessageDialog(null, "game over");
            restart();
        }
        else if (button3.isEnabled() == false && button3.getText() == button6.getText() && button3.getText() == button9.getText())
        {
            JOptionPane.showMessageDialog(null, "game over");
            restart();
        }
        else if (button1.isEnabled() == false && button1.getText() == button5.getText() && button1.getText() == button9.getText())
        {
        	JOptionPane.showMessageDialog(null, "game over");
            restart();
        }
        else if (button3.isEnabled() == false && button3.getText() == button5.getText() && button3.getText() == button7.getText())
        {
            JOptionPane.showMessageDialog(null, "game over");
            restart();
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){new Movements();}
		});}
}
