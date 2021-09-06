# Blog
* 文章分类，文章标签，可以通过相应的标签和分类显示对应的文章;文章归档功能，根据发布的日期自动按不同年月进行分 档;文章最热和最新文章的分类;文章评论和评论楼中楼功能;文章上传功能;文章阅读次数和评论数更新功能
* 用户的登录注册功能结合JWT+redis，token令牌登陆方式，redis做了令牌和用户信息的对应管理，threadLocal线程池使 用保存用户信息，可以随时获取登陆的用户，并且做了相应的删除，防止内存泄漏
* 用户登陆和发布文章功能结合，未登录会进行拦截;用户上传图片在云服务器(七牛云)中，解决带宽问题，然后上传文章 
* 统一缓存处理，提高密集访问的效率;统一AOP日志记录功能 
* 后台系统权限系统，实现用户登陆和管理权限功能(增删改查)，并且配有超级管理员
