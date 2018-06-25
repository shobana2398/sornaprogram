list=['Guvi']
def f(x):
	print x*5
	def sq(func,list):
		for item in list:
			func(item)
			calc=sq(f,list)
			print calc
