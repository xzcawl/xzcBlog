package com.xzc.blog.domain.dto;

/**
 * @Classname ResultInformationEnum
 * @Description TODO
 * @Date 2018/11/9 11:04
 * @Created by xzcawl
 */
public enum ResultEnum {


    /** 公共返回 */
    SUCCESS(1, "成功"),
    ERROR(0, "失败"),
    UNKNOWN_ERROR(-1, "未知异常"),
    EXECUTE_RROR(-2, "执行异常");


    private int state;
    private String info;

    ResultEnum() {
    }

    ResultEnum(int state, String info) {
        this.state = state;
        this.info = info;
    }

    public int getState() {
        return state;
    }

    public String getInfo() {
        return info;
    }

    public static ResultEnum stateOf(int index) {
        for (ResultEnum statEnum : values()) {
            if (statEnum.getState() == index) {
                return statEnum;
            }
        }
        return null;
    }

}
