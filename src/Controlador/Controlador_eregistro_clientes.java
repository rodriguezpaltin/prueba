package Controlador;

import Modelo.SistemaBD;
import Vistas.Registro_clientes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador_eregistro_clientes implements ActionListener{
       

    
    Registro_clientes Eliminar;
    SistemaBD abd;
    public Controlador_eregistro_clientes(Registro_clientes eliminar){
        this.Eliminar=eliminar;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
      if (JOptionPane.showConfirmDialog(null, "Quieres Eliminar el registro? ", " ", JOptionPane.YES_OPTION)==JOptionPane.YES_OPTION){
                 abd.eliminar( Eliminar.eliminarCliente());     
                }else{
            JOptionPane.showMessageDialog(null, "No se a eliminado el registro ");
      
      
      }  
    }
}


    