# Aplicación de Comunicación entre dos Actividades

## Descripción
Esta aplicación Android está diseñada para gestionar la comunicación entre dos actividades. La Actividad principal permite al usuario ingresar un nombre, el cual se envía a una segunda actividad que muestra un mensaje de despedida personalizado. Además, la Actividad principal valida que el nombre haya sido ingresado antes de permitir la transición a la segunda actividad.
![image](https://github.com/user-attachments/assets/3a46f2bc-dff7-427e-b4e3-1015b2438d2f)

## Características
- **Pantalla Principal**: 
  - Muestra un mensaje de bienvenida ("¡ie, Hola Mundo!!").
  - Permite al usuario ingresar un nombre.
  - Si el nombre no es ingresado, muestra un mensaje de error.
  - Un botón que redirige a la segunda actividad con el nombre ingresado.
  
- **Segunda Actividad**:
  - Muestra un mensaje de despedida que incluye el nombre proporcionado por el usuario.
  - Un botón para regresar a la pantalla principal con un mensaje de confirmación.

## Requisitos
- **Android Studio** (última versión recomendada).
- **SDK de Android** versión 21 o superior.
- Un dispositivo Android o emulador para probar la aplicación.

## Instalación
1. Clona o descarga el repositorio en tu máquina local.
   
   ```bash
   git clone https://github.com/tu_usuario/tu_repositorio.git
   ```
2. Abre el proyecto en Android Studio.

3. Espera a que Gradle sincronice el proyecto.

4. Asegúrate de tener un dispositivo Android conectado o un emulador configurado.

5. Haz clic en el botón Run en Android Studio para compilar y ejecutar la aplicación.

## Estructura del Proyecto
1. En la Actividad Principal, el usuario ingresa su nombre en un campo de texto. Si el campo está vacío y se pulsa el botón para ir a la segunda actividad, la aplicación muestra un mensaje de error.
   
2. Si el nombre está completo, se crea un Intent y se envía a la Segunda Actividad. Esta actividad recibe el nombre y muestra un mensaje de despedida personalizado.
   
3. El usuario puede regresar a la actividad principal pulsando un botón en la segunda actividad. Al regresar, la aplicación muestra un mensaje de confirmación.

# Pruebas en diferentes dispositivos
![image](https://github.com/user-attachments/assets/0225b139-cc4a-423f-8b0f-7b51a3172e76)

![image](https://github.com/user-attachments/assets/7e281014-c9bc-4e58-bf56-d627c06556fe)

![image](https://github.com/user-attachments/assets/3a46f2bc-dff7-427e-b4e3-1015b2438d2f)

