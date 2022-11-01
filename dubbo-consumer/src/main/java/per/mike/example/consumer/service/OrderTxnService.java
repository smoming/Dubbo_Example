package per.mike.example.consumer.service;

import java.math.BigDecimal;

/**
 * @author DXC Mike
 * @date 2022年10月19日
 * @remark
 */
public interface OrderTxnService {
    /**
     * 新增
     */
    void add(String orderId, String productId, BigDecimal amount);

    /**
     * 修改
     */
    void upd(String orderId, String productId, BigDecimal amount);

    /**
     * 刪除
     */
    void del(String orderId, String productId);

    /**
     * 執行@Transactional
     */
    void doAddTxn();

    /**
     * 執行@Transactional
     */
    void doTxn();
}
