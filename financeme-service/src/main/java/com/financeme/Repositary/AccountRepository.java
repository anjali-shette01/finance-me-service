
package com.financeme.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.financeme.Entity.Account;



@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
