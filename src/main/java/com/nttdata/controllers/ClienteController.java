package com.nttdata.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
//ClienteController.java
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	
	@RequestMapping("")
	public String clientes(Model model) {
		model.addAttribute("nombre", "Nttdata");
		return "cliente.jsp";
	}
	
	@RequestMapping("/pagos")
	public String pagos() {
		return "estamos en clientes pagos";
	}
	
	//recibir parametros por url ((@PathVariable("variable") tipoDato variable)
	@RequestMapping("/m/{rut}/{dv}")
	public String rutCliente(@PathVariable("rut") Integer rut,@PathVariable("dv") String dv) {
		return "el rut es: "+rut+" , de digito: "+dv;
	}
	
	
}