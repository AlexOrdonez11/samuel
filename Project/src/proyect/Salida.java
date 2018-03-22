/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect;

import javafx.scene.shape.Line;
import javax.swing.JLabel;

/**
 *
 * @author Alex Ordonez
 */
public class Salida extends Figuras{

    public Salida() {
        super();
    }

    public Salida(JLabel r, int color, String texto) {
        super(r, color, texto);
    }

    

    @Override
    public String toString() {
        if(super.getTexto()!=null){
            return super.getTexto();
        }else{
            return "Salida";
        }
    }

   
    
}
