package per.mike.example.consumer.dao.Impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import per.mike.example.face.bean.OrderPo;
import per.mike.example.face.dao.OrderDao;

/**
 * @author DXC Mike
 * @date 2022年10月19日
 * @remark
 */
@Service
public class OrderDaoImpl implements OrderDao {

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
    public void add(OrderPo po) {
        String sql = "INSERT INTO `order` (order_id,product_id,amount) VALUES ('" + po.getOrderId() + "', '" + po.getProductId() + "', " + po.getAmount() + ")";
        geJdbcTemplate().update(sql);
    }

    /**
     * 修改
     */
    @Override
    @Transactional
    public void upd(OrderPo po) {
        String sql = "UPDATE `order` SET product_id = '" + po.getProductId() + "', amount = " + po.getAmount() + " WHERE order_id = '" + po.getOrderId() + "'";
        geJdbcTemplate().update(sql);
    }

    /**
     * 刪除
     */
    @Override
    @Transactional
    public void del(String orderId) {
        String sql = "DELETE FROM `order` WHERE order_id = '" + orderId + "'";
        geJdbcTemplate().update(sql);
    }

}
