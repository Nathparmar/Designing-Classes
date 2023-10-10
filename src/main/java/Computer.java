public class Computer {

    private int storage;
    
    private int newstorage;
    
    private String printer;

    public Computer(int storage , int newstorage){
        this.storage = storage;
        this.newstorage = newstorage;

    }

    public int getStorage() {
        return this.storage + newstorage;
    }


     
     
     
}


