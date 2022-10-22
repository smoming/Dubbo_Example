package per.mike.example.face.stub;

import java.util.List;

import per.mike.example.face.bean.UserAddress;
import per.mike.example.face.service.UserService;

/**
 * @author DXC Mike
 * @date 2022年10月20日
 * @remark
 */
public class UserServiceStub implements UserService {

    private final UserService userService;

    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("### UserServiceStub.getUserAddressList.... ");
        if (userId != null && !userId.equals("")) {
            return this.userService.getUserAddressList(userId);
        }

        return null;
    }

}
