package com.atguigu.facade_9;


/**
 * 外观类(Facade)
 *      为调用端提供统一的调用接口, 外观类知道哪些子系统负责处理请求,从而将调用端的请求代理给适当子系统对象
 */
public class Facade {

    /**
     * 定义各个子系统对象
     */
    private Popcorn popcorn;
    private Projector projector;
    private DVDPlayer dVDPlayer;


    /**
     * 初始化子系统：
     */
    public Facade() {
        super();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.dVDPlayer = DVDPlayer.getInstanc();
    }

    /**
     * 1：准备
     */
    public void ready() {
        popcorn.on();
        popcorn.pop();
        projector.on();
        dVDPlayer.on();
    }

    /**
     * 2：放映
     */
    public void play() {
        dVDPlayer.play();
    }

    /**
     * 3：暂停
     */
    public void pause() {
        dVDPlayer.pause();
    }

    /**
     * 4：结束
     */
    public void end() {
        popcorn.off();
        projector.off();
        dVDPlayer.off();
    }





}
