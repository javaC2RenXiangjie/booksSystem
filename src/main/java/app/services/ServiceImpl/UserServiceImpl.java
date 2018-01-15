package app.services.ServiceImpl;

import app.dtos.UserDto;
import app.repositories.UserRepo;
import app.services.UserService;
import app.utitles.EntityConvertToDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private EntityConvertToDto entityConvertToDto;

    @Override
    public Boolean accoutValidate(String account) {
        if (userRepo.accoutValidate(account) == null) {
            return false;
        }else{
//            return entityConvertToDto.UserConvert(userRepo.accoutValidate(account));
            return true;
        }
    }
}
