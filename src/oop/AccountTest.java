package oop;

/**
 * @author TingxuanHu
 * @version 2022/9/16 13:59
 */

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setPassword("123456");
        account.setBalance(60);
        account.setName("jack");
        account.showInfo();
    }
}

class Account {
    private String name;
    private int balance;
    private String password;

    public Account() {

    }

    public Account(String name, int balance, String password) {
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 2 || name.length() == 3 || name.length() == 4) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("输入的年龄长度并非合理范围(2-4) 请重新键入 谢谢您的配合");
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            throw new IllegalArgumentException("余额过少");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("密码长度应当为6位，请重新输入");
        }
    }

    // 显示账号信息的方法
    public void showInfo() {
        // 添加验证密码环节验证校验
        System.out.println("账号信息" + name + " 余额=" + balance);
    }

}


