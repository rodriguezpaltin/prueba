
package Controlador;

import Modelo.Clientes;
import Modelo.SistemaBD;
import Vistas.Registro_clientes;
import Vistas.Registro_producto;
import Vistas.Vista_Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick Gaona
 */
public class Controlador_registro_clientes implements ActionListener{
                
        Registro_clientes Clientes;
        SistemaBD abd;
        Clientes a; 
        public Controlador_registro_clientes(Registro_clientes cli){
        this.Clientes=cli;
        }
        
        
    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource()== Clientes.getB_guardar()){
        System.out.println("Guardando..... ");
                //de la vista recibo un alumno
                a=Clientes.guardarCliente();
                //en la base de datos envio un alumno a guardar
                abd.guardarClienteBD(a);
        }
        if (event.getSource() == Clientes.getB_eliminar()) {
            if (JOptionPane.showConfirmDialog(null, "Quieres Eliminar el registro? ", " ", JOptionPane.YES_OPTION)==JOptionPane.YES_OPTION){
                 abd.eliminar( Clientes.eliminarCliente());     
                }else{
            JOptionPane.showMessageDialog(null, "No se a eliminado el registro ");
      }   
        }
        if (event.getSource() == Clientes.getB_consultar()) {
            Clientes.actualizarCliente(abd.cargar());
            
      }
        }
}
        

    


    
    
    
    
    
