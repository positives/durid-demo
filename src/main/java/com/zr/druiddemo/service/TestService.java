package com.zr.druiddemo.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author zr
 * @ClassName: TestService
 * @Description: TODO
 * @date 2019/4/28 17:27
 */
public interface TestService {

    List<Map<String,Object>> queryAll();
}
