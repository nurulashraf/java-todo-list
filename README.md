# Java To-Do List (Console App)

A simple console-based To-Do List application written in Java.  
This app lets you manage your tasks directly from the terminal: add new tasks, view them, mark them as completed, and delete them.

---

## Features

- Add new tasks  
- Mark tasks as completed  
- Delete tasks  
- View all current tasks  
- In-memory storage (data will reset when the app is closed)

---

## Getting Started

### Prerequisites

- Java JDK 14 or above
- A text editor or IDE (like VS Code, IntelliJ IDEA, or Eclipse)

### How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/nurulashraf/java-todo-list.git
   cd java-todo-list
   ```

2. Compile and run:
   ```bash
   cd src
   javac -d . ToDoList.java
   java todolist.ToDoList
   ```

### Run with Docker

1. Build the image:
   ```bash
   docker build -t java-todolist .
   ```

2. Run the container (interactive mode required for console input):
   ```bash
   docker run -it java-todolist
   ```

---

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
