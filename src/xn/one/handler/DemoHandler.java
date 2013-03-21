package xn.one.handler;

import org.springframework.beans.factory.annotation.Autowired;
import xn.core.AbstractHandler;
import xn.core.command.Command;
import xn.core.command.CommandResult;
import xn.core.annotation.Cmd;
import xn.core.annotation.After;
import xn.one.service.DemoService;

/**
 * User: 潘智峰
 * Date: 2011-10-13
 */
public class DemoHandler extends AbstractHandler {

    @Autowired
    private DemoService demoService;

    @Cmd(20100)
    public CommandResult test(Command command, String name) {
        CommandResult result = demoService.test(command.getUid(), "Hello:" + name);
        result.args = new Object[]{command};  //构造AfterHandler的入参
        return result;
    }

    @Cmd(20101)
    public CommandResult test2(Command command) {
        return demoService.test2(command.getUid());
    }

    @Cmd(20102)
    public CommandResult test3(Command command, String name) {
        return demoService.test3(command.getUid(), name);
    }
}
