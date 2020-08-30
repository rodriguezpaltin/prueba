package Vistas;

import Modelo.ProductoDB;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Erick Gaona
 */
public class Generar_factura {
    JFrame factura=new JFrame();
    JPanel p_factura=new JPanel();
    JLabel l_numerofact=new JLabel("numero");
    JLabel l_nombres=new JLabel("nombres");
    JLabel l_apellidos=new JLabel("apellidos");
    JLabel l_cedula=new JLabel("cedula");
    JLabel l_fecha=new JLabel("fecha");
    JLabel l_direccion=new JLabel("direcion");
    JLabel l_vendedor=new JLabel("vendedor");
    JPanel p_factura2=new JPanel(new FlowLayout(FlowLayout.CENTER));
    JTable tablaproducto=new JTable();
    
    
    JTextField txt_numerofact=new JTextField(10);
    JTextField txt_nombres=new JTextField(10);
    JTextField txt_apellidos=new JTextField(10);
    JTextField txt_cedula=new JTextField(10);
    JTextField txt_fecha=new JTextField(10);
    JTextField txt_direccion=new JTextField(10);
    JTextField txt_vendedor=new JTextField(10);
    
    JButton b_guardar=new JButton("Guardar");
    JButton b_editar=new JButton("Editar");
    JButton b_eliminar=new JButton("Eliminar1");
    JButton b_atras=new JButton("Atras"); 
    JButton b_consultar = new JButton("Enviar consulta");
    
public void Iniciar_Componentes(){
    GridBagLayout v_producto =new GridBagLayout();
    GridBagConstraints p_principal= new GridBagConstraints ();
    p_factura.setLayout(v_producto);
    //agregamos labels
    p_principal.gridx=1;
    p_principal.gridy=0;
    p_factura.add(l_numerofact,p_principal);
    
    p_principal.gridx=3;
    p_principal.gridy=0;
    p_factura.add(l_nombres,p_principal);
    
    p_principal.gridx=5;
    p_principal.gridy=0;
    p_factura.add(l_apellidos,p_principal);
    
    p_principal.gridx=7;
    p_principal.gridy=0;
    p_factura.add(l_cedula,p_principal);
    
    p_principal.gridx=9;
    p_principal.gridy=0;
    p_factura.add(l_fecha,p_principal);
    
    p_principal.gridx=10;
    p_principal.gridy=0;
    p_factura.add(l_direccion,p_principal);
    
    p_principal.gridx=11;
    p_principal.gridy=0;
    p_factura.add(l_vendedor,p_principal);
    
    
    //agregar los texfield
    
    p_principal.gridx=1;
    p_principal.gridy=2;
    p_factura.add(txt_numerofact,p_principal);
    
    
    
    p_principal.gridx=6;
    p_principal.gridy=2;
    p_factura.add(txt_nombres,p_principal);
    
    p_principal.gridx=7;
    p_principal.gridy=2;
    p_factura.add(txt_apellidos,p_principal);
    
    p_principal.gridx=9;
    p_principal.gridy=2;
    p_factura.add(txt_cedula,p_principal);
    
    p_principal.gridx=10;
    p_principal.gridy=2;
    p_factura.add(txt_fecha,p_principal);
    
    p_principal.gridx=10;
    p_principal.gridy=2;
    p_factura.add(txt_direccion,p_principal);
    
    p_principal.gridx=10;
    p_principal.gridy=2;
    p_factura.add(txt_vendedor,p_principal);
    //botones
    
    p_principal.gridx=11;
    p_principal.gridy=2;
    p_factura.add(b_guardar,p_principal);
    
    p_principal.gridx=10;
    p_principal.gridy=10;
    p_factura.add(b_editar,p_principal);
    
    p_principal.gridx=11;
    p_principal.gridy=10;
   p_factura.add(b_eliminar,p_principal);
    
    p_principal.gridx=0;
    p_principal.gridy=10;
    p_factura.add(b_atras,p_principal);
    
    p_principal.gridx=0;
    p_principal.gridy=11;
    p_factura.add(b_consultar,p_principal);
    
   
    
    p_factura2.add(tablaproducto);
       
     factura.add(p_factura,BorderLayout.NORTH);
     factura.add(p_factura2,BorderLayout.CENTER);
     factura.add(p_factura);
     factura.setVisible(true);
     factura.setSize(800, 500);
     factura.setLocationRelativeTo(null);
     factura.pack();
    }
public void Mostrar(){
    Iniciar_Componentes();
}}