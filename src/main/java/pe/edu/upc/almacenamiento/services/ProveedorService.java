package pe.edu.upc.almacenamiento.services;

import java.util.List;

import pe.edu.upc.almacenamiento.models.entities.Proveedor;

public interface ProveedorService extends CrudService<Proveedor, Integer> {
	List<Proveedor> findByNombre(String nombre) throws Exception;
}