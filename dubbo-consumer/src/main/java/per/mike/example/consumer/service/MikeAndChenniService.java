package per.mike.example.consumer.service;

/**
 * @author DXC Mike
 * @date 2022年10月19日
 * @remark
 */
public interface MikeAndChenniService {
    /**
     * 新增
     */
    void add(String mca, String mcb, String cca, String ccb);

    /**
     * 修改
     */
    void upd(String mca, String mcb, String cca, String ccb);

    /**
     * 刪除
     */
    void del(String mca, String cca);

    /**
     * 執行@Transactional
     */
    void doTxn();
}
