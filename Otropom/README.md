# GitHub - Actions

Mediante los Actions de GitHub se generan los artefactos del proyecto .jar y posteriormente, se crea una imagen en Docker donde se deja disponible el .jar generado.


Nota:
Estamos en fase de construcción.
para ejecutar por la modificación cd parte de la rama
se incorporó cambio de directorio en el yaml. 
pwd para target y ls 
/home/runner/work/JAVO/JAVO  
/home/runner/work/JAVO/JAVO/Otropom/target
/home/runner/work/JAVO/JAVO/Otropom/target dentro del Dockerfile  

ls -lta /home/runner/work/JAVO
ls -ltar /home/runner/work/JAVO
tree /home/runner/work/JAVO
 tree /home/runner/work/JAVO/JAVO/Otropom
 COPY Otropom/target /target

quito pom del directorio raiz.
file: ./Otropom/Dockerfile en mail.yml

COPY /home/runner/work/JAVO/JAVO/Otropom/target /target
COPY Otropom/target /target

#COPY /home/runner/work/JAVO/JAVO/Otropom/target /target
Ejecuto Otropom.yml
Depurar yml 
Estructura de yml 

