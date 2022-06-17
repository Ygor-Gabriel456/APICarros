package com.agencia.carros.dto;

import com.agencia.carros.domain.Carro;
import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class CarroDTO {
  private Long id;
  private String nome;
  private String tipo;
  private String descricao;
  private String cor;
  private int ano;
  private String dono;

  public static CarroDTO create(Carro carro) {
    ModelMapper modelMapper = new ModelMapper();
    return modelMapper.map(carro, CarroDTO.class);
  }
}
