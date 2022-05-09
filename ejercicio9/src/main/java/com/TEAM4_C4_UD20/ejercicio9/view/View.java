package com.TEAM4_C4_UD20.ejercicio9.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class View extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4,4,4,4));	//grid X Y 4X4
		
		//creamos un array
		JButton btn[] = new JButton[16];
		//añadimos la imagen
		ImageIcon dorso = new ImageIcon("resources/dorso.png");
		//con un for creamos los botones
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(dorso);
			btn[i].setPreferredSize(new Dimension(120, 120));
			
			contentPane.add(btn[i]);
		}
		
	}

}
