/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect;

import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Alex Ordonez
 */
public class UML {
    private JTextField tf=new JTextField();
    private JPanel jp;
    private UML Hija;
    private UML padre;
    private boolean Abs=false;
    private String titulo;
    private ArrayList<String> atributos=new ArrayList();
    int y;

    public JTextField getTf() {
        return tf;
    }

    public void setTf(JTextField tf) {
        this.tf = tf;
    }

    public void setPadre(UML padre) {
        this.padre = padre;
    }

    public UML getPadre() {
        return padre;
    }
    
    public UML(JPanel jp){
        this.jp=jp;
    }
    public void setJp(JPanel jp) {
        this.jp = jp;
    }

    public JPanel getJp() {
        return jp;
    }
    
    public UML() {
    }

    public UML getHija() {
        return Hija;
    }

    public void setHija(UML Hija) {
        this.Hija = Hija;
    }

    public void setAtributos(String atributos) {
        this.atributos.add(atributos);
    }

    public ArrayList<String> getAtributos() {
        return atributos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAbs(boolean Abs) {
        this.Abs = Abs;
    }

    public boolean isAbs() {
        return Abs;
    }  

    @Override
    public String toString() {
        return titulo;
    }
    
}
