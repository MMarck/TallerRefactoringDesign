package modelos;

import java.util.ArrayList;

public class Estudiante{
    //Informacion del estudiante
    public String matricula;
    public String nombre;
    public String apellido;
    public String facultad;
    public int edad;
    public String direccion;
    public String telefono;
    public ArrayList<Paralelo> paralelos;
    public ArrayList<Nota> inicial;
    public ArrayList<Nota> Final;
    
    //Getter y setter de Matricula

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //Getter y setter del Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Getter y setter del Apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    //Getter y setter de la Facultad
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    //Getter y setter de la edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Getter y setter de la direccion
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //Getter y setter del telefono

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    public double CalcularNota(Nota n, boolean isFinal){
        double nota=0;
        for(Paralelo par:paralelos){
            if(n.getParalelo().equals(par)){
                int i=paralelos.indexOf(par);
                double notaTeorico=(n.getNexamen()+n.getNdeberes()+n.getNlecciones())*0.80;
                double notaPractico=(n.getNtalleres())*0.20;
                nota=notaTeorico+notaPractico;
                if (isFinal){
                    this.Final.get(i).setTotal(nota);
                } else {
                    this.inicial.get(i).setTotal(nota);
                }
            }
        }
        return nota;
    }
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public double CalcularNotaTotal(Paralelo p){
        double notaTotal=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                int i=paralelos.indexOf(p);
                notaTotal=(this.inicial.get(i).getTotal()+this.Final.get(i).getTotal())/2;
                
            }
        }
        return notaTotal;
        
    }
}
        
    
    
    
            
        
        
