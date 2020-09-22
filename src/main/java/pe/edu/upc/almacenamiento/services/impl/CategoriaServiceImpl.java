package pe.edu.upc.almacenamiento.services.impl;

import java.io.Serializable;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import pe.edu.upc.almacenamiento.models.entities.Categoria;
import pe.edu.upc.almacenamiento.models.repositories.CategoriaRepository;
import pe.edu.upc.almacenamiento.services.CategoriaService;

@Named
@ApplicationScoped
public class CategoriaServiceImpl implements CategoriaService, Serializable{

private static final long serialVersionUID = 1L;
	
	@Inject
	private CategoriaRepository categoriaRepostory;
	
	@Transactional
	@Override
	public Categoria save(Categoria entity) throws Exception {
		return categoriaRepostory.save(entity);
	}

	@Transactional
	@Override
	public Categoria update(Categoria entity) throws Exception {
		return categoriaRepostory.update(entity);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		categoriaRepostory.deleteById(id);		
		
	}

	@Override
	public List<Categoria> findAll() throws Exception {
		return categoriaRepostory.findAll();
	}

	@Override
	public Optional<Categoria> findById(Integer id) throws Exception {
		return categoriaRepostory.findById(id);
	}
	
	

}
