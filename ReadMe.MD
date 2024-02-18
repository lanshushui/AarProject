项目结构
app 
---- implementation library1
                    ---- api  library2
                              --- api library3
                    ---implementation library3

问题1：
当library2 aar化，library3源码化时  ---》
library1编译时，会导致library1同时依赖library3源码和library2的aar传递过来的library3的aar
解决方案   --------------  剔除所有源码化的library 的aar依赖


问题2：
当library2 源码化时 ---》
因为解决问题1的方案会剔除app模块内 library1传递的api依赖，导致app模块无法编译运行 包含library2的代码