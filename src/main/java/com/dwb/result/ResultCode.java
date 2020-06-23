package com.dwb.result;

public enum ResultCode {
	// 操作成功标识
	SUCCESS(200, "Success"),
	// 系统异常标识
	SYS_ERROR(500, "当前网络不稳定，请稍后重试"),
	TECHNICIAN(40001,"姓名不能为空"),
	BIRTHDAY(40002,"生日不能为空"),
	DESCRIBE(40003,"技能描述不能为空"),


	EXTERNAL_SYSTEM_ERROR(1000, "调用外部系统[%s]出错"),
	TOO_MANY_REQUESTS(1002, "请求过多"),
	SYS_OPT_ERROR(1003, "操作失败，请刷新页面重试"),

	//----------------------------------------
	// 通用异常
	// 区间：10001-10050
	//----------------------------------------
	COMMON_PARAM_NULL(10001, "必要参数[%s]为空"),
	COMMON_PARAM_INVALID(10002, "%s无效"),
	CONTAINS_ILLEGAL_CHARACTERS(10003, "%s含有非法字符"),
	DATA_NOT_EXIST(10004, "%s不存在"),
	NO_PERMISSION_OPERATE(10005, "没有%s的操作权限"),
	CAN_NOT_BE_OPERATE(10006, "%s不能%s"),
	FIELD_NOT_ALLOWED_EMPTY(10010, "%s不能为空"),
	FIELD_VALUE_MUST_LARGE_THAN(10011, "%s必须大于%s"),
	FIELD_VALUE_MUST_LESS_THAN(10012, "%s必须小于%s"),
	DATA_EXIST(10013, "%s已存在"),
	FIELD_NOT_EMAIL(10013, "%s格式错误"),
	FIELD_NOT_MOBILE(10014, "%s格式错误"),
	FIELD_NOT_ID_NUM(10015, "%s格式错误"),
	FIELD_NOT_DATE(10016, "%s格式错误"),
	FIELD_LENGTH_MUST_LESS(10017, "%s必须小于%d"),
	FIELD_LENGTH_MUST_MORE(10018, "%s必须大于%d"),
	FIELD_LENGTH_MUST_BETWEEN(10019, "%s长度必须大于%d和小于%d"),
	FILED_NOT_IN_ENUM_VALUES(10020, "不支持的%s"),
	FIELD_NOT_BOTH_BE_EMPTY(10021, "%s不能同时为空"),
	MUST_BE_INTEGER_MULTIPLE(10022, "%s必须是%s的整数倍"),
	UPLOAD_PICTURES_ERROR(10023, "上传图片出错，%s"),

	FIELD_VALUE_MUST_GE_THAN(10023, "%s必须大于等于%s"),
	FIELD_VALUE_MUST_LE_THAN(10024, "%s必须小于等于%s"),
	FIELD_VALUE_MUST_DONE(10025, "%s还未%s"),

	TIME_MUST_LARGE_THAN(10030, "%s必须晚于%s"),
	TIME_VALUE_MUST_LESS_THAN(10031, "%s必须早于%s"),
	INVALID_CHANGE_STATUS(10032, "%s更新状态非法"),
	FIELD_DIGITAL(10033, "获取商品信息出错"),
	LENGTH_MUST_LESS(10034, "%s必须小于%s"),
	LENGTH_MUST_MORE(10035, "%s必须大于%s"),
	NO_DATA_FOUND(10036, "暂无数据"),
	COMMON_MESSAGE(10045, "%s"),
	IS_DEFAULT_ADDRESS(10046, "%s已设为默认值"),



	//----------------------------------------
	// api调用异常
	// 区间：10051-10099
	//----------------------------------------
	API_INVLID_SIGN(10100, "签名错误"),
	API_INVLID_FROM(10101, "没有权限访问"),
	API_INVLID_DATA(10102, "请求数据错误"),
	API_NOT_SUPPORT_METHOD(10103, "只接受Post请求"),
	API_INVLID_DATA_FORMAT(10104, "数据格式不符合要求"),
	API_INVLID_API(10105, "api【%s】不存在"),


	;


	public Integer code;
	public String message;

	public String getCodeS() {
		return codeS;
	}

	public String codeS;

	ResultCode(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
	ResultCode(String codeS, String message) {
		this.codeS = codeS;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
