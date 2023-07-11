package Controladores;


import Clases.Animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class ControllerAnimal {

    private static ControllerAnimal instance;
    private static List<Animal> animales = new ArrayList<>();

    private ControllerAnimal(){}

    public static ControllerAnimal getInstance(){
        if (instance == null){
            instance = new ControllerAnimal();
            instance.instanciarAnimales();
        }
        return instance;
    }

    private void instanciarAnimales() {
        animales.add(new Animal(0.3, 10.0, 2, true,true));
        animales.add(new Animal(0.3, 10.0, 2, true,false));
        animales.add(new Animal(0.3, 10.0, 2, false,false));
        animales.add(new Animal(0.3, 10.0, 2, true,false));
        animales.add(new Animal(0.3, 10.0, 2, true,false));
    }

    public List<Animal> getAnimales(){
        return animales;
    }

    public void agregarAnimal(Animal animal){
        animales.add(animal);
    }
}

