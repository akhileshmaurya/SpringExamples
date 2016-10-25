package boot.db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneBookRepository extends JpaRepository<PhoneBook, Long> {
	
	public List<PhoneBook> findByName(String name);
	
	public List<PhoneBook> findByMobile(String mobile);

}
