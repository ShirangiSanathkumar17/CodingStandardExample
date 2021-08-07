package com.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.server.entity.Account;

public interface AccountRepository extends JpaRepository<Account,Integer> {

}
