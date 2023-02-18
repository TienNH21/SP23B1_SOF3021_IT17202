package sof3021.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sof3021.entity.Account;

@Repository
public interface AccountRepository
	extends JpaRepository<Account, Integer> {
	// Reflection
	
	@Query("SELECT acc FROM Account acc WHERE acc.email=:email")
	public Account findByEmail(@Param("email") String email);
	
	public Account findByUsername(String username);
}
