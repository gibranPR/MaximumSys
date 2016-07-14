package componentes;
import javax.swing.*;
public class BotonTransparente extends JButton {
    /**
	 * 
	 */
	private static final long serialVersionUID = 7939419780435589493L;
	public BotonTransparente(String text){
        super(text);
        //setBorder(BorderFactory.createLineBorder(Color.BLUE,2));
        setBorderPainted(true);
        //setFocusPainted(true);
        //setBorder(null);
        setContentAreaFilled(false);
        setOpaque(false);
    }
    public BotonTransparente(){
    	super();
        //setBorder(BorderFactory.createLineBorder(Color.BLUE,2));
        setBorderPainted(true);
        //setFocusPainted(true);
        //setBorder(null);
        setContentAreaFilled(false);
        setOpaque(false);
    }
    public BotonTransparente(Icon imagen){
    	super(imagen);
    	//setBorder(BorderFactory.createLineBorder(Color.BLUE,2));
        setBorderPainted(true);
        setFocusPainted(true);
        //setBorder(null);
        setContentAreaFilled(false);
        setOpaque(false);
    }
}
