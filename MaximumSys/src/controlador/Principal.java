package controlador;

import modelo.*;
import vista.*;

public class Principal {
	Login miLogin;
	Logica miLogica;
	MenuPrincipal miMenuPrincipal;
	Coordinador miCoordinador;
	AgregaNota agregaNota;
	public static void main(String []a){
		Principal principal = new Principal();
		principal.inicio();
	}
	public void inicio(){
		miLogica= new Logica();
		miLogin= new Login();
		//miMenuPrincipal = new MenuPrincipal();
		miCoordinador = new Coordinador();
		
		miLogin.setCoordinador(miCoordinador);
		miLogica.setCoordinador(miCoordinador);
		//miMenuPrincipal.setCoordinador(miCoordinador);		
		
		miCoordinador.setMiLogica(miLogica);
		miCoordinador.setMiLogin(miLogin);
		//miCoordinador.setMiMenuPrincipal(miMenuPrincipal);
		
		miLogin.setVisible(true);
	}
}
