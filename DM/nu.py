f=open("FDRF5-rtu.txt")
f1=open("xcomb-5.txt",'w')
for l in f:
    c=0
    a=open("COMB-5.txt")
    for x in a:
        if l in x:
            c=1
            break
    if c == 0:
        f1.write(l)
    a.close()
f1.close()
f.close()
