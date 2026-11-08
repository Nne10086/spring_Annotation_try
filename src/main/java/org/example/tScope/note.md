Scope注解：切换bean作用域
@Scope（""singleton"）或者不写@Scope：bean为单实例，用完放回，ioc负责储存
@Scope（""prototype"）：多实例，每次调用创建新的bean，用完直接销毁，ioc不负责储存