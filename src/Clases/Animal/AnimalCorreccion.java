package Clases.Animal;

public class AnimalCorreccion {

    public AnimalCorreccion(Double altura, Double peso, int edad,Boolean buenEstadoSalud,Boolean salvaje) {
        this.enTratamiento = false;
        this.salvaje = salvaje;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
        this.buenEstadoSalud = buenEstadoSalud;
    }
    private Boolean enTratamiento;
    private Boolean salvaje;
    private Double peso;
    private int edad;
    private Double altura;
    private Boolean buenEstadoSalud;


    public void setEnTratamiento(){
        this.enTratamiento = true;
    }

    public Boolean enTratamiento() {
        return this.enTratamiento;
    }

    public Boolean getSalvaje() {
        return this.salvaje;
    }

}
