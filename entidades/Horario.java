/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author XCARET
 */
public class Horario {
    private int idhorario,idnivel,idcurso;
    private String dia,horaini,horafin;
    private int profesor;
    public int getIdhorario() {
        return idhorario;
    }

    public void setIdhorario(int idhorario) {
        this.idhorario = idhorario;
    }

    
    public int getIdnivel() {
        return idnivel;
    }

    public void setIdnivel(int idnivel) {
        this.idnivel = idnivel;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

   
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHoraini() {
        return horaini;
    }

    public void setHoraini(String horaini) {
        this.horaini = horaini;
    }

    public String getHorafin() {
        return horafin;
    }

    public void setHorafin(String horafin) {
        this.horafin = horafin;
    }

    public int getProfesor() {
        return profesor;
    }

    public void setProfesor(int profesor) {
        this.profesor = profesor;
    }
    
    public Horario() {
    }

    public Horario(int idhorario,int idnivel, int idcurso, String dia, String horaini, String horafin,int profesor) {
        this.idhorario=idhorario;
        this.idnivel = idnivel;
        this.idcurso = idcurso;
        this.dia = dia;
        this.horaini = horaini;
        this.horafin = horafin;
        this.profesor=profesor;
    }

    
     public String[] DatostoArray()
    {
        String[] lista= new String[14];
        lista[0]=String.valueOf(idnivel);
        lista[1]=String.valueOf(idcurso);
        lista[2]=String.valueOf(dia);
        lista[3]=String.valueOf(horaini);
        lista[4]=String.valueOf(horafin);
        lista[5]=String.valueOf(profesor);
        lista[6]=String.valueOf(idhorario);
   
        return lista;
}
}
