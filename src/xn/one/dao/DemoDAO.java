package xn.one.dao;

import net.paoding.rose.jade.annotation.DAO;
import net.paoding.rose.jade.annotation.SQL;
import net.paoding.rose.jade.annotation.SQLParam;
import net.paoding.rose.jade.annotation.UseMaster;
import xn.one.domain.Demo;

/**
 * User: 潘智峰
 * Date: 2011-11-17
 */
@DAO
public interface DemoDAO {

   /* CREATE TABLE `Demo` (
        `id` int(11) DEFAULT NULL,
        `uid` int(11) DEFAULT NULL,
        `name` varchar(64) DEFAULT NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;*/

    @SQL("insert into Demo(uid,name)"
            + " values(:o.uid,:o.name)")
    Integer insert(@SQLParam("o") Demo o);

    @SQL("select * from Demo where uid =:uid")
    Demo query(@SQLParam("uid") long uid);

    @SQL("update Demo set name =:o.name where uid=:o.uid")
    int update(@SQLParam("o") Demo o);
}
