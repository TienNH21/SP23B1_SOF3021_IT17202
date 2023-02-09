package sof3021.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sof3021.entity.Account;

@Repository
public interface AccountRepository
	extends JpaRepository<Account, Integer> {

}
