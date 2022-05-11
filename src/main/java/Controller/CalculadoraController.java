package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.CalculadoraService;

@RequestMapping("/api/publicaciones/{publicacionId}/comentarios")
public class CalculadoraController {
	@Autowired
	private CalculadoraService calculadoraService;
}
