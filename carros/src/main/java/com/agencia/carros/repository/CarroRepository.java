package com.agencia.carros.repository;

import com.agencia.carros.domain.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface  CarroRepository extends JpaRepository<Carro, Long>{

  List<Carro> findByTipo(String tipo);

  Carro findAllById(Long id);

  Carro findAllByNome(String nome);

  List<Carro> findAllByCor(String cor);

  Carro findAllByAno (int ano);

  Carro findAllByDono(String dono);
}

