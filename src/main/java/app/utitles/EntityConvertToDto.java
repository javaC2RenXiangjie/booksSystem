package app.utitles;

import app.dtos.BooksDto;
import app.dtos.UserDto;
import app.entities.BooksEntity;
import app.entities.UserEntity;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EntityConvertToDto {
    /**
     * userEntity convert to UserDto
     * @param userEntity
     * @return
     */
    public UserDto UserConvert(UserEntity userEntity) {
        UserDto userDto = new UserDto();
        userDto.setId(userEntity.getId());
        userDto.setName(userEntity.getName());
        userDto.setAccount(userEntity.getAccount());
        userDto.setPassword(userEntity.getPassword());
        return userDto;
    }

    /**
     * bookEntity convert to bookDto
     * @param booksEntity
     * @return
     */
    public BooksDto BooksConvert(BooksEntity booksEntity) {
        BooksDto booksDto = new BooksDto();
        booksDto.setId(booksEntity.getId());
        booksDto.setBookName(booksEntity.getBookName());
        booksDto.setAuthor(booksEntity.getAuthor());
        booksDto.setPubCompany(booksEntity.getPubCompany());
        booksDto.setISBN(booksEntity.getIsbn());
        booksDto.setFixedPrice(booksEntity.getFixedPrice());
        booksDto.setPubDate(booksEntity.getPubDate());
        return booksDto;
    }
}
