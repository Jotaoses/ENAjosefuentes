/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author DellPC
 */
public class Requerimiento {
    int id;
    private int id_gerencia;
    private int id_departamento;
    private int id_asigna;
    private int id_encargado;
    private String descripcion;
    
  public Requerimiento(){}

    public Requerimiento(int id, int id_gerencia, int id_departamento, int id_asigna, int id_encargado, String descripcion) {
        this.id = id;
        this.id_gerencia = id_gerencia;
        this.id_departamento = id_departamento;
        this.id_asigna = id_asigna;
        this.id_encargado = id_encargado;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_gerencia() {
        return id_gerencia;
    }

    public void setId_gerencia(int id_gerencia) {
        this.id_gerencia = id_gerencia;
    }

    public int getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    public int getId_asigna() {
        return id_asigna;
    }

    public void setId_asigna(int id_asigna) {
        this.id_asigna = id_asigna;
    }

    public int getId_encargado() {
        return id_encargado;
    }

    public void setId_encargado(int id_encargado) {
        this.id_encargado = id_encargado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
  
  
}
