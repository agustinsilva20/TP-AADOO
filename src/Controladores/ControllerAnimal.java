package Controladores;

import Clases.Animal.Animal;

import java.util.List;

public class ControllerAnimal {

    private static ControllerAnimal instance;
    private List<Animal> animales;

    private ControllerAnimal(){}

    public static ControllerAnimal getInstance(){
        if (instance == null){
            instance = new ControllerAnimal();

        }
        return instance;
    }
}
