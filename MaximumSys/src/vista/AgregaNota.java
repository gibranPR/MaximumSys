package vista;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import componentes.*;

import controlador.Coordinador;

public class AgregaNota extends JDialog implements ActionListener, ItemListener{
	private JTextField txtTelefono,txtNombre,txtCargador,txtContra,txtDescripcion,txtFalla;
	JComboBox<ImageIcon> combo = new JComboBox<ImageIcon> ();
	private DefaultTableModel model;
	private JTable table;
	private JScrollPane scrollPane_2;
	private Coordinador miCoordinador;
	private ObservingTextField txtCal;
	private JTxtMoneda txtPresupuesto,txtTotal;
	private JCheckBox chkContra,chkCargador;
	private JTextArea txtObservaciones;
	private BotonTransparente btnET,btnMas,btnCal,btnLimpiar,btnGuardar;
	public AgregaNota(){
		getContentPane().setBackground(UIManager.getColor("Button.background"));
		getContentPane().setLayout(null);
		setSize(800,600);
		componentes();
		escuchas();
	}
	private void escuchas() {
		btnCal.addActionListener(this);
		btnMas.addActionListener(this);
		btnET.addActionListener(this);
		btnLimpiar.addActionListener(this); 
	}
	public void setCoordinador(Coordinador miCoordinador){
		this.miCoordinador = miCoordinador;
	}
	private void componentes() {
		txtNombre = new JTextField();
		txtNombre.setBounds(300, 81, 450, 35);
		getContentPane().add(txtNombre);
	
		JLabel lblNombre = new JLabel(" Nombre:");
		lblNombre.setIcon(new ImageIcon(AgregaNota.class.getResource("/Recursos/img/AN/id1.png")));
		lblNombre.setFont(new Font("Walkway Bold", Font.BOLD, 19));
		lblNombre.setBounds(149, 80, 152, 35);
		getContentPane().add(lblNombre);
		
		JLabel lblTelefono = new JLabel(" Telefono:");
		lblTelefono.setIcon(new ImageIcon(AgregaNota.class.getResource("/Recursos/img/AN/auricular1.png")));
		lblTelefono.setFont(new Font("Walkway Bold", Font.BOLD, 19));
		lblTelefono.setBounds(149, 127, 152, 35);
		getContentPane().add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(300, 127, 450, 35);
		getContentPane().add(txtTelefono);
		
		JLabel lblEquipo = new JLabel(" Equipo:");
		lblEquipo.setIcon(new ImageIcon(AgregaNota.class.getResource("/Recursos/img/AN/gear1.png")));
		lblEquipo.setFont(new Font("Walkway Bold", Font.BOLD, 19));
		lblEquipo.setBounds(90, 173, 142, 35);
		getContentPane().add(lblEquipo);
		
		JLabel lblDescripcion = new JLabel(" Descripci\u00F3n:");
		lblDescripcion.setIcon(new ImageIcon(AgregaNota.class.getResource("/Recursos/img/AN/verification1.png")));
		lblDescripcion.setFont(new Font("Walkway Bold", Font.BOLD, 19));
		lblDescripcion.setBounds(272, 173, 167, 35);
		getContentPane().add(lblDescripcion);
		
		JLabel lblFalla = new JLabel(" Falla:");
		lblFalla.setIcon(new ImageIcon(AgregaNota.class.getResource("/Recursos/img/AN/wrench1.png")));
		lblFalla.setFont(new Font("Walkway Bold", Font.BOLD, 19));
		lblFalla.setBounds(530, 171, 112, 35);
		getContentPane().add(lblFalla);
		
		combo.setBounds(90, 208, 140, 28);
		ImageIcon img0 = new ImageIcon("src/Recursos/img/AN/smartphone2.png");
		combo.insertItemAt(img0, 0);
		ImageIcon img1 = new ImageIcon("src/Recursos/img/AN/tablet2.png");
		combo.insertItemAt(img1, 1);
		ImageIcon img2 = new ImageIcon("src/Recursos/img/AN/laptop2.png");
		combo.insertItemAt(img2, 2);
		ImageIcon img3 = new ImageIcon("src/Recursos/img/AN/computer2.png");
		combo.insertItemAt(img3, 3);
		getContentPane().add(combo);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(272, 209, 200, 32);
		getContentPane().add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		txtFalla = new JTextField();
		txtFalla.setColumns(10);
		txtFalla.setBounds(530, 207, 180, 32);
		getContentPane().add(txtFalla);
		
		btnMas = new BotonTransparente();
		btnMas.setIcon(new ImageIcon(AgregaNota.class.getResource("/Recursos/img/AN/round1.png")));
		btnMas.setBounds(720, 206, 35, 35);
		getContentPane().add(btnMas);
		
		Object [] obj = {"","",""};
		model= new DefaultTableModel(obj,0);
		table = new JTable(model); 
		table.setPreferredScrollableViewportSize(new Dimension(500, 80));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		TableColumnModel columnModel = table.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(170);
		columnModel.getColumn(1).setPreferredWidth(225);
		columnModel.getColumn(2).setPreferredWidth(210);
		for (int c = 0; c < table.getColumnCount(); c++)
		{
		    Class<?> col_class = table.getColumnClass(c);
		    table.setDefaultEditor(col_class, null);        // remove editor
		}
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(78, 255, 632, 70);
		scrollPane_2.setViewportView(table);
		getContentPane().add(scrollPane_2);
		
		btnET = new BotonTransparente((Icon) null);
		btnET.setIcon(new ImageIcon(AgregaNota.class.getResource("/Recursos/img/AN/cross.png")));
		btnET.setBounds(724, 268, 24, 24);
		getContentPane().add(btnET);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(AgregaNota.class.getResource("/Recursos/img/AN/maximum.jpg")));
		lblLogo.setBounds(12, 18, 120, 100);
		getContentPane().add(lblLogo);
		
