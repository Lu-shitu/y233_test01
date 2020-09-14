package cn.service;

import cn.domain.Account;

import java.util.List;

public interface AccountService {

    //查询所有账号
    public List<Account> queryAll();

    //保存账号
    public void save(Account account);

}
