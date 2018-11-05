package com.example.li.lll.a24patternproject.chain;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 记录责任链模式，该模式对比 respondibilitychain
 * 1.直接将任务加入任务链中，依次的执行该任务链，是多个任务继续操作。respondibilitychain 在任务链中选任务，返回任务链。
 * 2.在验证系统用到 eg：自考验证      1A,4,5A5D,6A6C
                        徐州成考      1A,3B3C,4,5A5D,6A6C
                            连云港成考  1A,3A3C,4,5A5D,6A6C  其中的都是每一个操作的任务。

 */
public class TempClient {
    public static void main(String[] args) throws IOException{
        List<Interceptor> interceptors =new ArrayList<>();
        interceptors.add(new BridgeInterceptor());
        interceptors.add(new CacheInterceptor());
        interceptors.add(new ConnectInterceptor());
        Request request =new Request();
        Interceptor.Chain chain=new RealInterceptorChain(interceptors,0,request);
        chain.proced(request);

        /**
         *  执行结果， 倒序
         *   ConnectInterceptor intercept
         *   CacheInterceptor intercept
         *   BridgeInterceptor intercept
         */
    }
}
