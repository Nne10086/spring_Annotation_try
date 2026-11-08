Dao:Dao1和Dao2的接口，用于返回动态对象（Dao1，Dao2对象都可以接住）

Dao1，Dao2：用于测试Import的ImportSelector的动态引入

Dao_ImportSelector:实现动态引入
    （ImportSelector接口，内含selectImport方法，
      在方法中加入逻辑，
      返回String类型的数组,返回中填入引入类的全路径（包类名）,
      返回至其他方法，实现指定 & 动态引入。
      ImportSelector一般写在配置类（Configuration））

@Import（类.class）  //直接引入

@Import（ImportSelector实现类.class）  //动态引入

Import对于普通类，获取该类对象，不读普通类内部bean，只引入普通来对象
      对于配置类，读内部所有bean，并全部引入
      对于ImportSelector实现类，则依据实现类内部返回类，动态引入

ImportSelector返回的类会传递给底层，通过底层生成bean对象，实现bean注入，所以import（importselector实现类.class）即可