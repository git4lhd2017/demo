package com.demo2;

/**
 * All rights Reserved, Designed By www.info4z.club
 * <p>title:com.demo2</p>
 * <p>ClassName:Demo</p>
 * <p>Description:TODO(请用一句话描述这个类的作用)</p>
 * <p>Compony:Info4z</p>
 * author:poker_heart
 * date:2019/12/18
 * version:1.0
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目
 */
public interface Demo {


    void showHello();
    public default void shwoHello(){
        System.out.println("hello");
    }

}
