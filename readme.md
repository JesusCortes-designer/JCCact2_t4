# JCCact2_t4

**Instituto Tecnológico de Oaxaca**  
**Materia:** Programación Web  
**Alumno:** Jesús Cortés Cruz

## Descripción

Proyecto de Spring Boot que implementa el patrón Modelo-Vista-Controlador (MVC) utilizando Thymeleaf para generar vistas HTML dinámicas. También expone una API REST para recibir información de empleados en formato JSON mediante solicitudes POST.

El proyecto fue desplegado en una máquina virtual de Azure, utilizando un puerto diferente al de la Actividad 1 para permitir que ambas aplicaciones funcionen simultáneamente.

## Tecnologías

- Java 21
- Spring Boot
- Maven
- Thymeleaf
- HTML
- API REST
- Nginx
- Azure Virtual Machine

## Estructura

- **InicioController:** muestra la página principal con enlaces a las diferentes funcionalidades del proyecto.
- **EmpleadoViewController:** administra las vistas de empleados, muestra una lista, permite consultar detalles y registra nuevos empleados mediante formularios.
- **EmpleadoApiController:** recibe empleados mediante solicitudes POST en formato JSON.
- **EjemploController:** proporciona información mediante una vista MVC.
- **EjemploRestController:** devuelve información en formato JSON.
- **PathVariableController:** recibe parámetros directamente desde la ruta mediante `@PathVariable`.
- **RequestParamController:** recibe parámetros mediante `@RequestParam`.
- **EmpleadoDTO:** objeto utilizado para transportar la información de los empleados.

## Funcionalidades y endpoints

### Vistas MVC

- `/` : página principal del proyecto.
- `/mvc/lista` : muestra la lista de empleados utilizando Thymeleaf.
- `/mvc/detalle/1` : muestra los detalles de un empleado.
- `/mvc/formulario` : presenta el formulario para registrar empleados.

### API REST

- `/api/detalles_info` : devuelve información mediante una vista.
- `/api/detalles_info2` : devuelve información del proyecto en formato JSON.
- `/api/empleados` : recibe información de un empleado mediante el método POST.

### Parámetros

- `/api/parametros/detalle?informacion=Hola` : recibe información mediante `@RequestParam`.
- `/api/path/detalle/5` : recibe un identificador mediante `@PathVariable`.

## Enlaces

**Proyecto en el VPS:**  
http://20.119.81.138:8083/

**Lista de empleados:**  
http://20.119.81.138:8083/mvc/lista

**Formulario de empleados:**  
http://20.119.81.138:8083/mvc/formulario

**Actividad 1:**  
http://20.119.81.138:8081/

## Cómo generar el JAR

Ejecutar el siguiente comando desde la carpeta del proyecto:

```bash
./mvnw clean package -DskipTests
```

El archivo JAR generado se encuentra dentro de la carpeta `target`.

## Despliegue en Azure

La aplicación se encuentra desplegada en una máquina virtual de Azure con Ubuntu 24.04 y Java 21.

Se configuró como un servicio de `systemd` para que pueda ejecutarse en segundo plano y reiniciarse automáticamente cuando sea necesario.

El servicio utilizado es `springapp2.service` y la aplicación funciona en el puerto 8083.

La Actividad 1 permanece funcionando en el puerto 8081, por lo que ambas aplicaciones pueden ejecutarse al mismo tiempo.

## Pruebas en el VPS

El proyecto se desplegó en la máquina virtual de Azure y se realizaron pruebas desde el navegador y Postman utilizando la IP pública del servidor y el puerto 8083.

### Página principal

![Página principal del proyecto en el VPS](imagenes/imagen1.png)

### Lista de empleados

![Lista de empleados en el VPS](imagenes/imagen2.png)

### Detalle de empleado

![Detalle de empleado en el VPS](imagenes/imagen3.png)

### Formulario de empleados

![Formulario de empleados en el VPS](imagenes/imagen4.png)

### Resultado del formulario

![Resultado del registro de empleado en el VPS](imagenes/imagen5.png)

### Parámetros con @RequestParam

Se comprobó la recepción de información mediante `@RequestParam`.

**Endpoint:**

`http://20.119.81.138:8083/api/parametros/detalle?informacion=Hola`

![Prueba de RequestParam en el VPS](imagenes/imagen6.png)

### Parámetros con @PathVariable

Se comprobó la recepción de un identificador directamente desde la ruta mediante `@PathVariable`.

**Endpoint:**

`http://20.119.81.138:8083/api/path/detalle/5`

![Prueba de PathVariable en el VPS](imagenes/imagen7.png)

## Alumno

**Jesús Cortés Cruz**  
Instituto Tecnológico de Oaxaca  
Programación Web