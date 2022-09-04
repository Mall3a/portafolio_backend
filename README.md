# portafolio_backend

## Available Scripts

In the project directory, you can run:

### `mvn spring-boot:run`

Runs the app in the development mode.\
Open [http://localhost:8080](http://localhost:8080)to view it in your browser.


en application.properties llenar lo siguiente (Cambiar ruta donde esta wallet)

spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
spring.datasource.url=jdbc:oracle:thin:@maipograndebdd_high?TNS_ADMIN=/Users/mallea/Wallet_MAIPOGRANDEBDD
spring.datasource.username=DEV
spring.datasource.password=MaipoGrande2022
spring.jpa.database-platform=org.hibernate.dialect.Oracle12cDialect