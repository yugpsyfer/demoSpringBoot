package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller1 {
		
	   @Autowired
	   private userRepo userRepos;
	
		@GetMapping("/hello")
	    public List<user> findAll() {
//			HashMap<String, String> object = new HashMap<>();
//			object.put("Pride", "Chole Bhature");
//			object.put("Non pride", "Shahi paneer");
	    	user z = new user();
	    	z.setAddress("IIIT Delhi");
	    	z.setEmailid("Bapi@12.com");
	    	z.setPassword("chatterjee");
	    	z.setPhonenumber(999887909);
	    	z.setUsername("adnan");
	    	userRepos.save(z);
	        return userRepos.findByUsername("adnan");
	        
	    }
}


//@RequestMapping("/api/books")
//public class BookController {
//
//    @Autowired
//    private BookRepository bookRepository;
//
//   
//
//    @GetMapping("/title/{bookTitle}")
//    public List findByTitle(@PathVariable String bookTitle) {
//        return bookRepository.findByTitle(bookTitle);
//    }
//
//    @GetMapping("/{id}")
//    public Book findOne(@PathVariable Long id) {
//        return bookRepository.findById(id)
//          .orElseThrow(BookNotFoundException::new);
//    }
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public Book create(@RequestBody Book book) {
//        return bookRepository.save(book);
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable Long id) {
//        bookRepository.findById(id)
//          .orElseThrow(BookNotFoundException::new);
//        bookRepository.deleteById(id);
//    }
//
//    @PutMapping("/{id}")
//    public Book updateBook(@RequestBody Book book, @PathVariable Long id) {
//        if (book.getId() != id) {
//          throw new BookIdMismatchException();
//        }
//        bookRepository.findById(id)
//          .orElseThrow(BookNotFoundException::new);
//        return bookRepository.save(book);
//    }
//}