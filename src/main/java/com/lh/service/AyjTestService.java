package com.lh.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lh.model.AyjTest;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lh
 * @since 2020-04-28
 */
public interface AyjTestService extends IService<AyjTest> {
    void insert();

    void updateById();

    IPage selectByCriteria();
}
