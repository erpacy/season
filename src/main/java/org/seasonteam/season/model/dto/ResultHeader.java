package org.seasonteam.season.model.dto;

import java.io.Serializable;

/**
 * 共有返回头
 *
 * @author yust
 *         2016-11-24
 */
public class ResultHeader implements Serializable {

    private Integer code = 1;//1：成功，0：失败

    private String msg;

    public ResultHeader() {}

    public ResultHeader(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
