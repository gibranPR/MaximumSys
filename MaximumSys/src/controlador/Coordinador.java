package controlador;
import modelo.*;
import otros.*;
import vista.*;
public class Coordinador {
	private Login miLogin;
	private Logica miLogica;
	private MenuPrincipal miMenuPrincipal;
	private AgregaNota agregaNota;
	private Usuario miUsuario;
	public Login getMiLogin() {
		return miLogin;
	}
	public void setMiLogin(Login miLogin) {
		this.miLogin = miLogin;
	}
	public Logica getMiLogica() {
		return miLogica;
	}
	public void setMiLogica(Logica miLogica) {
		this.miLogica = miLogica;
	}
	public boolean checaLogin(String algo){
		return miLogica.checaLogin(algo);
	}
	public MenuPrincipal getMiMenuPrincipal() {
		return miMenuPrincipal;
	}
	public void setMiMenuPrincipal(MenuPrincipal miMenuPrincipal) {
		this.miMenuPrincipal = miMenuPrincipal;
	}
	public AgregaNota getAgregaNota() {
		return agregaNota;
	}
	public void setAgregaNota(AgregaNota agregaNota) {
		this.agregaNota = agregaNota;
	}
	public Usuario getMiUsuario() {
		return miUsuario;
	}
	public void setMiUsuario(Usuario miUsuario) {
		this.miUsuario = miUsuario;
	}
}
