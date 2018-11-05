package com.example.li.lll.a24patternproject.chain;

import java.io.IOException;

public class CacheInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();
        //继续操作。
        Response proced = chain.proced(request);
        System.out.println("CacheInterceptor");
        return proced;
    }
}
