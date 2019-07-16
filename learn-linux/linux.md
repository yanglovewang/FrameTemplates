## linux

### linux基本原则
1. 由许多的小程序组成，我们要组合小程序完成任务
2. 一切都是文件
3. 尽量避免捕获接口
4. 配置文件保存为纯文本格式
5. 通过shell操作内核
    - root用户
    - 普通用户
    - 命令格式：命令 选项 参数
        - 选项分长选项和短选项 -a --word 用于修改命令执行的特性
        - 参数：操作的对象
        
### 基本命令
```
[root@izwz9gzlojss3iasomu1xxz /]# ls -l //长格式
total 84 
lrwxrwxrwx   1 root root     7 Mar 14 15:47 bin -> usr/bin
dr-xr-xr-x.  5 root root  4096 Mar 14 15:50 boot
drwxr-xr-x   2 root root  4096 Aug 24  2017 data
drwxr-xr-x  19 root root  2960 Apr 11  2018 dev
```
- 例如：dr-xr-xr-x  
首字母代表文件类型  
后面9位表示文件权限rwx 读 写 执行  
第一组文件拥有者具备的权限  
第二组加入此群组的其他文件的权限  
第三组其他未加入群组的权限


- 命令类型：
    - 外部命令（shell内置）
    - 内部命令： 在文件系统的某个路径下面有一个和命令名称相同的可执行文件
 ```
[root@izwz9gzlojss3iasomu1xxz ~]# /bin/ls
env.txt  LinuxProbe.pdf  sa_recovery.log  sa_recovery.log.bak
```
- 时间  
系统时钟：date  
硬件时钟：clock  

- 文件管理：
每个文件偶有属主、数组、其他可访问的概念
```
/etc/passwd 用户相关信息
/etc/shadow 个人密码
/etc/group 所有组名存放地址
```
改变文件路径和权限