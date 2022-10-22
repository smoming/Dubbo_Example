package per.mike.example.consumer.dao.Impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import per.mike.example.face.bean.ChenniPo;
import per.mike.example.face.dao.ChenniDao;

/**
 * @author DXC Mike
 * @date 2022年10月19日
 * @remark
 */
@Service
public class ChenniDaoImpl implements ChenniDao {

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
    public void add(ChenniPo po) {
        String sql = "INSERT INTO TB_CHENNI (CA,CB) VALUES ('" + po.getCa() + "', '" + po.getCb() + "')";
        geJdbcTemplate().update(sql);
    }

    /**
     * 修改
     */
    @Override
    @Transactional
    public void upd(ChenniPo po) {
        String sql = "UPDATE TB_CHENNI SET CB = '" + po.getCb() + "' WHERE CA = '" + po.getCa() + "'";
        geJdbcTemplate().update(sql);
    }

    /**
     * 刪除
     */
    @Override
    @Transactional
    public void del(ChenniPo po) {
        String sql = "DELETE FROM TB_CHENNI WHERE CA = '" + po.getCa() + "'";
        geJdbcTemplate().update(sql);
    }

}
