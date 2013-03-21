package xn.one.service;

import org.springframework.beans.factory.annotation.Autowired;
import xn.core.command.CommandResult;

/**
 * User: 潘智峰
 * Date: 12-2-9
 */
public class UserService {

    @Autowired
    private SenceService senceService;

    public CommandResult login(long uid) {

        senceService.set(0,uid);
        return new CommandResult();
    }


}
