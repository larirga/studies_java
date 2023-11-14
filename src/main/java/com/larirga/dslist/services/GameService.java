package com.larirga.dslist.services;

import com.larirga.dslist.dto.GameMinDTO;
import com.larirga.dslist.entities.Game;
import com.larirga.dslist.repositories.GameRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
  @Autowired
  private GameRepository gameRepository;
  public List<GameMinDTO> findAll() {
    List<Game> result = gameRepository.findAll();
    List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
    return dto;
  }
}
