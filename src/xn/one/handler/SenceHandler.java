package xn.one.handler;

import org.springframework.beans.factory.annotation.Autowired;
import xn.core.AbstractHandler;
import xn.core.annotation.Cmd;
import xn.core.command.Command;
import xn.core.command.CommandResult;
import xn.one.service.SenceService;

/**
 * User: 潘智峰
 * Date: 12-2-9
 */
public class SenceHandler extends AbstractHandler{

    @Autowired
    private SenceService senceService;

    @Cmd(11100)
    public CommandResult senceUserJoin(Command command,int sence) {
        return senceService.senceUserJoin(command.getHead(),command.getUid(),sence);
    }

    @Cmd(11101)
    public CommandResult senceUserAll(Command command,int sence) {
        return senceService.senceUserAll(command.getUid(),sence);
    }

    @Cmd(11110)
    public CommandResult walkByMouse(Command command,int sence,float x,float y) {
        return senceService.walkByMouse(command.getHead(),command.getUid(),sence,x,y);
    }

    @Cmd(11111)
    public CommandResult walkByKeyboard(Command command,int sence,String keys) {
        return senceService.walkByKeyboard(command.getHead(),command.getUid(),sence,keys);
    }

    @Cmd(11112)
    public CommandResult action(Command command,int sence,int key) {
        return senceService.action(command.getHead(),command.getUid(),sence,key);
    }

}
