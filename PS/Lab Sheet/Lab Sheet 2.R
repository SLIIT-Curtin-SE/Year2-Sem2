getwd()
setwd("F:\\1YS1_SE_Curtin\\Y2 S2 Curtin\\Notes & Works\\PS\\Lab Sheet")
getwd()
#Control Statements
#if-else
y=2
if(y<=5){
  print("Y is less than 5")
}else{
  print("Y is greater than 5")
}

#Nested_if
x=3
if(x<0){
  print("Negative")
}else if(x>0){
  print("Positive")
}else{
  print("Zero")
}

#for_loop
#print number from 1 to 10
for(i in 1:100){
  print(i)
}

students<-c("Ann","Peter","Kyle","Jhon")
for (i in 1:4) {
  print(students[i])
}

#while loop 
j<-1
while(j<=10){
  print(j)
  j=j+1
}

k<-5
while (k<10) {
  print(k)
  k=k+1
}

m<-2.987
while (m<4.987) {
  m<-m+0.987
  print(c(m,m-1,m-2))
}


#functions
function_1<-function(a,b){
  x<-a+b
  print(x)
}
function_1(2,3)

h<-2
function_2<-function(r){
  h<-h+1
  r<-h+r
  print(r)
}
function_2(1)

#importing files
#To import a text file -> read.table(filename.txt,header=TRUE,sep=",")
data_1<-read.table("Students.txt",header=TRUE,sep=",")
data_1
fix(data_1)

#importing csv file
data_2<-read.table("DATA 2.csv",header=TRUE,sep=",")
data_2
fix(data_2) 

#Exporting files
height<-c(12,23,56)
weight<-c(100,150,80)
myData<-data.frame(height,weight)
myData
fix(myData)

#Export a dataset into a text file
write.table(myData,file="Information.txt")


#Export a data set as a csv file
write.csv(myData,file = "Infomation.csv")

#Questions
#Q1
quadRoots<-function(a,b,c){
  x1=(-b-sqrt(b^2-4*a*c))/2*a
  x2=(-b+sqrt(b^2-4*a*c))/2*a
  print(x1)
  print(x2)
  #real roots for quadratic equation 2x^2+3+1=0
}
quadRoots(2,3,1)

#Q4
xVector<-c(1:20)
sum(xVector%%3==0)

#Q6
x<-c(1,2,45,34,23,67,56,89,99)
max<-0
for (i in 1:length(x)) {
  if(max<x[i]){
    max<-x[i]
  }
    
}
print(max)

#Q7
x[which.max(x)]

#Q8
a=p*(1+R/100)^n
a<-0

M<-function(p,R,n){
  for (i in 1:15) {
    a=p*(1+R/100)^n
    print(a)
    
  }
}
M(5000,11.5,15)




















