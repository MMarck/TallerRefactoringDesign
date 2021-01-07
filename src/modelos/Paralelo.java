package modelos;

import java.util.ArrayList;

public class Paralelo {
    private int numero;
    private Materia materia;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;
    private Ayudante ayudante;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    public ArrayList<Estudiante> getEstudiantes(){
        return this.estudiantes;
    }
    
    public void addEstudiante(Estudiante est){
        this.estudiantes.add(est);
    }
    
    public boolean removeEstudiante(Estudiante est) {
        return this.estudiantes.remove(est);
    }
}
