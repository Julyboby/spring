package com.july.springdatajpa.util;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

/**
 * @program: Spring_Demo
 * @description: 分页工具
 * @author: July
 * @create: 2018-10-09 15:03
 **/
public class PageUtil {

    public static PageRequest getPageRequest(Integer pageIndex, Integer pageSize, Sort sort) {
        //默认页面为0，
        if (pageIndex == null || pageIndex < 1) {
            pageIndex = 0;
        } else {
            pageIndex = pageIndex - 1;
        }
        //默认页面大小20
        if (pageSize == null || pageSize < 1) {
            pageSize = 20;
        }
        //默认采用ID倒叙排列
        if (sort == null) {
            sort = new Sort(Sort.Direction.DESC, "id");
        }
        return PageRequest.of(pageIndex, pageSize, sort);
    }

    public static PageRequest getPageRequest() {
        return getPageRequest(null, null, null);
    }

    public static PageRequest getPageRequest(Integer pageIndex, Integer pageSize) {
        return getPageRequest(pageIndex, pageSize, null);
    }
}
