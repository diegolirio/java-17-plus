# First Steps

Build App and Generate docker image
```shell
mvn package -Dmaven.test.skip=true
java -jar ./target/first-steps-0.0.1-SNAPSHOT.jar
docker build -t diegolirio/first-steps-java:17.0.0 . 
```

Run docker
```shell
docker run -p8080:8080 diegolirio/first-steps-java:17.0.0
```

Docker push
```shell
docker push diegolirio/first-steps-java:17.0.0
```