		txtObservaciones = new JTextArea();
		txtObservaciones.setBorder(BorderFactory.createLineBorder(Color.blue,1));
		txtObservaciones.setBounds(218, 336, 335, 58);
		getContentPane().add(txtObservaciones);
		
		JLabel lblObservaciones = new JLabel("Observaciones", (Icon) null, SwingConstants.RIGHT);
		lblObservaciones.setFont(new Font("Walkway Bold", Font.BOLD, 19));
		lblObservaciones.setBounds(10, 336, 193, 30);
		getContentPane().add(lblObservaciones);
		
		JLabel lblpeticiones = new JLabel("/Peticiones:");
		lblpeticiones.setHorizontalAlignment(SwingConstants.RIGHT);
		lblpeticiones.setFont(new Font("Walkway Bold", Font.BOLD, 19));
		lblpeticiones.setBounds(81, 364, 127, 30);
		getContentPane().add(lblpeticiones);
		
		JLabel lblCargador = new JLabel("Cargador:");
		lblCargador.setIcon(new ImageIcon(AgregaNota.class.getResource("/Recursos/img/AN/plug1.png")));
		lblCargador.setFont(new Font("Walkway Bold", Font.BOLD, 19));
		lblCargador.setBounds(26, 425, 142, 35);
		getContentPane().add(lblCargador);
		
		chkCargador = new JCheckBox("");
		chkCargador.setFont(new Font("Symbol", Font.PLAIN, 13));
		chkCargador.setBounds(162, 432, 24, 23);
		getContentPane().add(chkCargador);
		
		txtCargador = new JTextField();
		txtCargador.setEnabled(false);
		txtCargador.setBounds(192, 428, 180, 35);
		getContentPane().add(txtCargador);
		txtCargador.setColumns(10);
		
		txtContra = new JTextField();
		txtContra.setEnabled(false);
		txtContra.setColumns(10);
		txtContra.setBounds(575, 428, 180, 35);
		getContentPane().add(txtContra);
		
		chkContra = new JCheckBox("");
		chkContra.setFont(new Font("Symbol", Font.PLAIN, 13));
		chkContra.setBounds(550, 432, 24, 23);
		getContentPane().add(chkContra);
		chkContra.addItemListener(this);
		chkCargador.addItemListener(this);
		JLabel lblContra = new JLabel("Contrase\u00F1a");
		lblContra.setIcon(new ImageIcon(AgregaNota.class.getResource("/Recursos/img/AN/password1.png")));
		lblContra.setFont(new Font("Walkway Bold", Font.BOLD, 19));
		lblContra.setBounds(400, 425, 142, 35);
		getContentPane().add(lblContra);
		
		JLabel lblPresupuesto = new JLabel("Presupuesto:", new ImageIcon(AgregaNota.class.getResource("/Recursos/img/AN/currency1.png")), SwingConstants.RIGHT);
		lblPresupuesto.setFont(new Font("Walkway Bold", Font.BOLD, 19));
		lblPresupuesto.setBounds(99, 471, 167, 32);
		getContentPane().add(lblPresupuesto);
		
		txtPresupuesto = new JTxtMoneda();
		txtPresupuesto.setBounds(289, 472, 100, 30);
		getContentPane().add(txtPresupuesto);
		
		JLabel lblTotal = new JLabel("Total:", new ImageIcon(AgregaNota.class.getResource("/Recursos/img/AN/coins1.png")), SwingConstants.RIGHT);
		lblTotal.setFont(new Font("Walkway Bold", Font.BOLD, 19));
		lblTotal.setBounds(460, 471, 120, 32);
		getContentPane().add(lblTotal);
		
