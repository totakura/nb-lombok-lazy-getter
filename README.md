This is a sample project to demonstrate the issue with Netbeans and Lombok's `@Getter(lazy=true)`

For some reason Netbeans shows an error if `lazy=true` in Lombok's `@Getter`.  For more info see
https://github.com/rzwitserloot/lombok/issues/1696

I checked this on my system with the following information
* lombok-1.18.18
* Apache NetBeans IDE 12.3
* Java: 11.0.10; OpenJDK 64-Bit Server VM 11.0.10+9
* Runtime: OpenJDK Runtime Environment 11.0.10+9
* System: Linux version 5.10.16-arch1-1 running on amd64; UTF-8; en_US (nb)
* User directory: /home/totakura/.netbeans/12.3
* Cache directory: /home/totakura/.cache/netbeans/12.3

To reproduce this issue, please open this project in Netbeans 12.3 or greater.

Note the error log in Netbean's cache directory:

```
$ find ~/.cache/netbeans/12.3 -name "*.err"
/home/totakura/.cache/netbeans/12.3/index/s416/errors/1/nb/lombok/lazy/getter/App.java.err
$ cat /home/totakura/.cache/netbeans/12.3/index/s416/errors/1/nb/lombok/lazy/getter/App.java.err
ERROR:11:variable greeting is already defined in class nb.lombok.lazy.getter.App
```