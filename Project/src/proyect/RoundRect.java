/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect;

import java.awt.geom.RoundRectangle2D;
import javafx.scene.shape.Line;
import javax.swing.JLabel;

/**
 *
 * @author Alex Ordonez
 */
public class RoundRect extends Figuras{
    

    public RoundRect() {
        super();
    }

    public RoundRect(JLabel r, int color, String texto) {
        super(r, color, texto);
    }

    @Override
    public String toString() {
        if(super.getTexto()!=null){
            return super.getTexto();
        }else{
            return "Inicio/Fin";
        }
    }


    

    
}
