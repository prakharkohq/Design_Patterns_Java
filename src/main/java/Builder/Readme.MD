# Builder Pattern

The Builder pattern suggests that you extract the object construction code out of its own class and move it to separate objects called builders.


If your constructor for object creation becomes very big you should consider creating subfunctions 
which can offload that responsibility to subclasses and creates a cleaner and better interface for interaction.


# Relations with Other Patterns

* Many designs start by using Factory Method (less complicated and more customizable via subclasses) and evolve toward Abstract Factory, Prototype, or Builder (more flexible, but more complicated).

* Builder focuses on constructing complex objects step by step. Abstract Factory specializes in creating families of related objects. Abstract Factory returns the product immediately, whereas Builder lets you run some additional construction steps before fetching the product.

* You can use Builder when creating complex Composite trees because you can program its construction steps to work recursively.

* You can combine Builder with Bridge: the director class plays the role of the abstraction, while different builders act as implementations.

* Abstract Factories, Builders and Prototypes can all be implemented as Singletons.