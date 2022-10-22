package per.mike.example.face.service;

import java.util.List;

import per.mike.example.face.bean.UserAddress;

/**
 * @author DXC Mike
 * @date 2022年10月16日
 * @remark
 */
public interface UserService {
    /**
     * 查詢使用者地址
     * @param userId
     * @return
     * @remark
     */
    public List<UserAddress> getUserAddressList(String userId);
}
