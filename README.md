肖壮清

本次项目提交中遇到如下问题：
  fatal: 'git@github.com/xiaozhuangqing/netease-Java-.git' does not appear to be a git repository
  fatal: Could not read from remote repository.

  Please make sure you have the correct access rights
  and the repository exists.

//找遍全网站
最后终于在stack Overflow上面找到解答，现把帖子放上

Make sure you have correct url in .git/config

url = git@github.com:username/repo.git
If it's your first push, you'll need to set up correct upstream

$ git push -u origin master
You can check which key is used by:

$ ssh -vvv git@github.com
The reply should contain something like this:

debug1: Next authentication method: publickey
debug1: Offering RSA public key: ~/.ssh/id_rsa
...
You've successfully authenticated, but GitHub does not provide shell access.
Also it's possible to define rules for ssh in ~/.ssh/config, e.g. based on aliases:

   Host github
      HostName github.com 
      User git
      IdentityFile "~/.ssh/id_rsa"

   Host git
      HostName github.com 
      User git
      IdentityFile "~/.ssh/some_other_id"
You can set connect to different ports, use different username etc. for each alias.

多谢大侠了，
其中我主要执行了这一步
$ git push -u origin master


# netease-Java-
