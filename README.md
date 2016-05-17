# apps-talking-thru-rest
There are 2 Spring Boot applications with Angular JS front end.
1st app, option-a-exp, is populating the info bag partially and redirecting to the 2nd app, option-a-ext.
2nd app, option-a-ext, is populating the info bag partially and redirecting back to the 1st app, option-a-exp.
Each app is communicating with its own back end and 2nd app backend also talks to the 1st app backend through rest.