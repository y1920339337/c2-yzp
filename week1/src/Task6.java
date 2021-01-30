public class Task6 {
    public static void main(String[] args) {
        Account acc1 = new Account("conan", 100000f);// 利用构造方法开户
        System.out.println(acc1.search());//查询余额
    }

    public static class Account
     {
        private String name;// 账户名称
        private float balance;// 用户的账户余额

        public Account(String name, float balance) { // 开户（设置账户名称及余额），
            this.name = name;
            this.balance = balance;
        }

        public String search() {// 查询余额
            return "账户 名称：" + this.name + "tt " + "余额为 ： " + this.balance+"元整";
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public float getBalance() {
            return balance;
        }

        public void setBalance(float balance) {
            this.balance = balance;
        }

    }
}
