package pe.edu.upc.almacenamiento.models.repositories.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.edu.upc.almacenamiento.models.entities.Categoria;
import pe.edu.upc.almacenamiento.models.repositories.CategoriaRepository;

@Named
@ApplicationScoped
public class CategoriaRepositoryImpl implements CategoriaRepository, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "TPPU")
	private EntityManager em;
	
	@Override
	public Categoria save(Categoria entity) throws Exception {
		em.persist(entity);
		return entity;
	}

	@Override
	public Categoria update(Categoria entity) throws Exception {
		em.merge(entity);
		return entity;
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		
				Optional<Categoria> optional = findById(id);
				if( optional.isPresent() )
					em.remove( optional.get() );
		
	}

	@Override
	public List<Categoria> findAll() throws Exception {
		List<Categoria> categorias = new ArrayList<Categoria>();
		String qlString = "SELECT c FROM Categoria c";	// JPQL
		TypedQuery<Categoria> query = em.createQuery(qlString, Categoria.class);
		categorias = query.getResultList();
		return categorias;
	}

	@Override
	public Optional<Categoria> findById(Integer id) throws Exception {
				Optional<Categoria> categoria = Optional.empty();
				String qlString = "SELECT c FROM Categoria c WHERE c.id = ?1";
				TypedQuery<Categoria> query = em.createQuery(qlString, Categoria.class);
				query.setParameter(1, id);
				List<Categoria> categorias = query.getResultList();
				if(categorias != null && !categorias.isEmpty())
					categoria = Optional.of( categorias.get(0) );
				
				return categoria;
	}

}
