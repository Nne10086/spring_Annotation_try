ioc中，Conditional与import很重要


Conditional:条件引入bean，创建类实现Condition接口，写入逻辑，满足则返回true，创建对象
Conditional使用：在需要条件创造bean的类上面加入@Conditional（{Condition实现类.class}），如果只有一个实现类，可以不加{}

Import：bean引入
可以直接引入普通类：Import（类.class），放在配置类中被扫描

也可以引入实现ImportSelector类，实现动态引入
ImportSelector：根据逻辑返回所需要创建bean的类，返回String类型数组，
ex： return new String[]{需要创建bean的类1的全路径，需要创建bean的类2的全路径}
会返回给底层，交给底层创建该类bean对象，因此引入importselector实现类即可，不用引入本类
（因为可以加入逻辑，所以可以实现动态引入）

