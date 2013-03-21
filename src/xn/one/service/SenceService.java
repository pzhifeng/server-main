package xn.one.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import xn.core.command.CommandDecoder;
import xn.core.command.CommandResult;
import xn.core.online.Sessions;

import java.util.*;

/**
 * User: 潘智峰
 * Date: 12-2-9
 * <p/>
 * 场景服务，缓存<场景,玩家>
 */
public class SenceService {

    @Autowired
    protected Sessions sessions;


    public CommandResult senceUserJoin(int head, long uid, int sence) {
        set(sence, uid);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sence", sence);
        map.put("uid", uid);

        List<Long> list = get(sence);
        for (Long reciver : list) {
            if (reciver != uid) {
                String m = CommandDecoder.decode(head, reciver, CommandResult.SUCCESS, map);
                sessions.send(uid, m, reciver);
            }
        }
        return null;
    }

    public CommandResult senceUserAll(long uid, int sence) {
        set(sence, uid);

        List<Long> list = get(sence);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sence", sence);
        map.put("uids", list);

        //包装玩家形象
        return new CommandResult(map);
    }

    public CommandResult walkByMouse(int head, long uid, int sence, float x, float y) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sence", sence);
        map.put("uid", uid);
        map.put("x", x);
        map.put("y", y);

        List<Long> list = get(sence);
        for (Long reciver : list) {
            if (reciver != uid) {
                String m = CommandDecoder.decode(head, reciver, CommandResult.SUCCESS, map);
                sessions.send(uid, m, reciver);
            }
        }
        return null;
    }

    public CommandResult walkByKeyboard(int head, long uid, int sence, String keys) {
        if(null==keys || keys.equals("-")){
            keys="";
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sence", sence);
        map.put("uid", uid);
        map.put("keys", keys);

        List<Long> list = get(sence);
        for (Long reciver : list) {
            if (reciver != uid) {
                String m = CommandDecoder.decode(head, reciver, CommandResult.SUCCESS, map);
                sessions.send(uid, m, reciver);
            }
        }
        return null;
    }

    public CommandResult action(int head, long uid, int sence, int key) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sence", sence);
        map.put("uid", uid);
        map.put("key", key);

        List<Long> list = get(sence);
        for (Long reciver : list) {
            if (reciver != uid) {
                String m = CommandDecoder.decode(head, reciver, CommandResult.SUCCESS, map);
                sessions.send(uid, m, reciver);
            }
        }
        return null;
    }

    private Map<Integer, List<Long>> sceneMap = new HashMap<Integer, List<Long>>(100);

    public void set(Integer scene, Long uid) {
        remove(uid);

        //再设置
        List<Long> list = get(scene);
        if (!list.contains(uid)) {
            list.add(uid);
        }
    }

    public List<Long> get(Integer scene) {
        List<Long> result = sceneMap.get(scene);
        if (null == result) {
            result = new ArrayList<Long>();
            sceneMap.put(scene, result);
        }
        return result;
    }

    public  void remove(Long uid){
        for (Integer key : sceneMap.keySet()) {
            List<Long> list = sceneMap.get(key);
            for(Iterator it = list.iterator(); it.hasNext();){
                Long v = (Long)it.next();
                if(uid.equals(v))
                it.remove();
                break;
            }

        }
    }
}