		txtTotal = new JTxtMoneda();
		txtTotal.setBounds(610, 472, 100, 30);
		getContentPane().add(txtTotal);
		
		btnLimpiar = new BotonTransparente((Icon) null);
		btnLimpiar.setIcon(new ImageIcon(AgregaNota.class.getResource("/Recursos/img/AN/delete1.png")));
		btnLimpiar.setFont(new Font("Walkway Bold", Font.BOLD, 19));
		btnLimpiar.setText("Limpiar");
		btnLimpiar.setBounds(218, 519, 145, 32);
		getContentPane().add(btnLimpiar);
		
		btnGuardar = new BotonTransparente((Icon) null);
		btnGuardar.setIcon(new ImageIcon(AgregaNota.class.getResource("/Recursos/img/AN/save1.png")));
		btnGuardar.setFont(new Font("Walkway Bold", Font.BOLD, 19));
		btnGuardar.setText("Guardar");
		btnGuardar.setBounds(522, 519, 145, 32);
		getContentPane().add(btnGuardar);
		
		JLabel lblFecha = new JLabel("Fecha:", SwingConstants.RIGHT);
		lblFecha.setIcon(new ImageIcon(AgregaNota.class.getResource("/Recursos/img/AN/appointment1.png")));
		lblFecha.setFont(new Font("Walkway Bold", Font.BOLD, 19));
		lblFecha.setBounds(423, 11, 100, 32);
		getContentPane().add(lblFecha);
		
		txtCal = new ObservingTextField();
		txtCal.setBounds(542, 12, 100, 30);
		getContentPane().add(txtCal);
		
		btnCal = new BotonTransparente();
		btnCal.setIcon(new ImageIcon(AgregaNota.class.getResource("/Recursos/img/AN/calendar.png")));
		btnCal.setBounds(641, 11, 35, 35);
		getContentPane().add(btnCal);
	}
	
	private void calendarito() {
		String lang = null;
		final Locale locale = getLocale(lang);
		DatePicker dp = new DatePicker(txtCal, locale);
		Date selectedDate= dp.parseDate(txtCal.getText());
		dp.setSelectedDate(selectedDate);
		dp.start(txtCal);
	}
	private Locale getLocale(String loc){
		if (loc !=null && loc.length()>0)return new Locale(loc);
		else return Locale.US;
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnCal){
			calendarito();
			return;
		}
		if (e.getSource()==btnMas){
			if (validaEquipo()){
				Object [] agregas= new Object[4];
				agregas[0]=combo.getSelectedIndex();
				agregas[1]=txtDescripcion.getText();
				agregas[2]=txtFalla.getText();
				model.addRow(agregas);
				combo.setSelectedIndex(-1);
				combo.repaint();
				txtDescripcion.setText("");
				txtFalla.setText("");
			}
			return;
		}
		if (e.getSource()==btnET){
			if(table.getSelectedRow()!=-1){
				model.removeRow(table.getSelectedRow());
			}
			return;
		}
		if (e.getSource()==btnLimpiar){
			txtNombre.setText("");
			txtTelefono.setText("");
			txtCal.setText("");
			combo.setSelectedIndex(-1);
			txtDescripcion.setText("");
			txtFalla.setText("");
			chkCargador.setSelected(false);
			chkContra.setSelected(false);
			txtCargador.setText("");
			txtContra.setText("");
			txtObservaciones.setText("");
			txtPresupuesto.setText("");
			txtTotal.setText("");
			int aux=model.getRowCount();
			for(int i =aux; i>=1; i--){
				model.removeRow(0);
			}
			if (e.getSource()==btnGuardar){
				
				return;
			}
			//
		}
		
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource()==chkContra){
			if (chkContra.isSelected())txtContra.setEnabled(true);
			else txtContra.setEnabled(false);
			return;
		}
		if (e.getSource()==chkCargador){
			if (chkCargador.isSelected())txtCargador.setEnabled(true);
			else txtCargador.setEnabled(false);
			return;
		}
		
	}
	public void focusGained(FocusEvent e) {
		if (e.getSource()==table)txtObservaciones.grabFocus();
	}
	public void focusLost(FocusEvent arg0) {
	}
	private boolean validaEquipo(){
		if (combo.getSelectedIndex()==-1){
			JOptionPane.showMessageDialog(null, "Elige el equipo primero.");
			return false;
		}
		if (txtDescripcion.getText().equals("")){
			JOptionPane.showMessageDialog(null, "Escribe la descripción del equipo.");
			return false;
		}
		if (txtFalla.getText().equals("")){
			JOptionPane.showMessageDialog(null, "Describe la falla del equipo primero.");
			return false;
		}
		return true;
	}
}
