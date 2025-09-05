package com.alkemy.tpinte1.model;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepository extends MongoRepository<Producto, String> {
    // Aquí puedes agregar métodos de consulta personalizados si los necesitas
}

