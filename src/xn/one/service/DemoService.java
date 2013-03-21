package xn.one.service;

import org.springframework.beans.factory.annotation.Autowired;
import xn.core.command.CommandResult;
import xn.one.cache.DemoCache;
import xn.one.domain.Demo;
import xn.utils.CommonUtils;

/**
 * User: 潘智峰
 * Date: 2011-11-17
 */
public class DemoService {

    @Autowired
    private DemoCache demoCache;

    public CommandResult test(long uid, String name) {
        Demo demo = new Demo(uid, name+"_"+ CommonUtils.random(1,1000));
        demoCache.insert(demo);
        return new CommandResult(CommandResult.SUCCESS, demo);
    }

    public CommandResult test2(long uid) {
        Demo demo = demoCache.query(uid);
        return new CommandResult(demo);
    }

    public CommandResult test3(long uid, String name) {
        Demo demo = demoCache.updateName(uid,  name+"+"+CommonUtils.random(1,1000));
        return new CommandResult(CommandResult.SUCCESS, demo);
    }
}
