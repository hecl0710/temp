package com.hx.hxtspro.service;

import com.hx.hxtspro.entity.SysUser;

import java.util.Map;

public interface SysUserService {
    Map<String,Object> querySource(SysUser sysUser);
}
