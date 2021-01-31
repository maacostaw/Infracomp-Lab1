"""
Este modulo contiene los procedimientos
"""
import time

def impresora_pares(limite_superior:int, delay_time:float) -> None:
    i = 2
    while i<=limite_superior:
        print(i)
        time.sleep(delay_time)
        i+=2

def impresora_impares(limite_superior:int, delay_time:float) -> None:
    i = 1
    while i<=limite_superior:
        print(i)
        time.sleep(delay_time)
        i+=2
