package componentes;
import javax.swing.*;
import java.awt.event.*;
public class JTxtMoneda extends JTextField implements FocusListener, KeyListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2065450865481301201L;
	String cantidad;
	public JTxtMoneda(){
		super();
		escucha();
	}
	private void escucha() {
		addFocusListener(this);
		addKeyListener(this);
	}
	public void focusGained(FocusEvent arg0) {
		selectAll();
	}
	String cambio="example";
	public void focusLost(FocusEvent arg0) {
		String aux=getText();
		if (cambio.equals(aux))return;
		if (aux.equals(""))return;
		cantidad=getText();
		setText("");
		aux = acomoda(aux);
		if(!aux.contains("$")){
			setText("$ "+aux);
			aux=getText();
		}
		if(!aux.contains(".")){
			setText(aux+".00");
			aux=getText();
		}
		cambio=aux;
	}
	private String acomoda(String aux) {
		for(int i=aux.length(); i>0; i-=3){
			if (i-3>0){
				aux=aux.substring(0, i-3)+"'"+aux.substring(i-3);
			}
		}
		return aux;
	}
	public String getCantidad(){
		return cantidad;
	}
	@SuppressWarnings("static-access")
	public void keyPressed(KeyEvent e) {
		
		char caracter = e.getKeyChar();
		if(((caracter < '0') ||
		(caracter > '9')) &&
		(caracter != e.VK_BACK_SPACE))
		{
		e.consume();
		}
	}
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {
		      char caracter = e.getKeyChar();
		      // Verificar si la tecla pulsada no es un digito
		      if(((caracter < '0') ||
		         (caracter > '9')) &&
		         (caracter != '\b' /*corresponde a BACK_SPACE*/))
		      {
		         e.consume();  // ignorar el evento de teclado
		      }
		      
	}
}