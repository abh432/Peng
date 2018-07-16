f=open("cnew.txt")
w=open("cnew-rtu.txt",'w')
for i in f:
    a=i.partition("<||>")
    t1=a[0]
    a=a[2].partition("<||>")
    t2=a[2]
    t= t1 + "<||>" + t2
    w.write(t)
w.close()
f.close()
