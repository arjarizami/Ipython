fib = int(input('Ingrese el numero Fibonacci deseado: '))


a = 0

b = 1

c = 0


for i in range(fib-1):
 
	c = a+b
   
 	a = b
   
 	b = c


print('El numero Fibonacci deseado es:', c)