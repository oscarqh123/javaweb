package com.hampcode.business.impl;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import com.hampcode.business.IProductoNegocio;
import com.hampcode.model.entity.Producto;
import com.hampcode.model.repository.IProductRepository;

@Named
public class ProductoNegocio implements IProductoNegocio {
	
	@Inject
	private IProductRepository productRepository;

	@Transactional
	@Override
	public Long insert(Producto entity) throws Exception {
		
		return productRepository.insert(entity);
	}

	@Override
	public Long update(Producto entity) throws Exception {
		// TODO Auto-generated method stub
		return productRepository.update(entity);
	}

	@Override
	public List<Producto> getAll() throws Exception {
		// TODO Auto-generated method stub
		return productRepository.buscar();
	}

	@Override
	public Optional<Producto> getOne(Producto entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
