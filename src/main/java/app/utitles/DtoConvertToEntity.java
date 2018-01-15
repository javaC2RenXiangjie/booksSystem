package app.utitles;

import app.dtos.UserDto;
import app.entities.UserEntity;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DtoConvertToEntity {
    /**
     * userDto convert to UserEntity
     * @param userDto
     * @return
     */
    public UserEntity userConvert(UserDto userDto) {
        UserEntity userEntity = new UserEntity();

        return userEntity;
    }
}
