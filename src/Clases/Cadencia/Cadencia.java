package Clases.Cadencia;
import java.time.LocalTime;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;

/**
 * 
 */
public class Cadencia {

    public Cadencia() {
        LocalDate fechaActual = LocalDate.now();
        this.dia = Date.from(fechaActual.atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.horario = LocalTime.now();
    }

    public Date getDia(){
        return dia;
    }

    public LocalTime getHorario(){
        return horario;
    }
    private Date dia;

    private LocalTime horario;

}