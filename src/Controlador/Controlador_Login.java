
package Controlador;

import Vistas.login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class Controlador_Login implements ActionListener{
login login=new login();

    public Controlador_Login(login login) {
        this.login=login;

    }
    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource()== login.getAceptar()){
            if(login.getT_usuario().getText().isEmpty()&& login.getT_contraseña().getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese datos obligatorios ");
            }
            else{
                if(login.getT_usuario().getText().equals("rafa")&& login.getT_contraseña().getText().equals("rafa")){
            JOptionPane.showMessageDialog(null,"Bienvenido\n" + "Ha ingresado correctamente ","Confirmacion de ingreso", JOptionPane.INFORMATION_MESSAGE);
            new Vistas.Vista_Principal().Mostrar();
        }else{
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecto ");  
                }
            
            }
        }
        
        if(event.getSource()==login.getCancelar()){
        if (JOptionPane.showConfirmDialog(null, "Quieres salir del sistema ", " ", JOptionPane.YES_OPTION)==JOptionPane.YES_OPTION){
                      System.exit(0);
                }
        }   
    }     
}
