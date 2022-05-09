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
	//creo un hash table que se va a usar en el metodo para checkear que no se repiten los colores
	Hashtable<String,Integer> listaValuesColores = new Hashtable<String,Integer>();
	
	
	public View() {
		
		//cargamos el array de colores
		rellenarArrayColores();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4,4,4,4));	//grid (graella) X Y 4X4
		
		ActionListener girar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
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
		
		//pasar por todos los botones de la matriz
		
		//mientras los voy pasando tengo que generar un algoritmo que no pasen mas de dos
		
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
		
		int count = 0;
		Random r = new Random();
		int numero;
		//bucle hasta que se rellenen los 16 colores
		do {
		//Random r (7)
		numero = r.nextInt(7);
		//checkear con otro metodo que haga un control de colores metodo boolan
		if(comprobarColorRepetido(numero)) {
			//se añade al array list
			listaBotonesParejas.get(count).setBackground(listaColores.get(numero));
			//suma count
			count++;
			
		}
		
		}while(count > 16);
	}
	
	public boolean comprobarColorRepetido(int numero) {
		
		//aqui se mira que no esté repetido
		
		
		return false;
	}

	//al pulsar cambia de color, hay una parjea para cada una
	
	//el jugador solo puede mostrar a la vez
	
	//si son del mismo color desaparecen de la pantalla con setVisible(false)
	
	//si las dos cartas son del mismo color, vuelven a girarse
	
	//ADICIONAL
	//usar imagenes
	
	//contador de intentos
	
	//MessageDialog de enhorabuena
	
}
