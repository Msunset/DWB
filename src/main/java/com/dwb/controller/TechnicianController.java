package com.dwb.controller;
import com.dwb.entity.SJishi;
import com.dwb.result.Result;
import com.dwb.service.TechnicianService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author manke
 * @Date 2020/6/23 15:25
 * @Version 0.0.1
 */
@RestController
@Api(value = "technician", description = "技师控制器")
@RequestMapping("/technician")
public class TechnicianController {
    @Autowired
    private TechnicianService technicianService;
    @ApiOperation(value = "add" ,notes = "技师添加")
    @PostMapping("/add")
    public Result<Integer> add(@RequestBody SJishi technician){
        technicianService.insert(technician);
        return Result.newSuccess();
    }




}
