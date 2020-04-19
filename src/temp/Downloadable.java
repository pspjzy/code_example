package temp;

public interface Downloadable {
    public void downlaod();
}

interface readable extends Downloadable{
    public void rb();
}

abstract class Book implements readable{
    @Override
    public void rb() {
        System.out.println("ssdas");
    }
}

class eb extends Book{


    @Override
    public void rb(){
        System.out.println("das");
    }

    @Override
    public void downlaod() {

    }
}

