Este repositorio contiene la aplicación desarrollada para el proyecto de la materia RHU-115 (Universidad de El Salvador): un sistema de planillas automatizado, dedicado a la gestión integral de recursos humanos y planificación de nóminas empresariales.

La aplicación fue desarrollada utilizando Apache NetBeans 18 como entorno de desarrollo y PostgreSQL como sistema de gestión de base de datos, con el propósito de facilitar el registro y control automatizado de las planillas, empleados y cálculos de nómina de la empresa.

r## Compatibilidad con IDEs

El proyecto es compatible con múltiples entornos de desarrollo integrado (IDEs):

- **Apache NetBeans 18+**: El IDE principal utilizado para el desarrollo
- **IntelliJ IDEA**: Totalmente compatible (Community y Ultimate Edition)
- **Eclipse**: Compatible mediante importación de proyecto Maven
- **VS Code**: Compatible con extensiones Java y Maven

### Ejecución en NetBeans
1. Abrir NetBeans y seleccionar `File > Open Project`
2. Navegar a la carpeta del proyecto y abrirlo
3. Ejecutar con `Run > Run Project` (F6) o clic en el botón ▶

### Ejecución en IntelliJ IDEA
1. Abrir IntelliJ IDEA y seleccionar `File > Open`
2. Seleccionar el archivo `pom.xml` del proyecto
3. Ejecutar con `Run > Run 'Application'` o clic en el botón ▶

### Ejecución por Línea de Comandos
```bash
# Compilar el proyecto
mvn clean compile

# Ejecutar la aplicación
mvn exec:java -Dexec.mainClass="application.Application"

# Ejecutar con Maven (compila y ejecuta)
mvn clean compile exec:java -Dexec.mainClass="application.Application"
```

**Nota:** La primera ejecución descargará todas las dependencias de Maven. Las dependencias locales (JARs en `/lib/`) se instalan automáticamente en el repositorio local de Maven durante la compilación.

El sistema implementa funcionalidades clave para la gestión de recursos humanos y planillas, tales como:

- Registro y gestión de empleados.
- Gestión de puestos de trabajo.
- Generación de planillas de sueldos y nóminas.
- Reportes de recursos humanos y planillas.
- Control de acceso y autenticación de usuarios.

---

## Requisitos de Base de Datos

- El sistema requiere **PostgreSQL versión 16 o superior** 
- La conexión se realiza con el usuario **`postgres`** y la contraseña utilizada para iniciar sesión en **pgAdmin** (la misma contraseña que se asignó durante la instalación de PostgreSQL).

### Modo de Prueba (Frontend sin Base de Datos)

Si deseas ejecutar la aplicación sin conexión a la base de datos (por ejemplo, para revisar la interfaz de usuario o hacer demostraciones), el sistema incluye un **modo de prueba** que permite navegar por los formularios sin necesidad de PostgreSQL.

En este modo:
- Se muestran datos de ejemplo en los catálogos
- No se requiere autenticación en el login
- Las operaciones de modificación/eliminación están deshabilitadas
- Permite visualizar todos los formularios y la interfaz completa

---

### Login  
![Image](https://github.com/user-attachments/assets/9950d4a1-50b7-4c21-98e6-da575ed2f2d4)

---

### Menú Principal - RHU115  
![Image](https://github.com/user-attachments/assets/dbd56ebe-7be1-4477-b67f-be2a625e4efe)

---

### Registro de Empleados  
![Image](https://github.com/user-attachments/assets/1c67a4ec-b804-41d7-8dcd-54d0dff2ed68)

---

### Gestión de Puestos  
![Image](https://github.com/user-attachments/assets/bbad2dac-403d-4058-aefd-cbbbfbd32d0c)

---

### Planilla General  
![Image](https://github.com/user-attachments/assets/824ec6b3-2308-4060-bcb4-f849447d3b22)

---

### Reporte de Planilla  
![Image](https://github.com/user-attachments/assets/05517631-ed04-4e86-b671-d2764e98808e)

---

### Balance General  
![Image](https://github.com/user-attachments/assets/d95c5889-28a5-466c-87c8-bfa32a9c441b)

---

### Planilla de Empleados  
![Image](https://github.com/user-attachments/assets/83ce81f4-c83c-49ce-a722-7fbdc56f0800)

---

### Solicitud de Servicio  
![Image](https://github.com/user-attachments/assets/14bf9711-3b6a-400b-9d5e-4f14d425839d)

---

## Créditos

Este proyecto utiliza un tema/dashboard basado en el trabajo de [DJ-Raven](https://github.com/DJ-Raven), quien lo compartió públicamente en GitHub y YouTube. Agradecemos su aporte para facilitar el desarrollo visual y funcional de esta aplicación.

---
