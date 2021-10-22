package co.btrujillo.poointerfaces.imprenta.modelo;

public interface Imprimible {
    static String MENSAJE_ESTATICO ="Imprimiendo mensaje estatico";
    default String imprimir(){
        return MENSAJE_ESTATICO;
    }


   static void imprimir(Imprimible imprimible) {
       System.out.println(imprimible.imprimir());
   }
}
