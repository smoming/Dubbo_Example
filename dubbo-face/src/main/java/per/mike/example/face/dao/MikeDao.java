package per.mike.example.face.dao;

import per.mike.example.face.bean.MikePo;

/**
 * @author DXC Mike
 * @date 2022年10月19日
 * @remark
 */
public interface MikeDao {
    /**
     * 新增
     */
    void add(MikePo po);

    /**
     * 修改
     */
    void upd(MikePo po);

    /**
     * 刪除
     */
    void del(MikePo po);
}
