Feature: Ejecutar la apk finalapp con appium y android Studio

  @Login
  Scenario Outline:  Inicio de secion exitoso
    Given Camilo ejecuta la app
    When el inicia sesion en la app
    Then el valida el <usuario> logueado
    Examples:
      | usuario             |
      | SIGN IN WITH GOOGLE |