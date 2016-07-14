package otros;

public class Nota {
	private String Fecha;
	private String Nombre;
	private long Telefono;
	private String [] Cantidad;
	private String [] Equipo;
	private String [] Descripcion;
	private String [] Falla;
	private String Observaciones;
	private String Cargador;
	private String Contra;
	private String Presupuesto;
	private String Total;
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public long getTelefono() {
		return Telefono;
	}
	public void setTelefono(long telefono) {
		Telefono = telefono;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	public String [] getCantidad() {
		return Cantidad;
	}
	public void setCantidad(String [] cantidad) {
		Cantidad = cantidad;
	}
	public String [] getEquipo() {
		return Equipo;
	}
	public void setEquipo(String [] equipo) {
		Equipo = equipo;
	}
	public String [] getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String [] descripcion) {
		Descripcion = descripcion;
	}
	
	public void setCargador(String cargador) {
		Cargador = cargador;
	}
	public String getCargador() {
		return Cargador;
	}
	public void setContra(String contra) {
		Contra=contra;
	}
	
	public String getContra() {
		return Contra;
	}
	
	public String getObservaciones() {
		return Observaciones;
	}
	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}
	public String getPresupuesto() {
		return Presupuesto;
	}
	public void setPresupuesto(String presupuesto) {
		Presupuesto = presupuesto;
	}
	public String getTotal() {
		return Total;
	}
	public void setTotal(String total) {
		Total = total;
	}
	public String [] getFalla() {
		return Falla;
	}
	public void setFalla(String [] falla) {
		Falla = falla;
	}
}
