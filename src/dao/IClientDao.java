package dao;

import model.Client;

/**
 * Created by double on 16-12-21.
 */
public interface IClientDao extends IBaseDao {
    //需要重写的两个方法就是添加用户和登录方法这两个方法是BaseDao中没有的
    public void add(Client client);
    public void login(String msg);

}
