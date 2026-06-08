# Coursera: Programa especializado: Desarrollo de aplicaciones móviles con Android

## Curso 3 - Module 4

**Parte 1**
  
| Prototipos | Descripción |
|-----------|-----------|
| <img width="372" height="709" alt="image" src="https://github.com/user-attachments/assets/c6d202d7-3724-46b6-b305-005e8d050bd5" /> | La siguiente imagen representa una maqueta de una pantalla: <br> Ahora: <br>  1. Analiza la entidad “Mascota” . <br> 2. Genera un RecyclerView que muestre una lista de mascotas como se observa.  <br> 3. Deberás prevenir que cada mascota puede ser raiteada usando el ícono de hueso en blanco en comparación con el hueso amarillo que nos muestra la cantidad de raiting que tiene cada mascota. |

**Parte 2**
| Prototipos | Descripción |
|-----------|-----------|
| <img width="379" height="214" alt="image" src="https://github.com/user-attachments/assets/8ce9c980-10c8-409c-a2ff-cf4c0561307a" /> <br> <img width="750" height="653" alt="image" src="https://github.com/user-attachments/assets/71875d8b-33eb-40ed-a163-c6ea7781540c" /> | Partiendo de lo realizado en la parte 1: <br> Crea un Action View en forma de estrella como el que se muestra en la siguiente imagen: (primera imagen) <br> <br> Este botón debe tener las siguientes características: <br> 1. Nos debe llevar a un Nuevo Activity que en el futuro funcionará como una pantalla en la que estaremos almacenando las últimas 5 mascotas que nos han gustado (el ícono de gustar es el indicado por el hueso en blanco). <br> 2. Para el objetivo de este ejemplo, lo único que deberás mostrar es un RecyclerView con 5 mascotas  “Dummy” o Hardcodeadas. <br> 3. Además, la actividad que muestra las mascotas favoritas, deberá tener la posibilidad de regresar al Activity padre. <br> <br> El flujo de la aplicación deberá ser el que se muestra en las siguientes maquetas: (segunda imagen)  |


### Criterios de Evaluación
1. Que corra el proyecto
2. DataSet
3. Adapter
4. ViewHolder
5. Clase para dar forma a los items del RecyclerView
6. Resultado final del RecyclerView
7. Action View de estella
8. Acciones del Action View
9. RecyclerView con  5 Items
10. Botón para subir

## Evidencias
1. Que corra el proyecto
   
[course3.module4.webm](https://github.com/user-attachments/assets/a801d34f-5c5a-4385-bff7-6aac85382564)


| 2. DataSet | 3. Adapter | 4. ViewHolder |
|-----------|-----------|-----------|
| <img width="1483" height="826" alt="image" src="https://github.com/user-attachments/assets/63a0a3f5-b485-4180-bddc-5ab1bfae0073" /> | <img width="1602" height="857" alt="image" src="https://github.com/user-attachments/assets/dfbd89ea-17e2-4fdc-823d-5fcf69d737c7" /> | <img width="1463" height="811" alt="image" src="https://github.com/user-attachments/assets/2bf423c8-18c2-48d8-9cde-b11f1ac07af0" /> |
   
| 5. Clase para dar forma a los items del RecyclerView | 6. Resultado final del RecyclerView | 7. Action View de estella |
|-----------|-----------|-----------|
| <img width="1463" height="811" alt="image" src="https://github.com/user-attachments/assets/2bf423c8-18c2-48d8-9cde-b11f1ac07af0" /> <br> <img width="1727" height="677" alt="image" src="https://github.com/user-attachments/assets/71c4fd40-2071-4a99-80e2-9b0a365c1b25" /> | <img width="467" height="921" alt="image" src="https://github.com/user-attachments/assets/5095b3c3-cd7f-4b92-b1bc-bb51e954deb0" /> | <img width="1731" height="416" alt="image" src="https://github.com/user-attachments/assets/6eff1d81-26a1-4f83-9043-2d9053462bda" /> |
  
| 8. Acciones del Action View | 9. RecyclerView con  5 Items | 10. Botón para subir |
|-----------|-----------|-----------|
|<img width="1101" height="897" alt="image" src="https://github.com/user-attachments/assets/f734fe43-a548-448e-b07b-89dd7d7cae2e" />|<img width="476" height="923" alt="image" src="https://github.com/user-attachments/assets/d6abe0ed-5074-4213-a91d-74c4ab1a434b" />|<img width="1118" height="347" alt="image" src="https://github.com/user-attachments/assets/3bce72df-1ea2-4c23-afcd-283e557b0e5d" />|

## Notas
- El boton para subir es el FloatingActionButton, nos lleva al principio de la lista.
- Se agrega los favoritos al presionar el hueso blanco y lo añade a una lista de mascotas favoritas.
- Si se presiona a un elemento que ya estaba como favorito entonces lo borra de la lista de favoritos.
- Las instrucciones son puntuales y no valida que cuando se presiona el icono de favoritos(hueso blanco) se incremente el contador de rating, por lo que no se ha abordado ese detalle.
- Version de Android Studio: Android Studio Narwhal | 2025.1.1
