@Autowired:根据类型自动装配对象（同类型多个bean无法装配，与@Qualifier一起使用）
@Qualifier：@Qualifier（""bean名字"）,根据bean名字装配对象，与autowried一起用

@Autowired也可以用于构造器与方法
用于构造器（默认调用构造器）：spring自动调用无参构造器，在有参构造器上面加入@Autowired即可自动调用该有参构造器
用于方法（自动装配形参列表）：比如public viod a（Name name）{}，加入@Autowired，即可自动装配形参列表bean（自动装配Name类型bean）