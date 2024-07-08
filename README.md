# FORMULA1-TABLEVIEW

## EXPLICACION DEL CODIGO

### CONEXION
Para poder realizar la conexion en un principio tenemos que descargar el conector de la base de datos especifica la cual usaremos, en mi caso yo use el conector de MySQL, despues para poder acceder a ella desde el codigo tuvimos que agregar el url en el que se encuentra la base de datos especifica, asi como el usuario y la contraseña correspondiente

![image](https://github.com/kenyba15/FORMULA1-TABLEVIEW/assets/168501498/95469a54-5d37-4e0a-bde0-e6a54fb13c0c)

Para poder acceder a la conexion dentro del codigo necesitaremos la sentencia getConnection la cual nos servira para acceder a la base de datos mediante cada uno de los atributos los cuales ya han sido especificados, se realiza el Query sobre a lo que se quiere acceder en la base de datos

![image](https://github.com/kenyba15/FORMULA1-TABLEVIEW/assets/168501498/f595f5d1-08e1-4b7f-a351-5fc1f01f0536)
Se realiza el query y si todo esta bien accedemos a la base de datos de forma facil
De todas formas para que esto funcione debemos tener una clase con cada uno de los atributos, gets y sets correspondientes
Al acceder a la base de datos definimos cada tipo de datos para que asi coincida con el tipo de dato de la tabla correspondiente en la base de datos y de esta forma cada uno de los datos de cada registro se ingresan en el codigo, para que despues con un metodo correspondiente puedan ser mostrados con un tableview.
Cada uno de los datos obtenidos de los registros son almacenados en un Arraylist, el cual puede ser mostrado con el metodo dentro de Main, pero de eso no estamos hablando, hablare acerca del tableview, en la clase App
Se creo un metodo para acceder a los conductores dependiendo el año elegido, realizando un Query en Sql pudimos obtener cada uno de los años de la tabla drivers, los que se repiten no se toman en cuenta y solamente se toma cada año unico.

![image](https://github.com/kenyba15/FORMULA1-TABLEVIEW/assets/168501498/1f41e413-e886-4a01-bf5b-9c177896ffcc)

Con el metodo getDriversByYear podemos acceder a los registros de cada conductor a los que les correspondera el año seleccionado.
Accedimos al repositorio correspondiente, y a la lista de cada uno, realizando un query especifico para elegir solamente a los conductores a los cuales les corresponda el año el cual seleccionamos
![image](https://github.com/kenyba15/FORMULA1-TABLEVIEW/assets/168501498/c86ed754-5c06-4e1c-a868-810cea628288)



## EJECUCION
![image](https://github.com/kenyba15/FORMULA1-TABLEVIEW/assets/168501498/9f65e2f1-8e55-4245-8abd-68c78905b403)


## CAPTURAS DEL CODIGO
### MAIN
![image](https://github.com/kenyba15/FORMULA1-TABLEVIEW/assets/168501498/0814cf46-8293-4649-ac60-f67084b93ec1)
![image](https://github.com/kenyba15/FORMULA1-TABLEVIEW/assets/168501498/e2492d04-8986-4223-b2b8-cea52a228b67)

### APP
![image](https://github.com/kenyba15/FORMULA1-TABLEVIEW/assets/168501498/c4bb6f33-e531-4fe2-aa07-23fe2877d9af)
![image](https://github.com/kenyba15/FORMULA1-TABLEVIEW/assets/168501498/99d0c7ac-1143-4589-8129-6efde8984c53)
![image](https://github.com/kenyba15/FORMULA1-TABLEVIEW/assets/168501498/790f3c44-bec0-48d0-ba33-ef2e05b96d92)
![image](https://github.com/kenyba15/FORMULA1-TABLEVIEW/assets/168501498/3c1a8123-262c-4afa-aa51-6149b3c142e1)

### DRIVER
![image](https://github.com/kenyba15/FORMULA1-TABLEVIEW/assets/168501498/6b8ebd5c-fc8e-4c5b-906f-b76f39dd1169)
![image](https://github.com/kenyba15/FORMULA1-TABLEVIEW/assets/168501498/bcac802d-7e59-4d07-b4fc-5d17c4fc9380)

### CONSTRUCTORS
![image](https://github.com/kenyba15/FORMULA1-TABLEVIEW/assets/168501498/0ccf35b1-dbf2-4193-98ee-28b4ace51b4b)
![image](https://github.com/kenyba15/FORMULA1-TABLEVIEW/assets/168501498/bb4b133b-cf4b-4e8c-812a-a672fd8ff798)

### DRIVERREPOSITORY
![image](https://github.com/kenyba15/FORMULA1-TABLEVIEW/assets/168501498/7effdec7-d72c-45d3-98ac-22f10a430084)
![image](https://github.com/kenyba15/FORMULA1-TABLEVIEW/assets/168501498/96476187-24bf-48bc-89d5-5f067567f3d3)

### CONSTRUCTORSREPOSITORY
![image](https://github.com/kenyba15/FORMULA1-TABLEVIEW/assets/168501498/7cf27c1d-39c8-40af-952f-d30561f72dc2)
