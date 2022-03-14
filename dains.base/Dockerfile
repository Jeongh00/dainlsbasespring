FROM tomcat:9
MAINTAINER eGovframe Center


ADD ./target/base-1.0.0.war /usr/local/tomcat/webapps/

COPY ./DATABASE/mariadb/server.xml     					   			/usr/local/tomcat/conf/
COPY ./DATABASE/mariadb/context.xml     				   		   /usr/local/tomcat/conf/
COPY ./DATABASE/mariadb/mariadb-java-client-1.8.0.jar     		   /usr/local/tomcat/lib/

CMD ["catalina.sh", "run"]