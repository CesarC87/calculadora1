package DTO;

import javax.validation.constraints.NotEmpty;

public class CalculadoraDTO {
	private long id;

	@NotEmpty(message = "Debe ingresar un numero")
	private String numero;

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public ComentarioDTO() {
		super();
	}
}
