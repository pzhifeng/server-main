package xn.one.service;

import org.apache.log4j.Logger;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import xn.core.online.Sessions;
import xn.core.socket.ICloseService;

/**
 * User: 潘智峰
 */
public class CloseService implements ICloseService {

    protected final Logger log = Logger.getLogger(this.getClass());

    @Autowired
    protected Sessions sessions;

    @Autowired
    protected SenceService senceService;

    @Override
    public void onChannelClose(ChannelHandlerContext ctx) {
        Long uid = (Long) ctx.getAttachment();
        if (null != uid) {
            senceService.remove(uid);
            sessions.remove(uid);
            log.info("EXIT|" + uid);
        }
        ctx.getChannel().close();


    }

    @Override
    public void onServerClose(int port) {

    }
}