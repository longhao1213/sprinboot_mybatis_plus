package com.lh.mybatis_config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: MyMetaObjectHandler.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/04/24 14:05
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    private final static Logger logger = LoggerFactory.getLogger(MyMetaObjectHandler.class);

//    @Autowired
//    private CurrentUserUtils currentUserUtils;

    @Override
    public void insertFill(MetaObject metaObject) {
        if (metaObject.getValue("createTime") == null) {
            this.setFieldValByName("createTime", new Date(), metaObject);
            logger.info("自动填充创建时间");
        }
        if (metaObject.getValue("lastModifyTime") == null) {
            this.setFieldValByName("lastModifyTime", new Date(), metaObject);
            logger.info("自动填充最后修改时间");
        }
//        if (metaObject.getValue("createUserId") == null) {
//            this.setFieldValByName("createUserId", currentUserUtils.getCurrentUserId(), metaObject);
//            logger.info("自动填充创建人id");
//        }
//        if (metaObject.getValue("createUserName") == null) {
//            this.setFieldValByName("createUserName", currentUserUtils.getCurrentUserName(), metaObject);
//            logger.info("自动填充创建人名称");
//        }

    }

    @Override
    public void updateFill(MetaObject metaObject) {
        if (metaObject.getValue("et.lastModifyTime") == null) {
            this.setFieldValByName("et.lastModifyTime", new Date(), metaObject);
            logger.info("自动填充最后修改时间");
        }
//        if (metaObject.getValue("lastModifyUserId") == null) {
//            this.setFieldValByName("lastModifyUserId", currentUserUtils.getCurrentUserId(), metaObject);
//            logger.info("自动填充最后修改人id");
//        }
//        if (metaObject.getValue("lastModifyUserName") == null) {
//            this.setFieldValByName("lastModifyUserName", currentUserUtils.getCurrentUserName(), metaObject);
//            logger.info("自动填充最后修改人名称");
//        }
    }

}