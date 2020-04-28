package com.lh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lh.model.AyjTest;
import com.lh.mapper.AyjTestMapper;
import com.lh.service.AyjTestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lh
 * @since 2020-04-28
 */
@Service
@Transactional
public class AyjTestServiceImpl extends ServiceImpl<AyjTestMapper, AyjTest> implements AyjTestService {

    @Autowired
    private AyjTestMapper ayjTestMapper;

    @Override
    public void insert() {
        AyjTest ayjTest = new AyjTest();
        ayjTest.setName("test");
        ayjTestMapper.insert(ayjTest);
    }

    @Override
    public void updateById() {
        AyjTest ayjTest = new AyjTest();
        ayjTest.setId(1);
        ayjTest.setName("test_update");
        ayjTestMapper.updateById(ayjTest);
    }

    /**
     * 分页条件查询
     * @return
     */
    @Override
    public IPage selectByCriteria() {
        // 添加分页信息,一般是由前端传入，这里就直接写死
        Page<AyjTest> page = new Page<AyjTest>(1, 2);
        // 添加查询条件
        QueryWrapper<AyjTest> queryWrapper = new QueryWrapper<AyjTest>();
        queryWrapper.eq("name", "test");
        // 调用查询
        IPage<AyjTest> iPage = ayjTestMapper.selectPage(page, queryWrapper);
        return iPage;
    }
}
