package xn.one.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import xn.cache.ICache;
import xn.one.dao.DemoDAO;
import xn.one.domain.Demo;

import javax.annotation.PostConstruct;

/**
 * User: 潘智峰
 * Date: 2011-11-17
 */
public class DemoCache {

    @Autowired
    private DemoDAO demoDAO;

    @Autowired
    @Qualifier("cache")
    private ICache cache;

    @PostConstruct
    public void init() {
    }

    private static String key = "demo_";

    private String getKey(long uid) {
        return key + uid;
    }

    public void insert(Demo demo) {
        demoDAO.insert(demo);
        String key = getKey(demo.getUid());
        cache.set(key, demo);
    }


    public Demo query(long uid) {
        String key = getKey(uid);
        Demo demo = cache.get(key);
        if (null == demo) {
            demo = demoDAO.query(uid);
            if (null != demo) {
                cache.set(key, demo);
            }
        }
        return demo;
    }

    public Demo updateName(long uid, String name) {
        Demo demo = new Demo(uid, name);
        update(demo);
        return demo;
    }


    private boolean update(Demo demo) {
        //同步cache与db
        String key = getKey(demo.getUid());
        boolean result = cache.set(key, demo);
        demoDAO.update(demo);
        // synchronous.put(key);
        return result;
    }
}
