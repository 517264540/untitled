package jincheng;



import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;




public class Bank {

    private Lock bankLock = new ReentrantLock();  // 加一个锁
    private final double[] accounts;
    private Condition sufficientFunds;
    private Object lock = new Object();
    public static AtomicLong nextNumber = new AtomicLong();
    long id = nextNumber.incrementAndGet();






    public Bank(int n, double initialBalance) {
        accounts = new double[n];
        Arrays.fill(accounts,initialBalance);
        bankLock = new ReentrantLock();
        sufficientFunds = bankLock.newCondition();

    }

    public void transfer(int from, int to, double amount) throws InterruptedException {
        if (bankLock.tryLock(1, TimeUnit.NANOSECONDS))
        try {
            while (accounts[from] < amount)
                sufficientFunds.await();
            System.out.print(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf("%10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf("Total Balance: %10.2f%n", getTotalBalance());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            bankLock.unlock();
        }else {
            System.out.println("*****************************************************");
        }
        }

    public  double getTotalBalance() {
        synchronized (lock){
            double sum = 0;
            for (double a : accounts)
                sum +=a;
            return sum;
        }

    }

    public int size(){
        return accounts.length;
    }
}
