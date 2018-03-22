/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect;

import java.awt.geom.Rectangle2D;
import javafx.scene.shape.Line;
import javax.swing.JLabel;

/**
 *
 * @author Alex Ordonez
 */
public class Rectangulo extends Figuras {

    public Rectangulo() {
        super();
    }

    public Rectangulo(JLabel r, int color, String texto) {
        super(r, color, texto);
    }

    
    @Override
    public String toString() {
        if(super.getTexto()!=null){
            return super.getTexto();
        }else{
            return "Proceso";
        }
    }
    
}
