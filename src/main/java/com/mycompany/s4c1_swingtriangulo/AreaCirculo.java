/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s4c1_swingtriangulo;

/**
 *
 * @author josev
 */
public class AreaCirculo extends Geometria{
    double radio;
    public double calcularArea(){
        return Math.PI*(radio*radio);
    }
    public double calcularPerimetro(){
        return 2*Math.PI*this.radio;
    }
}
