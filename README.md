🛒 Product Management System (Java)
📌 About the Project

This project is a desktop-based product management system built using pure Java and Swing. It simulates a simple inventory system where users can manage products and categories through an interactive menu.

The application was designed to reinforce object-oriented programming concepts and demonstrate how a layered architecture can be applied even in small-scale applications.

🚀 Features
Create new product categories
Register products with:
Name
Description
Price
Category
Update existing products
Search products by ID
Filter products by category
Interactive menu using Java Swing (JOptionPane)
🧠 Concepts Applied
Object-Oriented Programming (OOP)
Separation of concerns (Model, Repository, View)
In-memory data persistence using collections
Data validation and user input handling
Basic system flow control with enums
⚙️ Tech Stack
Java 17+
Java Swing (JOptionPane)
Collections Framework (List, Vector)
No external frameworks (pure Java)
📂 Project Structure
src/com/projetonovo/produtos
│
├── model/
│   ├── Produto.java
│   └── Categoria.java
│
├── repository/
│   ├── ProdutoCollectionRepository.java
│   └── CategoriaCollectionRepository.java
│
├── view/
│   ├── ProdutoView.java
│   ├── CategoriaView.java
│   ├── OpcaoView.java
│   └── Opcao.java
│
└── Main.java
▶️ How to Run
1. Clone the repository
git clone https://github.com/iPanham/Java_Project.git
2. Open in IDE
IntelliJ IDEA (recommended)
Eclipse
3. Run the application

Run the Main.java class.

💡 How It Works

The system uses a simple menu-based interface where users interact through dialog boxes.

The Main class controls the application flow
View classes handle user interaction
Repository classes simulate a database using in-memory collections
Model classes represent the business entities
📈 What I Learned

This project helped me develop:

Strong understanding of OOP principles
Structuring applications using layers
Handling user input and validation
Managing state without a database
Writing cleaner and more readable Java code
🔮 Future Improvements
Replace in-memory storage with a real database (PostgreSQL or MySQL)
Convert the project into a REST API using Spring Boot
Add unit tests
Improve UI with JavaFX or web frontend
Implement better validation and error handling
👨‍💻 Author

Gustavo Panham

GitHub: https://github.com/iPanham
📄 License

This project is open-source and available under the MIT License.
