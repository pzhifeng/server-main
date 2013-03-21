package xn.one.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import xn.cache.ICache;
import xn.core.socket.ICheckService;

import javax.annotation.PostConstruct;

/**
 * User: 潘智峰
 * Date: 12-1-13
 */
public class CheckService implements ICheckService {

    @Autowired
    @Qualifier("cache")
    private ICache cache;

    /**
     * 初始化持久化的无效IP和账号
     */
    @PostConstruct
    public void init() {

    }

    @Override
    public boolean checkIp(String ip) {
        return true;
    }

    @Override
    public boolean checkAccount(long uid) {
        return true;
    }
}
