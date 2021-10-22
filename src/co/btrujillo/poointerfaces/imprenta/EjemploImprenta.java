package co.btrujillo.poointerfaces.imprenta;

import co.btrujillo.poointerfaces.imprenta.modelo.*;
import static co.btrujillo.poointerfaces.imprenta.modelo.Genero.ACADEMICO;
import static co.btrujillo.poointerfaces.imprenta.modelo.Imprimible.*;
public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv =new Curriculum(new Persona("Wally", "Perez"),"Programador","Resumen laboral");
        cv.addExperiencias("Java")
                .addExperiencias("Mantenimiento de lavadoras")
                .addExperiencias("Computación");

        Libro libro = new Libro("Erich Gamma","Patron de diseños: Elementos reusables POO",
                ACADEMICO);
        libro.addPagina(new Pagina("Patron de Singleton"))
                .addPagina(new Pagina("Patron observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Facade"));

        Informe informe = new Informe("Estudio sobre microservicios",
                new Persona("Jason", "Fores"),new Persona("Jake", "Martinez"));

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        Imprimible obtImp = new Imprimible() {
            @Override
            public String imprimir() {
                return "Imprimiendo objeto anonimo al vuelo";
            }
        };

        imprimir(new Imprimible(){});
        imprimir(obtImp);

    }

}
