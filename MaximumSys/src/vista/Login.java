package vista;
import javax.swing.*;
import controlador.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.ServerSocket;
public class Login extends JFrame implements ActionListener{
	//objeto miCoordinador que permite la relacion entre esta clase y la clase coordinador
	private Coordinador miCoordinador;
	//Serializable
	private static final long serialVersionUID = -2341484719287499712L;
	//Server socket solo permite una instancia de la clase
	private static ServerSocket SERVER_SOCKET;
	private JPasswordField txtContra;
	private JButton btnAccesar;
	private JLabel lblLogo;
	public Login(){
		super("MaximumSYS v2.0");
		getContentPane().setBackground(new Color(0, 0, 128));
		setSize(320,160);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		componentes();	
	}

	private void componentes() {
		//ServerSocket
		try {
			SERVER_SOCKET = new ServerSocket(1334);
			SERVER_SOCKET.isClosed();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,"Otra instancia de la aplicación se está ejecutando...");
			System.exit(0);
		}
		
		JLabel lblContrasea = new JLabel("Ingresa tu contrase\u00F1a:");
		lblContrasea.setForeground(new Color(154, 205, 50));
		lblContrasea.setBounds(75, 11, 160, 14);
		getContentPane().add(lblContrasea);
		
		txtContra = new JPasswordField();
		txtContra.setForeground(new Color(154, 205, 50));
		txtContra.setBounds(75, 44, 160, 20);
		getContentPane().add(txtContra);
		txtContra.setColumns(10);
		
		lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("src\\Recursos\\img\\maximum50x50.png"));
		lblLogo.setBounds(5, 5, 50, 59);
		getContentPane().add(lblLogo);
		
		btnAccesar = new JButton("Accesar");
		btnAccesar.setForeground(new Color(154, 205, 50));
		btnAccesar.setBackground(new Color(255, 255, 255));
		btnAccesar.setBounds(100, 88, 100, 23);
		btnAccesar.addActionListener(this);
		getContentPane().add(btnAccesar);
	}
	
	public void setCoordinador(Coordinador miCoordinador){
		this.miCoordinador = miCoordinador;
	}

	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource()==btnAccesar){
			String pass="";
			for (int i=0; i<txtContra.getPassword().length; i++){
				char contra = txtContra.getPassword()[i];
				pass = pass + contra;
			}
			//if(miCoordinador.checaLogin(pass)){
				miCoordinador.setMiMenuPrincipal(new MenuPrincipal());
				miCoordinador.getMiMenuPrincipal().setCoordinador(miCoordinador);
				miCoordinador.getMiMenuPrincipal().setVisible(true);
				dispose();
			//}
		}
	}
	
}