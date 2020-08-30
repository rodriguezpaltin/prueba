
package Vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Erick Gaona
 */
public class Usuarios {

    private static void setIcon(ImageIcon image) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    JFrame v_uruario=new JFrame();
    JPanel p_usuario=new JPanel();
    JPanel p_usuari=new JPanel();
    JLabel logo=new JLabel();
    
    JPasswordField contraseña=new JPasswordField(10);
    JLabel usuario=new JLabel("Usuario");
//  JLabel ucontraseña=new JLabel("Contraseña");
    JTextField txt_usuario=new JTextField(10);
    
    JButton b_consultar = new JButton( "Enviar consulta atras" );
    
     ImageIcon image =  new ImageIcon(getClass().getResource("/Imagenes/indice.png"));
    
    public void Mostrar(){
    Iniciar_Componentes();
    ventana();
    }

  public void Iniciar_Componentes(){
    GridBagLayout v_posicion =new GridBagLayout();
    GridBagConstraints v_posicion1= new GridBagConstraints ();
    p_usuario.setLayout(v_posicion);
    
    
     v_posicion1.insets= new Insets(1, 1, 1, 1); 
    v_posicion1.gridx=0;
    v_posicion1.gridy=0;
    p_usuario.add(logo,v_posicion1);

// aqui era tu error por que no enviamas parametros de nada 
//
    v_posicion1.gridx=0;
    v_posicion1.gridy=0;
    p_usuario.add(usuario,v_posicion1);
    
    v_posicion1.gridx=0;
    v_posicion1.gridy=1;
    p_usuario.add(txt_usuario,v_posicion1);
    
    v_posicion1.gridx=0;
    v_posicion1.gridy=2;
    p_usuario.add(contraseña,v_posicion1);
    
    
    
    
    // botones
    v_posicion1.gridx=0;
    v_posicion1.gridy=4;
    p_usuario.add(b_consultar,v_posicion1);
    b_consultar.addActionListener((ae) -> 
        {Vista_Principal b_consultar= new Vista_Principal();});
    
    //b_consultar.setVisible(true);
    
//    Usuarios.add(v_posicion1,BorderLayout.NORTH);
//    Usuarios.add(v_posicion1,BorderLayout.CENTER);
//    Usuarios.add(v_posicion1);
//    Usuarios.setVisible(true);
//    Usuarios.setSize(800, 500);
//    Usuarios.setLocationRelativeTo(null);
//    Usuarios.pack();
//    
    
    

      }
  public void ventana(){
      
         
        //aqui das tamaño a la ventana, posicion , se haga visible 
        v_uruario.add(p_usuario);
        v_uruario.setBounds(400, 150, 350, 380);
        v_uruario.setVisible(true);
        v_uruario.setLocationRelativeTo(null);
        logo.setIcon(image);
        v_uruario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p_usuario.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED)
        ,"Por favor ingresar",TitledBorder.CENTER,TitledBorder.DEFAULT_POSITION));
        v_uruario.add(p_usuario,BorderLayout.SOUTH);
    }

 }
    
