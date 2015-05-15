package blog;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idUsuario;
	
	private long DNI;
	private String tarjetaSocio;
	private String nombre;
	private String apellidos;
	private Date fechaNac;
	private String email;
	private List<Cita> citas;

	public Usuario(){}
	public Usuario(long dni,String tarjetaSocio,String nombre,String apellidos,Date fecha,String email){
		setDNI(dni);
		setTarjetaSocio(tarjetaSocio);
		setNombre(nombre);
		setApellidos(apellidos);
		setFechaNac(fecha);
		setEmail(email);
	}
	public void setDNI(long dni){}
	public void setTarjetaSocio(String tarjetaSocio){}
	public void setNombre(String nombre){}
	public void setApellidos(String apellidos){}
	public void setFechaNac(Date fecha){}
	public void setEmail(String email){}
	public Long getDNI(){
		return DNI;
	}
	public String getTarjetaSocio(){
		return tarjetaSocio;
	}
	public String getNombre(){
		return nombre;
	}
	public String getApellidos(){
		return apellidos;
	}
	public Date getFechaNac(){
		return fechaNac;
	}
	public void pedirCita(Medico medico,Date fecha){
		
	}
	public List<Cita> getCitas(){
		return citas;
	}
}
