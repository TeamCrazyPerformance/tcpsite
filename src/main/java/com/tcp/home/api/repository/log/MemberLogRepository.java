package com.tcp.home.api.repository.log;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcp.home.api.domain.log.MemberLog;

public interface MemberLogRepository extends JpaRepository<MemberLog, Long> {

}
