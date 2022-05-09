package com.TEAM4_C4_UD20.ejercicio9;

import java.awt.EventQueue;

import com.TEAM4_C4_UD20.ejercicio9.view.View;

public class App 
{
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
