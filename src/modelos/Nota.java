/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Franklin
 */
public class Nota {
    private Estudiante est;
    private Materia materia;
    private double nexamen;
    private double ndeberes;
    private double nlecciones;
    private double ntalleres;

    public Nota(Estudiante est, Materia materia) {
        this.est = est;
        this.materia = materia;
        this.nexamen = 0.0;
        this.ndeberes = 0.0;
        this.nlecciones = 0.0;
        this.ntalleres = 0.0;
    }
    
    
}
