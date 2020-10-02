import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.recipes.cache.ChildData;
import org.apache.curator.framework.recipes.cache.TreeCache;
import org.apache.curator.framework.recipes.cache.TreeCacheEvent;
import org.apache.curator.framework.recipes.cache.TreeCacheListener;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.curator.framework.*;
import org.apache.zookeeper.CreateMode;

public class createNode {

    /*
    创建永久节点
     */
    public void createZnode() throws Exception{
        //1.创建一个重试策略
        /*
            param 1:重试的间隔时间
            param 2:重试的最大次数
         */
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000,1);
        //2.获取客户端对象
        /*
        param1:要连接的Zookeeper服务器列表
        param2:会话超时时间
        param3:连接超时时间
        param3:重试策略
         */
        String connectionStr="192.168.72.128:2181,192.168.72.129:2181,192.168.72.130:2181";
        CuratorFramework client = CuratorFrameworkFactory.newClient(connectionStr,8000,8000,retryPolicy);
        //3.开启客户端
        client.start();
        //4。创建永久节点
        client.create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT).forPath("/hello2","world".getBytes());
        //5.关闭客户端
        client.close();
    }

    /*
    创建永久序列化节点
     */
    public void createZPnode() throws Exception{
        //1.创建一个重试策略
        /*
            param 1:重试的间隔时间
            param 2:重试的最大次数
         */
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000,1);
        //2.获取客户端对象
        /*
        param1:要连接的Zookeeper服务器列表
        param2:会话超时时间
        param3:连接超时时间
        param3:重试策略
         */
        String connectionStr="192.168.72.128:2181,192.168.72.129:2181,192.168.72.130:2181";
        CuratorFramework client = CuratorFrameworkFactory.newClient(connectionStr,8000,8000,retryPolicy);
        //3.开启客户端
        client.start();
        //4。创建永久节点
        client.create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT_SEQUENTIAL).forPath("/hello","world".getBytes());
        //5.关闭客户端
        client.close();
    }

    /*
    创建临时节点
     */
    public void createTnode() throws Exception{
        //1.创建一个重试策略
        /*
            param 1:重试的间隔时间
            param 2:重试的最大次数
         */
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000,1);
        //2.获取客户端对象
        /*
        param1:要连接的Zookeeper服务器列表
        param2:会话超时时间
        param3:连接超时时间
        param3:重试策略
         */
        String connectionStr="192.168.72.128:2181,192.168.72.129:2181,192.168.72.130:2181";
        CuratorFramework client = CuratorFrameworkFactory.newClient(connectionStr,8000,8000,retryPolicy);
        //3.开启客户端
        client.start();
        //4。创建永久节点
        client.create().creatingParentsIfNeeded().withMode(CreateMode.EPHEMERAL).forPath("/hello","world".getBytes());
        Thread.sleep(5000);
        //5.关闭客户端
        client.close();
    }

    /*
    创建临时序列化节点
     */
    public void createTPnode() throws Exception{
        //1.创建一个重试策略
        /*
            param 1:重试的间隔时间
            param 2:重试的最大次数
         */
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000,1);
        //2.获取客户端对象
        /*
        param1:要连接的Zookeeper服务器列表
        param2:会话超时时间
        param3:连接超时时间
        param3:重试策略
         */
        String connectionStr="192.168.72.128:2181,192.168.72.129:2181,192.168.72.130:2181";
        CuratorFramework client = CuratorFrameworkFactory.newClient(connectionStr,8000,8000,retryPolicy);
        //3.开启客户端
        client.start();
        //4。创建永久节点
        client.create().creatingParentsIfNeeded().withMode(CreateMode.EPHEMERAL_SEQUENTIAL).forPath("/hello","world".getBytes());
        Thread.sleep(5000);
        //5.关闭客户端
        client.close();
    }

    /*
    修改节点数据
     */
    public void setZnode() throws Exception{
        //1.创建一个重试策略
        /*
            param 1:重试的间隔时间
            param 2:重试的最大次数
         */
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000,1);
        //2.获取客户端对象
        /*
        param1:要连接的Zookeeper服务器列表
        param2:会话超时时间
        param3:连接超时时间
        param3:重试策略
         */
        String connectionStr="192.168.72.128:2181,192.168.72.129:2181,192.168.72.130:2181";
        CuratorFramework client = CuratorFrameworkFactory.newClient(connectionStr,8000,8000,retryPolicy);
        //3.开启客户端
        client.start();
        //4。修改永久节点
//      client.create().creatingParentsIfNeeded().withMode(CreateMode.EPHEMERAL_SEQUENTIAL).forPath("/hello","world".getBytes());
        client.setData().forPath("/hello2","fuck".getBytes());
        //5.关闭客户端
        client.close();
    }

    /*
    获取节点数据
     */
    public void getZnode(){
        //1.创建一个重试策略
        /*
            param 1:重试的间隔时间
            param 2:重试的最大次数
         */
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000,1);
        //2.获取客户端对象
        /*
        param1:要连接的Zookeeper服务器列表
        param2:会话超时时间
        param3:连接超时时间
        param3:重试策略
         */
        String connectionStr="192.168.72.128:2181,192.168.72.129:2181,192.168.72.130:2181";
        CuratorFramework client = CuratorFrameworkFactory.newClient(connectionStr,8000,8000,retryPolicy);
        //3.开启客户端
        client.start();
        //4。修改永久节点
//      client.create().creatingParentsIfNeeded().withMode(CreateMode.EPHEMERAL_SEQUENTIAL).forPath("/hello","world".getBytes());
//        client.setData().forPath("/hello2","fuck".getBytes());
        try {
            byte[] bytes=client.getData().forPath("/hello2");
            System.out.println(new String(bytes));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //5.关闭客户端
        client.close();
    }
    /*
     节点的watch监控机制
     */
    public void watchZnode(){
        //1.定制一个重试策略
        RetryPolicy retryPolicy=new ExponentialBackoffRetry(3000,1);

        //2.获取客户端
        String connectionStr="192.168.72.128:2181,192.168.72.129:2181,192.168.72.130:2181";
        CuratorFramework client = CuratorFrameworkFactory.newClient(connectionStr,8000,8000,retryPolicy);
        //3.启动客户端
        client.start();
        //4.创建一个TreeCache对象，指定要监控的节点路径
        TreeCache treecache=new TreeCache(client,"/hello2");

        //5.自定义一个监听器
        treecache.getListenable().addListener(new TreeCacheListener() {
            @Override
            public void childEvent(CuratorFramework client, TreeCacheEvent event) throws Exception {
                    ChildData data = event.getData();       //监听器触发，获取数据
                    if(data!=null){
                        switch(event.getType()){            //获取事件类型
                            case NODE_ADDED:
                                System.out.println("监控到有新的节点");
                                break;
                            case NODE_REMOVED:
                                System.out.println("监控到节点被删除");
                                break;
                            case NODE_UPDATED:
                                System.out.println("监控到节点被更新");
                                break;
                        }
                    }
            }
        });

        //6.开始监听
        try {
            treecache.start();
            Thread.sleep(100000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
