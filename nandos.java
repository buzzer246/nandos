import java.io.*;
import java.util.*;
public class nandos{

    int a=2,b=3,c;

 public void enterpin(){

    if(a<b){

System.out.println("Please Enter the PIN");

    }

    else {

        System.out.println("Enter Valid PIN");
    }

 }
public void threads(){

    while(b>=a){

        System.out.println("Run the first Thread 1 and then Thread 2 ");
    }
        System.out.println("Input Threads failed!");

if (a<=b==true){

        System.out.println("Run the First Threads as Asynchronus process");
    }
}

public void input(){
for(a=2;a<=b;a++){

    System.out.println("Enter the input value"+a);

}

}
protected void process(){

    if(a<=b==true){
System.out.println("First thread is Executed as Asychronus type");

    }
    else{

        System.out.println("Both the threads are Executed as Asynchronus type ");
    }
}
public void output(){

System.out.println("Nand os is Sucessfully Completed the execution");

}

public static void main(String[] args) {


nandos O = new nandos();

O.enterpin();
O.threads();
O.input();
O.process();
O.output();

}
}
