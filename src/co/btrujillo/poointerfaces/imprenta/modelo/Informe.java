package co.btrujillo.poointerfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible{

    private Persona revisor;
    private Persona autor;

    public Informe(String contenido, Persona revisor, Persona autor) {
        super(contenido);
        this.revisor = revisor;
        this.autor = autor;
    }

    @Override
    public String imprimir() {
        return "\nInforme escrito por: " + autor + "\nrevisado por: " +
                revisor +"\n"+ this.contenido;
    }
}
