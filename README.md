# 🛒 Product Management System (Java)

## 📌 About the Project
This project is a desktop-based product management system built using pure Java and Swing. It simulates a simple inventory system where users can manage products and categories through an interactive menu.

The application was designed to reinforce object-oriented programming concepts and demonstrate how a layered architecture can be applied even in small-scale applications.

---

## 🚀 Features

- Create new product categories
- Register products with:
  - Name
  - Description
  - Price
  - Category
- Update existing products
- Search products by ID
- Filter products by category
- Interactive menu using Java Swing (JOptionPane)

---

## 🧠 Concepts Applied

- Object-Oriented Programming (OOP)
- Separation of concerns (Model, Repository, View)
- In-memory data persistence using collections
- Data validation and user input handling
- Basic system flow control with enums

---

## ⚙️ Tech Stack

- Java 17+
- Java Swing (JOptionPane)
- Collections Framework (List, Vector)
- No external frameworks (pure Java)

---

## 📂 Project Structure


src/com/projetonovo/produtos
│
├── model/
│ ├── Produto.java
│ └── Categoria.java
│
├── repository/
│ ├── ProdutoCollectionRepository.java
│ └── CategoriaCollectionRepository.java
│
├── view/
│ ├── ProdutoView.java
│ ├── CategoriaView.java
│ ├── OpcaoView.java
│ └── Opcao.java
│
└── Main.java


---

## ▶️ How to Run

### 1. Clone the repository
```bash
git clone https://github.com/iPanham/Java_Project.git
