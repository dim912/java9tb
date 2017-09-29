//module descriptor
//name of the module should be unique
//defined. Dependencies for this module. which packages are to be exposed
module Java9Test { //java.base is the parent module on which every other module depends upon
    //by default every module can read java.base module

    //Application Modules => all third party dependencies

    //Automated Modules => JARS placed in classpath without module descriptor
    //this implecitly export all the packages and rea all mother modules.
    //purpose -> to use pre-java 9 build JARS. mysql-connector-java-6.1.6.jar => mysql.connector.java

    //Unnamed modules


    //Platform modules => modules from JDK. Ex: java.se  , java.xml.ws

    //requires  a; => dependents
    //requires transitive  b; => Whatever I have will be given to a module that asks me
    //requires  static c; => This dependency check is mandatory at compile time and optional at runtime

    //exports p ;
    //exports p to m ; //qualified export
    //Opens p //access this packege through Reflection in runtime. public type at compile turm, private type at runtime.
    //opens p to m; //

    //users serviceInterface  //interface is in this module and implementation can be in other module
    //Providers serviceInterface with class1,class2


}