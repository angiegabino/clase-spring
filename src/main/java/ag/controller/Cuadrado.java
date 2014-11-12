
package ag.controller;

/**
 *
 * @author T107
 */
public class Cuadrado implements Superficie{
    
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    Cuadrado() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    

    public String calularArea(){
        int area = lado * lado;
        return "El area es de: " + area;
    }

    public String calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
