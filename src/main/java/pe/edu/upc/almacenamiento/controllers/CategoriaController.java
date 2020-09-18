package pe.edu.upc.almacenamiento.controllers;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.almacenamiento.services.CategoriaService;

@Named
public class CategoriaController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private CategoriaService categoriaService;

}
