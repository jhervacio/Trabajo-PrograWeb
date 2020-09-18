package pe.edu.upc.almacenamiento.models.repositories;
import java.util.List;

import pe.edu.upc.almacenamiento.models.entities.Articulos;
	
	public interface ArticuloRepository extends JpaRepository<Articulos, Integer> {
		List<Articulos> findByDescripcion(String Descripcion) throws Exception;
}
