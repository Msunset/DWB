package com.dwb.common.check;

import com.dwb.config.BizException;
import com.dwb.entity.SJishi;
import com.dwb.result.ResultCode;

import static com.dwb.utils.Empty.INT_EMPTY;
import static com.dwb.utils.Empty.STRING_EMPTY;

/**
 * @Author manke
 * @Date 2020/6/23 17:06
 * @Version 0.0.1
 */
public class Check {
    // 校验模型数据完整性
    public static void CHECK_TECHNICIAN(SJishi technician){
        if (STRING_EMPTY(technician.getName())){
            throw  new BizException(ResultCode.TECHNICIAN);

        }
        if (INT_EMPTY(technician.getBirthday())){
            throw  new BizException(ResultCode.BIRTHDAY);
        }
        if (STRING_EMPTY(technician.getJinengDesc())){
            throw  new BizException(ResultCode.DESCRIBE);
        }



    }
}
