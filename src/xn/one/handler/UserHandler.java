package xn.one.handler;

import org.jboss.netty.channel.ChannelHandlerContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import xn.core.AbstractHandler;
import xn.core.ServerConfig;
import xn.core.annotation.Cmd;
import xn.core.command.Command;
import xn.core.command.CommandResult;
import xn.core.online.Session;
import xn.core.online.Sessions;
import xn.one.service.AdminService;
import xn.one.service.UserService;

import java.net.InetSocketAddress;

/**
 * User: 潘智峰
 * Date: 12-2-9
 */
public class UserHandler extends AbstractHandler {

    @Autowired
    private UserService userService;

    @Autowired
    private AdminService adminService;

    @Autowired
    private Sessions sessions;

    @Autowired
    private ServerConfig serverConfig;

    @Cmd(10100)
    public CommandResult version(Command command, String v) {
        int r = 0;
        if (!serverConfig.getVersion().equals(v)) {
            r = 1;
        }
        return new CommandResult(r);
    }

    @Cmd(10101)
    public CommandResult login(Command command, ChannelHandlerContext context) {
        Session session = new Session();
        context.setAttachment(command.getUid());
        session.setChannelContext(context);
        this.sessions.put(command.getUid(), session);
        String ip = ((InetSocketAddress) context.getChannel().getRemoteAddress()).getAddress().getHostAddress();
        log.info("LOGIN|" + command.getUid() + "|" + ip);
        return userService.login(command.getUid());
    }

     //tmp
    @Cmd(99100)
    public CommandResult config(Command command) {
        String r=adminService.generateConfig() ;
        return new CommandResult(r);
    }
}
