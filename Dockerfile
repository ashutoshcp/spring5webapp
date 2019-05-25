FROM maven:alpine
WORKDIR '/app'
COPY . .
RUN mvn clean compile

RUN mvn test