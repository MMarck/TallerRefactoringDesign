package modelos;

public class Materia {
    private String codigo;
    private String nombre;
    private String facultad;
    
    public String getCodigo(){
        return codigo; 
    } 
    
    public String getNombre(){
        return nombre;
    } 
    
    public String getFacultad(){
        return facultad;
    }  

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
}

