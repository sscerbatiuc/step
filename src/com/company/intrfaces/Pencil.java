package com.company.intrfaces;

public interface Pencil {
    public abstract void draw();
    public abstract void write(String text);

}

class GraphitePencil implements Pencil {

    public void sketch() {
        System.out.println("Drawing sketch");
    }

    public void write(String text){
        System.out.println(text);
    }

    public void draw() {
        System.out.println("Drawing monochrome");
    }
}

class ColoredPencil implements Pencil {

    public void colorStuff(){
        System.out.println("Coloring");
    }

    public void write(String text) {
        System.out.println("Colored: " + text);
    }
    public void draw() {
        System.out.println("Drawing in color");
    }
}

class Demo {
    public static void main(String[] args) {
        Pencil pencil = new ColoredPencil();
        //pencil.colorStuff();
        pencil.write("Hello");



        Pencil grPencil = new ColoredPencil();
//        grPencil.sketch();
        grPencil.write("Hi again");


        Pencil pen = new GraphitePencil();
        pen.write("Text");
        pen = new ColoredPencil();
        pen.write("Text");





    }
}
