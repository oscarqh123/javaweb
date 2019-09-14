package com.hampcode.model.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.hampcode.model.entity.Producto;
import com.hampcode.model.repository.IProductRepository;

@Named
public class ProductRepository implements IProductRepository{
	
	@PersistenceContext(unitName = "tallerPU")
	private EntityManager em;
	

	@Override
	public Long insert(Producto entity) throws Exception {
		em.persist(entity);
		return entity.getId();
	}

	@Override
	public Long update(Producto entity) throws Exception {
		em.persist(entity);
		return entity.getId();
		
	}

	@Override
	public List<Producto> buscar() throws Exception {
		List<Producto> pro =new ArrayList<>();
		
		TypedQuery<Producto> query=em.createQuery("from Product p",Producto.class);
		
		return pro;
	}

	@Override
	public Optional<Producto> BuscarPorId(Producto entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
