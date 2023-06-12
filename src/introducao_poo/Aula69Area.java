package introducao_poo;

public class Aula69Area {
    public Double width;
    public Double height;

    public Double area(){
        return (width*height);
    }

    public Double perimetro(){
        return (2*width) + (2*height);
    }

    public Double diagonal(){
        return Math.sqrt(perimetro());
    }


}

