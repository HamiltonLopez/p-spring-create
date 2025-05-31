# Servicio de Creación de Estudiantes

Microservicio Spring Boot para la creación de nuevos estudiantes.

## Estructura del Proyecto

```
.
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/studentscreate/
│   │   │       ├── controller/    # Controladores REST
│   │   │       ├── model/         # Entidades
│   │   │       ├── repository/    # Repositorios JPA
│   │   │       ├── service/       # Lógica de negocio
│   │   │       └── StudentCreateApplication.java
│   │   └── resources/
│   │       └── application.yml    # Configuración
│   └── test/                      # Pruebas unitarias
├── k8s/                          # Manifiestos de Kubernetes
│   ├── deployment.yaml
│   └── service.yaml
├── Dockerfile                    # Configuración de Docker
├── docker-compose.yml           # Configuración de Docker Compose
├── pom.xml                      # Dependencias Maven
└── README.md
```

## Endpoint

- **POST** `/api/students`
- Puerto: 8081
- Content-Type: application/json

### Request Body
```json
{
    "name": "string",
    "email": "string",
    "age": integer
}
```

### Responses

- **201 Created**
  ```json
  {
      "id": 1,
      "name": "string",
      "email": "string",
      "age": integer
  }
  ```
- **400 Bad Request**: Si el email ya existe o los datos son inválidos
- **500 Internal Server Error**: Error del servidor

## Configuración

### Application Properties
```yaml
server:
  port: 8081

spring:
  application:
    name: students-create-service
  datasource:
    url: ${SPRING_DATASOURCE_URL:jdbc:mariadb://localhost:3306/studentsdb}
    username: root
    password: root
```

### Docker
```bash
# Construir imagen
docker build -t students-create-service .

# Ejecutar contenedor
docker run -p 8081:8081 students-create-service
```

### Docker Compose
```bash
docker compose up --build
```

### Kubernetes
```bash
kubectl apply -f k8s/
```

## Dependencias Principales

- Spring Boot 3.1.5
- Spring Data JPA
- MariaDB Driver
- Spring Web
- Spring Boot Test

## Desarrollo

### Requisitos
- Java 17
- Maven
- Docker (opcional)
- Kubernetes (opcional)

### Compilar
```bash
./mvnw clean package
```

### Ejecutar Tests
```bash
./mvnw test
```

### Ejecutar Localmente
```bash
./mvnw spring-boot:run
```

## Ejemplo de Uso

### Crear un Estudiante
```bash
curl -X POST \
  http://localhost:8081/api/students \
  -H 'Content-Type: application/json' \
  -d '{
    "name": "Juan Pérez",
    "email": "juan.perez@ejemplo.com",
    "age": 20
}'
```

## Validaciones

- El nombre no puede estar vacío
- El email debe ser único y válido
- La edad debe ser mayor a 0

## Monitoreo y Logs

- Los logs de la aplicación se encuentran en la salida estándar
- Se utiliza el nivel de log INFO por defecto
- Se registran todas las operaciones de creación

## Seguridad

- Validación de datos de entrada
- Sanitización de datos
- Manejo seguro de excepciones 