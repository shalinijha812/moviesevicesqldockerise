FROM openjdk:10
WORKDIR	 usr/src
ENV MYSQL_DATABASE=Keepnote
ENV MYSQL_ROOT_PASSWORD=root
ENV MYSQL_CI_URL=jdbc:mysql://localhost:3306/Keepnote
ADD ./target/movie-service-0.0.1-SNAPSHOT.jar /usr/src/movie-service-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/src/movie-service-0.0.1-SNAPSHOT.jar"]
