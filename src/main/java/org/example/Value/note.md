配置类读取配置文件：@PropertySource(value = "classpath:property文件名")
配置文件要写在resources包下面：classpath自动扫描resources包
@value("${..}")：写入配置文件key值，    即可得到value值