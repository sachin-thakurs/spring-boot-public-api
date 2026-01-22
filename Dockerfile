FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# saara code copy karo
COPY . .

# yahin JAR build hoga
RUN ./mvnw clean package -DskipTests

EXPOSE 8080

ENTRYPOINT ["java","-jar","target/*.jar"]
