/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.sql.Date;

/**
 *
 * @author XCARET
 */
public class ListaPagos {
    private String nombres,curp,nivel,concepto;
    private Date fecha;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDni() {
        return curp;
    }

    public void setDni(String curp) {
        this.curp = curp;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ListaPagos() {
    }

    public ListaPagos(String nombres, String curp, String nivel, String concepto, Date fecha) {
        this.nombres = nombres;
        this.curp = curp;
        this.nivel = nivel;
        this.concepto = concepto;
        this.fecha = fecha;
    }
   public String[] DatostoArray()
    {
        String[] lista= new String[5];
        lista[0]=nombres;
        lista[1]=curp;
        lista[2]=nivel;
        lista[3]=concepto;
        lista[4]=Formatos.sdtfecha.format(fecha);
        return lista;
    } 
}
