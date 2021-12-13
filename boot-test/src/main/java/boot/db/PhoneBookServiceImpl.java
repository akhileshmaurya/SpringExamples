package boot.db;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PhoneBookServiceImpl implements PhoneBookService {

  @Autowired private PhoneBookRepository phoneBookRepository;

  public List<PhoneBook> findAll() {
    return phoneBookRepository.findAll();
  }

  public void saveBook(PhoneBook book) {
    phoneBookRepository.save(book);
  }

  public PhoneBook findOne(long id) {
    return phoneBookRepository.findOne(id);
  }

  public void delete(long id) {
    phoneBookRepository.delete(id);
  }

  public List<PhoneBook> findByName(String name) {

    return phoneBookRepository.findByName(name);
  }

  public List<PhoneBook> findByMobile(String mobile) {

    return phoneBookRepository.findByMobile(mobile);
  }
}
