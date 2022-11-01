package per.mike.example.face.dao;

import per.mike.example.face.bean.OrderPo;

/**
 * @author DXC Mike
 * @date 2022年10月19日
 * @remark
 */
public interface OrderDao {
    /**
     * 新增
     */
    void add(OrderPo po);

    /**
     * 修改
     */
    void upd(OrderPo po);

    /**
     * 刪除
     */
    void del(String orderId);
}
