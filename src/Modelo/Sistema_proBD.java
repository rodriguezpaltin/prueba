
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Sistema_proBD {
    
    private static ArrayList<String> listaNombres;
    private static ArrayList<Producto> listaClientes;
    
    
    public static void guardarClienteBD(Producto producto){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/producto","root","rafa");
			System.out.print("Conexion establecida!");
                        
			Statement sentencia = conexion.createStatement();
				int insert = sentencia.executeUpdate("insert into clientes values('"+producto.getCodigo()+
						"','"+producto.getArticulo()+"','"+producto.getDescripcion()+"','"+producto.getValor()+"','"
                                                +producto.getIva()
                                                +"','"+producto.getCantidad()+"')");
				sentencia.close();
				conexion.close();	
		}catch(Exception ex){
			System.out.print("Error en la conexion"+ex);
		}
	}
    public static void eliminar(String codigo){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/producto","root","rafa");
			System.out.print("Conexion Establecida");
			Statement sentencia = conexion.createStatement();
			int insert = sentencia.executeUpdate("delete from producto where producto= '"+codigo+"'");
			
			sentencia.close();
			conexion.close();
		}catch(Exception ex){
			System.out.print("Error en la conexion"+ex);
		}
	}
    
    public static Producto buscarCliente(String codigo){
    
          Producto producto= new Producto();
           
              try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/producto","root","rafa");
			//System.out.print("Conexion Establecida");
			Statement sentencia = conexion.createStatement();
			ResultSet necesario = sentencia.executeQuery("select * from producto "
                                + "where codigo = '"+codigo+"'");
                        
			while(necesario.next()){
					String ced= necesario.getString("codigo");
                                        String nom = necesario.getString("Artidulo");
					String ape = necesario.getString("descripcion");
                                       String car = necesario.getString("Valor");
                                       String mod = necesario.getString("Iva");
                                       String tel = necesario.getString("Cantidad");
                                       
                                      
					
                                       producto.setCodigo(ced);
					producto.setArticulo(nom);
					producto.setDescripcion(ape);
					producto.setValor(car);
                                       producto.setIva(mod);
                                       producto.setCantidad(tel);
					 
					
			}
			sentencia.close();
			conexion.close();
		}catch(Exception ex){
			System.out.print("Error en la conexion"+ex);
		}
    
           return producto;
    
     }
    public static ArrayList cargar(){
			
            try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/producto","root","rafas");
				System.out.print("Conexion establecida1!");
				Statement sentencia = conexion.createStatement();
				ResultSet necesario = sentencia.executeQuery("select * from producto");
                                Producto producto;
				 
				listaClientes = new ArrayList<>();
				while(necesario.next()){
					
                                       String ced= necesario.getString("codigo");
                                       String nom = necesario.getString("articulo");
				       String ape = necesario.getString("descripcion");
                                       String dir = necesario.getString("valor");
                                       String tel = necesario.getString("iva");
                                       String cor = necesario.getString("cantidad");
                                       
                                        producto=new Producto();
                                        
					producto.setCodigo(ced);
					producto.setArticulo(nom);
					producto.setDescripcion(ape);
					producto.setValor(dir);
                                       producto.setIva(tel);
                                       producto.setCantidad(cor);
					
					listaClientes.add(producto);
				}
				sentencia.close();
				conexion.close();
				
			}catch(Exception ex){
				System.out.print("Error en la conexion"+ex);
			}
			return listaClientes;
			
	}
}


