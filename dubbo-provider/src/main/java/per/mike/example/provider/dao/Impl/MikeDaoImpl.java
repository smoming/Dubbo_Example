package per.mike.example.provider.dao.Impl;

import javax.sql.DataSource;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import per.mike.example.face.bean.MikePo;
import per.mike.example.face.dao.MikeDao;

/**
 * @author DXC Mike
 * @date 2022年10月19日
 * @remark
 */
@DubboService
@Component
public class MikeDaoImpl implements MikeDao {

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
    public void add(MikePo po) {
        String sql = "INSERT INTO TB_MIKE (CA,CB) VALUES ('" + po.getCa() + "', '" + po.getCb() + "')";
        geJdbcTemplate().update(sql);
    }

    /**
     * 修改
     */
    @Override
    @Transactional
    public void upd(MikePo po) {
        String sql = "UPDATE TB_MIKE SET CB = '" + po.getCb() + "' WHERE CA = '" + po.getCa() + "'";
        geJdbcTemplate().update(sql);
    }

    /**
     * 刪除
     */
    @Override
    @Transactional
    public void del(MikePo po) {
        String sql = "DELETE FROM TB_MIKE WHERE CA = '" + po.getCa() + "'";
        geJdbcTemplate().update(sql);
    }

}
