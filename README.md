simpleftlmvc
============

A light MVC framework in Java that makes use of Freemarker library to render the dynamic pages. This was originally created for a Facebook application I wrote which was hosted on Google App Engine. As the App Engine spools up the VM only when the site is used, a heavy framework such as Spring was not desirable.

To use:

1. Fork the code
2. mvn clean install
3. mvn jetty:run
