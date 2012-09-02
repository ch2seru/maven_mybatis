package com.sample.scott.model;

/**
 * Subject :
 * User: lke
 * Date: 12. 4. 13
 */
public class SearchModel {
    private String search_column = "";
    private String search_keyword = "";
    private int page_num = 1;
    private int max_size = 10;

    public String getSearch_column() {
        return search_column;
    }

    public void setSearch_column(String search_column) {
        this.search_column = search_column;
    }

    public String getSearch_keyword() {
        return search_keyword;
    }

    public void setSearch_keyword(String search_keyword) {
        this.search_keyword = search_keyword;
    }

    public int getPage_num() {
        if(this.page_num==1) return 0;
        else return (this.page_num-1) * this.max_size;
    }

    public void setPage_num(int page_num) {
        this.page_num = page_num;
    }

    public int getMax_size() {
        if(this.page_num==1) return this.max_size;
        else return this.page_num * this.max_size;
    }

    public void setMax_size(int max_size) {
        this.max_size = max_size;
    }
}
