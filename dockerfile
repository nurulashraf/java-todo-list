FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY src/ToDoList.java todolist/
RUN javac todolist/ToDoList.java
CMD ["java", "todolist.ToDoList"]
