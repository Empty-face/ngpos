package edu.com.ngpos.controller;

import edu.com.ngpos.core.domain.AjaxResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 符合Restful的控制器
 */
@RestController
public class IndexController {
    /**
     * 接口
     *
     * @return
     */
    @GetMapping("/")
    public AjaxResult index() {
        return AjaxResult.success("查询成功","Hello SpringBoot");
    }
//    public String index() {
//        return "Hello SpringBoot";
//    }
}
