package com.burt.pattern.chain;

/**
 * Msg
 *
 * @author xujianbo
 * @date 2021/3/11 2:03 下午
 * @since 1.0.0
 */
public class Msg {
    private String title;
    private String msg;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "title='" + title + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
