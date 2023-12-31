/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodato;

import entidades.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author XCARET
 */
public class ADNHorario {
    private static boolean Nuevo(Horario p) throws ClassNotFoundException, SQLException
    {
        int r=0;
        String sql="insert into horarios values(?,?,?,?,?,?,?)";
        try (Connection cn= Conexion.Cadena();
                PreparedStatement ps= cn.prepareStatement(sql)){
            ps.setInt(1,p.getIdhorario());
            ps.setInt(2,p.getIdnivel());
            ps.setInt(3,p.getIdcurso());
            ps.setString(4,p.getDia());
            ps.setString(5,p.getHoraini());
            ps.setString(6,p.getHorafin());
            ps.setInt(7,p.getProfesor());
            
            r=ps.executeUpdate();
        }
        return r==1?true:false;
    }
    private static boolean Actualizar(Horario p) throws ClassNotFoundException, SQLException
    {
        int r=0;
        String sql="update horarios set idcurso=?,dia=?,horaini=?,horafin=?,profesor=? where idhorario=?";
        try (Connection cn= Conexion.Cadena();
                PreparedStatement ps= cn.prepareStatement(sql)){
            ps.setInt(1,p.getIdcurso());
            ps.setString(2,p.getDia());
            ps.setString(3,p.getHoraini());
            ps.setString(4,p.getHorafin());
            ps.setInt(5, p.getProfesor());
            ps.setInt(6, p.getIdhorario());
            r=ps.executeUpdate();
        }
        return r==1?true:false;
    }
    private static boolean Existe(Horario p) throws ClassNotFoundException, SQLException
    {
        int r=0;
        String sql="select ifnull(count( idhorario),0) from horarios where idhorario=?";
        try (Connection cn= Conexion.Cadena();
                PreparedStatement ps= cn.prepareStatement(sql)){
            ps.setInt(1,p.getIdhorario());
            try (ResultSet rs= ps.executeQuery()){
                rs.next();
                r=rs.getInt(1);
            }
        }
        return r>0?true:false;
    }
    private static boolean DarBaja(Horario p) throws ClassNotFoundException, SQLException
    {
        int r=0;
        String sql="delete from horarios where idhorario=?";
        try (Connection cn= Conexion.Cadena();
                PreparedStatement ps= cn.prepareStatement(sql)){
            ps.setInt(1,p.getIdhorario());
            r=ps.executeUpdate();
        }
        return r==1?true:false;
    }
    
   public static LinkedList<Horario> Lista(Horario p) throws ClassNotFoundException, SQLException
  {
       int r=0;
       LinkedList<Horario> Lista = new LinkedList<>();
      String sql="select * from horarios";
      try (Connection cn= Conexion.Cadena();
             PreparedStatement ps= cn.prepareStatement(sql)){
           try (ResultSet rs= ps.executeQuery()){
             while(rs.next())
             {
                  Lista.add(new Horario(rs.getInt(1),rs.getInt(2),rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7)));
               }
            }
        }
        return Lista;
   }
    public static boolean Guardar(Horario p) throws ClassNotFoundException, SQLException
    {
        if (Existe(p)) {
            return Actualizar(p);
        }else
        {
            return Nuevo(p);
        }
    }
    public static boolean Eliminar(Horario p) throws ClassNotFoundException, SQLException
    {
        return DarBaja(p);
    }
//    public static LinkedList<Horario> ListaHorarios() throws ClassNotFoundException, SQLException
//    {
//        return Lista();
//    }
}
