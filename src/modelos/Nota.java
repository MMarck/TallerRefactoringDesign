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
    private Paralelo paralelo;
    private double nexamen;
    private double ndeberes;
    private double nlecciones;
    private double ntalleres;
    private double total;

    public Nota(Paralelo paralelo) {
        this.paralelo = paralelo;
        this.nexamen = 0.0;
        this.ndeberes = 0.0;
        this.nlecciones = 0.0;
        this.ntalleres = 0.0;
        this.total=0.0;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    public Paralelo getParalelo() {
        return paralelo;
    }

    public void setParalelo(Paralelo paralelo) {
        this.paralelo = paralelo;
    }

    public double getNexamen() {
        return nexamen;
    }

    public void setNexamen(double nexamen) {
        this.nexamen = nexamen;
    }

    public double getNdeberes() {
        return ndeberes;
    }

    public void setNdeberes(double ndeberes) {
        this.ndeberes = ndeberes;
    }

    public double getNlecciones() {
        return nlecciones;
    }

    public void setNlecciones(double nlecciones) {
        this.nlecciones = nlecciones;
    }

    public double getNtalleres() {
        return ntalleres;
    }

    public void setNtalleres(double ntalleres) {
        this.ntalleres = ntalleres;
    }
    
    
}
