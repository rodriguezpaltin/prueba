
package Controlador;

import Modelo.Clientes;
import Modelo.SistemaBD;
import Vistas.Registro_clientes;
import Vistas.Registro_producto;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


public class Controlador_registro_producto {
    
   
    
    
        Registro_producto producto;
        SistemaBD abd;
        Clientes a; 
        public Controlador_registro_producto(Registro_producto producto){
        this.producto=producto;
        }
        
        
   public void actionPerformed(ActionEvent event) {
        if(event.getSource()== producto.getB_guardar()){
        System.out.println("Guardando..... ");
                //de la vista recibo un alumno
                a=producto.guardarproducto();
                //en la base de datos envio un alumno a guardar
                abd.guardarClienteBD(a);
        }
        if (event.getSource() == producto.getB_eliminar()) {
            if (JOptionPane.showConfirmDialog(null, "Quieres Eliminar el registro? ", " ", JOptionPane.YES_OPTION)==JOptionPane.YES_OPTION){
                 abd.eliminar( Clientes.eliminarproducto());     
                }else{
            JOptionPane.showMessageDialog(null, "No se a eliminado el registro ");
      }   
        }
        if (event.getSource() == producto.getB_editar()) {
            producto.actualizarProducto(abd.cargar());
            
      }
        }
}
