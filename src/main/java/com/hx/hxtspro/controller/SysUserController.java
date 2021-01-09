package com.hx.hxtspro.controller;

import com.hx.hxtspro.entity.SysUser;
import com.hx.hxtspro.service.SysUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("sysUser")
public class SysUserController {

    @Resource
    SysUserService sysUserService;

    @RequestMapping("querySource")
    public Map<String,Object> querySource(SysUser sysUser){
        return sysUserService.querySource(sysUser);
    }
}
