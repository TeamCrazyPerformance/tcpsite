package com.tcp.home.api.repository.board;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcp.home.api.domain.board.BoardInfo;

public interface BoardInfoRepository extends JpaRepository<BoardInfo, Long>{

}
