 package pagereplacement;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Demo {
String ref="";
int size=0;
int pf=0;
char frame[];
int fc=0;
Scanner input=new Scanner(System.in);
public void input(){
System.out.println("Enter Ref. String");
ref=input.next();
System.out.println("Enter Frame size");
size=input.nextInt();
frame=new char[size];
}
public boolean search(char ch){
for(int i=0;i<fc;i++){
char temp=frame[i];
if(temp==ch){
return true;
}
}
return false;
}
public int future(char ch, int pos){
int result=ref.length()+1;
for(int i=pos+1;i<ref.length();i++){
char temp=ref.charAt(i);
if(temp==ch){
if(i<result){
result=i;
}
}
}
return result;
}

