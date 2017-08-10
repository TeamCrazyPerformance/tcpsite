package com.tcp.home.api.repository.member;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcp.home.api.domain.member.Members;

public interface MembersRepository extends JpaRepository<Members, Long> {

}
