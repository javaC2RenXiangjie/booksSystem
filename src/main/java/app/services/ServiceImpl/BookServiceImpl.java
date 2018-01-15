package app.services.ServiceImpl;

import app.dtos.BooksDto;
import app.entities.BooksEntity;
import app.repositories.BooksRepo;
import app.services.BooksService;
import app.utitles.EntityConvertToDto;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BooksService {

    @Autowired
    private BooksRepo booksRepo;

    @Autowired
    private EntityConvertToDto entityConvertToDto;

    @Override
    public List<BooksDto> getAllBooks() {
        List<BooksDto> ds = new ArrayList<BooksDto>();
        for(BooksEntity BE: booksRepo.findAll()){
            ds.add(entityConvertToDto.BooksConvert(BE));
        }
        return ds;
    }
}
