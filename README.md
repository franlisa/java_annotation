# java_annotation
usage of annotation and reflection

#something about annotation
http://tutorials.jenkov.com/java/annotations.html
#something about reflection
http://tutorials.jenkov.com/java-reflection/index.html  
http://tutorials.jenkov.com/java-reflection/classes.html

#note:
1. when we use reflection,we should get the .class  of the object first,we can get it in two ways.  
If we know the Object name in advance. we can use className.class to get the class Object.for example  Class  clazz = Mytest.class;  
Otherwise, we can get the class Object by Class.forName("XXXXXXXX");

2. we can directly create the package-info.java, but we can create it when we create a new package.
![]/Users/xuejiao/Downloads/package-info.png   
Otherwise,we can create a package-info.java in a textEditor,and then copy it in.

getDeclaredMethod: get the declared method of this class(include the public, protected,private), exclude method of the superclass/interface
getMethod:get the public method of the class, include the public method of the superclass/interface










