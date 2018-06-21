package com.pinyougou.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author lee leeshuhua@163.com
 * @create 2018-06-20-22:37
 **/
public class PageResult implements Serializable {

    // 总记录数
    private long total;
    // 当前页结果
    private List rows;

    public PageResult(long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
