<p align="center">
  <img src="resources/bocchi.gif" alt="Banner" width="60%" />
</p>
<p align="center">
  Java Swing • MVC Architecture • CRUD Application
</p>

# 🎵 Studio Music Equipment Management System

A desktop-based application built with **Java Swing** to manage studio music equipment and supplies.  
This application is designed as a **CRUD system** (Create, Read, Update, Delete) and follows a clean **MVC (Model–View–Controller)** architecture.

---

## 📌 Features

- Create, Read, Update, Delete (CRUD) equipment data
- Desktop GUI using Java Swing
- Input validation with dialog warnings
- Clean architecture using MVC (Model–View–Controller)
- Simple and clean user interface

---

## ⚙️ Technologies Used

- Java JDK 8+
- Java Swing
- Maven (build tool)
- VS Code
- Git (version control)
---
## 🧱 Architecture

This project uses the **MVC (Model–View–Controller)** architecture:

### 🔹 Model
Responsible for data representation.
- `Equipment.java`

### 🔹 View
Handles all GUI components (Java Swing).
- `MainFrame.java`
- `FormPanel.java`
- `TablePanel.java`

### 🔹 Controller
Handles application logic and CRUD operations.
- `EquipmentController.java`

This separation improves:
- Code readability
- Maintainability
- Scalability

---

## 🚀 How to Run the Project
1️⃣ Prerequisites

- Java JDK installed
- Maven installed
- IDE (IntelliJ IDEA recommended) editor (VS Code recommended)

2️⃣ Clone the Repository

```bash
git clone git clone https://github.com/your-username/studio-inventory.git
cd studio-inventory
```
3️⃣ Build the Project

```bash
mvn clean install
```
4️⃣ Run the Application

```bash
mvn clean compile exec:java
```
---
## 🤝 Contributing
Contributions are welcome! Please fork the repository and create a pull request with your changes.
---
## 📄 License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
```bash
MIT License

Copyright (c) 2025 Akbar Noviandi

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files...
```