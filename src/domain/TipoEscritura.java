package domain;

public enum TipoEscritura {
    CLASICO("Escritura a mano"),
    MODERNO("Escritura digiatl");

    private final String descripcion;
    
    private TipoEscritura(String descripcion){
        this.descripcion = descripcion;
    }
    
    public String getDescription(){
        return this.descripcion;
    }
}
