# dagger2

## dagger构成

构成的元素有三种：Module,Component,Container

![dagger2构成](./img/dagger2构成.jpg)


## dagger2使用

| 注解符        | 作用                                       |
| ---------- | :--------------------------------------- |
| @Inject    | 通常在需要依赖的地方使用这个注解。换句话说，你用它告诉Dagger这个类或者字段需要依赖注入。这样，Dagger这回构造一个一个这个类的实例并满足他们的依赖。 |
| @Module    | Module类里面的方法专门提供依赖，所以我们定义一个类，用@Module注解，这样Dagger在构造类的实例时候，就知道从哪里去寻找需要的依赖。modules的一个重要的特征是他们设计为分区并组合在一起（比如说，我们的app中可以有多个组成在一起的modules） |
| @Provide   | 在modules中，我们定义的方法是用这个注解，以此来告诉Dagger我们想要构造对象并提供这些依赖。 |
| @Component | Components从根本上说就是一个注入器，也可以说是@Inject和@Module的桥梁，它的主要作用就是连接这两部分。Components可以提供所有定义了的类型的实例，比如：我们必须用@Component注解一个接口然后列出所有的 |


