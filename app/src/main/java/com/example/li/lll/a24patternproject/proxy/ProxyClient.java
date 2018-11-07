package com.example.li.lll.a24patternproject.proxy;

/**
 * 代理模式：
 *
 * 为其他对象提供一种代理以控制对这个对象的访问。
 *
 * Subject 类，定义了RealSubject和Prpxy的共用接口，这样就能在任何使用RealSubject的地方使用Proxy。
 *
 * Proxy类，保存一个引用使得代理可以访问实体，并提供一个与Subject的接口相同的接口，这样代理可以替代实体。
 * 远程代理：也就是为一个对象在不同的地址空间提供局部代表，这样可以隐藏一个对象存在于不同地址空间的事实。
 * 虚拟代理：是根据需要创建开销很大的对象。通过它来存放实例化需要很长时间的真实对象。
 * 安全代理：用来控制真实对象访问时的权限，
 * 智能指引：时指当调用真实的对象时，代理处理另外一些事。
 */
public class ProxyClient {
    public static void main(String [] args){
        Proxy proxy =new Proxy();
        proxy.request();;
    }

}
