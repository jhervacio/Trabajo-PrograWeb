package pe.edu.upc.almacenamiento.services;

import java.util.List;

import pe.edu.upc.almacenamiento.models.entities.Articulos;

public interface ArticuloService extends CrudService<Articulos, Integer> {
	List<Articulos> findByDescripcion(String Descripcion) throws Exception;
}
