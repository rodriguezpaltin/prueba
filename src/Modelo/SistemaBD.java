/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class SistemaBD {
    // metodos para recoleccion  de datos hacia la base de datos
    private static ArrayList<String> listaNombres;
    private static ArrayList<Clientes> listaClientes;
        //private static ArrayList<String> listaNombres;
 
    
    
    
    public static void guardarClienteBD(Clientes cliente){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/clientes","root","rafa");
			System.out.print("Conexion establecida!");
                        
			Statement sentencia = conexion.createStatement();
				int insert = sentencia.executeUpdate("insert into clientes values('"+cliente.getCedula()+
						"','"+cliente.getNombres()+"','"+cliente.getApellidos()+"','"+cliente.getDireccion()+"','"
                                                +cliente.getTeléfono()
                                                +"','"+cliente.getCorreo()+"')");
				sentencia.close();
				conexion.close();	
		}catch(Exception ex){
			System.out.print("Error en la conexion"+ex);
		}
	}
    public static void eliminar(String cedula){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/clientes","root","rafa");
			System.out.print("Conexion Establecida");
			Statement sentencia = conexion.createStatement();
			int insert = sentencia.executeUpdate("delete from clientes where cedula = '"+cedula+"'");
			
			sentencia.close();
			conexion.close();
		}catch(Exception ex){
			System.out.print("Error en la conexion"+ex);
		}
	}
    
    public static Clientes buscarCliente(String cedula){
    
           Clientes cliente = new Clientes();
           
              try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/clientes","root","rafa");
			//System.out.print("Conexion Establecida");
			Statement sentencia = conexion.createStatement();
			ResultSet necesario = sentencia.executeQuery("SELECT * FROM clientes.clientes; "
                                + "where cedula = '"+cedula+"'");
                        
			while(necesario.next()){
					String ced= necesario.getString("cedula");
                                        String nom = necesario.getString("nombres");
					String ape = necesario.getString("apellidos");
                                       String car = necesario.getString("carrera");
                                       String mod = necesario.getString("modulo");
                                       String tel = necesario.getString("telefono");
                                       
                                      
					
                                        cliente.setCedula(ced);
					cliente.setNombres(nom);
					cliente.setApellidos(ape);
					cliente.setDireccion(car);
                                       cliente.setTeléfono(mod);
                                       cliente.setCorreo(tel);
					 
					
			}
			sentencia.close();
			conexion.close();
		}catch(Exception ex){
			System.out.print("Error en la conexion"+ex);
		}
    
           return cliente;
    
     }
    public static ArrayList cargar(){
			
            try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/","root","rafas");
				System.out.print("Conexion establecida1!");
				Statement sentencia = conexion.createStatement();
				ResultSet necesario = sentencia.executeQuery("SELECT * FROM clientes.clientes;");
                                Clientes clientes;
				 
				listaClientes = new ArrayList<>();
				while(necesario.next()){
//					
                                       String ced= necesario.getString("cedula");
                                       String nom = necesario.getString("nombres");
				       String ape = necesario.getString("apellidos");
                                       String dir = necesario.getString("direccion");
                                       String tel = necesario.getString("telefono");
                                       String cor = necesario.getString("correo");
                                       
                                        clientes=new Clientes();
                                        
					clientes.setCedula(ced);
					clientes.setNombres(nom);
					clientes.setApellidos(ape);
					clientes.setDireccion(dir);
                                       clientes.setTeléfono(tel);
                                       clientes.setCorreo(cor);
					 
					listaClientes.add(clientes);
				}
				sentencia.close();
				conexion.close();
				
			}catch(Exception ex){
				System.out.print("Error en la conexion"+ex);
			}
			return listaClientes;
			
	}
}
    