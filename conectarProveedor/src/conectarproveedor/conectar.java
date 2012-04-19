

package conectarproveedor;
 import java.sql.*;
/**
 *
 * @author david
 */
public class conectar {
   

  
     Connection miconexion;
     Statement stSentencias;
     ResultSet rsDatos;
     PreparedStatement prepararSentencias;
     public conectar()  throws SQLException, Exception{
     
         try {
             Class.forName("com.mysql.jdbc.Driver");
             String url="jdbc:mysql://localhost/empresa";
             miconexion=DriverManager.getConnection(url,"root","root");
             
             stSentencias=miconexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
     } catch(ClassCastException ex){
     throw ex;
     } catch (SQLException ex1)
     {
         throw ex1;
        
     }
     }
     
     public ResultSet consulta (String sql) throws SQLException
     {
         try {
             //Para la seleccion
         
            rsDatos=stSentencias.executeQuery(sql);
         
     }catch (SQLException ex){
         throw ex;
}
         return rsDatos;
}

    public void ejecutar (String sql) throws SQLException 
    {
try{
    stSentencias.execute(sql);
}
catch (SQLException ex) 
{
    throw ex;
}
    }}
    

