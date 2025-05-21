package com.licuadri.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.licuadri.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}
