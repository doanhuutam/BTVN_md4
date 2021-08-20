package service;

import model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import repository.IAccountRepo;

import java.util.ArrayList;

public class AccountService implements IAccountService {
    @Autowired
    IAccountRepo iAccountRepo;

    @Override
    public Account save(Account account) {
        return iAccountRepo.save(account);
    }

    @Override
    public Account findById(long id) {
        return null;
    }

    @Override
    public ArrayList<Account> findAll() {
        return (ArrayList<Account>) iAccountRepo.findAll();
    }

    @Override
    public ArrayList<Account> findAllByName(String name) {
        return null;
    }

    @Override
    public void Delete(Account account) {
        iAccountRepo.delete(account);
    }

    @Override
    public void edit(Account account) {
        iAccountRepo.save(account);
    }
}
