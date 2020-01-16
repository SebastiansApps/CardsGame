import java.awt.Image;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class Start {
	
	//H: Hearts, D: Diamonds, C: Clover, S: Spades
	static String[] cType = {"H","D","C","S"};
	static int decks = 1;
	static String[] cards = new String[52];
	static String[][] cards2 = new String[decks][52];
	
	public static void main(String[] args) throws IOException {
		
		getCards();
		
		//Set up Buttons.
		JFrame frame = new JFrame("Card Game");
		
		JButton btn1 = new JButton("Shuffle");
		btn1.setBounds(50,100,150,50);
		JButton btn2 = new JButton("Sort");
		btn2.setBounds(50,170,150,50);
		JButton btn3 = new JButton("Draw");
		btn3.setBounds(50,240,150,50);
		
		// Set up image
		Icon ic = new ImageIcon("src/assets/back.png");
		JButton btn4 = new JButton(ic);
		btn4.setBounds(220,100,250,350);
		
		frame.add(btn1); frame.add(btn2); frame.add(btn3); frame.add(btn4); 
		frame.setSize(600,600);
		frame.setLayout(null);
		frame.setVisible(true);
		
		//Event listeners
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				shuffle();
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sort();
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon s1 = new ImageIcon (new ImageIcon("src/assets/" + cards2[decks-1][0] 
						+ ".png").getImage().getScaledInstance(260,380, Image.SCALE_SMOOTH));
				btn4.setIcon(s1);
				draw();
			}
		});
	}
	
	static void getCards() {
		for (int i=0; i<4; i++) {
			String dType = cType[i];
			for (int j=0; j<13; j++) {
				String c = ((j + 1) + dType);
				
			}
		}
		//Append to multiarray decks
		for (int j=0; j<decks; j++) {
			for (int i=0; i<52; i++) {
				cards2[j][i] = cards[i];
			}
		}
	}
	
	public static void shuffle() {
		System.out.println("Shuffle pressed");
	}
	public static void sort() {
		System.out.println("Sort pressed");
	}
	public static void draw() {
		//System.out.println(cards.getItem(0).toString());
		//cards.add(cards.remove(0));
		//cards.remove(0);
	}
}










