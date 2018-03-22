/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect;

import java.awt.geom.Rectangle2D;
import java.io.Serializable;
import java.util.ArrayList;
import javafx.scene.shape.Line;
import javax.swing.JLabel;

/**
 *
 * @author Alex Ordonez
 */
public class Figuras implements Serializable {
    private static final long SerialVersionUTD = 777L;
    private JLabel r;
    private int color;
    private ArrayList<Figuras> hijas=new ArrayList();
    private ArrayList<Figuras>padres=new ArrayList();
    private boolean padre_val=true,uso=false,k;
    private String texto;

    public void setK(boolean k) {
        this.k = k;
    }

    public boolean isK() {
        return k;
    }

    public boolean isUso() {
        return uso;
    }

    public void setUso(boolean uso) {
        this.uso = uso;
    }
    
    public String getTexto() {
        return texto;
    }

    public boolean isPadre_val() {
        return padre_val;
    }

    public void setPadre_val(boolean padre_val) {
        this.padre_val = padre_val;
    }
     

    public ArrayList<Figuras> getPadres() {
        return padres;
    }

    public void setPadres(Figuras padres) {
        this.padres.add(padres);
    }
    

    public void setTexto(String texto) {
        this.texto = r.getText();
    }
    
    public void setHijas(ArrayList<Figuras> hijas) {
        this.hijas = hijas;
    }

    public ArrayList<Figuras> getHijas() {
        return hijas;
    }

    public Figuras() {
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public Figuras(JLabel r, int color, String texto) {
        this.r = r;
        this.color = color;
        this.texto = texto;
    }



    public JLabel getR() {
        return r;
    }

    public void setR(JLabel r) {
        this.r = r;
    }



    
    
}
