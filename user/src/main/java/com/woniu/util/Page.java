package com.woniu.util;


public class Page{
    private Integer pageIndex;
    private Integer pageCount;
    private Integer dataCount;

    public Page() {
    }

    public Page(Integer pageIndex, Integer pageCount, Integer dataCount) {
        this.pageIndex = pageIndex;
        this.pageCount = pageCount;
        this.dataCount = dataCount;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getDataCount() {
        return dataCount;
    }

    public void setDataCount(Integer dataCount) {
        this.dataCount = dataCount;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageIndex=" + pageIndex +
                ", pageCount=" + pageCount +
                ", dataCount=" + dataCount +
                '}';
    }
}
