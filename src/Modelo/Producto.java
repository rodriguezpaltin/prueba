
package Modelo;

import java.util.ArrayList;

public class Producto {
     public static String eliminarproducto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void actualizarCliente(ArrayList cargar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private  String Codigo,Articulo, Descripcion,Valor,Iva,Cantidad;



    public String getCodigo() {
        return Codigo;
    }

    public String getArticulo() {
        return Articulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getValor() {
        return Valor;
    }

    public String getIva() {
        return Iva;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public void setArticulo(String Articulo) {
        this.Articulo = Articulo;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }

    public void setIva(String Iva) {
        this.Iva = Iva;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }


    
}