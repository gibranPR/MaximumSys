package vista;
import javax.swing.*;

import controlador.Coordinador;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import componentes.BotonTransparente;
public class Status extends JDialog implements ActionListener{
	private Coordinador miCoordinador;
	private BotonTransparente btnSA;
	private BotonTransparente btnER;
	private BotonTransparente btnLI;
	private BotonTransparente btnEN;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private BotonTransparente btnBuscar;
	private JTextField txtBuscar;
	
	public void setCoordinador(Coordinador miCoordinador){
		this.miCoordinador = miCoordinador;
	}
	
	public Status(){
		getContentPane().setBackground(Color.WHITE);
		setTitle("Status del equipo");
		setSize(480,360);
		
		getContentPane().setLayout(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuPrincipal.class.getResource("/Recursos/img/maximumM.png")));
		setLocationRelativeTo(null);
		complementos();
		logica();
	}

	private void logica() {
		btnSA.addActionListener(this);
		btnER.addActionListener(this);
		btnLI.addActionListener(this);
		btnEN.addActionListener(this);
		btnBuscar.addActionListener(this);
	}

	private void complementos() {
		btnSA = new BotonTransparente();
		btnSA.setIcon(new ImageIcon(Status.class.getResource("/Recursos/img/statusbtn1.png")));
		btnSA.setBounds(10, 100, 100, 200);
		getContentPane().add(btnSA);
		
		btnER = new BotonTransparente();
		btnER.setIcon(new ImageIcon(Status.class.getResource("/Recursos/img/statusbtn2.png")));
		btnER.setBounds(120, 100, 100, 200);
		getContentPane().add(btnER);
		
		btnLI = new BotonTransparente();
		btnLI.setIcon(new ImageIcon(Status.class.getResource("/Recursos/img/statusbtn3.png")));
		btnLI.setBounds(230, 100, 100, 200);
		getContentPane().add(btnLI);
		
		btnEN = new BotonTransparente();
		btnEN.setIcon(new ImageIcon(Status.class.getResource("/Recursos/img/statusbtn4.png")));
		btnEN.setBounds(340, 100, 100, 200);
		getContentPane().add(btnEN);		
		
		JLabel lbl1 = new JLabel("SIN ASIGNAR");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setFont(new Font("Walkway UltraBold", Font.PLAIN, 14));
		lbl1.setBounds(10, 74, 100, 14);
		getContentPane().add(lbl1);
		
		lbl2 = new JLabel("REPARANDO");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setFont(new Font("Walkway UltraBold", Font.PLAIN, 14));
		lbl2.setBounds(120, 74, 100, 14);
		getContentPane().add(lbl2);
		
		lbl3 = new JLabel("LISTO");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setFont(new Font("Walkway UltraBold", Font.PLAIN, 14));
		lbl3.setBounds(230, 74, 91, 14);
		getContentPane().add(lbl3);
		
		lbl4 = new JLabel("ENTREGADOS");
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setFont(new Font("Walkway UltraBold", Font.PLAIN, 14));
		lbl4.setBounds(340, 74, 100, 14);
		getContentPane().add(lbl4);
		
		txtBuscar = new JTextField();
		txtBuscar.setFont(new Font("Walkway Black", Font.PLAIN, 17));
		txtBuscar.setForeground(new Color(255, 255, 255));
		txtBuscar.setBackground(new Color(60, 179, 113));
		txtBuscar.setBounds(368, 11, 50, 35);
		getContentPane().add(txtBuscar);
		txtBuscar.setColumns(5);
		
		btnBuscar = new BotonTransparente();
		btnBuscar.setIcon(new ImageIcon(Status.class.getResource("/Recursos/img/statusbtnBuscar.png")));
		btnBuscar.setBounds(419, 11, 37, 37);
		getContentPane().add(btnBuscar);
	}

	public void actionPerformed(ActionEvent accion) {
		if (accion.getSource() == btnBuscar){
			JOptionPane.showMessageDialog(null, "Buscando el elemento "+txtBuscar.getText());//
		}
	}
}
