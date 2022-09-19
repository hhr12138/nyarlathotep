package common.user.nyarlathotep.service.impl;

import common.user.nyarlathotep.UsersService;
import common.user.nyarlathotep.entity.Users;
import common.user.nyarlathotep.mapper.UsersMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author haoran hou
 * @since 2022-09-19
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

}
