package per.mike.example.consumer.service.Impl;

import java.math.BigDecimal;
import java.util.Objects;

import org.apache.dubbo.common.utils.StringUtils;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import per.mike.example.consumer.service.OrderTxnService;
import per.mike.example.face.bean.InventoryPo;
import per.mike.example.face.bean.OrderPo;
import per.mike.example.face.dao.InventoryDao;
import per.mike.example.face.dao.OrderDao;

/**
 * @author DXC Mike
 * @date 2022年10月19日
 * @remark
 */
@Service
public class OrderTxnServiceImpl implements OrderTxnService {

    @DubboReference
    InventoryDao inventoryDao;

    @Autowired
    OrderDao orderDao;

    @Transactional
    @Override
    public void add(String orderId, String productId, BigDecimal amount) {
        if (Objects.nonNull(orderId) && !StringUtils.isEmpty(orderId)) {
            if (Objects.nonNull(productId) && !StringUtils.isEmpty(productId)) {
                orderDao.add(new OrderPo(orderId, productId, amount));
                inventoryDao.add(new InventoryPo(productId, amount));
            }
        }
    }

    @Transactional
    @Override
    public void upd(String orderId, String productId, BigDecimal amount) {
        if (Objects.nonNull(orderId) && !StringUtils.isEmpty(orderId)) {
            if (Objects.nonNull(productId) && !StringUtils.isEmpty(productId)) {
                orderDao.upd(new OrderPo(orderId, productId, amount));
                inventoryDao.upd(new InventoryPo(productId, amount));
            }
        }
    }

    @Transactional
    @Override
    public void del(String orderId, String productId) {
        if (Objects.nonNull(orderId) && !StringUtils.isEmpty(orderId)) {
            orderDao.del(orderId);
        }

        if (Objects.nonNull(productId) && !StringUtils.isEmpty(productId)) {
            inventoryDao.del(productId);
        }
    }

    @Transactional
    @Override
    public void doAddTxn() {
        add("1", "01", new BigDecimal("10"));
        add("2", "02", new BigDecimal("20"));
        add("3", "03", new BigDecimal("30"));
    }

    @Transactional
    @Override
    public void doTxn() {
        del("3", "03");
        upd("2", "02", new BigDecimal("99"));
        add("4", "04", new BigDecimal("60"));
        add("1", "AA", new BigDecimal("77"));
    }

}
