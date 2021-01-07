package modelos;

public class Materia {
    private String codigo;
    private String nombre;
    private String facultad;
    private double notaInicial;
    private double notaFinal;
    private double notaTotal;  
    
    public String getCodigo(){
        return codigo; 
    } 
    
    public String getNombre(){
        return nombre;
    } 
    
    public String getFacultad(){
        return facultad;
    }  
    
    public double getNotaInicial(){
        return notaInicial;
    }  
    
    public double getNotaFinal(){
        return notaFinal;
    }  
    
    public double getNotatotal(){
        return notaTotal;
    }  
    
    public void setCodigo(){
        this.codigo=codigo;
    } 
    
    public void setNombre(){
        this.nombre=nombre;
    } 
    
    public void setFacultad(){
        this.facultad=facultad;
    } 
    
    public void setNotaInicial(){
        this.notaInicial=notaInicial;
    } 
    
    public void setNotaFinal(){
        this.facultad=facultad;
    } 
    
    public void setNotaTotal(){
        this.notaTotal=notaTotal;
    } 
    
    
}

