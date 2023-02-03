package work;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-03
 * Time: 20:38
 */
public class demo11 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5,//核心线程数量
                10,//最大线程数量
                3,//空闲时长
                TimeUnit.SECONDS,//线程空闲时长的单位
                new LinkedBlockingQueue<>(100),//任务队列
                new ThreadPoolExecutor.DiscardPolicy()//拒绝策略为忽略最新的任务
        );
    }
}
