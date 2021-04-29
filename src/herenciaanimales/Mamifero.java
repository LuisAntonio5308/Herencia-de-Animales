/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaanimales;

/**
 *
 * @author lo397
 */
public class Mamifero extends Animal{
    //Color no accesible directamente
    //getColor() si es accesible
    //setColor() si es accesible
//    public Mamifero(){
//        super();
//    }
//    
//    public Mamifero(String colorPadre, String colorHijo){
//        super(colorPadre);
//        this.Color= colorHijo;
//    }
//    
//    @Override
//    public String getColor(){
//        return super.getColor();
//    }
    protected String tamano;
    public Mamifero(){
        super();
    }

    public Mamifero(String Color, String tamano) {
        super(Color);
        this.tamano = tamano;
    }
    
    public Mamifero(String tamano){
        super();
        this.tamano = tamano;
    }
    
}
