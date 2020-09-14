package cn.service.impl;

import cn.domain.Account;
import cn.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    public List<Account> queryAll() {

        return null;
    }

    public void save(Account account) {

    }
}
