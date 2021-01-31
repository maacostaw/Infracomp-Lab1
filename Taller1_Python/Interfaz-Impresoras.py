"""
Este modulo contiene la interfaz de las impresoras
"""
import Impresoras
import threading
import random

delay_time = random.uniform(2.5,4.5)
limite_superior = -1;

try:
    limite_superior = int(input("Ingrese un numero > 0: "))
except:
    print("Valor no aceptado como numerico")

if limite_superior > 0:
    print(f"Se imprimiran numeros con un intervalo de espera de {delay_time} milisegundos")
    t1 = threading.Thread(target=Impresoras.impresora_pares, args = (limite_superior, delay_time,))
    t2 = threading.Thread(target=Impresoras.impresora_impares, args = (limite_superior, delay_time,))
    t1.start()
    t2.start()
