package per.mike.example.provider.dao.Impl;

import javax.sql.DataSource;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import per.mike.example.face.bean.InventoryPo;
import per.mike.example.face.dao.InventoryDao;

/**
 * @author DXC Mike
 * @date 2022年10月19日
 * @remark
 */
@DubboService
@Component
public class InventoryDaoImpl implements InventoryDao {

    /** Data source */
    @Autowired
    private DataSource dataSource;

    private JdbcTemplate geJdbcTemplate() {
        return new JdbcTemplate(dataSource);
    }

    /**
     * 新增
     */
    @Override
    @Transactional
    public void add(InventoryPo po) {
        String sql = "INSERT INTO inventory (product_id,amount) VALUES ('" + po.getProductId() + "', '" + po.getAmount() + "')";
        geJdbcTemplate().update(sql);
    }

    /**
     * 修改
     */
    @Override
    @Transactional
    public void upd(InventoryPo po) {
        String sql = "UPDATE inventory SET amount = '" + po.getAmount() + "' WHERE product_id = '" + po.getProductId() + "'";
        geJdbcTemplate().update(sql);
    }

    /**
     * 刪除
     */
    @Override
    @Transactional
    public void del(String productId) {
        String sql = "DELETE FROM inventory WHERE product_id = '" + productId + "'";
        geJdbcTemplate().update(sql);
    }

}
