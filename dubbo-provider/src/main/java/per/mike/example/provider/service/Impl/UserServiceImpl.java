package per.mike.example.provider.service.Impl;

import java.util.Arrays;
import java.util.List;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

import per.mike.example.face.bean.UserAddress;
import per.mike.example.face.service.UserService;

/**
 * @author DXC Mike
 * @date 2022年10月16日
 * @remark
 */
@DubboService
@Component
public class UserServiceImpl implements UserService {

    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress addr1 = new UserAddress(1, "台北", "AA", "RRR", "111", "Y");
        UserAddress addr2 = new UserAddress(2, "高雄", "BB", "GGG", "333", "N");

        return Arrays.asList(addr1, addr2);
    }

}
