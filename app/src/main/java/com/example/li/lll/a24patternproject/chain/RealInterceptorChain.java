package com.example.li.lll.a24patternproject.chain;

import java.io.IOException;
import java.util.List;

public class RealInterceptorChain implements Interceptor.Chain {
    private final List<Interceptor> interceptors;
    private final int index;
    private final Request request;
    private int calls;

    public RealInterceptorChain(List<Interceptor> interceptors,int index,Request request){
        this.interceptors = interceptors;
        this.index = index;
        this.request =request;
    }

    @Override
    public Request request() {
        return request;
    }

    @Override
    public Response proced(Request request) throws IOException {
        if (index >= interceptors.size()){
            throw  new AssertionError();
        }
        calls ++;
        RealInterceptorChain next =new RealInterceptorChain(interceptors,index+1,request);
        Interceptor interceptor =interceptors.get(index);
        Response response =interceptor.intercept(next);

        if (index +1 < interceptors.size() && next.calls !=1){
            throw new IllegalStateException("network interceptor " + interceptor
                    + " must call proceed() exactly once");
        }
        if (response ==null){
            throw new NullPointerException("interceptor " + interceptor  + " returned null");
        }

        return response;
    }
}
