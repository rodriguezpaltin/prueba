
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import javax.swing.table.TableModel;
/**
 *
 * @author mariopalma
 */
public class ProductoDB implements TableModel{
     //private static ArrayList<String> listaNombres;
     private List <Producto> la;


    public ProductoDB (List<Producto> Lista){
        la=Lista;
    }
    @Override
    public int getRowCount() {
        return la.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int columnIndex) {
        //Codigo, String Articulo, String Descripcion, String Valor, String Iva, String Cantidad
        String titulo=null;
        switch(columnIndex){
            case 0:{
                titulo="Codigo";
                break;
            }
             case 1:{
                titulo="Articulo";
                break;
            }
              case 2:{
                titulo="Descripcion";
                break;
            }
               case 3:{
                titulo="Valor";
                break;
            }
                case 4:{
                titulo="Iva";
                break;
            }
                 case 5:{
                titulo=" Cantidad";
                break;
            }
                
        }
        return titulo;
      
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto e= la.get(rowIndex);
        String valor=null;
        //Codigo, String Articulo, String Descripcion, String Valor, String Iva, String Cantidad
        switch(columnIndex){
            case 0:{
               valor=e.getCodigo();
                break;
            }
             case 1:{
                valor=e.getArticulo();
                break;
            }
              case 2:{
                valor=e.getDescripcion();
                break;
            }
               case 3:{
               valor=e.getValor();
                break;
            }
                case 4:{
                valor=e.getIva();
                break;
            }
                 case 5:{
                valor=e.getCantidad();
                break;
            }
                
        }
        return valor;
        
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
       //sirve si en caso modifica de la tabla
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        
    }
    
}
