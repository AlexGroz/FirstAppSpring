package com.groznov.firstspring.repository;

import com.groznov.firstspring.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
