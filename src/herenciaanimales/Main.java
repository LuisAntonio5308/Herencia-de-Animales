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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creacion del objeto de la clase Animal
        //Instacion de la clase animal
        //tipo nombre = valor();
        Animal animal = new Animal();
        System.out.println(animal.getColor());
        //Inicilizar color
        //animal.Color = "Rojo";
        //Clase nombreObjeto = new Constructor();
//        System.out.println(animal.getColor());
//        
//        Animal animal2 = new Animal("Lila");
//        System.out.println(animal2.getColor());
        
        //Creacions de objeto de la clase mamifero
        Mamifero mamifero1 = new Mamifero();
        mamifero1.setColor("Azul");
        mamifero1.setTamano("Grande");
        System.out.println(mamifero1.getColor());
        System.out.println(mamifero1.getTamano());
        
        
    }
    
}
