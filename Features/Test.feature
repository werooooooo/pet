Feature: Pruebas Automatizadas
Scenario: Ingreso de nombre de usuario con datos almacenados en BD
Given Abrir Chrome
When ingresar Username "rodrigo" y Password "123456"
Then inicia session
Given Cerrar Chrome


Scenario: Ingreso de nombre de usuario y passoword con datos erróneos
Given Abrir Chrome
When Ingresar Username falso "Rod" y Password "123"
Then inicia session
Given Cerrar Chrome


Scenario: Registro de hora medica veterinaria
Given Abrir Chrome
When Ingresar Hora Medica
Then inicia session
Given Cerrar Chrome