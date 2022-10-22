package per.mike.example.consumer.service.Impl;

import java.util.Objects;

import org.apache.dubbo.common.utils.StringUtils;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import per.mike.example.consumer.service.MikeAndChenniService;
import per.mike.example.face.bean.ChenniPo;
import per.mike.example.face.bean.MikePo;
import per.mike.example.face.dao.ChenniDao;
import per.mike.example.face.dao.MikeDao;

/**
 * @author DXC Mike
 * @date 2022年10月19日
 * @remark
 */
@Service
public class MikeAndChenniServiceImpl implements MikeAndChenniService {

    @DubboReference
    MikeDao mDao;

    @Autowired
    ChenniDao cDao;

    @Transactional
    @Override
    public void add(String mca, String mcb, String cca, String ccb) {
        if (Objects.nonNull(mca) && !StringUtils.isEmpty(mca)) {
            mDao.add(new MikePo(mca, mcb));
        }

        if (Objects.nonNull(cca) && !StringUtils.isEmpty(cca)) {
            cDao.add(new ChenniPo(cca, ccb));
        }
    }

    @Transactional
    @Override
    public void upd(String mca, String mcb, String cca, String ccb) {
        if (Objects.nonNull(mca) && !StringUtils.isEmpty(mca)) {
            mDao.upd(new MikePo(mca, mcb));
        }

        if (Objects.nonNull(cca) && !StringUtils.isEmpty(cca)) {
            cDao.upd(new ChenniPo(cca, ccb));
        }
    }

    @Transactional
    @Override
    public void del(String mca, String cca) {
        if (Objects.nonNull(mca) && !StringUtils.isEmpty(mca)) {
            mDao.del(new MikePo(mca, ""));
        }

        if (Objects.nonNull(cca) && !StringUtils.isEmpty(cca)) {
            cDao.del(new ChenniPo(cca, ""));
        }
    }

    @Transactional
    @Override
    public void doTxn() {
        del("MA", "");
        upd("", "", "CA", "CACA222");
        add("MA", "MA3", "CAA", "CA1");
    }

}
