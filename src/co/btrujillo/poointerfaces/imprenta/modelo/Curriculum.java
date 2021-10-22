package co.btrujillo.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible{
    private Persona persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculum(Persona persona, String carrera,String contenido){
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();

    }
    public Curriculum addExperiencias(String experiencia){
        experiencias.add(experiencia);
        return this;
    }


    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("\nNombre: ")
                .append(persona)
                .append("\nResumen: ").append(contenido)
                .append("\nProfesion: ").append(carrera)
                .append("\nExperiencia: ");
        for(String exp:experiencias){
            sb.append("\n-").append(exp);
        }
        return sb.toString();
    }
}
