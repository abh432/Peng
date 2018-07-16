import re
f=open("FDRF5-rtu.txt")
l=open("FDRF5-rtu-RE.txt",'w')
for a in f:
	x=a.strip('\n')
	s=open("RE_EMTerms-new.txt")
	for g in s:
		w=g.strip('\n')
		t=re.search(w,x,2)
		if t!= None:
			print(a)
			print(g)
			l.write(a)
			break
	s.close()
l.close()
f.close()

