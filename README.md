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

- Java JDK 8 or above
- A text editor or IDE (like VS Code, IntelliJ IDEA, or Eclipse)

### How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/nurulashraf/java-todo-list.git
   cd java-todo-list
   ```

2. Compile and run:
   ```bash
   COPY src/ToDoList.java todolist/
   javac todolist/ToDoList.java

### Run with Docker

1. Build the image:
   ```bash
   docker build -t java-todolist.
   ```

2. Run the container (interactive mode required for console input):
   ```bash
   docker run -it java-todolist
   ```

## Screenshot ##

<img width="1206" height="973" alt="Screenshot 2026-02-21 172138" src="https://github.com/user-attachments/assets/aa840ee3-184e-4241-abf9-79917868315b" />


---

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
