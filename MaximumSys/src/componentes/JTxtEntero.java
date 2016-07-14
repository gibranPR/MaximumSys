package componentes;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
public class JTxtEntero extends JTextField implements KeyListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3072500648143167242L;
	int maximo;
	public JTxtEntero(int maximo){
		super(10);
		this.maximo= maximo;
		escucha();
	}

	private void escucha() {
		addKeyListener(this);
	}
	@SuppressWarnings("static-access")
	public void keyPressed(KeyEvent e) {
		if (getText().length()==maximo){
			e.consume();
		}
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
			if (getText().length()==maximo){
				e.consume();
			}
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
