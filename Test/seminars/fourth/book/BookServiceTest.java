package seminars.fourth.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

class BookServiceTest {

    @Mock
    private BookRepository mockBookRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void findBookById() {
        BookService bookService = new BookService(mockBookRepository);
        bookService.findBookById("1");
        verify(mockBookRepository).findById("1");
    }

    @Test
    void findAllBooks() {
        BookService bookService = new BookService(mockBookRepository);
        bookService.findAllBooks();
        verify(mockBookRepository).findAll();
    }
}