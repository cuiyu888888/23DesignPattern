package com.atguigu.command_13;

/**
 * 命令的发布者：Invoker
 */
public class Invoker {

    /**
     * 聚合命令的抽象类：command
     */
    private Command command;

    public Command getCommand(Command commend) {
        return this.command;
    }

    public void setCommand(Command commend) {
        this.command = commend;
    }

    /**
     * 命令执行
     */
    public void execute(){
        command.execute();
    }

}
