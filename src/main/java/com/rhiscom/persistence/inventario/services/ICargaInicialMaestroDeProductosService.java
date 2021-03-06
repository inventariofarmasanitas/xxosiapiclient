package com.rhiscom.persistence.inventario.services;

import java.util.List;

import com.rhiscom.persistence.inventario.common.PersistenceExceptionInventario;
import com.rhiscom.persistence.inventario.entity.xxosi.ProductoXXOSI;

public interface ICargaInicialMaestroDeProductosService {
/*
	void generarExtraccionMaestroDeProductos()
			throws PersistenceExceptionInventario;
*/
	List<ProductoXXOSI> generarExtraccionMaestroDeProductos(String url, String schema, String username, String password)
			throws PersistenceExceptionInventario;

}
