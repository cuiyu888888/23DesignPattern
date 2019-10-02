package com.atguigu.command_13;

/**
 * 具体的命令
 */
public class LightOnCommand implements Command{

    /**
     * 聚合命令的执行者：LightReceiver
     */
    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        super();
        this.lightReceiver = lightReceiver;
    }

    /**
     * 执行具体命令
     */
    @Override
    public void execute() {
        lightReceiver.on();
    }

}
