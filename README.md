# Heroku

## App

### Ejecucion

para hacer uso de la app desde la herramienta maven, se debe estar
en el mismo lugar que el pom, abrir el cmd y compilarlo (**mvn package**)

puede ejecutarse en el IDE de preferencia, y entrar en el link 
**http://localhost:4567/**

Ahora, como el proyecto se encuentra desplegado en heroku se puede acceder de manera 
directa al link 
**https://arepdesvmedcalc.herokuapp.com/**

### Funcionamiento

Para ambas formas de ejecucion se deben poner los numeros deseados separados por comas(,)
y dar al boton calcular, esto redirigira hacia la pagina con la solucion y desde la cual podremos volver para 
seguir usando la app.

### Explicacion detallada

[Heroku](https://github.com/MiguelASG/Heroku/master/heroku.pdf)

### Javadoc

Para que el javadoc se cree solo debe usarse el comando **mvn javadoc:javadoc**
De igual manera el javadoc se encuentra en el git como un archivo para poder abrirse.
