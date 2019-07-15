package com.leyou.common.vo;

import java.util.List;

public class PageResult<T> {
    private Long taotal; //总页数
    private Integer totalPage;
    private List<T> items;

    public PageResult(){}

    public PageResult(Long taotal,List<T> items){
        this.taotal = taotal;
        this.items = items;
    }

    public PageResult(Long taotal, Integer totalPage, List<T> items) {
        this.taotal = taotal;
        this.totalPage = totalPage;
        this.items = items;
    }
}
