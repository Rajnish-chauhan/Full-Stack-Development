package com.cfs.BookAPI.Controller;

import com.cfs.BookAPI.entity.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BookController {

    private Map<Long, Book> bookDb = new HashMap<>();

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok(new ArrayList<>(bookDb.values()));
    }


    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        bookDb.put(book.getId(), book);
        return ResponseEntity.status(HttpStatus.CREATED).body(book);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Book book = bookDb.get(id);
        if (book == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(book);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Void> updateBook(@PathVariable Long id, @RequestBody Book book) {
        Book existing = bookDb.get(id);
        if (existing == null) {
            return ResponseEntity.status((HttpStatus.NOT_FOUND)).build();
        }
        bookDb.put(id, book);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


    @PatchMapping("/{id}/price")
    public ResponseEntity<Book> updatePrice(@PathVariable Long id, @RequestBody Double newPrice) {
        Book existing = bookDb.get(id);
        if (existing == null) {
            return ResponseEntity.status((HttpStatus.NOT_FOUND)).build();
        }
        existing.setPrice(newPrice);
        bookDb.put(id,existing);
        return ResponseEntity.ok(existing);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id){
        Book existing=bookDb.remove(id);
        if (existing==null){
            return ResponseEntity.status((HttpStatus.NOT_FOUND)).build();
        }
        bookDb.put(id,existing);
        return ResponseEntity.noContent().build();
    }
}


