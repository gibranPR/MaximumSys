package modelo;
import controlador.*;
/*By Gibran*/
public class Logica {
	private Coordinador miCoordinador;
	private Conexiones miConexion;
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
	}
	public boolean checaLogin(String pass){
		miConexion = new Conexiones();
		miConexion.setmiCoordinador(miCoordinador);
		if(miConexion.conexionLogin(pass)){
			miCoordinador.getMiLogin().setVisible(false);
			return true;
		}
		else return false;
	}
	public void BotonesMenu(int boton){
		switch(boton){
		case 1:miCoordinador.getAgregaNota().setVisible(true);return;
		case 2:miCoordinador.getStatus().setVisible(true);return;
		case 3:return;
		case 4:return;
		default:;
		}
	}
}
