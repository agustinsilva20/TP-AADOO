package Controladores;


import Clases.Animal.AnimalCorreccion;
import java.util.List;

public class ControllerAnimal {

    private static ControllerAnimal instance;
    private static List<AnimalCorreccion> animales;

    private ControllerAnimal(){}

    public static ControllerAnimal getInstance(){
        if (instance == null){
            instance = new ControllerAnimal();
            instance.instanciarAnimales();
        }
        return instance;
    }

    private void instanciarAnimales() {
        animales.add(new AnimalCorreccion(0.3, 10.0, 2, true,true));
        animales.add(new AnimalCorreccion(0.3, 10.0, 2, true,false));
        animales.add(new AnimalCorreccion(0.3, 10.0, 2, false,false));
        animales.add(new AnimalCorreccion(0.3, 10.0, 2, true,false));
        animales.add(new AnimalCorreccion(0.3, 10.0, 2, true,false));
    }

    public List<AnimalCorreccion> getAnimales(){
        return animales;
    }

    public void agregarAnimal(AnimalCorreccion animal){
        animales.add(animal);
    }
}

