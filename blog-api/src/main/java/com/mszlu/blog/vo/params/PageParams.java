package com.mszlu.blog.vo.params;

import lombok.Data;

@Data
public class PageParams {
    private int page = 1;
    private int pageSize = 10;
    private Long categoryId;
    private Long tagId;
    private String year;
    private String month;
    //为了让6变成06
    public  String getMonth(){
        if(this.month != null && this.month.length() == 1){
            return "0"+month;
        }
        return  month;
    }
}