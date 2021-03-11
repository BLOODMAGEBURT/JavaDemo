package com.burt.pattern.chain;

import com.burt.pattern.chain.filter.*;

import java.nio.channels.FileChannel;
import java.util.ArrayList;

/**
 * Client
 *
 * @author xujianbo
 * @date 2021/3/11 1:56 下午
 * @since 1.0.0
 * <p>
 * 需求场景：
 * 1。在论坛发表一篇博客
 * 2。论坛后台 需要进行一系列的信息处理（敏感词，敏感图，黑客代码检测，判断长度等合法性） 才能入库
 */
public class Client {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setTitle("hello everyone");
        msg.setMsg("hello, <script> http everyone is 996");


        FilterChain filterChain = new FilterChain();
        FilterChain fc = filterChain.add(new HtmlFilter())
                .add(new SensitiveFilter());


        FilterChain filterChain2 = new FilterChain().add(new UrlFilter());

        fc.add(filterChain2);

        fc.doFilter(msg);

        System.out.println(msg.getMsg());

    }
}
