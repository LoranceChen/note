synchronized ：同步锁
：：打个比方：一个object就像一个大房子，大门永远打开。房子里有 很多房间（也就是方法）。
这些房间有上锁的（synchronized方法）， 和不上锁之分（普通方法）。房门口放着一把钥匙（key），这把钥匙可以打开所有上锁的房间。
另外我把所有想调用该对象方法的线程比喻成想进入这房子某个 房间的人。
：：同步代码块还可以人为的指定获得某个其它对象的key。就像是指定用哪一把钥匙才能开这个屏风的锁，你可以用本房的钥匙；你也可以指定用另一个房子的钥匙才能开，这样的话，你要跑到另一栋房子那儿把那个钥匙拿来，并用那个房子的钥匙来打开这个房子的带锁的屏风。
：：http://www.cnblogs.com/GnagWang/archive/2011/02/27/1966606.html

transient: 修饰字段，表示值不会被序列化
：：事例：static transient boolean preferIPv6Address = false;

InetAddress ： IP（Internet Protocol） address
：：InetAddress getByAddress(byte[] addr)
：：  IPv4 address byte array must be 4 bytes long and IPv6 byte array must be 16 bytes long
