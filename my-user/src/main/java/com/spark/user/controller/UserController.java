/**
 * Copyright (C), 2015-2023, XXX有限公司
 * FileName: UserController
 * Author:   FanLian
 * Date:     2023/3/11 23:31
 * Description: 用户控制类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.spark.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户控制类〉
 *
 * @author spark
 * @create 2023/3/11
 * @since 1.0.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("hello")
    public String test(){
        return "hello world!";
    }
}
