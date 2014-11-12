
package com.jc.elementos.controller;


public class ServicioSuperficie {
    Superficie superficie;

    public ServicioSuperficie() {
    }

    public ServicioSuperficie(Superficie superficie) {
        this.superficie = superficie;
    }
    
    public String servicioArea(){
        //return superficie.calcularArea();
        Cuadrado d = new Cuadrado();
        d.setLado(5);
        return d.calcularArea();
    }
}
