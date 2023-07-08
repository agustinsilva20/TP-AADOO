package Controladores;

import Clases.Animal.Animal;

import java.util.List;

public class ControllerAnimal {

    private static ControllerAnimal instance;
    private static List<Animal> Animales;

    private List<Animal> instanciarAnimales() {
        //Instanciar adopciones
        return null;
    }

    private ControllerAnimal(){}

    public static ControllerAnimal getInstance(){
        if (instance == null){
            instance = new ControllerAnimal();

        }
        return instance;
    }
}
