/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pckModelos;

import java.util.PriorityQueue;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author huawei
 */
public class PacientesModel {
    PriorityQueue <Pacientes> ListaPacientes = new PriorityQueue<Pacientes>();
    DefaultTableModel ModeloTabla = new DefaultTableModel();
    
    public void IngresarPaciente(String ape, String name, String tel, int grav){
        Pacientes nuevoPaciente = new Pacientes(ape, name, tel, grav);
        ListaPacientes.add(nuevoPaciente);
    }
    
    public DefaultTableModel ListarPacientes(){
        this.ModeloTabla.addColumn("APELLIDOS");
        this.ModeloTabla.addColumn("NOMBRES");  
        this.ModeloTabla.addColumn("TELÉFONO");
        this.ModeloTabla.addColumn("GRAVEDAD");
        
        for(Pacientes MiListaDePacientes: ListaPacientes){
            
            this.ModeloTabla.addRow(new Object[]{MiListaDePacientes.getApellidos(),
            MiListaDePacientes.getNombres(), MiListaDePacientes.getTelefono(),
            MiListaDePacientes.getGravedad()});
        }
        return ModeloTabla;
    }
}
