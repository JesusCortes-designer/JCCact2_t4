# JCCact2_t4

**Instituto Tecnológico de Oaxaca**  
**Materia:** Programación Web  
**Alumno:** Jesús Cortés Cruz

## Descripción

Proyecto de Spring Boot que implementa el patrón Modelo-Vista-Controlador (MVC) utilizando Thymeleaf para generar vistas HTML dinámicas. También expone una API REST para recibir información de empleados en formato JSON mediante solicitudes POST.

El proyecto fue probado localmente y desplegado en una máquina virtual de Azure, utilizando un puerto diferente al de la Actividad 1 para permitir que ambas aplicaciones funcionen simultáneamente.

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
- **RquestParamControllers:** recibe parámetros mediante `@RequestParam`.
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

## Pruebas en localhost

Se ejecutó el proyecto localmente mediante el siguiente comando:

```powershell
.\mvnw.cmd spring-boot:run
```

Se realizaron pruebas desde el navegador para comprobar el funcionamiento de las vistas MVC y los diferentes endpoints.

### Lista de empleados

![Prueba en localhost de la lista de empleados](imagenes/imagen1.png)

### Detalle de empleado

![Prueba en localhost del detalle de empleado](imagenes/imagen2.png)

### Formulario de empleados

![Prueba en localhost del formulario](imagenes/imagen3.png)

### Resultado del formulario

![Prueba en localhost del resultado](imagenes/imagen4.png)

### Parámetros con @RequestParam

![Prueba en localhost de RequestParam](imagenes/imagen5.png)

### Parámetros con @PathVariable

![Prueba en localhost de PathVariable](imagenes/imagen6.png)

### API REST con POST

La API se probó mediante Postman utilizando el método POST y enviando un objeto JSON.

**Endpoint:**

`http://localhost:8083/api/empleados`

**Ejemplo de JSON enviado:**

```json
{
  "id": 0,
  "nombre": "Sofia",
  "apellido": "Ruiz",
  "puesto": "Gerente",
  "edad": 30
}
```

![Prueba POST en Postman](imagenes/imagen7.png)

## Pruebas en el VPS

El proyecto se desplegó en la máquina virtual de Azure y se comprobó su funcionamiento utilizando la IP pública del servidor y el puerto 8083.

### Página principal

![Prueba en el VPS de la página principal](imagenes/imagen8.png)

### Lista de empleados

![Prueba en el VPS de la lista de empleados](imagenes/imagen9.png)

### Formulario de empleados

![Prueba en el VPS del formulario](imagenes/imagen10.png)

### API REST

Se comprobó el funcionamiento del endpoint POST mediante una solicitud a la dirección:

`http://20.119.81.138:8083/api/empleados`

![Prueba POST en el VPS](imagenes/imagen11.png)

## Alumno

**Jesús Cortés Cruz**  
Instituto Tecnológico de Oaxaca  
Programación Web