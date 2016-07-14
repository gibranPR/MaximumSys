package modelo;
import java.sql.*;
import javax.swing.*;
import controlador.*;
import otros.*;
public class Conexiones {
	private Connection conexion;
	Coordinador miCoordinador;
	public void setmiCoordinador(Coordinador miCoordinador){
		this.miCoordinador=miCoordinador;
	}
	public Conexiones(){
		try{
	         //obtenemos el driver de para mysql
			DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
	         //obtenemos la conexión
	         conexion = DriverManager.getConnection (
				        "jdbc:mysql://mysql.hostinger.mx:3306/u408483851_bdmxm","u408483851_gap", "gibrancillo123");
		}catch(SQLException E){
			JOptionPane.showMessageDialog(null, "No se pudo hacer la conexion, asegurate que estes conectado a internet.", "Conexión fallida.", JOptionPane.ERROR_MESSAGE);
			}
	}
	public boolean conexionLogin(String contra){
		if (conexion==null){
			return false;
		}
		try {
			Statement s = conexion.createStatement();
			ResultSet rs = s.executeQuery("select ID, Nombre, Puesto from empleado where password = MD5('"+contra+"')");
			if(!rs.next()){
				JOptionPane.showMessageDialog(null, "Error, usuario incorrecto", "Clave invalida", JOptionPane.ERROR_MESSAGE);
				conexion.close();
				return false;
			}
			String es = rs.getString(2);
			String ed = rs.getString(3);
			miCoordinador.setMiUsuario(new Usuario());
			miCoordinador.getMiUsuario().setID(rs.getInt(1));
			miCoordinador.getMiUsuario().setNombre(es);
			miCoordinador.getMiUsuario().setPuesto(ed);
			JOptionPane.showMessageDialog(null, "Bienvenido "+es+".", "Interfaz para "+ed, JOptionPane.PLAIN_MESSAGE);
			return true;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se pudo hacer la conexion, asegurate que estes conectado a internet.", "Conexión fallida.", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}