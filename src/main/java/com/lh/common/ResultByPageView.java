package com.lh.common;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: ResultByPageView.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2018/08/25 15:21
 */
@Data
@NoArgsConstructor
public class ResultByPageView<T> {
    private Integer pages;
    private Long total;
    private Integer pageSize;
    private Integer pageNum;
    private T data;

    public ResultByPageView(Long total, Integer pageSize, Integer pageNum, T data) {
        this.total = total;
        this.pageSize = pageSize;
        this.pageNum = pageNum;
        this.data = data;
        this.pages = (int) (total - 1) / pageSize + 1;
    }
}