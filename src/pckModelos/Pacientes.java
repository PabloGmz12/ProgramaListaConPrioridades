/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pckModelos;

/**
 *
 * @author huawei
 */
public class Pacientes implements Comparable<Pacientes>{
    String apellidos;
    String nombres;
    String telefono;
    int gravedad;

    public Pacientes(String apellidos, String nombres, String telefono, int gravedad) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.telefono = telefono;
        this.gravedad = gravedad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }

    @Override
    public int compareTo(Pacientes o) {
        return o.gravedad <this.gravedad ? 1: -1;
    }
}
