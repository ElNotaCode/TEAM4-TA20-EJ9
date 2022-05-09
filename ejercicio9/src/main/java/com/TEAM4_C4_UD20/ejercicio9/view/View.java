package com.TEAM4_C4_UD20.ejercicio9.view;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class View extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	
	int ROWS = 4;
	int COLS = 4;
	//creamos un array bidimensional de botones
	static JToggleButton btn[][] = new JToggleButton[4][4];
	
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4,4,4,4));	//grid (graella) X Y 4X4
		
		ActionListener girar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				for (int i = 0; i < ROWS; i++) {
					for (int j = 0; j < COLS; j++) {
						if(btn[i][j] == e.getSource()) {
							//funcion(i,j)
						}
					}
				}
				
			}
		};
		
		//1) Botones JToggleButton perfectamente distribuidos
		
		//añadimos la imagen
		ImageIcon dorso = new ImageIcon("resources/dorso.png");
		//con un for creamos los botones
		for (int i = 0; i < btn.length; i++) {
			for (int j = 0; j < btn[i].length; j++) {
				btn[i][j] = new JToggleButton(dorso);
				btn[i][j].setPreferredSize(new Dimension(120, 120));
				contentPane.add(btn[i][j]);
				btn[i][j].addActionListener(girar);
			}
		}
		
	}
}
