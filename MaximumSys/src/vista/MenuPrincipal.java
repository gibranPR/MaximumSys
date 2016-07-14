package vista;
import javax.swing.*;
import controlador.Coordinador;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import componentes.BotonTransparente;
public class MenuPrincipal extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1405938959585854971L;
	private Coordinador miCoordinador;
	private Fondo Fondo;
	private BotonTransparente btnAgregar;
	public void setCoordinador(Coordinador miCoordinador){
		this.miCoordinador = miCoordinador;
	}
	
	public MenuPrincipal(){
		super("Maximum SYS V2.0");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuPrincipal.class.getResource("/Recursos/img/maximumM.png")));
		setSize(1024,768);
		getContentPane().setLayout(null);
		Fondo = new Fondo();
		Fondo.setBounds(0, 0, 1024, 768);
		setContentPane(Fondo);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		componentes();
		setVisible(true);
	}

	private void componentes() {
		Fondo.setLayout(null);
		
		btnAgregar = new BotonTransparente();
		btnAgregar.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Recursos/img/fix.png")));
		btnAgregar.setBounds(48, 250, 160, 200);
		Fondo.add(btnAgregar);
		btnAgregar.addActionListener(this);
		
		JLabel lblAgregar = new JLabel("AGREGAR");
		lblAgregar.setForeground(Color.WHITE);
		lblAgregar.setFont(new Font("Walkway Bold", Font.BOLD, 40));
		lblAgregar.setBounds(28, 130, 200, 56);
		Fondo.add(lblAgregar);
		
		JLabel lblEquipo = new JLabel("EQUIPO");
		lblEquipo.setForeground(Color.WHITE);
		lblEquipo.setFont(new Font("Walkway Bold", Font.BOLD, 40));
		lblEquipo.setBounds(50, 172, 160, 67);
		Fondo.add(lblEquipo);
		
		BotonTransparente btnStatus = new BotonTransparente();
		btnStatus.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Recursos/img/status.png")));
		btnStatus.setBounds(304, 250, 160, 200);
		Fondo.add(btnStatus);
		
		JLabel lblStatus = new JLabel("STATUS");
		lblStatus.setForeground(Color.WHITE);
		lblStatus.setFont(new Font("Walkway Bold", Font.BOLD, 40));
		lblStatus.setBounds(304, 165, 160, 50);
		Fondo.add(lblStatus);
		
		JLabel lblEmpleados = new JLabel("EMPLEADOS");
		lblEmpleados.setForeground(Color.WHITE);
		lblEmpleados.setFont(new Font("Walkway Bold", Font.BOLD, 40));
		lblEmpleados.setBounds(515, 165, 250, 50);
		Fondo.add(lblEmpleados);
		
		BotonTransparente btnEmpleados = new BotonTransparente();
		btnEmpleados.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Recursos/img/business.png")));
		btnEmpleados.setBounds(560, 250, 160, 200);
		Fondo.add(btnEmpleados);
		
		JLabel lblVentas = new JLabel("VENTAS");
		lblVentas.setForeground(Color.WHITE);
		lblVentas.setFont(new Font("Walkway Bold", Font.BOLD, 40));
		lblVentas.setBounds(816, 165, 160, 50);
		Fondo.add(lblVentas);
		
		BotonTransparente botonTransparente = new BotonTransparente();
		botonTransparente.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Recursos/img/shop.png")));
		botonTransparente.setBounds(816, 250, 160, 200);
		Fondo.add(botonTransparente);
		
		
	}


	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource()==btnAgregar){
			miCoordinador.setAgregaNota(new AgregaNota());
			miCoordinador.getAgregaNota().setCoordinador(miCoordinador);
			miCoordinador.getMiLogica().BotonesMenu(1);
			return;
		}
		
	}
}
