package com.dwb.controller;

import com.dwb.entity.PEnterprise;
import com.dwb.result.Result;
import com.dwb.service.EnterpriseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author manke
 * @Date 2020/6/23 10:24
 * @Version 0.0.1
 */
@Api(value = "enterprise", description = "企业信息接口")
@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {
    @Autowired
    private EnterpriseService enterpriseService;
    @ApiOperation(value = "getInfo", notes = "获取企业信息")
    @GetMapping("/getInfo")
    public Result<PEnterprise> get() {
        Result<PEnterprise> result = Result.newSuccess();
        PEnterprise enterprise = enterpriseService.getInfo();
        result.setDataMap(enterprise);
        return result;
    }
    @ApiOperation(value = "update", notes = "更新企业信息")
    @PostMapping("/update")
    public Result<Integer> save(@RequestBody PEnterprise pEnterprise){
        enterpriseService.update(pEnterprise);
        return Result.newSuccess();
    }

}






















