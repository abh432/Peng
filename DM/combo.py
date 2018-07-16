f=open("FDRF5-rtu.txt")
a=open("FDRF5-rtu-RE.txt")
b=open("FDRF5-rtu-sub.txt")
w=open("COMB-5.txt",'w')
x=a.readline()
y=b.readline()
for i in f:
    c = 0
    if i in x:
        c = 1
        x=a.readline()
    if i in y:
        c = 1
        y=b.readline()
    if c == 1:
        print(i)
        w.write(i)
w.close()
b.close()
a.close()
f.close()
