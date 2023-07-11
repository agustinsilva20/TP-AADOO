package Clases.Control;

import java.util.*;

public class Control {


    public Control(TipoControl tipo) {
        this.detalleControl = tipo;
        this.completado = false;
        this.descripcionTarea = "";
    }

    private TipoControl detalleControl;
    private Boolean completado;
    public String descripcionTarea;

    public void marcarCompletado() {
        this.completado = true;
    }

    public void indicarComentario(String comentario) {
        this.descripcionTarea = comentario;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }
}