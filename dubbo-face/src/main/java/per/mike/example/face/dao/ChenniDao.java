package per.mike.example.face.dao;

import per.mike.example.face.bean.ChenniPo;

/**
 * @author DXC Mike
 * @date 2022年10月19日
 * @remark
 */
public interface ChenniDao {
    /**
     * 新增
     */
    void add(ChenniPo po);

    /**
     * 修改
     */
    void upd(ChenniPo po);

    /**
     * 刪除
     */
    void del(ChenniPo po);
}
