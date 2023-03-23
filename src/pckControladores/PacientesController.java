/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pckControladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pckModelos.PacientesModel;
import pckVistas.frmPrincipal;

/**
 *
 * @author huawei
 */
public class PacientesController implements ActionListener{
    frmPrincipal VistaPrincipal;
    PacientesModel ModeloPacientes;

    public PacientesController(frmPrincipal VistaPrincipal, PacientesModel ModeloPacientes) {
        this.VistaPrincipal = VistaPrincipal;
        this.ModeloPacientes = ModeloPacientes;
        
        //PONER A LA ESCUCHA LOS BOTONES
        this.VistaPrincipal.btnIngresar.addActionListener(this);
        this.VistaPrincipal.btnAtender.addActionListener(this);
        //LEVANTAR LA VISTA PRINCIPAL
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.VistaPrincipal.btnIngresar){
            this.ModeloPacientes.IngresarPaciente(this.VistaPrincipal.txtApellidos.getText(),
                    this.VistaPrincipal.txtNombres.getText(),
                    this.VistaPrincipal.txtTelefono.getText(),
                    Integer.parseInt(this.VistaPrincipal.txtPrioridad.getText()));
            
            this.VistaPrincipal.jtTablaPacientes.setModel(this.ModeloPacientes.ListarPacientes());
        }
    }
    
}
