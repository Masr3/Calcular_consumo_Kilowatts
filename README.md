# Calcular_consumo_Kilowatts
Calcular cuanto se te va a cobrar segun los killowatts que tienes consumidos en tu hogar o area de trabajo

Este programa calculara cuanto el usuario debe pagar dependiendo de la cantidad de killowatts que introduzca, siguiendo las siguientes tarifas, de 0 a 200 son 5.55 pesos
por kw de 201 a 300 son 7.88 por kw de 301 a 700 son 11.46 por kw y si sobre pasa los 700 son 11.56 por kw.

La energia se calcula de la siguiente manera, luego de que se pasa una tarifa se aplicara la otra. Es decir, tengo que pagar 500 kw, 200 se cobraran en 5.55, 100 se iran
en 7.88 y 200 en 11.46

Sabiendo que cada vez que sobre pase los 5.55 seran 200 hice que cuando vaya a la siguiente tarifa (7.88) se le sume 5.55*200 que son 1110 y resto 200 kw para 
poder calcular la siguiente tarifa estando sola. En el caso de 250, como se que pasara de 200 le resto a la variable kw 200 y le sumo a la variable resultado el presio 
que alcanzara a 200 (1110) y asi puedo calcular los 50 restantes en 7.88.

Esa accion se estara aplicando en las condiciones que le siguen, para asi hacer la ecuacion mas simple.
