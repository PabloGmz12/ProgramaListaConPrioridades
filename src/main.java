
import pckControladores.PacientesController;
import pckModelos.PacientesModel;
import pckVistas.frmPrincipal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author huawei
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        PacientesModel ModeloPacientes = new PacientesModel();
        PacientesController ControladorPacientes = new PacientesController(VistaPrincipal, ModeloPacientes);
    }
}
