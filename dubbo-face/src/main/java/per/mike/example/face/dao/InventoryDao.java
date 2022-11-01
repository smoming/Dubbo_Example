package per.mike.example.face.dao;

import per.mike.example.face.bean.InventoryPo;

/**
 * @author DXC Mike
 * @date 2022年10月19日
 * @remark
 */
public interface InventoryDao {
    /**
     * 新增
     */
    void add(InventoryPo po);

    /**
     * 修改
     */
    void upd(InventoryPo po);

    /**
     * 刪除
     */
    void del(String productId);
}
