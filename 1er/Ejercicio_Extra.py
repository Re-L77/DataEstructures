import numpy as np

def obtenerMayor(arr):
    if arr.size == 0:
        return None
    maximo = arr[0]
    for elemento in arr[1:]:
        if elemento > maximo:
            maximo = elemento

    return maximo


def obtenerPromedio(arr):
    if arr.size == 0:
        return None
    promedio = 0
    for elemento in arr[0:]:
        promedio+= elemento

    return promedio / arr.size


edades = np.array([19, 18, 21, 20, 24, 23, 21]) 

print(f"El arreglo de entrada es: {edades}")
print(f"El valor mas grande del arreglo es: {obtenerMayor(edades)}")
print(f"El promedio de edades es de {obtenerPromedio(edades):.2f}")
    