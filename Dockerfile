FROM alpine/java:22-jdk

WORKDIR /app

COPY . /app

WORKDIR /app/src

# Compile the code
RUN javac -d . ToDoList.java

# Run the app
CMD ["java", "todolist.ToDoList"]
