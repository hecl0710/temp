package com.hx.hxtspro.service.impl;

import com.alibaba.fastjson.JSON;
import com.hx.hxtspro.entity.SysUser;
import com.hx.hxtspro.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class SysUserServiceImpl implements SysUserService {
    @Override
    public Map<String, Object> querySource(SysUser sysUser) {
        log.info("用户权限列表查询：{}", JSON.toJSONString(sysUser));
        Map<String,Object> respMap = new HashMap<>();
        Map<String,Object> homeMap = new HashMap<>();
        Map<String,Object> logoMap = new HashMap<>();
        Map<String,Object> menuMap = new HashMap<>();
        List<Map<String,Object>> menuMaps = new ArrayList<>();
        Map<String,Object> menuChildMap = new HashMap<>();
        List<Map<String,Object>> menuChildMaps = new ArrayList<>();

        Map<String,Object> menuChildMap2 = new HashMap<>();
        List<Map<String,Object>> menuChildMaps2 = new ArrayList<>();

        homeMap.put("title","首页");
        homeMap.put("href","page/welcome-3.html?t=1");

        logoMap.put("title","税务通");
        logoMap.put("image","../static/images/logo.png");
        logoMap.put("href","");

        menuChildMap.put("title","客户管理");
        menuChildMap.put("href","");
        menuChildMap.put("icon","fa fa-home");
        menuChildMap.put("target","_self");

        menuChildMap2.put("title","客户信息");
        menuChildMap2.put("href","customer/customer.html");
        menuChildMap2.put("icon","fa fa-tachometer");
        menuChildMap2.put("target","_self");

        menuChildMaps2.add(menuChildMap2);
        menuChildMap.put("child",menuChildMaps2);

        menuChildMaps.add(menuChildMap);

        menuMap.put("title","常规管理");
        menuMap.put("href","");
        menuMap.put("icon","fa fa-address-book");
        menuMap.put("target","_self");
        menuMap.put("child",menuChildMaps);

        menuMaps.add(menuMap);

        respMap.put("homeInfo",homeMap);
        respMap.put("logoInfo",logoMap);
        respMap.put("menuInfo",menuMaps);

        log.info("响应权限列表：{}",JSON.toJSONString(respMap));
        return respMap;
    }
}
