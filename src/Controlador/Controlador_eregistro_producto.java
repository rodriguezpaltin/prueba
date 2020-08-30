
package Controlador;

import Modelo.SistemaBD;
import Vistas.Registro_clientes;
import Vistas.Registro_producto;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


public class Controlador_eregistro_producto {
    Registro_producto Eliminar;
    SistemaBD abd;
    public Controlador_eregistro_producto(Registro_producto eliminar){
      this.Eliminar=eliminar;
    }

    public void actionPerformed(ActionEvent event) {
      if (JOptionPane.showConfirmDialog(null, "Quieres Eliminar el registro? ", " ", JOptionPane.YES_OPTION)==JOptionPane.YES_OPTION){
                 abd.eliminar( Eliminar.eliminarproducto());     
                }else{
            JOptionPane.showMessageDialog(null, "No se a eliminado el registro ");
      
      
      }  
    }
}


