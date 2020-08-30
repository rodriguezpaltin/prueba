
package Vistas;


import Controlador.Controlador_registro_clientes;
import Controlador.Controlador_registro_producto;
import Modelo.Clientes;
import Modelo.ClientesBD;
import Modelo.Producto;
import Modelo.ProductoDB;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Registro_producto extends JFrame {
    
     private ProductoDB modeloDatos;
    JFrame registro_producto = new JFrame("Registrar Producto");;
    JPanel panel_producto=new  JPanel();
     JPanel panel_producto2=new JPanel(new FlowLayout(FlowLayout.CENTER));
     // crear labels segun el diseño
     
    
    JTable tablaproducto=new JTable();
    Box boxNorte = Box.createHorizontalBox();
    JLabel jlistas=new JLabel("LISTA DE CLIENTES");
    JLabel lb_codigo=new JLabel("Codigo");
    JLabel lb_articulo=new JLabel("Articulo");
    JLabel lb_descripcion=new JLabel("Descripcion");
    JLabel lb_valor=new JLabel("Valor");
    JLabel lb_iva=new JLabel("Iva");
    JLabel lb_cantidad=new JLabel("Cantidad");
     
    //crear los texfield
    
    JTextField txt_codigo=new JTextField(10);
    JTextField txt_articulo=new JTextField(10);
    JTextField txt_descripcion=new JTextField(10);
    JTextField txt_valor=new JTextField(10);
    JTextField txt_iva=new JTextField(10);
    JTextField txt_cantidad=new JTextField(10);
    //creamos botones
//    JButton b_consultar = new JButton( "Enviar consulta" );
//    JButton b_guardar=new JButton("Guardar");
//    JButton b_editar=new JButton("Editar");
//    JButton b_eliminar=new JButton("Eliminar");
//    JButton b_atras=new JButton("Atras");
    JButton b_guardar=new JButton("Guardar");
    JButton b_editar=new JButton("Editar");
    JButton b_eliminar=new JButton("Eliminar1");
    JButton b_atras=new JButton("Atras"); 
    JButton b_consultar = new JButton("Enviar consulta");
    
    JComboBox jcb_articulo=new JComboBox();
      private Clientes producto;
      
   public void Mostrar(){
    Iniciar_Componentes();
    guardarproducto();
   //Disposer();
  
    }
     /*private void agregarComponentes() {
        
        // establece objeto JButton para enviar las consultas
        
        botonConsultar.addActionListener(new OyenteListasAlumnos(this));
        // crea objeto Box para manejar la colocación de areaConsulta y
        // botonEnviar en la GUI
        Box boxNorte = Box.createHorizontalBox();
        boxNorte.add( jlistas );
        boxNorte.add( botonConsultar );
        // crea delegado de JTable para modeloTabla
        //JTable tablaResultados = new JTable( modeloTabla );
        
        tablaResultados = new JTable( );
        add( boxNorte, BorderLayout.NORTH );
        add( new JScrollPane( tablaResultados ), BorderLayout.CENTER );
    }
    */
    public void Iniciar_Componentes(){
    GridBagLayout v_producto =new GridBagLayout();
    GridBagConstraints p_principal= new GridBagConstraints ();
    panel_producto.setLayout(v_producto);
    //agregamos labels
    p_principal.gridx=1;
    p_principal.gridy=0;
    panel_producto.add(lb_codigo,p_principal);
    
    p_principal.gridx=3;
    p_principal.gridy=0;
    panel_producto.add(lb_articulo,p_principal);
    
    p_principal.gridx=5;
    p_principal.gridy=0;
    panel_producto.add(lb_descripcion,p_principal);
    
    p_principal.gridx=7;
    p_principal.gridy=0;
    panel_producto.add(lb_valor,p_principal);
    
    p_principal.gridx=9;
    p_principal.gridy=0;
    panel_producto.add(lb_iva,p_principal);
    
    p_principal.gridx=10;
    p_principal.gridy=0;
    panel_producto.add(lb_cantidad,p_principal);
    
    //agregar los texfield
    
    p_principal.gridx=1;
    p_principal.gridy=2;
    panel_producto.add(txt_codigo,p_principal);
    
    p_principal.gridx=3;
    p_principal.gridy=2;
    panel_producto.add(jcb_articulo,p_principal);
        jcb_articulo.addItem("Tarjeta de video");
        jcb_articulo.addItem("Motherboard");
        jcb_articulo.addItem("Memoria Ram");
        jcb_articulo.addItem("Fuente de poder");
        panel_producto.add(jcb_articulo,p_principal);
    
    p_principal.gridx=5;
    p_principal.gridy=2;
    panel_producto.add(txt_descripcion,p_principal);
    
    p_principal.gridx=7;
    p_principal.gridy=2;
    panel_producto.add(txt_valor,p_principal);
    
    p_principal.gridx=9;
    p_principal.gridy=2;
    panel_producto.add(txt_iva,p_principal);
    
    p_principal.gridx=10;
    p_principal.gridy=2;
    panel_producto.add(txt_cantidad,p_principal);
    
    //botones
    
    p_principal.gridx=11;
    p_principal.gridy=2;
    panel_producto.add(b_guardar,p_principal);
    
    p_principal.gridx=10;
    p_principal.gridy=10;
    panel_producto.add(b_editar,p_principal);
    
    p_principal.gridx=11;
    p_principal.gridy=10;
    panel_producto.add(b_eliminar,p_principal);
    
    p_principal.gridx=0;
    p_principal.gridy=10;
    panel_producto.add(b_atras,p_principal);
    
    p_principal.gridx=0;
    p_principal.gridy=11;
    panel_producto.add(b_consultar,p_principal);
    
    p_principal.gridx=3;
    p_principal.gridy=5;
    panel_producto.add(jcb_articulo,p_principal);
    panel_producto2.add(tablaproducto);
       
    registro_producto.add(panel_producto,BorderLayout.NORTH);
    registro_producto.add(panel_producto2,BorderLayout.CENTER);
    registro_producto.add(panel_producto);
    registro_producto.setVisible(true);
    registro_producto.setSize(800, 500);
    registro_producto.setLocationRelativeTo(null);
    registro_producto.pack();
    }
    public void actualizarProducto(ArrayList lis){
                
                 modeloDatos= new ProductoDB(lis);
                 tablaproducto.setModel(modeloDatos);
    }
    public String eliminarProducto(){
            return txt_codigo.getText();
        
        }
    public Clientes guardarproducto() {
        producto=new Clientes();
        producto.setCedula(txt_codigo.getText());
        producto.setNombres(txt_articulo.getText());
        producto.setApellidos(txt_descripcion.getText());
        producto.setDireccion(txt_valor.getText());
        producto.setTeléfono(txt_iva.getText());
        producto.setCorreo(txt_cantidad.getText());
         return producto;
    }
    public void Disposer(){
    registro_producto.setVisible(false);
    }

    public JTextField getTxt_codigo() {
        return txt_codigo;
    }

    public void setTxt_codigo(JTextField txt_codigo) {
        this.txt_codigo = txt_codigo;
    }

    public JTextField getTxt_articulo() {
        return txt_articulo;
    }

    public void setTxt_articulo(JTextField txt_articulo) {
        this.txt_articulo = txt_articulo;
    }

    public JTextField getTxt_descripcion() {
        return txt_descripcion;
    }

    public void setTxt_descripcion(JTextField txt_descripcion) {
        this.txt_descripcion = txt_descripcion;
    }

    public JTextField getTxt_valor() {
        return txt_valor;
    }

    public void setTxt_valor(JTextField txt_valor) {
        this.txt_valor = txt_valor;
    }

    public JTextField getTxt_iva() {
        return txt_iva;
    }

    public void setTxt_iva(JTextField txt_iva) {
        this.txt_iva = txt_iva;
    }

    public JTextField getTxt_cantidad() {
        return txt_cantidad;
    }

    public void setTxt_cantidad(JTextField txt_cantidad) {
        this.txt_cantidad = txt_cantidad;
    }

    public JButton getB_guardar() {
        return b_guardar;
    }

    public JButton getB_editar() {
        return b_editar;
    }

    public JButton getB_eliminar() {
        return b_eliminar;
    }

    public JButton getB_atras() {
        return b_atras;
    }

    public JButton getB_consultar() {
        return b_consultar;
    }

    public String eliminarproducto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    
    
    
    
    
    
//    registro_producto.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//    b_guardar.addActionListener(new Controlador_registro_producto);
//    b_eliminar.addActionListener((ActionListener)new Controlador_registro_producto(this));
//    b_consultar.addActionListener((ActionListener)new Controlador_registro_producto(this));
//    registro_producto.pack();
//    
//    }
//    
//    
//    
//    
//    public void actualizarCliente(ArrayList lis){
//                
//                 modeloDatos= new ClientesBD(lis);
//                 tablaproducto.setModel(modeloDatos);
//    }
//    
//    
//    
//    public void Disposer(){
//
//      registro_producto.setVisible(false);
//    }
//    public String eliminarCliente(){
//            return txt_codigo.getText();
//        
//        }
//    public Clientes guardarproducto() {
//        producto=new Clientes();
//        producto.setCedula(txt_codigo.getText());
//        producto.setNombres(txt_articulo.getText());
//        producto.setApellidos(txt_descripcion.getText());
//        producto.setDireccion(txt_valor.getText());
//        producto.setTeléfono(txt_iva.getText());
//        producto.setCorreo(txt_cantidad.getText());
//
//        return producto;
//
//    }
//    
//    
//    public void Dispone(){
//    registro_producto.setVisible(false);
//    
//    }
//    
//
//    public JTextField getTxt_codigo() {
//        return txt_codigo;
//    }
//
//    public JTextField getTxt_articulo() {
//        return txt_articulo;
//    }
//
//    public JTextField getTxt_descripcion() {
//        return txt_descripcion;
//    }
//
//    public JTextField getTxt_valor() {
//        return txt_valor;
//    }
//
//    public JTextField getTxt_iva() {
//        return txt_iva;
//    }
//
//    public JTextField getTxt_cantidad() {
//        return txt_cantidad;
//    }
//
//    public JButton getB_guardar() {
//        return b_guardar;
//    }
//
//    public JButton getB_editar() {
//        return b_editar;
//    }
//
//    public JButton getB_eliminar() {
//        return b_eliminar;
//    }
//
//    public JButton getB_atras() {
//        return b_atras;
//    }
//
//    public JComboBox getJcb_articulo() {
//        return jcb_articulo;
//    }
//
//}