package boot.db;

import boot.enums.Types;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/phoneBook")
public class PhoneBookController {
  @Autowired private PhoneBookService phoneBookService;

  @RequestMapping(value = "/add/{name}/{mobile}/{type}/{address}")
  public PhoneBook addPhoneBook(
      @PathVariable String name,
      @PathVariable String mobile,
      @PathVariable String type,
      @PathVariable String address) {
    PhoneBook phoneBook = new PhoneBook();
    phoneBook.setName(name);
    phoneBook.setMobile(mobile);
    phoneBook.setTypes(Types.valueOf(type));
    if (!StringUtils.hasText(phoneBook.getTypes().name())) phoneBook.setTypes(Types.MOBILE);
    phoneBook.setAddress(address);
    phoneBookService.saveBook(phoneBook);
    return phoneBook;
  }

  @RequestMapping(value = "/delete/{id}")
  public void deletePhoneBook(@PathVariable int id) {
    phoneBookService.delete(id);
  }

  @RequestMapping(value = "/")
  public List<PhoneBook> getPhoneBooks() {
    return phoneBookService.findAll();
  }

  @RequestMapping(value = "/{id}")
  public PhoneBook getPhoneBook(@PathVariable int id) {
    PhoneBook phonebook = phoneBookService.findOne(id);
    return phonebook;
  }

  @RequestMapping(value = "/search/name/{name}")
  public List<PhoneBook> getPhoneBookByName(@PathVariable String name) {
    List<PhoneBook> phonebooks = phoneBookService.findByName(name);
    return phonebooks;
  }

  @RequestMapping(value = "/search/mobile/{mobile}")
  public List<PhoneBook> getPhoneBookByMobile(@PathVariable String mobile) {
    List<PhoneBook> phonebooks = phoneBookService.findByMobile(mobile);
    return phonebooks;
  }
}
