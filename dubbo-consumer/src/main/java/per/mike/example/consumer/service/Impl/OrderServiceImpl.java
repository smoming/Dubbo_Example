package per.mike.example.consumer.service.Impl;

import java.util.List;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

import per.mike.example.face.bean.UserAddress;
import per.mike.example.face.service.OrderSerice;
import per.mike.example.face.service.UserService;

/**
 * @author DXC Mike
 * @date 2022年10月16日
 * @remark
 */
@DubboService
@Component
public class OrderServiceImpl implements OrderSerice {

    // @Autowired
    @DubboReference(stub = "per.mike.example.face.stub.UserServiceStub")
    UserService userService;

    public List<UserAddress> ininOrder(String userId) {
        // TODO Auto-generated method stub
        System.out.println("#####");
        System.out.println("userId:[" + userId + "]");
        System.out.println("#####");
        List<UserAddress> userAddresses = userService.getUserAddressList(userId);
        System.out.println("=====");
        for (UserAddress userAddress : userAddresses) {
            System.out.println(userAddress.getUserAddress());
        }
        System.out.println("=====");
        return userAddresses;
    }

}
