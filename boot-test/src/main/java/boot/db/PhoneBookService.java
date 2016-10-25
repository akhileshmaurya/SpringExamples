package boot.db;

import java.util.List;

public interface PhoneBookService {
	public List<PhoneBook> findAll();

	public void saveBook(PhoneBook book);

	public PhoneBook findOne(long id);

	public void delete(long id);

	public List<PhoneBook> findByName(String name);

	public List<PhoneBook> findByMobile(String mobile);
}
