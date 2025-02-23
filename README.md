# Computer Shop Management System 🖥️

Este proyecto es una aplicación en Java para gestionar una tienda de computadores. Permite agregar, eliminar, buscar y listar computadores almacenados en la tienda.

## 📌 Características  
- Agregar computadores a la tienda.  
- Eliminar computadores por su ID.  
- Buscar computadores por marca.  
- Listar todos los computadores disponibles.  

## 🚀 Tecnologías Utilizadas  
- **Java 21**  
- **JUnit 5** para pruebas unitarias.  
- **Hamcrest** para validaciones más expresivas en los tests.  
- **Maven** para la gestión de dependencias y compilación del proyecto.  

## 📂 Estructura del Proyecto  
```
computer-shop/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── dev/yeferson/computer_shop/model/
│   │   │       ├── Computador.java
│   │   │       ├── Tienda.java
│   │   │       ├── GestionTienda.java
│   │   │   └── dev/yeferson/computer_shop/controller/
│   │   │       ├── Controller.java
│   └── test/
│       ├── java/
│       │   └── dev/yeferson/computer_shop/
│       │       ├── ComputadorTest.java
│       │       ├── TiendaTest.java
│       │       ├── ControllerTest.java
│── pom.xml
│── README.md
```

## 🛠️ Instalación y Uso  
1. Clona el repositorio:  
   ```bash
   git clone https://github.com/tu-usuario/computer_shop.git
   ```
2. Accede al directorio del proyecto:  
   ```bash
   cd computer_shop
   ```
3. Compila el proyecto con Maven:  
   ```bash
   mvn clean install
   ```
4. Ejecuta las pruebas:  
   ```bash
   mvn test
   ```

## 🐜 Contribuciones  
Las contribuciones son bienvenidas. Si deseas mejorar el proyecto, por favor abre un _pull request_.  

## 🐝 Autor  
Desarrollado por [YefGav] 

## 🌍 Licencia  
Este proyecto está bajo la licencia MIT.  

---

✨ _¡Contribuciones y mejoras son bienvenidas!_ 😊  

