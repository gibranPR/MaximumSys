package vista;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
public class Fondo extends javax.swing.JPanel {
	public Fondo(){
		this.setSize(1024,768);
	}
	public void paintComponent (Graphics g){
		Dimension tamanio = getSize();
		ImageIcon imagenFondo = new ImageIcon("src/recursos/img/menu.png");
		g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);
		setOpaque(false);
		super.paintComponent(g);
	}
}
