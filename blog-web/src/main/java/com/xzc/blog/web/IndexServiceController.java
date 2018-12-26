package com.xzc.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xzc on 2018/12/8 17:14
 */
@Controller
@RequestMapping
public class IndexServiceController {

    /**
     * 500错误页面
     */
    @RequestMapping(value="/500")
    public String error500() {
        return "error/500";
    }

    /**
     * 404错误页面
     */
    @RequestMapping(value="/404")
    public String error404() {
        return "error/404";
    }

    /**
     * 无权限
     * @return
     */
    @RequestMapping(value="/refuse")
    public String refuse() {
        return "error/refuse";
    }
    

}
