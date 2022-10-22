package per.mike.example.face.service;

import java.util.List;

import per.mike.example.face.bean.UserAddress;

/**
 * @author DXC Mike
 * @date 2022年10月16日
 * @remark
 */
public interface OrderSerice {
    /**
     * 初始化訂單
     * @param userId
     * @remark
     */
    public List<UserAddress> ininOrder(String userId);
}
