/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author Estudiante
 */
public class B extends A{
    private int b1;
    
    public B(int a1, int b1){
        
    super(a1);
    this.b1 = b1;
            
            }
    public void yy(){
        System.out.println("YY");
    }
    // Para cambiar un metodo que no me gusta
    @Override
    public void xx(){
        System.out.println("En B");
    }
}
