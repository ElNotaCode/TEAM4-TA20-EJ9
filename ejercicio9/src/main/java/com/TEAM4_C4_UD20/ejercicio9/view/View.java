package com.TEAM4_C4_UD20.ejercicio9.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Random;

import javax.swing.ImageIcon;

public class View extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	
	//creamos un array list de botones y colores
	ArrayList<Color> listaColores = new ArrayList<Color>();
	ArrayList<JToggleButton> listaBotonesParejas = new ArrayList<JToggleButton>();
	
	
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
				//cargamos el array de colores
				
				
			}
		};
		//1) Botones JToggleButton perfectamente distribuidos
		
		//añadimos la imagen
		//ImageIcon dorso = new ImageIcon("resources/dorso.png");
		//con un for creamos los botones
		for (int i = 0; i < 16; i++) {
			JToggleButton btn = new JToggleButton();
			listaBotonesParejas.add(btn);
			//listaBotonesParejas.get(i).setPreferredSize(new Dimension(120, 120));
			contentPane.add(listaBotonesParejas.get(i));
			listaBotonesParejas.get(i).addActionListener(girar);
		}
		
		//cargamos el array de colores y randomizamos
		rellenarArrayColores();
		randomizadorDeColores();
		//importante hacerlo despues de cargar los botones
		
	}
	
	//cargar colores
	public void rellenarArrayColores() {
		listaColores.add(Color.blue);
		listaColores.add(Color.red);
		listaColores.add(Color.pink);
		listaColores.add(Color.black);
		listaColores.add(Color.orange);
		listaColores.add(Color.green);
		listaColores.add(Color.yellow);
		listaColores.add(Color.white);
	}
	
	public void randomizadorDeColores() {
		//se crea un random
		Random r = new Random();
		//el numero que va a guardar el random
		int numero;
		//se recorre la lista de botones
		for (int i = 0; i < listaBotonesParejas.size(); i++) {
			do {
				numero = r.nextInt(8);
			}while(!comprobarColorRepetido(numero));
			listaBotonesParejas.get(i).setBackground(listaColores.get(numero));
			//le damos la vuelta
			
		}
		
	}
	
	int arrayDeColoresColocados[] = {0,0,0,0,0,0,0,0};
	
	//al pulsar cambia de color, hay una parjea para cada una
	public boolean comprobarColorRepetido(int numero) {
		
		if(arrayDeColoresColocados[numero] < 2 ) {
			arrayDeColoresColocados[numero]++;
			return true;
		}else {
			return false;
		}
		
	}
	
	//el jugador solo puede mostrar a la vez
	
	//si son del mismo color desaparecen de la pantalla con setVisible(false)
	
	//si las dos cartas son del mismo color, vuelven a girarse
	
	//ADICIONAL
	//usar imagenes
	
	//contador de intentos
	
	//MessageDialog de enhorabuena
	
}
